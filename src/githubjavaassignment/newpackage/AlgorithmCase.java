/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package githubjavaassignment.newpackage;

/**
 *
 * @author 350265507
 */
public class AlgorithmCase extends EthicsCase{
    //create some private variabel
    private String biasType;
    /**
     * constructor 
     * @param caseTitle variable to parent class
     * @param description
     * @param category
     * @param biasType
     */
    public AlgorithmCase(String caseTitle, String description, String biasType){
        super(caseTitle, description, "AlgorithmCase");
        this.biasType =biasType;
    }
    /**
     * get the bias type 
     * @return return the value
     */
    public String getBiasType(){
        return biasType;
    }
    @Override
    /**
     * make the description
     * @return give some information
     */
    public String toString(){
        return biasType;
    }
}
