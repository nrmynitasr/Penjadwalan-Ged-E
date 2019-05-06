/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User-5
 */
public class order {
    public void insertOrder (char option, String nama, String kdruang, String tanggal, Integer jamM, Integer jamS) {
        
        Connection con= MyConnection.getConnection();
        PreparedStatement ps;
        
        if (option == 'i'){
            try {
                ps = con.prepareStatement("INSERT INTO peminjaman_ruang (nama, kd_ruang, tgl_pinjam, jam_mulai, jam_selesai) VALUES (?,?,?,?,?)");
                ps.setString(1, nama);
                ps.setString(2, kdruang);
                ps.setString(3, tanggal);
                ps.setInt(4, jamM);
                ps.setInt(5, jamS);
                
                if(ps.executeUpdate() > 0){
                    JOptionPane.showMessageDialog(null, "New Order Added");
                }
            
            
            } catch (SQLException ex) {
                Logger.getLogger(order.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
