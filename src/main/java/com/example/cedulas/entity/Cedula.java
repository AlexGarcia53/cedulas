/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.cedulas.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Cedula {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "id_cedula")
    private Long id;
    
    @Column(name = "cedula_medico")
    private String cedulaMedico;
    
    @Column(name = "nombre_medico")
    private String nombre;

    
    
}
