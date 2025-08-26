package com.jdc.web.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "Sedes")
public class SedeEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idsede")
    private int idSede;

    @NotNull
    @Size(min = 0,max = 50)
    @Column(name= "nombre")
    private String nombre;

    @NotNull
    @Size(min = 0,max = 50)
    @Column(name= "direccion")
    private String direccion;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idcolegio", referencedColumnName = "idcolegio", nullable = false)
    private ColegioEntity colegio;

    public ColegioEntity getColegio() {
        return colegio;
    }

    public void setColegio(ColegioEntity colegio) {
        this.colegio = colegio;
    }

    public int getIdSede() {
        return idSede;
    }

    public void setIdSede(int idSede) {
        this.idSede = idSede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
