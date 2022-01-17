package Arrays.Homework2;
import java.util.Arrays;

public class ArraysHomework {
    public static void main(String[] args) {
       int[] myarr={10,20,20,10,10,20,5,20};
       int count1=0;
       int count2=0;
       int count3=0;
       for(int i=0;i<myarr.length;i++){
               if(myarr[i]==10){
                   count1++;                   
                }
           else if(myarr[i]==20){
               count2++;                             
           }
           else{ 
           count3++;             
        }   
    
    }
    System.out.println("Array: "+Arrays.toString(myarr));
    System.out.println("The number 10 was repeated "+count1+ " times.");
    System.out.println("The number 20 was repeated "+count2+ " times.");
    System.out.println("The number 5 was repeated "+count3+ " times.");
}  
  }
    

    