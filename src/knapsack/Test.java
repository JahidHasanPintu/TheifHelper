
package knapsack;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author pin2
 */
public class Test {

    public void knapsackGreProc(int W[], int V[], int M, int n,String name[]) {
	KnapsackPackage[] packs = new KnapsackPackage[n];
        //KnapsackPackage[] resulting = new KnapsackPackage[n];
	for (int i = 0; i < n; i ++) {
		packs[i] = new KnapsackPackage(W[i], V[i],name[i]);
	}
	
	Arrays.sort(packs, new Comparator<KnapsackPackage>() {
		@Override
		public int compare(KnapsackPackage kPackA, KnapsackPackage kPackB) {
			return kPackB.getCost().compareTo(kPackA.getCost());
		}
	});
	
	int remain = M;	
double result = 0d;
int quan[]= new int[]{0,0,0,0,0};
	
	int i = 0;
	boolean stopProc = false;
	while (!stopProc) {
		if (packs[i].getWeight() <= remain) {
			remain -= packs[i].getWeight();
			result += packs[i].getValue();
                        quan[i]++;
			
			//System.out.println(packs[i].getName()+ " - Weight " + packs[i].getWeight() + " - Value " + packs[i].getValue());
		}
		
		if (packs[i].getWeight() > remain) {
			i ++;
		}
		
		if (i == n) {
			stopProc = true;
		}
	}
        Result res1=new Result();
        
        res1.firstF.setText(packs[0].getName());
        res1.secondF.setText(packs[1].getName());
        res1.thirdF.setText(packs[2].getName());
        res1.fourthF.setText(packs[3].getName());
        res1.fifthF.setText(packs[4].getName());
        
        res1.finCQ1.setText(Integer.toString(packs[0].getWeight()*quan[0]));
        res1.finIQ1.setText(Integer.toString(packs[1].getWeight()*quan[1]));
        res1.finMQ1.setText(Integer.toString(packs[2].getWeight()*quan[2]));
        res1.finBQ1.setText(Integer.toString(packs[3].getWeight()*quan[3]));
        res1.finPQ.setText(Integer.toString(packs[4].getWeight()*quan[4]));
        
        
        res1.finCP.setText(Integer.toString(packs[0].getValue()*quan[0]));
        res1.finIP.setText(Integer.toString(packs[1].getValue()*quan[1]));
        res1.finMP.setText(Integer.toString(packs[2].getValue()*quan[2]));
        res1.finBP.setText(Integer.toString(packs[3].getValue()*quan[3]));
        res1.finPP.setText(Integer.toString(packs[4].getValue()*quan[4]));
        
        res1.tP.setText(Double.toString(result));
        
        
	for(i=0;i<n;i++){
        System.out.println(packs[i].getName()+ " - Weight " + packs[i].getWeight()*quan[i] + " - Value " + packs[i].getValue()*quan[i]);
        }
	System.out.println("Max Value:\t" + result);
        
}
    public void run() {
	/*
	 * Pack and Weight - Value
	 */
        Home h1=new Home();
            String[] pName = { "Apple", "Orange", "Malta","Grape","Sugar" }; 
    int W[] = new int[]{15, 10, 2, 4,3};
    int V[] = new int[]{30, 25, 2, 6,6};

/*
	int W[] = new int[5];
        W[0]= Integer.parseInt(h1.AppQ.getText());
        W[1]= Integer.parseInt(h1.OraQ.getText());
        W[2]= Integer.parseInt(h1.MalQ.getText());
        W[3]= Integer.parseInt(h1.GraQ.getText());
        W[4]= Integer.parseInt(h1.SugQ.getText());
	
//
	int V[] = new int[5];
        V[0]= Integer.parseInt(h1.AppP.getText());
        V[1]= Integer.parseInt(h1.OraP.getText());
        V[2]= Integer.parseInt(h1.MalP.getText());
        V[3]= Integer.parseInt(h1.GraP.getText());
        V[4]= Integer.parseInt(h1.SugP.getText());
	
         */
	
	/*
	 * Max Weight
	 */
//int M = 37;
	int M = 15;//Integer.parseInt(h1.BagS.getText());
	int n = 5;
	
	/*
	 * Run the algorithm
	 */
       // KnapsackPackage[] knapres=new KnapsackPackage[5];
	knapsackGreProc(W, V, M, n,pName);
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    Test t =new Test();
   t.run();
   
        
    new Result().setVisible(true);
    
        
    }

    
}
