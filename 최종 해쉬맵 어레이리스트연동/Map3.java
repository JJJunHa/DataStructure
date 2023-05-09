package HashMap;

public interface Map3<K,V> {
	V get(K key);
    V put(K key, V value);
    String toString();
    V remove(K key);
}
