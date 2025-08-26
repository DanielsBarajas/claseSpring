package com.jdc.web.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "Rectores")
public class RectoreEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "idrector")
    private int idrector;

    @NotNull
    @Size(min = 1, max = 50)
    @Column(name="primerApellido")
    private String primerApellido;

    @NotNull
    @Size(min = 1, max = 50)
    @Column(name="segundoapellido")
    private String segundoApellido;

    @NotNull
    @Size(min = 1, max = 50)
    @Column(name="nombre")
    private String nombre;

    @NotNull
    @Size(min = 1, max = 50)
    @Column(name="numerodocumento")
    private String numDocumento;

    @NotNull
    @Size(min = 1, max = 50)
    @Column(name="tipodocumento")
    private String tipodocumento;

    @NotNull
    @Column(name= "fechanacimiento")
    @DateTimeFormat(pattern = "yyy-MM-dd")
    private Date fechanacimiento;


    @OneToOne
    @JoinColumn(name = " idcolegio", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private ColegioEntity colegios;

    public ColegioEntity getColegios() {
        return colegios;
    }

    public void setColegios(ColegioEntity colegios) {
        this.colegios = colegios;
    }

    public Date getFechanacimiento() {

        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int getIdrector() {
        return idrector;
    }

    public void setIdrector(int idrector) {
        this.idrector = idrector;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

}
