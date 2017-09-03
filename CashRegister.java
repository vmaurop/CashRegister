



import java.util.ArrayList;
import java.util.Scanner;




public class CashRegister
        
{

    
    int[] codes = {123,145,124,246,863,539,963,878,754,221};
    double[] prices = {2,1.3,14.2,19.45,15.3,22.1,2.7,3.1,19.05,14.5};
    String[] names = {"coca-cola","juice","honey","wine","Butterfat","salmon","chicken","cigarettes","whiskey","vodka"};
    
     ArrayList<Integer> Codes = new ArrayList<>();
     ArrayList<Double> Prices = new ArrayList<>();
     ArrayList<String> Names = new ArrayList<>();
    
    public double total(ArrayList<Double>Prices)
    {
        double sum = 0;
        for (double i:Prices)
        {
            sum = sum +i;
        }
        
        return sum;
    }
    
    public double givechange(double payment)
    {
            double change;
        
            change = payment-total(Prices);
       
            return change;
    }
    
    
    public void receipt()
    {
        
        int x;
        int counter=0;
        for (int i=0;i<10;i++)
        {    
           System.out.print(names[i]+":"+codes[i]+"  ");
        }  
        System.out.println("\n\nplease select from this codes the products from th list or [0] to print the receipt");
        
        
        Scanner in = new Scanner(System.in);
         
         
        do
                   
        {
          
             
           x = in.nextInt();
         
         for (int i=0;i<10;i++)
         {
             
             if(x==codes[i])
             {
                 Codes.add(codes[i]);
                 Prices.add(prices[i]);
                 Names.add(names[i]);
                 System.out.println(""+names[i]+":"+prices[i]+"$");
                 
                 
             }
             
              else   
                {
                    
                    counter++;
                    if(counter==10&&x!=0)
                     {
                       System.out.println("wrong code insert again..");
                       
                     }
                 }  
             
        }
             
                         
          
            
         counter=0;
       
        }while(x != 0);
            
         
        System.out.println("Your debt is please:"+(double)Math.round(total(Prices)*1000d)/1000d);
        
      
         double payment;
         System.out.print("please pay:");
         payment = in.nextDouble();
        
        while(givechange(payment)<0)
        {
            System.out.println("wrong payment.It's:"+(double)Math.round(total(Prices)*1000d)/1000d);
            System.out.print("again please:");
            payment = in.nextDouble();
        }
        
        
        
        
        
       
        System.out.println("your change:"+(double)Math.round(givechange(payment)*1000d)/1000d);
       
       
        System.out.println("the proof of payment\n\n\n**************");
        
        for (int k=0;k<Names.size();k++)
        {
            System.out.println(""+Names.get(k)+":"+Prices.get(k)+"$");
        }
        System.out.println("---------------");
        System.out.println("Total="+(double)Math.round(total(Prices)*1000d)/1000d);
        System.out.println("Payment="+payment);
        System.out.println("Exchange="+(double)Math.round(givechange(payment)*1000d)/1000d);
    }
    
}
