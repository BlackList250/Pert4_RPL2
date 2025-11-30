/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author MAHKOTA
 */
@Entity
@Table(name = "mahasiswa")
public class ModelMahasiswa {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column (name = "npm", nullable = false, length = 10)
    private String npm;
    
    @Column (name = "nama", nullable = false, length = 50)
    private String nama;
    
    @Column (name = "semester", nullable = false, length = 2)
    private int semester;
    
    @Column (name = "ipk", nullable = false, length = 4)
    private float ipk;   
    
    public ModelMahasiswa(){
        
    }
    
    public ModelMahasiswa(int id, String npm, String nama, int semester, float ipk){
        this.id = id;
        this.npm = npm;
        this.nama = nama;
        this.semester = semester;
        this.ipk = ipk;
    
    }
}