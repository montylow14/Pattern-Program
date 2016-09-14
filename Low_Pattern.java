import javax.swing.*;

public class Low_Pattern
{
   public static void main(String[] args)
   {
      //declaration statements
       int startingValue;
       int counter=1;
       int workingNum;
       
       String showSeq; //Does the user want to see the numbers in the sequence Yes/No
       String startingStr;
       String outputString; //The sequence of number to show at the end
       
       //Get a starting number
       startingStr = JOptionPane.showInputDialog("Enter a positive starting value: ");
       startingValue = Integer.parseInt(startingStr);
       
       //Make sure that the starting value is positive and keep asking until it is positive.
       while(startingValue <= 0)
       {
          startingStr = JOptionPane.showInputDialog("The number was not a valid starting value. \nPlease enter a positive starting value: ");
          startingValue = Integer.parseInt(startingStr);
       } 
       
       showSeq = JOptionPane.showInputDialog("Do you want to see the\n numbers in the sequence? (Y)es or (N)o");
       
       workingNum = startingValue;
       outputString = startingStr;
       
       //Start the pattern and continue until you get 1:  Odd 3N+1 Even N/2              
       while(workingNum != 1)
       {
            if(workingNum%2 == 0)
            {
               workingNum = workingNum/2;
               counter ++;
               outputString = outputString+ ", " + workingNum;
            }
            
            else
            {
              workingNum = 3 * workingNum + 1;
              counter++;
              outputString = outputString+ ", " +workingNum;
            }
        }
        
        
        if(showSeq.equals("y") || showSeq.equals("Y") || showSeq.equals("Yes") || showSeq.equals("yes"))
        {
            outputString = outputString + "\n It took " + counter + " terms in the sequence.";    
        }
        else
        {
            outputString = "It took " + counter + " terms in the sequence.";
        }
        
         JOptionPane.showMessageDialog(null, outputString,"3N+1 Pattern",1);     
    }
}       