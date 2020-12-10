package Tugas1;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person implements Interface{
	private static String nama,name,domisili,matkul;
	private static int id,opsi,sks,room,value;
	private static int totalsks=0;
	static Scanner scan=new Scanner(System.in);	
	ArrayList array = new ArrayList();	
	static ArrayList array2 = new ArrayList();
	public Student() {
		
	}
	
	
	public Student(String domisili) {
		super(domisili);
		array.add(domisili);
	}

	
	public void setHasil() {
		Student student=new Student();		
		student.setSks(totalsks);					
		array.add(student.getSks());		
	}
	
	@Override
	public void learningplan(String name, int sks, int room) {
		array2.add(name);;
		array2.add(sks);;
		array2.add(room);;		
		totalsks=totalsks+sks;
	}	

	@Override
	public String getDomisili() {		
		return super.getDomisili();
	}


	@Override
	public void registrasi(String fullname, int id) {
		sks= (int) array.get(1);
		if (sks==144) {
			fullname=fullname+" S.Kom.";
		} 		
		Interface.super.registrasi(fullname, id);
	}

	public void tampilHasil() {		
		System.out.println("Kota Domisili Mahasiswa = "+array.get(0));
		System.out.println("Jumlah SKS yang di lulusi = "+array.get(1));
	}
	
	public void tampilHasil2() {
		if (array2.size()!=0) {
		for (int counter = 0; counter < array2.size(); counter++)
	        System.out.println((array2.get(counter)));
	} else {
		System.out.println("Belum ada SKS yang di input");
	}}
	
	public void Menu() {		
		while (opsi!=5) {
			Student student=new Student(domisili);
			System.out.println("1.Registrasi Mahasiswa");
			System.out.println("2.Input SKS");
			System.out.println("3.Lihat SKS");
			System.out.println("4.Lihat Hasil");
			System.out.println("5.Exit");
			System.out.print("Pilih Opsi= ");
			opsi=scan.nextInt();
			System.out.println();
			switch(opsi) {
			case 1:						
				System.out.print("Nama Mahasiswa = ");
				nama=scan.next();
				System.out.print("Id Mahasiswa = ");
				id=scan.nextInt();
				System.out.print("Domisili Mahasiswa = ");
				domisili=scan.next();
				break;
			case 2:
				if (nama==null && id==0 && domisili==null) {
					System.out.println("Data siswa masih belum ada");
				} else {				
				System.out.print("Input jumlah Data : "); 
				value= scan.nextInt();
				for(int a = 0; a < value; a++)
		        {
		            System.out.print("Data ke-"+(a+1)+" : ");	
		            System.out.println();
		            //  Masukkan ke dalam ArrayList
		            System.out.print("Nama Matakuliah = ");
		            name=scan.next();
					System.out.print("Jumlah SKS = ");
					sks=scan.nextInt();
					System.out.print("Ruangan = ");
					room=scan.nextInt();
					System.out.println();
					student.learningplan(name, sks, room);						    	
		        }}					
				break;
			case 3:													
				student.tampilHasil2();
				break;
			case 4:
				if (nama==null && id==0 && domisili==null) {
					System.out.println("Data masih kosong");
				} else {
					student.setHasil();				
					student.registrasi(nama, id);
					student.tampilHasil();
				}
				break;
			case 5:				
				System.out.println("Thank you ");
				break;
			default:				
				System.out.println("Invalid Option "); 
			}
			System.out.println("");
			}			
	}


	
}
