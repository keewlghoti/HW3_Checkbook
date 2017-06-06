import java.util.*;

public class CheckBook 
{
    
    private double balance;
    private ArrayList<Check> checkBookRegister;
    public int checkNumber = 1;
    public double checkAmountBook;
    
  
    public CheckBook(double currentBalance){ //initializes object" check book with a starting balance
        balance = currentBalance; 
        checkBookRegister = new ArrayList<Check>(); // defines array
           
        
    }
    
    public void addCheck(Check checkAdd)// method used to add a single check to array
    {
        
        checkAmountBook = checkAdd.checkAmount;// saves array parameter as varible
        double checkBalance = balance - checkAmountBook; //creates varible to see if check with bounce
        if (checkBalance >= 0)//checks for bounce
        {
           checkBookRegister.add(checkAdd); //adds a check to the array
           balance -= checkAmountBook; // auto subtracts amount from the from balance
        }
        else 
        {
            System.out.println("Please check your balance before adding check to checkbook");
        }
    }
       
    public double checkBalanceValue()
    {
        return balance; //returns value when method is called
    }
    
    public double addDeposit(double deposit) //adds a deposit to the balance, then instantly sets the value and returns it
    {
        balance += deposit;
        System.out.println("Your new balance is: " + balance); //take care of the display and the return in 1 method
        return balance;
    }
           
    public void printBalance(){
        System.out.println("Your balance is: " + balance); // method that prints the balance
    }
    
    public void printCheckBook()
    {
        for (Check check : checkBookRegister)//for all objects "check" in array "checkBookRegister"
        {
                check.printCheck(); //prints all checks in array based on the format in method printCheck()
                System.out.println("Check number: " + setCheckNumber()); //prints checknumber based on order in checkbook
                checkNumber ++; 
        }  
    }
    
    //below is a method that i was testing. i was going to pass this value into the array each time addCheck() was called - ill ask you for help
    public int setCheckNumber() //I understand this is a really rough way to add a counter, I just really want a method I can call with this value
    {
        return checkNumber;
    }
}
