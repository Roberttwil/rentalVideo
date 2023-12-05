/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ToDatabase;
import java.sql.*;
/**
 *
 * @author Hp
 */
public class Admin {
    private int idUser, idVideo, idHistory, idPeminjaman;
    private int idUserTabelPeminjaman, idUserTabelHistory,idVideoTabelPeminjaman, idVideoTabelHistory, level;
    private String judul, author, kategori;
    private String status;
    private String password, nama, username, noHp;
    
    public Admin(){
        this.idUser = 0;
        this.idVideo = 0;
        this.idHistory = 0;
        this.idPeminjaman = 0;
        this.idUserTabelPeminjaman = 0;
        this.idUserTabelHistory = 0;
        this.idVideoTabelPeminjaman = 0;
        this.idVideoTabelHistory = 0;
        this.level = 0;
        this.judul = "";
        this.author = "";
        this.kategori = "";
        this.status = "";
        this.password = "";
        this.nama = "";
        this.username = "";
        this.noHp = "";
    }
    
    public void setIdUser(){
    this.idUser = idUser;
    }
    public void setIdVideo(){
    this.idVideo = idVideo;
    }
    public void setIdHistory(){
    this.idHistory = idHistory;
    }
    public void setIdPeminjaman(){
    this.idPeminjaman = idPeminjaman;
    }
    public void setIdUserTabelPeminjaman(){
    this.idUserTabelPeminjaman = idUserTabelPeminjaman;
    }
    public void setIdUserTabelHistory(){
    this.idUserTabelHistory = idUserTabelHistory;
    }
    public void setIdVideoTabelPeminjaman(){
    this.idVideoTabelPeminjaman = idVideoTabelPeminjaman;
    }
    public void setIdVideoTabelHistory(){
    this.idVideoTabelHistory = idVideoTabelHistory;
    }
    public void setLevel(){
    this.level = level;
    }
    public void setJudul(){
    this.judul = judul;
    }
    public void setAuthor(){
    this.author = author;
    }
    public void setKategori(){
    this.kategori = kategori;
    }
    public void setStatus(){
    this.status = status;
    }
    public void setPassword(){
    this.password = password;
    }
    public void setNama(){
    this.nama = nama;
    }
    public void setUsername(){
    this.username = username;
    }
    public void setNoHP(){
    this.noHp = noHp;
    }
    
    public String getJudul(){
        return this.judul;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getKategori(){
        return this.kategori;
    }
     public String getStatus(){
        return this.status;
    }
    public String getPassword(){
        return this.password;
    }
    public String getNama(){
        return this.nama;
    }
    public String getUsername(){
        return this.username;
    }
    public String getNoHp(){
        return this.noHp;
    }
    public int getIdUser(){
        return this.idUser;
    }
    public int getIdVideo(){
        return this.idVideo;
    }
    public int getIdUserTabelPeminjaman(){
        return this.idUserTabelPeminjaman;
    }
    public int getIdHistory(){
        return this.idHistory;
    }
    public int getIdPeminjaman(){
        return this.idPeminjaman;
    }
    public int getIdUserTabelHistory(){
        return this.idUserTabelHistory;
    }
    public int getIdVideoTabelPeminjaman(){
        return this.idVideoTabelPeminjaman;
    }
    public int getIdVideoTabelHistory(){
        return this.idVideoTabelHistory;
    }
    public int getLevel(){
        return this.level;
    }
    
    public int insertVideo(){
        Koneksi userModel = new Koneksi();
        String queryString = "INSERT INTO videos (id, judul, author, kategori) VALUES('"
                + this.idVideo + "','" + this.judul + "','" + "','" + this.author + "','" + this.kategori + "')";
        int affectedRow = userModel.query(queryString);
        return affectedRow;
    }
    
    public int updateVideo(){
        Koneksi userModel = new Koneksi();
        String queryString = "UPDATE FROM videos SET kategori='"+kategori+"',"+"judul='"+judul+"',"+"author='"+author+"'"+" WHERE id='"+idVideo+"'";
        int affectedRow = userModel.query(queryString);
        return affectedRow;}  
    
    public int deleteVideo(){
        Koneksi userModel = new Koneksi();
        String queryString = "DELETE FROM videos WHERE id = '"+idVideo+"'";
        int affectedRow = userModel.query(queryString);
        return affectedRow;} 
    }


