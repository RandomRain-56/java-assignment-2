/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package githubjavaassignment.newpackage;

/**
 *
 * @author 350265507
 */
public class IntellectualPropertyCase extends EthicsCase{
    
    private String ipType;
    
    public IntellectualPropertyCase(String caseTitle, String description, String ipType) {
        super(caseTitle, description, "IntellectualProperty");
        this.ipType = ipType;
        
    }
    
    public String getIpType(){
        return this.ipType;
    }
    
    public String toString(){
        return super.toString() + this.ipType;
    }
}
