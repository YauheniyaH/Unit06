package com.epam.unit06.task01;

public class Counter {

	private int minValue;
	private int maxValue;

	private int value;

	public int getMinValue() {
		return minValue;
	}

	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

	public Counter() {
		minValue = 0;
		maxValue = 100;

		value = minValue;

	}

	public Counter(int minValue, int maxValue) {
		if (minValue > maxValue) {
			this.minValue = maxValue;
			this.maxValue = minValue;
		} else {
			this.minValue = minValue;
			this.maxValue = maxValue;

		}
		this.value = this.minValue;

	}

	public Counter(int minValue, int maxValue, int startValue) {

		if (minValue > maxValue) {
			this.minValue = maxValue;
			this.maxValue = minValue;
		} else {
			this.minValue = minValue;
			this.maxValue = maxValue;

		}
		
		if(startValue<this.minValue | startValue>this.maxValue) {
			System.out.println("Incorrect startValue");
		}else {
			value=startValue;
		}

	}

	public int increase() {
		value = value + 1;
		if (value > maxValue) {
			value = maxValue;
		}
		return value;
	}

	public int decrease() {
		value = value - 1;
		if (value < minValue) {
			value = minValue;
		}
		return value;
	}

}
