/**
 *
 * @author James Holmes
 */
import java.util.Scanner;
import java.util.ArrayList;

public class StudyHabits {

    private Scanner reader;
    private ArrayList<String> listOfStudents;
    private ArrayList<Student> students;
    
    /**
     * @param args the command line arguments
     */
    public StudyHabits(Scanner scanner){
        this.reader = scanner;
        this.listOfStudents = new ArrayList<String>();
        this.students = new ArrayList<Student>();
    }
    
    public void start(){
        while(true){
            System.out.println("Please select from one of the following:\n   -Create a student\n   -Enter a student to update\n   -Exit");//   -Add Study Time\n   -Add Exam Grades\n   -Print Study Hours\n   -Print Grade Results\n   -Exit");
            String selection = this.reader.nextLine().toLowerCase();
            if(selection.equals("exit")){
                break;
            } else if(selection.equals("create a student")){
                System.out.println("Please enter the student's full name: ");
                String name = this.reader.nextLine();
                Student student = new Student(name);
                this.students.add(student);
                this.listOfStudents.add(name);
            }  else if(selection.equals("enter a student to update")){
                System.out.println("Please select either 'update study hours' or 'update exam grades': ");
                String choice = this.reader.nextLine().toLowerCase();
                if(choice.equals("update study hours")){
                    studentStudyUpdate();
                } else if(choice.equals("update exam grades")){
                    studentExamGradeUpdate();
                }                
            }
        }
        System.out.println("Please enter who you would like to see: ");
        String name = this.reader.nextLine();
        for(Student students : this.students){
            if(students.getName().equals(name)){
                System.out.println(students.printStudyInformation());
            }
        }
    }
    
    public void studentExamGradeUpdate(){
        System.out.println("Print student's full name here: ");
        String studentName = this.reader.nextLine().toLowerCase();
        System.out.println("Please enter the exam they took: ");
        String exam = this.reader.nextLine().toLowerCase();
        System.out.println("Please enter their score(decimal form): ");
        double score = Double.parseDouble(reader.nextLine());
        for(Student students : this.students){
            String name = students.getName();
            if(name.equals(studentName)){
                students.updateExamScores(exam, score);
            } else{
                System.out.println("There is no student with that name currently added to this list.");
                break;
            }
        }
    }
    
    public void studentStudyUpdate(){
        System.out.println("Print student's full name here: ");
        String studentName = this.reader.nextLine().toLowerCase();
        System.out.println("Please enter the exam they studied for: ");
        String exam = this.reader.nextLine().toLowerCase();
        System.out.println("Please enter the number of hours studied(decimal form): ");
        double numberOfHours = Double.parseDouble(this.reader.nextLine());
        for(Student students : this.students){
            String name = students.getName();
            if(name.equals(studentName)){
                students.updateStudyHours(exam, numberOfHours);
            } else{
                System.out.println("There is no student with that name currently added to this list.");
                break;
            }
        }
    }
}
