package com.tyc.web.util;

import java.util.Scanner;

public class RodriguesRotationMatrix {//�޵������ת��ʽ
	public static double Vrot_x;//���
	public static double Vrot_y;//���
	public static double Vrot_z;//���
	public static void getNewMatrix(OriginMatrix V,RotationMatrix K,double angle)
	{
		double x=K.getX();
		double y=K.getY();
		double z=K.getZ();
		double u=V.getU();
		double v=V.getV();
		double w=V.getW();
		Vrot_x=u*Math.cos(angle)+(y*w-z*v)*Math.sin(angle)+x*(x*u + y*v + z*w)*( 1- Math.cos(angle));
		Vrot_y=v*Math.cos(angle)+(z*u-x*w)*Math.sin(angle)+y*(x*u + y*v + z*w)*( 1- Math.cos(angle));
		Vrot_z=w*Math.cos(angle)+(x*v-y*u)*Math.sin(angle)+z*(x*u + y*v + z*w)*( 1- Math.cos(angle));
	}
	public static void main(String[] args) 
	{
		System.out.println("�޵������ת��ʽ,���ڼ������ת�����ת�ǶȺ�Ľ����");
		double u,v,w,x,y,z,angle;
		Scanner input=new Scanner(System.in);
		System.out.println("��������ԭ����");
		u=input.nextDouble();
		v=input.nextDouble();
		w=input.nextDouble();	
		System.out.println("ԭ����("+u+","+v+","+w+")");
		OriginMatrix V=new OriginMatrix(u,v,w);
		
		System.out.println("��������ת��");
		x=input.nextDouble();
		y=input.nextDouble();
		z=input.nextDouble();	
		System.out.println("��ת����("+x+","+y+","+z+")");
		RotationMatrix K=new RotationMatrix(x, y, z);
		
		System.out.println("��������ת�Ƕ�");
		angle=input.nextDouble();
		System.out.println("��ת�Ƕ�:"+angle);
		getNewMatrix(V,K,angle);
		
		System.out.println("�����("+String.format("%.2f", Vrot_x)+","+String.format("%.2f", Vrot_y)+","+String.format("%.2f", Vrot_z)+")");
	}
}
class OriginMatrix{//ԭ���ؾ��� (u,v,w)
	private double u,v,w;
	public OriginMatrix(double u,double v,double w){
		this.u=u;
		this.v=v;
		this.w=w;
	}
	public double getU() {
		return u;
	}
	public void setU(double u) {
		this.u = u;
	}
	public double getV() {
		return v;
	}
	public void setV(double v) {
		this.v = v;
	}
	public double getW() {
		return w;
	}
	public void setW(double w) {
		this.w = w;
	}
	
}
class RotationMatrix{//ת��(x,y,z)
	private double x,y,z;
	public RotationMatrix(double x,double y,double z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
}