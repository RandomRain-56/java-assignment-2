/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package githubjavaassignment.newpackage;

/**
 *
 * @author 350265507
 */
public class PrivacyCase extends EthicsCase{
    //add some private variabel
    private String dataType;
    /**
     * constructor
     * @param caseTitle variable for parent class
     * @param description variable for parent class
     * @param dataType variable for parent class
     */
    public PrivacyCase(String caseTitle, String description,String dataType){
        super(caseTitle, description);
        this.dataType = dataType;
    }
    /**
     * give the data type 
     * @return give the data type
     */
    public String getDataType(){
        return dataType;
    }
    /**
     * give out the basic information
     * @return give out the basic information
     */
    public String toString(){
        return dataType;
    }
}
