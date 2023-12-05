
package ToDatabase;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;


/**
 *
 * @author
 */
public class User {

    private String username;
    private String password;
    private String level;
    private String nama;
    private String cp;
    private int userId;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUSerId() {
        return this.userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setLevel(String level){
        this.level = level;
    }
    
    public String getLevel(){
        return this.level;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }
    
    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCp() {
        return this.cp;
    }

    public int InsertUser() {
        Koneksi userModel = new Koneksi();
        String queryString = "INSERT INTO users (username, password, level, nama, no_hp) VALUES('"
                + this.username + "','" + this.password + "','" + "2" + "','" + this.nama + "','" + this.cp + "')";
        int affectedRow = userModel.query(queryString);
        return affectedRow;

    }

    
}
