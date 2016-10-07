/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daverickdunn.ct417.registrationsystemtest;

import com.daverickdunn.ct417.registrationsystem.*;

import java.util.Iterator;

/**
 *
 * @author Dave
 */
public class testClass {
   
    private static CourseProgramme course;
    private static Student student_a;
    private static Student student_b;
    private static Student student_c;
    private static Student student_d;
    
    public static void main(String args[]){
        
        course = new CourseProgramme("BCT1 Bachelor of Science (Computer Science & Information Technology)");
        course.setStartDate("07-09-2016");
        course.setEndDate("30-04-2017");
        
        student_a = new Student("John", 21, "01/03/88");
        student_b = new Student("Mary", 22, "02/03/88");
        student_c = new Student("Jane", 23, "03/03/88");
        student_d = new Student("Jack", 24, "04/03/88");
        
        Module module_a = new Module("Software Engineering III", "CT417");
        Module module_b = new Module("Modern Information Management", "CT422");
        Module module_c = new Module("Machine Learning & Data Mining", "CT475");
        Module module_d = new Module("Systems Modelling and Simulation", "CT561");
        
        module_a.addStudent(student_a);
        module_a.addStudent(student_b);
        
        module_b.addStudent(student_c);
        module_b.addStudent(student_d);
        
        module_c.addStudent(student_a);
        module_c.addStudent(student_b);
        module_c.addStudent(student_c);
        module_c.addStudent(student_d);
        
        module_d.addStudent(student_a);
        module_d.addStudent(student_d);
                                
        course.addModule(module_a);
        course.addModule(module_b);
        course.addModule(module_c);
        course.addModule(module_d);
        
        System.out.println(course.toString());
        printStudent(student_a);
        printStudent(student_b);
        printStudent(student_c);
        printStudent(student_d);
        
    }
    
    public static void printStudent(Student student){
        System.out.println("~~~~~~~~~~~~~~~~~");
        System.out.println(student.toString());
        for (Iterator<Module> iter = student.getModules().listIterator(); iter.hasNext(); ) {
            Module m = iter.next();
            System.out.println(m.toString());
        }
    }
    
}
