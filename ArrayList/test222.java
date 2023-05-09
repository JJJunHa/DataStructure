
import java.util.ArrayList;

public class test222 {

	public static void main(String[] args) {
//		int length = 0;
//		String []arry=new String[length];
//		String []arry1= null;
//		
//		System.out.println("Thread.name - "+Thread.currentThread().getName());
//		//get
//		//add
//		//remove
//		//toString
//		//size
//		
		ArrayList<String> test= new ArrayList<String>();
//		ArrayList2 test2= new ArrayList2();
//		test2.add("check1");
//		test2.add("check2");
//		test2.add("check3");
//		test2.add("check4");
//		test2.add("check5");
//		
//		
//		test.add("test");
//		System.out.println(test2.add("check6"));
//		System.out.println(test2.get(0));
//		System.out.println(test2.remove(0));
//		System.out.println(test2.toString());
//		System.out.println(test2.size());
//		Even test =new Even();
//		
//		for(int x:test.OddNum(300)) {
//			System.out.println(x);
//		}
		
		int x = 10;
		EvenInterface even = new Even();
        int[] evenNums = even.EvenNum(x);
        System.out.print("Even Numbers: ");
        for(int i=0; i<evenNums.length; i++) {
            System.out.print(evenNums[i] + " ");
        }
        System.out.println();
        
        EvenInterface odd = new Even();
        int[] oddNums = odd.OddNum(x);
        System.out.print("Odd Numbers: ");
        for(int i=0; i<oddNums.length; i++) {
            System.out.print(oddNums[i] + " ");
        }
        System.out.println();
		
	}

}
