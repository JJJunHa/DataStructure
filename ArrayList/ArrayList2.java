public class ArrayList2 {
	  private String[]array = {};

	  public ArrayList2() {
		   
	   }

	
	   public boolean add(String a) {
		   try {
		      int len = this.array.length;      // 현재 array 길이를 구함(나중에 1더해야하니깐)
		      String[]array2 = new String[len+1];   // 현재보다 1긴 array 를 하나 만듬 
		      
		      for(int i=0;i<array.length;i++) {      
		         array2[i] = array[i];          // array[1],array[2], array[3]
		      }                           // 현재에 존재하던 data를 새 array에 넣고 새로 추가된것도 넣음
		      array2[array2.length-1] = a;      // 맨 마지막에 입력 data 넣음
		      this.array = array2;
		   } catch (Exception e1) {
			   return false;
		   }
		   return true;
	   }
	   
	 // get
	   public String get(int i) {
	      return this.array[i];
	   }
	   
	// size
	   public int size() {
	      return this.array.length;
	   }
	// remove
	   public String remove(int indexNum) {
	      
	      int len = this.array.length;
	      String[]array2 = new String[len-1];
	      String num2=this.array[indexNum];
	      // i 넣다가 해당 index 에서 안넣고, 그냥 지나감 
	      for(int i=0;i<array2.length;i++) {
	         if(i<indexNum) {
	            array2[i] = array[i];
	         } else {
	            array2[i] = array[i+1];
	         }                           
	      }
	      
	      this.array = array2;
	      return num2;
	   }
	   
	// toString
	   public String toString() {
	      String str = "[";
	      for(int i=0;i<array.length;i++) {
	         str = str + "," + array[i] + "";
	      }
	      str = str + "]";
	      return str.replaceFirst(",","");
	   }



}
