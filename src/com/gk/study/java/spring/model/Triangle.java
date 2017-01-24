package com.gk.study.java.spring.model;




public class Triangle  implements Shape/*InitializingBean,DisposableBean*/{
	
	private String type;
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	
	public Triangle(String type){
		this.type=type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	public void draw(){
		System.out.println(getType() +" Triangle is made of the following points");
		System.out.println("Point A ("+getPointA().getX()+","+getPointA().getY()+")");
		System.out.println("Point B ("+getPointB().getX()+","+getPointB().getY()+")");
		System.out.println("Point C ("+getPointC().getX()+","+getPointC().getY()+")");
	
	}

	/*@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean's destroy method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean's  afterPropertiesSet method");
	}
	
	public void myInit(){
		System.out.println("MyInit method");
	}
	
	public void cleanUp(){
		System.out.println("Clean-up");
	}*/

}
