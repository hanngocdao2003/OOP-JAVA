package test1;

import java.util.Scanner;

public class HinhChuNhat {
	private double dai;
	private double rong;

	public HinhChuNhat(double dai, double rong) {
		super();
		this.dai = dai;
		this.rong = rong;
	}

	public HinhChuNhat() {
		// TODO Auto-generated constructor stub
	}

	public double getDai() {
		if (this.dai >= this.rong) // dai =5 rong =10 => this
			return dai;
		return 0; // dai =0
	}

	public void setDai(double dai) {
		if (this.dai >= this.rong)
			this.dai = dai;
	}

	public double getRong() {
		if (this.dai >= this.rong)
			return rong;
		return 0;
	}

	public void setRong(double rong) {
		if (this.dai >= this.rong)
			this.rong = rong;
	}

	public double chuVi() {
		return (getDai() + getRong()) * 2;
	}
	public double dienTich() {
		return (getDai() * getRong());
	}

	protected static String getThongTin(double dai, double rong) {
		return "Thong tin cua hcn la: " + dai + ", " + rong;
	}

	public static void main(String[] args) {
		HinhChuNhat h1 = new HinhChuNhat();
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap chieu dai: ");
		double dai = s.nextDouble();
		System.out.println("Nhap chieu rong: ");
		double rong = s.nextDouble();
		h1.setDai(dai);
		h1.setRong(rong);
		//System.out.println(getThongTin(dai, rong));
		System.out.println("Dien tich hcn la: " + h1.dienTich());
		System.out.println("Chu vi hcn la: " + h1.chuVi());
	}
}
