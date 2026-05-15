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
     * 
     * @param caseTitle
     * @param description
     * @param category 
     */
    public EthicsCase(String caseTitle, String description, String category){
        this.caseTitle = caseTitle;
        this.description = description;
        this.category = category;
    
    }
    
    public String getCaseTitle(){
        return this.caseTitle;
    
    }
    
    public String getCaseDescription(){
        return this.description;
    
    }
    
    public String getCategory(){
        return this.category;
    
    }
    
    public String toString(){
        return caseTitle + description + category;
    }
    
    
}
