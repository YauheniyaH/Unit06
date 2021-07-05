package com.epam.unit06.task01;

public class CounterOptionsView {

	public static void main(String[] args) {
		
		 Counter counter1=new Counter();
		 
		 System.out.println("counter1 minValue= "+counter1.getMinValue());
		 System.out.println("counter1 minValue= "+counter1.getMaxValue());
		 System.out.println("counter1 value= "+counter1.getValue());
		 
		 counter1.setMinValue(50);
		 counter1.setMaxValue(123);
		 counter1.setValue(76);
		 counter1.decrease();
		 counter1.increase();
		 
		 System.out.println("counter1 minValue= "+counter1.getMinValue());
		 System.out.println("counter1 minValue= "+counter1.getMaxValue());
		 System.out.println("counter1 value= "+counter1.getValue());
		 
		 Counter counter2= new Counter (15,1);
		 System.out.println("counter2 minValue= "+counter2.getMinValue());
		 System.out.println("counter2 minValue= "+counter2.getMaxValue());
		 System.out.println("counter2 value= "+counter2.getValue());
		 
		 Counter counter3=new Counter  (12,2,10);
		 counter3.increase();
		 counter3.increase();
		 counter3.increase();
		 System.out.println("counter3 minValue= "+counter3.getMinValue());
		 System.out.println("counter3 minValue= "+counter3.getMaxValue());
		 System.out.println("counter3 value= "+counter3.getValue());

	}

}
