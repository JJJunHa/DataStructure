package HashMap;


import ArrayList.ArrayList3;

public class HashMap3<K, V> implements Map3<K, V> {

    ArrayList3<Pair<K, V>> list = null;

    public HashMap3() {
        list = new ArrayList3<>();
    }

    @Override
    public V get(K key) {
    	int i=0;
    	for(Pair<K, V> x:list) {
    		if(x.getKey()==key||x.getKey().equals(key)) {
    			return list.get(i).getValue();
    		}
    		i++;
    	}
        return null;
    }

    @Override
    public V put(K key, V value) {
        Pair<K, V> newPair = new Pair<K, V>(key, value);
        boolean flag=true;
		int i=0;
		int reviceNum=0;
		V result = null;
		for(Pair<K, V> x:list) {
			if(x.getKey()==key||x.getKey().equals(key)) {
				result = x.getValue();
				flag=false;
				reviceNum=i;
			}
			i++;
		}
		if(!flag) {
			list.set(reviceNum,newPair);
			newPair.setKey(key);
			newPair.setValue(value);
			
		}
		if(flag) {
			this.list.add(newPair);
		}
        return result;
    }
    
    public String toString() {
		String result="";
		for(int i=0; i<list.size(); i++) {
			result+=list.get(i).getKey()+"="+list.get(i).getValue();
			if(i==list.size()-1)break;
			result+=", ";
		}
		return "{"+result+"}";
		
	}
    
    @Override
	public V remove(K key) {
    	int i=0;
    	V removeNum=null;
    	for(Pair<K, V> x:list) {
    		if(x.getKey()==key||x.getKey().equals(key)) {
    			removeNum=list.get(i).getValue();
    			list.remove(i);
    			return removeNum;
    		}
    		i++;
    	}
		return null;
	}
    
    private class Pair<K2, V2> {
        private K key;
        private V value;

        Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        K getKey() {
            return this.key;
        }

        V getValue() {
            return this.value;
        }

        void setKey(K key) {
            this.key = key;
        }

        void setValue(V value) {
            this.value = value;
        }
    }

	
}
