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
    
    private String mediaType;//create the string variable symbolized the type of media
    
    /**
     * the constructor for class
     * @param caseTitle the string variable symbolize the title
     * @param description the string variable symbolize the description
     * @param mediaType the string variable symbolize the mediaType
     */
    public MisinformationCase(String caseTitle, String description, String mediaType) {
        super(caseTitle, description, "Misinformation");
        this.mediaType = mediaType;
    }
    
    
  
    /**
     * the method used to output media type
     * @return the media type with string variable
     */
    public String getMediaType(){
        return this.mediaType;
    }
    
    /**
     * The method used to output the sentences including informations with particular format
     * @return the sentence by string variable
     */
    public String toString(){
        return super.toString() + this.mediaType;
    }
    
}
