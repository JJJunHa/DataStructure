package HashMap;

import java.util.ArrayList;

public class HashMap2<K,V> implements Map2<K,V> {
	
	ArrayList<K> keybox = new ArrayList<K>();
	ArrayList<V> valuebox = new ArrayList<V>();

	@Override
	public void put(K key, V value) {
		boolean flag=true;
		int i=0;
		int reviceNum=0;
		for(K x:keybox ) {
			if(x==key&&x.equals(key)) {
				flag=false;
				reviceNum=i;
			}
			i++;
		}
		if(!flag) {
			keybox.set(reviceNum, key);
			valuebox.set(reviceNum, value);
		}
		if(flag) {
			this.valuebox.add(value);
			this.keybox.add(key);
		}
		
		
	}


	@Override
	public Object get(Object key) {

		int i=0;
		for(K x:keybox ) {
			if(x==key&&x.equals(key)) {
				return valuebox.get(i);
				
			}
			i++;
		}
		return null;
	}
	
	public String toString() {
		String result="";
		for(int i=0; i<keybox.size(); i++) {
			result+=keybox.get(i)+"="+valuebox.get(i);
			if(i==keybox.size()-1)break;
			result+=", ";
		}
		return "{"+result+"}";
		
	}
}
