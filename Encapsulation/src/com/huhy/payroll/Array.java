package com.huhy.payroll;

import java.lang.System;
import java.sql.Date;


public class Array {
	int a;
	public Array() {
		// TODO Auto-generated constructor stub
		System.out.println("parent");
	}
	public Array(int b) {
		// TODO Auto-generated constructor stub
		this.a=b;
	}
	public void arr(){
		int a=5;
	}
	
	public static void main(String[] args) {
		
	int i=1;
int[] arr1=new int[5];
 
for(i=0;i<5;i++)
arr1[i]=i+1;

int[] arr2= new int[10];

for(i=0;i<10;i++)
	arr2[i]=i+1;
	
System.arraycopy(arr1, 0, arr2, 0, 5);
System.out.println(arr2[0]);
	}
}
