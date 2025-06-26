/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Services.DBConnect;
import USERs.NV;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class nvDAO {

    List<NV> dsNV = new ArrayList<>();

    public List<NV> getAll() {
        String sql = "select * from nhanvien";
        Connection conn = DBConnect.getConnection();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                String manv = rs.getString(1);
                String tennv = rs.getString(2);
                String gioitinh = rs.getString(3);
                String tuoi = rs.getString(4);
                NV nv = new NV(manv, tennv, gioitinh, tuoi);
                dsNV.add(nv);
            }
        } catch (Exception e) {

        }
        return dsNV;
    }

    public Object[] getRow(NV nv) {
        String manv = nv.getManv();
        String tennv= nv.getTennv();
        String gioitinh = nv.getGioitinh();
        String tuoi = nv.getTuoi();
        Object[] obj = new Object[]{manv,tennv,gioitinh,tuoi};
        return obj;
    }
    
    public int themnv(NV nv){
        String sql = "insert into nhanvien values(?,?,?,?)";
        Connection conn = DBConnect.getConnection();
        try {
            PreparedStatement ptsm = conn.prepareStatement(sql);
            ptsm.setString(1, nv.getManv());
            ptsm.setString(2, nv.getTennv());
            ptsm.setString(3, nv.getGioitinh());
            ptsm.setString(4,nv.getTuoi());
            if(ptsm.executeUpdate() > 0){
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Lỗi "+e);
        }
        return 0;
    }
    
    public int updatenv(NV nv){
        String sql = "update nhanvien set manv =?, tennv =?, gioitinh =?,tuoi=?";
        Connection conn = DBConnect.getConnection();
        try {
            PreparedStatement ptsm = conn.prepareStatement(sql);
            ptsm.setString(1, nv.getManv());
            ptsm.setString(2, nv.getTennv());
            ptsm.setString(3, nv.getGioitinh());
            ptsm.setString(4, nv.getTuoi());
            if(ptsm.executeUpdate() > 0){
                return 1;
            }
        } catch (Exception e) {
        }
        return 0;
    }
    
    public int duoinv(NV nv){
        String sql = "delete nhanvien where manv =?";
        Connection conn = DBConnect.getConnection();
        try {
            PreparedStatement ptsm = conn.prepareStatement(sql);
            ptsm.setString(1, nv.getManv());
            if(ptsm.executeUpdate() > 0){
                return 1;
            }
        } catch (Exception e) {
        }
        return 0;
    }
    
}
