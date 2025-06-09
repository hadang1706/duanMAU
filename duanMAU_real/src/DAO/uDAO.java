/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Services.DBConnect;
import USERs.SP;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */

public class uDAO {
    List<SP> dsSP = new ArrayList<>();
    public Object[] getRow(SP sps) {
        String macp = sps.getMacp();
        String tencp = sps.getTencp();
        String uong = sps.getUong();
        int gia = sps.getGia();
        String tt = sps.getTinhtrang();
        Object[] obj = new Object[]{macp,tencp,uong,gia,tt};
        return obj;
    }
    
    public void hrllo(){
        
    }
    
    public List<SP> getAll(){
        String sql = "select * from caphe";
        Connection conn = DBConnect.getConnection();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                String macp = rs.getString(1);
                String tencp = rs.getString(2);
                String uong = rs.getString(3);
                int gia = Integer.parseInt(rs.getString(4));
                String tt = rs.getString(5);
                SP sps = new SP(macp,tencp,uong,gia,tt);
                dsSP.add(sps);
            }
        } catch (Exception e) {
            
        }
        return dsSP;
    }
    public int themSP(SP sp){
        String sql = "INSERT INTO caphe values(?,?,?,?,?)";
        Connection conn = DBConnect.getConnection();
        try {
            PreparedStatement ptsm = conn.prepareStatement(sql);
            ptsm.setString(1, sp.getMacp());
            ptsm.setString(2, sp.getTencp());
            ptsm.setString(3, sp.getUong());
            ptsm.setInt(4,sp.getGia());
            ptsm.setString(5, sp.getTinhtrang());
            if (ptsm.executeUpdate() > 0) {
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Lỗi "+e);
        }
        return 0;
    }
    
   
    public int editSP(SP sp) {
        String sql = "UPDATE caphe SET\n"
                + "MASP = ?,\n"
                + "TENSP = ?,\n"
                + "LANHONG = ?,\n"
                + "GIABAN = ?\n"
                + "WHERE TINHTRANG = ?";
        try {
            Connection con = DBConnect.getConnection();
            PreparedStatement ptsm = con.prepareStatement(sql);
            ptsm.setString(1, sp.getMacp());
            ptsm.setString(2, sp.getTencp());
            ptsm.setString(3, sp.getUong());
            ptsm.setInt(4,sp.getGia());
            ptsm.setString(5, sp.getTinhtrang());
            if (ptsm.executeUpdate() > 0) {
                return 1;
            }
        } catch (Exception e) {
        }

        return 0;
    }
    
     public int deleteSP(SP sps) {
        String sql = "DELETE caphe WHERE MASP = ?";
        try {
            Connection con = DBConnect.getConnection();
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, sps.getMacp());
            if (pstm.executeUpdate() > 0) {
                return 1;
            }
        } catch (Exception e) {
        }

        return 0;
    }
    
}
