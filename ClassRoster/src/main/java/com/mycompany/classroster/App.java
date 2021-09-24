/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classroster;
import com.mycompany.classroster.controller.*;
import com.mycompany.classroster.ui.*;
import com.mycompany.classroster.dao.*;
import com.mycompany.classroster.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Manny
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        UserIO myIo = new UserIOConsoleImp();
        ClassRosterView myView = new ClassRosterView(myIo);
        ClassRosterDao myDao = new ClassRosterDaoFileImp();
        ClassRosterAuditDao myAuditDao = 
           new ClassRosterAuditDaoFileImp();
        ClassRosterServiceLayer myService = 
           new ClassRosterServiceLayerImpl(myDao, myAuditDao);
        ClassRosterController controller = 
           new ClassRosterController(myView, myService);
        controller.run();
        */
        
        ApplicationContext ctx = 
           new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassRosterController controller = 
           ctx.getBean("controller", ClassRosterController.class);
        controller.run();
 
    }
    
}
