/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package githubjavaassignment.newpackage;

/**
 *
 * @author 350265507
 */
public class Verdict {
    //create private variables
    private String caseName;
    private String studentVerdict;
    private String reason;
    /**
     * empty constructor
    */
    public Verdict(){
        caseName = "empty";
        studentVerdict = " empty";
        reason = "empty";
    }
    /**
     * constructor with parament 
     * @param caseName variable to store
     * @param verdict variable to store
     * @param reason variable to store
     */
    public Verdict(String caseName, String verdict,String reason){
        this.caseName = caseName;
        this.reason = reason;
        this.studentVerdict = verdict;
    }
    /**
     * set a new value to Case Name
     * @param caseName new value to the Case name
     */
    public void setCaseName(String caseName){
        this.caseName = caseName;
    }
    /**
     * get the current name 
     * @return give the value out
     */
    public String getCaseName(){
        return caseName;
    }
    /**
     * set the new value to the reason
     * @param reason new reason to store
     */
    public void setReason(String reason){
        this.reason = reason;
    }
    /**
     * get the current reason
     * @return give the reaosn out
     */
    public String getReason(){
        return reason;
    }
    /**
     * set the new student verdict
     * @param studentVerdict new Verdict need to store
     */
    public void setStudentVerdict(String studentVerdict){
        this.studentVerdict = studentVerdict;
    }
    /**
     * get the current studentVerdict
     * @return give the studentVerdict
     */
    public String getStudentVerdict(){
        return studentVerdict;
    }
    /**
     * give out the describe for the file
     * @return give the object info
     */
    public String toString(){
        return caseName+studentVerdict + reason;
    }
}
