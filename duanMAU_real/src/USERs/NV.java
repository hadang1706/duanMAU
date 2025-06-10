/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package USERs;

/**
 *
 * @author ADMIN
 */
public class NV {
    private String manv;
    private String tennv;
    private String gioitinh;
    private String tuoi;

    public NV() {
    }

    public NV(String manv, String tennv, String gioitinh, String tuoi) {
        this.manv = manv;
        this.tennv = tennv;
        this.gioitinh = gioitinh;
        this.tuoi = tuoi;
    }

    public String getManv() {
        return manv;
    }

    public String getTennv() {
        return tennv;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }
    
}
