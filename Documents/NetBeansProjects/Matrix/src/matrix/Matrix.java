/*
Creating two random Metrixes and swapp the elements below the 
Left diagonal with each other
 */
package matrix;


import java.util.Random;
/**
 *
 * @author Manoj Rasika
 */

public class Matrix {
 
   
    public static void main(String args[] ){
    }
        
    private void random(){
        //creating random dimentions of A and B Matrixs
        Random randA = new Random();
        int rowM = randA.nextInt();
        int columnN = randA.nextInt();
   
        Random randB = new Random();
        int rowO = randB.nextInt();
        int columnP = randB.nextInt();
        
       
    
       
    }
    private void Array (int[][] twoDArrayA){
        
         //creating random elements for A and B Matrixs
        Random elimentA = new Random();
                
        int [][] twoDArrayA =
       
        for  ( int i=0;  -10 < i && i < 10; i = elimentA.nextInt()){ 
        for  ( int j=0;  -10 < j && j < 10; j = elimentA.nextInt()){
            
        }
            System.out.print(twoDArrayA[i][j] + "  " );
        }
        
        Random elimentB = new Random();
                
        int [][] twoDArrayB =
       
        for  ( int r=0;  -10 < r && r < 10; r = elimentB.nextInt()){ 
        for  ( int s=0;  -10 < s && s < 10; s = elimentB.nextInt()){
            
        }
            System.out.print(twoDArrayB[r][s] + "  " );
        }
    }
    }
}