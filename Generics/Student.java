package Generics;

public class Student implements PrintInterface{
    int rollNo;
    public Student(int rollNo){
        this.rollNo=rollNo;
    }
    public void print(){
        System.out.println(rollNo);
    }
}
