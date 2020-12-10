package Tugas1;

public interface Interface {
	
	default void registrasi(String fullname,int id) {	
		
		System.out.println("Nama Mahasiswa = "+fullname);
		System.out.println("Id Mahasiswa = "+id);
	}
	
	public void learningplan(String name, int sks,int room);
}
