package poly.app.core.entities;
// Generated Nov 5, 2018 2:07:26 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * GheNgoi generated by hbm2java
 */
public class GheNgoi  implements java.io.Serializable {


     private int id;
     private LoaiGhe loaiGhe;
     private PhongChieu phongChieu;
     private String viTriDay;
     private int viTriCot;
     private boolean daChon;
     private Set<VeBan> veBans = new HashSet<VeBan>(0);

    public GheNgoi() {
    }

	
    public GheNgoi(int id, LoaiGhe loaiGhe, PhongChieu phongChieu, String viTriDay, int viTriCot, boolean daChon) {
        this.id = id;
        this.loaiGhe = loaiGhe;
        this.phongChieu = phongChieu;
        this.viTriDay = viTriDay;
        this.viTriCot = viTriCot;
        this.daChon = daChon;
    }
    public GheNgoi(int id, LoaiGhe loaiGhe, PhongChieu phongChieu, String viTriDay, int viTriCot, boolean daChon, Set<VeBan> veBans) {
       this.id = id;
       this.loaiGhe = loaiGhe;
       this.phongChieu = phongChieu;
       this.viTriDay = viTriDay;
       this.viTriCot = viTriCot;
       this.daChon = daChon;
       this.veBans = veBans;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public LoaiGhe getLoaiGhe() {
        return this.loaiGhe;
    }
    
    public void setLoaiGhe(LoaiGhe loaiGhe) {
        this.loaiGhe = loaiGhe;
    }
    public PhongChieu getPhongChieu() {
        return this.phongChieu;
    }
    
    public void setPhongChieu(PhongChieu phongChieu) {
        this.phongChieu = phongChieu;
    }
    public String getViTriDay() {
        return this.viTriDay;
    }
    
    public void setViTriDay(String viTriDay) {
        this.viTriDay = viTriDay;
    }
    public int getViTriCot() {
        return this.viTriCot;
    }
    
    public void setViTriCot(int viTriCot) {
        this.viTriCot = viTriCot;
    }
    public boolean isDaChon() {
        return this.daChon;
    }
    
    public void setDaChon(boolean daChon) {
        this.daChon = daChon;
    }
    public Set<VeBan> getVeBans() {
        return this.veBans;
    }
    
    public void setVeBans(Set<VeBan> veBans) {
        this.veBans = veBans;
    }




}


