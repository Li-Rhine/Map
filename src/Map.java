public interface Map<K, V> {
    int getSize();
    boolean isEmpty();
    void add(K k, V v);
    boolean contains(K key);
    V get(K key);
    void set(K key, V newValue);
}
