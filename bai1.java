// LỚP HOA QUẢ
package Lab5;

public class Hoaqua {

    private double giaban;
    private String ngaynhap;
    private double soluong;
    private String nguongoc;

    public Hoaqua(double giaban,String ngaynhap, double soluong, String nguongoc) {
        this.giaban = giaban;
        this.ngaynhap = ngaynhap;
        this.soluong = soluong;
        this.nguongoc = nguongoc;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public double getSoluong() {
        return soluong;
    }

    public void setSoluong(double soluong) {
        this.soluong = soluong;
    }

    public String getNguongoc() {
        return nguongoc;
    }

    public void setNguongoc(String nguongoc) {
        this.nguongoc = nguongoc;
    }

}
// LỚP QUẢ CAM
package Lab5;

public class Quacam extends Hoaqua {
    private String tenqua;

    public Quacam(String tenqua,double giaban, String ngaynhap, double soluong, String nguongoc) {
        super(giaban, ngaynhap, soluong, nguongoc);
        this.tenqua = tenqua;
    }

    public String getTenqua() {
        return tenqua;
    }

    public void setTenqua(String tenqua) {
        this.tenqua = tenqua;
    }
}
// LỚP QUẢ TÁO
package Lab5;

public class Quatao extends Hoaqua {
    private String tenqua;

    public Quatao(String tenqua,double giaban, String ngaynhap, double soluong, String nguongoc) {
        super(giaban, ngaynhap, soluong, nguongoc);
        this.tenqua = tenqua;
    }

    public String getTenqua() {
        return tenqua;
    }

    public void setTenqua(String tenqua) {
        this.tenqua = tenqua;
    }
}
// LỚP QUẢ CAM PHONG
package Lab5;

public class Quacamphong extends Hoaqua {
    private String tenqua;

    public Quacamphong(String tenqua,double giaban, String ngaynhap, double soluong, String nguongoc) {
        super(giaban, ngaynhap, soluong, nguongoc);
        this.tenqua = tenqua;
    }

    public String getTenqua() {
        return tenqua;
    }

    public void setTenqua(String tenqua) {
        this.tenqua = tenqua;
    }
}
// LỚP CAM SÀNH
package Lab5;

public class Camsanh extends Hoaqua {
    private String tenqua;

    public Camsanh(String tenqua,double giaban, String ngaynhap, double soluong, String nguongoc) {
        super(giaban, ngaynhap, soluong, nguongoc);
        this.tenqua = tenqua;
    }

    public String getTenqua() {
        return tenqua;
    }

    public void setTenqua(String tenqua) {
        this.tenqua = tenqua;
    }
}
// HÀM MAIN
package Lab5;

public class Main {
    public static void main(String[] args) {
        Quacam quacam = new Quacam("Cam tươi",2.5,"1/1/2023",5.0,"Tây Ninh");

        System.out.println("Ten qua : " + quacam.getTenqua());
        System.out.println("Gia ban: " + quacam.getGiaban());
        System.out.println("Ngay nhap: " + ((Quacam) quacam).getNgaynhap());
        System.out.println("So luong: " + quacam.getSoluong());
        System.out.println("Nguon goc: " + quacam.getNguongoc());
    }
}


