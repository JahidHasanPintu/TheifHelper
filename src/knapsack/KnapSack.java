/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knapsack;

/**
 *
 * @author pin2
 */
public class KnapSack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SplashScreen s1= new SplashScreen();
        s1.setVisible(true);
        Home log1=new Home();
         try 
                  {
                for(int x=0;x<=100;x++)
                      {
              Thread.sleep(110);
              
              s1.percent.setText(Integer.toString(x)+"%");
              s1.jp1.setValue(x);
            
                 if(x==100)
                     {
                   s1.setVisible(false);
                   log1.setVisible(true);
            
                     }
                     }
                   } 
                 catch (Exception e) 
                 {
                 }
         
    }
    
}
