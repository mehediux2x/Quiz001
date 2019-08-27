package classQuizes;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassExam001 {

    //create a program which will
    // - take a specific number of student name from the console
    // - for each student, it should ask for 4 subjects name and marks for them all
    // - your code should get the avg marks & total for the each of the students
    // - store all the students name, marks, subjects in individual ArrayList/Hashset and print all subjects, students name from that

    //Tips : You may want to use Scanner, ArrayList, HashSet/ArrayList
    //Your code needs to by dynamic enough to handle as many numbers of student user may want to.
    //Think Smartly !


    double avg = 0;

    ClassExam001(int a[]) {
        for (int i = 0; i < a.length; i++) {
            avg = avg + a[i];
        }
    }

        public static void main(String args[])
        {
            int i;

//            ArrayList<String>nameOfStudents = new ArrayList<String>();
//            nameOfStudents.add("ahamed");
//            nameOfStudents.add("iftekar");
//            nameOfStudents.add("md");
//            nameOfStudents.add("mehedi");
//            nameOfStudents.add("hasan");
//            System.out.println("Enter name of the students = "+ nameOfStudents);




            System.out.println("Enter number of subjects");
            Scanner sc=new Scanner(System.in);

            //ArrayList studentNameList = new ArrayList();

            int n=sc.nextInt();

            int[] a=new int[n];




            System.out.println("Enter Subject name ,"+"Then nextLine  "+"Enter marks");

            for( i=0;i<n;i++)
            {
                String studentName = sc.next();

                a[i]=sc.nextInt();

            }

            ClassExam001 c=new ClassExam001(a);

            System.out.print("Average of (");

            for(i=0;i<n-1;i++)
            {
                System.out.print(a[i]+",");
            }
            System.out.println(a[i]+") ="+c.avg/n);


        }

        }


