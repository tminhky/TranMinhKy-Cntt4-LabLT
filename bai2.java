// LỚP XE CỘ
package Cau2Lab5;

public class Vehicle {
    private String color;
    private String model;

    public Vehicle(String color, String model)
    {
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void run(){
        System.out.println("ting ting!");
    }

}
// LỚP XE ĐẠP
package Cau2Lab5;

public class Bicycle extends Vehicle {
    private int giaban;
    private String ngaynhap;
    private String nguongoc;

    public Bicycle(String color, String model, int giaban, String ngaynhap, String nguongoc)
    {
        super(color, model);
        this.giaban = giaban;
        this. ngaynhap = ngaynhap;
        this.nguongoc = nguongoc;
    }
    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }
    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }
    public String getNguongoc() {
        return nguongoc;
    }

    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }

}
// LỚP XE OTO
package Cau2Lab5;

public class Car extends Vehicle {
    private int giaban;
    private String ngaynhap;
    private String nguongoc;

    public Car(String color, String model, int giaban, String ngaynhap, String nguongoc)
    {
        super(color, model);
        this.giaban = giaban;
        this. ngaynhap = ngaynhap;
        this.nguongoc = nguongoc;
    }
    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }
    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }
    public String getNguongoc() {
        return nguongoc;
    }

    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }

}
// HÀM MAIN
package Cau2Lab5;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Đen", "Đia hinh",100000000,"7/8","USA");
        System.out.println("Color: " + bicycle.getColor());
        System.out.println("Model: " + bicycle.getModel());
        System.out.println("Gia ban: " + bicycle.getGiaban());
        System.out.println("Ngay nhap: " + bicycle.getNgaynhap());
        System.out.println("Nguon goc: " + bicycle.getNguongoc());
    }
}
