package com.jdc.web.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serial;
import java.io.Serializable;


@Entity
@Table(name = "contactos")
public class Contactos implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcontatcto")
    private int idcontatcto;

    @NotNull
    @Size(min = 1, max = 50)
    @Column(name="tipocontacto")
    private String tipocontacto;

    @NotNull
    @Size(min = 1, max = 10)
    @Column(name="numero")
    private String numero ;

    public int getIdcontatcto() {
        return idcontatcto;
    }

    public void setIdcontatcto(int idcontatcto) {
        this.idcontatcto = idcontatcto;
    }

    public String getTipocontacto() {
        return tipocontacto;
    }

    public void setTipocontacto(String tipocontacto) {
        this.tipocontacto = tipocontacto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
