
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James Holmes
 */
import java.util.HashMap;
import java.util.ArrayList;

public class Student {
    
    String name;
    private HashMap<String, Double> studyInformation;
    private HashMap<String, Double> gradeInformation;
    private ArrayList<String> examNames;
    
    public Student(String name){
        this.name = name.toLowerCase();
        this.studyInformation = new HashMap<String, Double>();
        this.gradeInformation = new HashMap<String, Double>();
        this.examNames = new ArrayList<String>();
    }
    
    /*public Student(){
        this.name = "";
        this.studyInformation = new HashMap<String, Double>();
        this.gradeInformation = new HashMap<String, Double>();       
    }*/
    
    public String getName(){
        return this.name;
    }

    public void updateStudyHours(String exam, double hours){
        this.studyInformation.put(exam, hours);
    }
    
    public void updateExamScores(String exam, double grade){
        this.gradeInformation.put(exam, grade);
    }
    
    public String printStudyInformation(){
        String answer = "";
        for(String exam : this.studyInformation.keySet()){
            answer += exam + ": " + this.studyInformation.get(exam) + " hours studied\n";
        }
        return answer;
    }
    
    public boolean isExamStudyHere(String exam){
        for(String exams : this.studyInformation.keySet()){
            if(exams.equals(exam)){
                return true;
            }
        }
        return false;
    }
    
    public boolean isExamGradeHere(String exam){
        for(String exams : this.gradeInformation.keySet()){
            if(exams.equals(exam)){
                return true;
            }
        }
        return false;
    }
    
    public void addNewExamGrade(String exam, double grade){
        this.gradeInformation.put(exam, grade);
        this.examNames.add(exam);
    }
    
}
