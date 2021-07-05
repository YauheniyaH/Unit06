package com.epam.unit06.task02;

public class TimeInspertor {

	public static void main(String[] args) {
		Time t = new Time();
		
		System.out.println("t = hours "+t.getHours()+" minutes "+ t.getMinutes()+ " seconds "+ t.getSeconds());

		Time t2 ;
		t2= new Time(25,60,1);
		System.out.println("t2 = hours "+t2.getHours()+" minutes "+ t2.getMinutes()+ " seconds "+ t2.getSeconds());
		t2.setHours(14);
		t2.setMinutes(67);
		t2.setSeconds(45);
		System.out.println("t2 = hours "+t2.getHours()+" minutes "+ t2.getMinutes()+ " seconds "+ t2.getSeconds());
		t2.setMinutes(7);
		System.out.println("t2 = hours "+t2.getHours()+" minutes "+ t2.getMinutes()+ " seconds "+ t2.getSeconds());

		System.out.println(t2.getMinutes());
		
		t2.add(5, 20, 34);
		System.out.println("t2 = hours "+t2.getHours()+" minutes "+ t2.getMinutes()+ " seconds "+ t2.getSeconds());
		t.setHours(4);
		t.setMinutes(53);
		t.setSeconds(12);
		System.out.println("t  = hours "+t.getHours()+" minutes "+ t.getMinutes()+ " seconds "+ t.getSeconds());
		
		t2.add(t);
		
		System.out.println("t2 = hours "+t2.getHours()+" minutes "+ t2.getMinutes()+ " seconds "+ t2.getSeconds());
		
		t2.decrease(t);
		
		System.out.println("t2 = hours "+t2.getHours()+" minutes "+ t2.getMinutes()+ " seconds "+ t2.getSeconds());
	}

}
