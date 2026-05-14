/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package githubjavaassignment.newpackage;

/**
 *
 * @author 350265507
 */
public class MisinformationCase extends EthicsCase{
    
    private String mediaType;
    
    public MisinformationCase(String caseTitle, String description, String mediaType) {
        super(caseTitle, description, "Misinformation");
        this.mediaType = mediaType;
    }
    
    
  
    
    public String getMediaType(){
        return this.mediaType;
    }
    
    public String toString(){
        return super.toString() + this.mediaType;
    }
    
}
