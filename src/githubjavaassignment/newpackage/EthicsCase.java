/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package githubjavaassignment.newpackage;

/**
 *
 * @author 350265507
 */
public class EthicsCase {
    //create three string variables for three necessary informations
    private String caseTitle;
    private String description;
    private String category;
    //create "has-a" relationship with class Verdict
    public Verdict verdict;
    
    /**
     * the constructor for the class
     * @param caseTitle String variable symbolize the titile
     * @param description String variable symbolize the description
     * @param category String variable symbolize the category
     */
    public EthicsCase(String caseTitle, String description, String category){
        this.caseTitle = caseTitle;
        this.description = description;
        this.category = category;
    
    }
    
    /**
     * The method used to get title
     * @return the title with string type
     */
    public String getCaseTitle(){
        return this.caseTitle;
    
    }
    
    /**
     * The method used to get description
     * @return the description with string type
     */
    public String getCaseDescription(){
        return this.description;
    
    }
    
    /**
     * The method used to get category
     * @return the category with string type
     */
    public String getCategory(){
        return this.category;
    
    }
    
    /**
     * The method used to get verdict
     * @return the verdict with Verdict class
     */
    public Verdict getVerdict(){
        return this.verdict;
    }
    
    /**
     * the sentences used to output the informations with particular format
     * @return sentence with string
     */
    public String toString(){
        return caseTitle + description + category;
    }
    
    
}
