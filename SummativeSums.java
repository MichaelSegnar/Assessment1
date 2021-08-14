
public class SummativeSums {
    public static void main(String[] args) {

    	int [] list1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
    	int [] list2 = { 999, -60, -77, 14, 160, 301 };
    	int [] list3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };
    	System.out.println("#1 Array Sum: " + Sum(list1));
    	System.out.println("#2 Array Sum: " + Sum(list2));
    	System.out.println("#3 Array Sum: " + Sum(list3));
    }
    
    public static int Sum(int [] waffles)
    {
    	int wafflePower = 0;
    	
    	for(int yum : waffles)
    	{
    		wafflePower += yum;
    	}
    	
    	return wafflePower;
    }
}
