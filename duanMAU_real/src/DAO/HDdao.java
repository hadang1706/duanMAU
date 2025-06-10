/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Services.DBConnect;
import USERs.HD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HDdao {
    public List<HD> getall(){
        List<HD> lstHD = new ArrayList<>();
        String sql = "select * from hoaadon";
        Connection con = DBConnect.getConnection();
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next()){
                HD hd = new HD();
                hd.setMahd(rs.getString(1));
                hd.setTensp(rs.getString(2));
                hd.setGiatien(rs.getInt(3));
                hd.setSoluong(rs.getInt(4));
                hd.setDiachi(rs.getString(5));
                hd.setSdt(rs.getString(6));
                hd.setNonglanh(rs.getString(7));
                lstHD.add(hd);
            }
            
        } catch (Exception e) {
        }
        return lstHD;
    }
    
        public  int addsv(HD hd){
        String sql = "INSERT INTO hoaadon VALues (?,?,?,?,?,?,?)";
         Connection con = DBConnect.getConnection();
         PreparedStatement pstm = null;
         
         try {
            pstm = con.prepareStatement(sql);
             pstm.setString(1,hd.getMahd());
            pstm.setString(2,hd.getTensp());
            pstm.setInt(3,hd.getGiatien());
            pstm.setInt(4,hd.getSoluong());
            pstm.setString(5,hd.getDiachi());
            pstm.setString(6,hd.getSdt());
            pstm.setString(7,hd.getNonglanh());
            if(pstm.executeUpdate() > 0){
               
                return 1;
            }
        } catch (Exception e) {
        }
         
        return 0;
    }
    
        public int deletetee(String mahd){
         String sql = "Delete hoaadon where mahd like ?";
         Connection con = DBConnect.getConnection();
         try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1,mahd);
            if(pstm.executeUpdate() > 0){
                return 1;
            }
        } catch (Exception e) {
        }
        
        return 0; 
    }
        
        
        
     public  int updatett(HD hd,String ma){
        
           String sql = "  update hoaadon Set\n" 
                   +"mahd = ?, \n"
                   +"  tenmonan = ?, giatien = ? , soluong = ?, diachi = ?, sdt = ?, nonglanh = ? \n" 
                   +"  where mahd like ?";
         Connection con = DBConnect.getConnection();
         try {
            PreparedStatement pstm = con.prepareStatement(sql);    
            pstm.setString(1,hd.getMahd());
            pstm.setString(2,hd.getTensp());
            pstm.setInt(3,hd.getGiatien());
            pstm.setInt(4,hd.getSoluong());
            pstm.setString(5,hd.getDiachi());
            pstm.setString(6,hd.getSdt());
             pstm.setString(7,hd.getNonglanh());
            pstm.setString(8, ma);
            if(pstm.executeUpdate() > 0){
                
                return 1;
            }
        } catch (Exception e) {
        }
         
         return 0;
    }
    
    public Object[] getrow(HD hd){
        Object[] row = new Object[] {hd.getMahd(),hd.getTensp(),hd.getGiatien()
                ,hd.getSoluong(),hd.getDiachi(),hd.getSdt(),hd.getNonglanh()} ;
        return row;
    }
}
