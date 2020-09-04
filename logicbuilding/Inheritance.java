/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicbuilding;


class aktu{
    void dbms(){
        System.out.println("RDBMS");
    }
    void datastructure(){
        System.out.println("Linked Lists");
    }
    void os(){
        System.out.println("Implement it");
    }
}
class KIET extends aktu{
    void python(){
        System.out.println("Python");
    }
}
class RKGIT extends aktu{
    void javascript(){
        System.out.println("JS");
}
}
class GALGOTIA extends aktu{
    void html(){
        System.out.println("Html");
    }
}
class GALGOTIAUNIVERSITY extends GALGOTIA{
    void geeksforgeeks(){
        System.out.println("Part of the university");
    }
}
class Student extends aktu{
    void study(){
        System.out.println("Main Subjects");
    }
}
class Student1 extends KIET{
    void study1(){
        System.out.println("Extra + Main Subjects");
    }
}
class Student2 extends RKGIT{
    void study2(){
        System.out.println("Extra + Main Subjects");
    }
}
class Student3 extends GALGOTIA{
    void study3(){
        System.out.println("Extra + Main Subjects");
    }
}
class Student4 extends GALGOTIAUNIVERSITY{
    void study4(){
        System.out.println("Extra + Main Subjects");
    }
}
class Inheritance{
    public static void main(String[] args) {
        Student s = new Student();
        Student1 s1 = new Student1();
        Student2 s2 = new Student2();
        Student3 s3 = new Student3();
        Student4 s4 = new Student4();
        s.datastructure();
        s.dbms();
        s.os();
        s1.python();
        s2.javascript();
        s3.html();
        s4.geeksforgeeks();
        s.study();
        s3.study3();
        s4.study4();
        
    }
}
