package poly.app.core.entities;
// Generated Nov 2, 2018 5:32:44 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * GiaVe generated by hbm2java
 */
public class GiaVe  implements java.io.Serializable {


     private int id;
     private String ten;
     private int donGia;
     private Set<VeBan> veBans = new HashSet<VeBan>(0);
     private Set<VeDat> veDats = new HashSet<VeDat>(0);

    public GiaVe() {
    }

	
    public GiaVe(int id, String ten, int donGia) {
        this.id = id;
        this.ten = ten;
        this.donGia = donGia;
    }
    public GiaVe(int id, String ten, int donGia, Set<VeBan> veBans, Set<VeDat> veDats) {
       this.id = id;
       this.ten = ten;
       this.donGia = donGia;
       this.veBans = veBans;
       this.veDats = veDats;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getTen() {
        return this.ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    public int getDonGia() {
        return this.donGia;
    }
    
    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    public Set<VeBan> getVeBans() {
        return this.veBans;
    }
    
    public void setVeBans(Set<VeBan> veBans) {
        this.veBans = veBans;
    }
    public Set<VeDat> getVeDats() {
        return this.veDats;
    }
    
    public void setVeDats(Set<VeDat> veDats) {
        this.veDats = veDats;
    }




}

