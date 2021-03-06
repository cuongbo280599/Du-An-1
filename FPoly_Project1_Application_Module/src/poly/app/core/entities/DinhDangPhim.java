package poly.app.core.entities;
// Generated Nov 5, 2018 2:07:26 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * DinhDangPhim generated by hbm2java
 */
public class DinhDangPhim  implements java.io.Serializable {


     private String id;
     private String ten;
     private int phuThu;
     private Set<SuatChieu> suatChieus = new HashSet<SuatChieu>(0);

    public DinhDangPhim() {
    }

	
    public DinhDangPhim(String id, String ten, int phuThu) {
        this.id = id;
        this.ten = ten;
        this.phuThu = phuThu;
    }
    public DinhDangPhim(String id, String ten, int phuThu, Set<SuatChieu> suatChieus) {
       this.id = id;
       this.ten = ten;
       this.phuThu = phuThu;
       this.suatChieus = suatChieus;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getTen() {
        return this.ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    public int getPhuThu() {
        return this.phuThu;
    }
    
    public void setPhuThu(int phuThu) {
        this.phuThu = phuThu;
    }
    public Set<SuatChieu> getSuatChieus() {
        return this.suatChieus;
    }
    
    public void setSuatChieus(Set<SuatChieu> suatChieus) {
        this.suatChieus = suatChieus;
    }




}


