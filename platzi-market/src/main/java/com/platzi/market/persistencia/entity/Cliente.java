package com.platzi.market.persistencia.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="clientes")
public class Cliente {
    @Id
    private String id;
    private String nombre;
    private String apellido;
    private Integer celular;
    private String dirección;
    @Column(name="correo_electronico")
    private String correoElectronico;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    @OneToMany(mappedBy = "cliente")

    private List<Compra> compras;
}
