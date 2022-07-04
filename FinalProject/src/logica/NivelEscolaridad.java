package logica;
public class NivelEscolaridad<K, V> {
	private K key;
	private V value;
	
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	public NivelEscolaridad(K key, V value){
		this.key = key;
		this.value = value;
	}
	}

