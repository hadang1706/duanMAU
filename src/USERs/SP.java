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

    public SP() {
    }

    public SP(String macp, String tencp, String uong, int gia, String tinhtrang) {
        this.macp = macp;
        this.tencp = tencp;
        this.uong = uong;
        this.gia = gia;
        this.tinhtrang = tinhtrang;
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
        
}
