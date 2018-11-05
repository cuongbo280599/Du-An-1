package poly.app.core.entities;
// Generated Nov 5, 2018 2:07:26 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * VeBan generated by hbm2java
 */
public class VeBan  implements java.io.Serializable {


     private String id;
     private GheNgoi gheNgoi;
     private GiaVe giaVe;
     private NguoiDung nguoiDung;
     private SuatChieu suatChieu;
     private Date ngayBan;
     private int tongTien;
     private VeDat veDat;

    public VeBan() {
    }

	
    public VeBan(String id, GheNgoi gheNgoi, GiaVe giaVe, SuatChieu suatChieu, Date ngayBan, int tongTien) {
        this.id = id;
        this.gheNgoi = gheNgoi;
        this.giaVe = giaVe;
        this.suatChieu = suatChieu;
        this.ngayBan = ngayBan;
        this.tongTien = tongTien;
    }
    public VeBan(String id, GheNgoi gheNgoi, GiaVe giaVe, NguoiDung nguoiDung, SuatChieu suatChieu, Date ngayBan, int tongTien, VeDat veDat) {
       this.id = id;
       this.gheNgoi = gheNgoi;
       this.giaVe = giaVe;
       this.nguoiDung = nguoiDung;
       this.suatChieu = suatChieu;
       this.ngayBan = ngayBan;
       this.tongTien = tongTien;
       this.veDat = veDat;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public GheNgoi getGheNgoi() {
        return this.gheNgoi;
    }
    
    public void setGheNgoi(GheNgoi gheNgoi) {
        this.gheNgoi = gheNgoi;
    }
    public GiaVe getGiaVe() {
        return this.giaVe;
    }
    
    public void setGiaVe(GiaVe giaVe) {
        this.giaVe = giaVe;
    }
    public NguoiDung getNguoiDung() {
        return this.nguoiDung;
    }
    
    public void setNguoiDung(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
    }
    public SuatChieu getSuatChieu() {
        return this.suatChieu;
    }
    
    public void setSuatChieu(SuatChieu suatChieu) {
        this.suatChieu = suatChieu;
    }
    public Date getNgayBan() {
        return this.ngayBan;
    }
    
    public void setNgayBan(Date ngayBan) {
        this.ngayBan = ngayBan;
    }
    public int getTongTien() {
        return this.tongTien;
    }
    
    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }
    public VeDat getVeDat() {
        return this.veDat;
    }
    
    public void setVeDat(VeDat veDat) {
        this.veDat = veDat;
    }




}


