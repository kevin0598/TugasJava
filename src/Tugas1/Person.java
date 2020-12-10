package Tugas1;

public class Person {
	private String domisili;
	private int sks;	

	public Person() {
		
	}
	
	public Person(String domisili) {
		super();
		this.domisili=domisili;
	}

	public int getSks() {
		return sks;
	}

	public void setSks(int sks) {
		this.sks = sks;
	}

	public String getDomisili() {
		return domisili;
	}

	public void setDomisili(String domisili) {
		this.domisili = domisili;
	}

	
}
