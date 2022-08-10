package com.compound.calculator.service;

public class service implements calculatorinterface{
private float principal;
private float time;
private float rate;

public service(float principal,float time,float rate) {
	this.principal = principal; 
	this.time=time;
	this.rate=rate;

}
public service() {
	
}
public float getPrincipal() {
	return principal;
}
public void setPrincipal(float principal) {
	this.principal = principal;
}
public float getTime() {
	return time;
}
public void setTime(float time) {
	this.time = time;
}
public float getRate() {
	return rate;
}
public void setRate(float rate) {
	this.rate = rate;
}
@Override
public float calculate() {
	
	return (float) (principal*Math.pow((1+rate),time));
}

}
