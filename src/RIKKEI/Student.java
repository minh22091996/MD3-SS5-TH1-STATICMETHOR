package RIKKEI;

public class Student {
    private int rollNo;
    private String name;
    private static String college = "BBDIT";
    Student(int x, String n) {
        rollNo = x;
        name = n;
    }
    static void change(){
        college = "RIKKEI";
    }
    void display(){
        System.out.println(rollNo + "" + name + "" + college);
    }
}
