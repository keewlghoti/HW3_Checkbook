

/*
 * Write checkbook info to the check
 */
public class Check
{
    
    public double checkAmount = 0.0; //amount the check is for
    private int checkNumber; //to hold the check number 
    private String checkPayee =  null; //string to capture the "who"
    private String checkReason =  null;// string to capture "why"
    private String checkPayer =  null;
    
    public Check(double amount, String payee, String reason)
    {
       //initialize the check's values
       checkAmount = amount; 
       checkNumber = 0;
       checkPayee = payee;
       checkReason = reason;
       checkPayer = "Mike Bell";// i know its overcoded, left this hardcode in but could swap for varible later
       
    }
    
    public double checkAmountValue()
    {
        return checkAmount; //returns value when method is called        
    }
    
    public void checkAmountValueFix(double amount)
    {
        checkAmount = amount; //user sets value
    }
    
    public String checkPayee()
    {
        return checkPayee; //returns value when method is called 
    }
    
    public void checkPayeeValueFix(String payee)
    {
        checkPayee = payee; //user sets value
    }
    
    public String checkReason()
    {
        return checkReason; //returns value when method is called 
    }
    
    public void checkReasonValueFix (String reason)
    {
       checkReason = reason; //user sets value
    }
    
    public void printCheck()
    {
        System.out.println(checkPayer + "    " + checkNumber);
        System.out.println("Pay to the order of: " + checkPayee + "     " + checkAmountValue());
        System.out.println("For: " + checkReason);
       
        //prints single check by it's self
    }
}