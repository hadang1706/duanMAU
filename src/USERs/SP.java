/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package USERs;

/**
 *
 * @author ADMIN
 */
public class SP {
	private String macp;
	private String tencp;
        private String uong;
	private int gia;
        private String tinhtrang;
        private int soluong;

    public SP() {
    }

    public SP(String macp, String tencp, String uong, int gia, String tinhtrang, int soluong) {
        this.macp = macp;
        this.tencp = tencp;
        this.uong = uong;
        this.gia = gia;
        this.tinhtrang = tinhtrang;
        this.soluong = soluong;
    }

    public String getMacp() {
        return macp;
    }

    public String getTencp() {
        return tencp;
    }

    public String getUong() {
        return uong;
    }

    public int getGia() {
        return gia;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setMacp(String macp) {
        this.macp = macp;
    }

    public void setTencp(String tencp) {
        this.tencp = tencp;
    }

    public void setUong(String uong) {
        this.uong = uong;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
        
        
}

