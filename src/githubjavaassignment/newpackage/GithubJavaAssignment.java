/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package githubjavaassignment.newpackage;

/**
 *
 * @author 350325485
 */
public class GithubJavaAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PrivacyCase PC = new PrivacyCase ("Data leak Case", " Company Exposed emials publicly", "Personal Data");
        System.out.println(PC);
        PC.verdict = new Verdict("data leak Case", "Unthical", "user data was shared without consent");
        System.out.println(PC.verdict);
        System.out.println(PC.getCaseDescription());
        System.out.println(PC.getCategory());
        System.out.println(PC.getDataType());
    }
    
}
