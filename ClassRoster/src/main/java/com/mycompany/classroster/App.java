/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classroster;
import com.mycompany.classroster.controller.*;
import com.mycompany.classroster.ui.*;
import com.mycompany.classroster.dao.*;

/**
 *
 * @author Manny
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UserIO io = new UserIOConsoleImp();
        ClassRosterView view = new ClassRosterView(io);
        ClassRosterDao dao = new ClassRosterDaoFileImp();
        
        ClassRosterController controller = new ClassRosterController(view, dao);
        controller.run();
    }
    
}
