// operatins Traversing,insertion,deletion,removing,search
import java.util.*;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

public class StaticArray{
    public static void main(String[] args) {
        // creation of an array
        int sizeOfArray = 6;
        int[] NewArray = new int[sizeOfArray];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<NewArray.length;i++){
            NewArray[i] = sc.nextInt();
        }

        // Traversing an array
        if(sizeOfArray==0){
            System.out.println("There are now array elements present in an array");
        }
        else{
            for(int k=0;k<sizeOfArray;k++){
                System.out.print(NewArray[k]);
            }
        }
      
        // Searching for the element
        if(sizeOfArray==0){
            System.out.println("there are no elements presen tin an array so no searching operation is done for this array");
        }
        else{
            int searchElement = sc.nextInt();
            for(int k=0;k<sizeOfArray;k++){
                if(searchElement==NewArray[k]){
                    System.out.println("The element id found at index "+k);
                }
                else{
                    System.out.println("element is not found in the array");
                }
            }
        }

        //Insertion for a static array is quite difficult because it is having a fixe size so we need to create a new array
        if(sizeOfArray==0){
            System.out.println("Insertion operation is not possible here");
        }
        else if(sizeOfArray>0 && NewArray[0]==0){
            for(int k=0;k<sizeOfArray;k++){
                NewArray[k] = sc.nextInt();
            }
        }
        else{
            int newsizeIncreaseForNewArray = sc.nextInt();
            int[] SecondNewArray = new int[newsizeIncreaseForNewArray];
            int IndexAtWhichTheElementNeedsToBeInserted = sc.nextInt();
            int InsertionElement = sc.nextInt();
            for(int m=0;m<sizeOfArray;m++){
                if(m!=IndexAtWhichTheElementNeedsToBeInserted){
                    SecondNewArray[m]=NewArray[m];
                }
                else{
                    SecondNewArray[m]=InsertionElement;
                }
            }
        }

        // removing an element from an array it also needs to have a new array
        int thirdSize = sc.nextInt();
        int[] ThirdArray =new int[thirdSize];
        int ElementToBeRemoved = sc.nextInt();
        for(int n=0;n<thirdSize;n++){
            if(ElementToBeRemoved==)

        }
    }
}