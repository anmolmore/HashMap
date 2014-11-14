package com.anmol.util;


public class MyEntry<K,V> {
	private MyEntry<K, V> next;  //useful for iterating through Map, original Entry also has this and hash
	private final K key;
	private V value;
	
	public MyEntry<K, V> getNext() {
		return next;
	}

	public void setNext(MyEntry<K, V> next) {
		this.next = next;
	}

	public MyEntry(K k,V v) {
		this.key = k;
		this.value = v;
	}
	
	public V getValue() {
		return value;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
}
