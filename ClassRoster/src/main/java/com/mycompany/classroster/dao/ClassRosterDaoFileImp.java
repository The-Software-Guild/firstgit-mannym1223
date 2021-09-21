/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classroster.dao;

import com.mycompany.classroster.dto.Student;
import java.util.*;
import java.io.*;

/**
 *
 * @author Manny
 */
public class ClassRosterDaoFileImp implements ClassRosterDao {
    private Map<String, Student> students = new HashMap<>();
    public  String ROSTER_FILE;
    public static final String DELIMITER = "::";
    
    public ClassRosterDaoFileImp() {
        ROSTER_FILE = "roster.txt";
    }
    
    public ClassRosterDaoFileImp(String fileName) {
        ROSTER_FILE = fileName;
    }

    @Override
    public Student addStudent(String studentId, Student student) throws ClassRosterPersistenceException {
        loadRoster();
        Student prevStudent = students.put(studentId, student);
        writeRoster();
        return prevStudent;
    }

    @Override
    public List<Student> getAllStudents() throws ClassRosterPersistenceException {
        loadRoster();
        return new ArrayList<>(students.values());
    }

    @Override
    public Student getStudent(String studentId) throws ClassRosterPersistenceException {
        loadRoster();
        return students.get(studentId);
    }

    @Override
    public Student removeStudent(String studentId) throws ClassRosterPersistenceException {
        loadRoster();
        Student removedStudent = students.remove(studentId);
        writeRoster();
        return removedStudent;
    }
    
    private Student unmarshallStudent(String studentAsText){
        // ______________________________________
        // |    |   |        |                  |
        // |1234|Ada|Lovelace|Java-September1842|
        // |    |   |        |                  |
        // --------------------------------------
        //  [0]  [1]    [2]         [3]
        String[] studentTokens = studentAsText.split(DELIMITER);
        
        // student Id is in index 0 of the array.
        String studentId = studentTokens[0];
        
        Student studentFromFile = new Student(studentId);
        
        // Index 1 - FirstName
        studentFromFile.setFirstName(studentTokens[1]);
        
        // Index 2 - LastName
        studentFromFile.setLastName(studentTokens[2]);
        
        // Index 3 - Cohort
        studentFromFile.setCohort(studentTokens[3]);
        
        return studentFromFile;
    }
    
    private void loadRoster() throws ClassRosterPersistenceException {
        Scanner scanner;
        
        try {
            // Create Scanner for reading the file
            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(ROSTER_FILE)));
        } catch (FileNotFoundException e) {
            throw new ClassRosterPersistenceException(
                    "-_- Could not load roster data into memory.", e);
        }
        String currentLine;
        Student currentStudent;
        // Go through ROSTER_FILE line by line, decoding each line into a
        // Student object by calling the unmarshallStudent method.
        while (scanner.hasNextLine()) {
            currentLine = scanner.nextLine();
            currentStudent = unmarshallStudent(currentLine);
            
            // Put currentStudent into the map using student id as the key
            students.put(currentStudent.getStudentId(), currentStudent);
        }
        scanner.close();
    }
    
    private String marshallStudent(Student aStudent){
        // Example: 
        // 4321::Charles::Babbage::Java-September1842
        
        // StudentID
        String studentAsText = aStudent.getStudentId() + DELIMITER;
        
        // FirstName
        studentAsText += aStudent.getFirstName() + DELIMITER;
        
        // LastName
        studentAsText += aStudent.getLastName() + DELIMITER;
        
        // Cohort - skip the DELIMITER here.
        studentAsText += aStudent.getCohort();
        
        return studentAsText;
    }
    
    /**
     * Writes all students in the roster out to a ROSTER_FILE.  See loadRoster
     * for file format.
     *
     * @throws ClassRosterPersistenceException if an error occurs writing to the file
     */
    private void writeRoster() throws ClassRosterPersistenceException {
        PrintWriter out;
        
        try {
            out = new PrintWriter(new FileWriter(ROSTER_FILE));
        } catch (IOException e) {
            throw new ClassRosterPersistenceException(
                    "Could not save student data.", e);
        }
        
        // Write out the Student objects to the roster file.
        String studentAsText;
        List<Student> studentList = this.getAllStudents();
        for (Student currentStudent : studentList) {
            // turn a Student into a String
            studentAsText = marshallStudent(currentStudent);
            // write the Student object to the file
            out.println(studentAsText);
            // force PrintWriter to write line to the file
            out.flush();
        }
        // Clean up
        out.close();
    }
    
}
