package githubsolvequadraticswithgui;
import java.util.Scanner;

public class GitHubSolveQuadraticsWithGui {


    public static void main(String[] args) {

        //Quadratic Equation Root Finder code, without the GUI
                double A, B, C;
        

        
        double Output1, Output2, Answer1, Answer2;

        String Answer;
       String Factor1, Factor2;
       
        Scanner Coeff = new Scanner(System.in);
        
        int UserInput = Coeff.nextInt();
        A = UserInput;
        
        int UserInput2 = Coeff.nextInt();
        B = UserInput2;
                
        int UserInput3 = Coeff.nextInt();
        C = UserInput3;
        
        //calculations from user input
        
                Output1 = -B+Math.sqrt((B*B)-(4*A*C));
        
        Answer1 = Output1/(2*A);
        
        
               
        
        Output2 = (-B-Math.sqrt((B*B)-(4*A*C)));
        
        Answer2 = Output2/(2*A);
        
        
        
        if (Answer1<0){
        
        Factor1 = "(x+"+(Answer1*-1)+")";
               }
        else {
            Factor1 = "(x"+(Answer1*-1)+")";
        }
        
                if (Answer2<0){
        
        Factor2 = "(x+"+(Answer2*-1)+")";
               }
        else {
            Factor2 = "(x"+(Answer2*-1)+")";
        }
        
        
        
        Answer=Factor1+Factor2;
       
        System.out.println("The factors are "+Answer);
        System.out.println("The solutions are "+Answer1+", "+Answer2);
        
        
        
        
        
    }
    
}
;
;