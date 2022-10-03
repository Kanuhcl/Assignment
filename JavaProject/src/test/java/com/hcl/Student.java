package com.hcl;

class Student {
	
	String name;
	int rollnum;
	Student()
	{
		
		name = "Govinda";
		rollnum = 3;
	}
	
	Student (String str, int n){
		name = str;
		 rollnum = n;
	}
	
	public static void main(String args[]) {
		
		Student s1 = new Student();
		Student s2 = new Student("Govinda kanu", 4);
		System.out.println(s1.name);
		System.out.println (s1.rollnum);
		System.out.println(s2.name);
		System.out.println (s2.rollnum);
		
		
	}
}
