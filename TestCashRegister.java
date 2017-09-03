



public class TestCashRegister
{

   

    
    public static void main(String[] args) 
    {
       try
       {    
        CashRegister x = new CashRegister();
        x.receipt();
       
       }
       catch(Exception e)
       {    
        System.out.println("wrong input please try again...");
       }
    }
    
}
