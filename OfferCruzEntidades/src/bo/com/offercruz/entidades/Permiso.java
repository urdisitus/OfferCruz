/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.com.offercruz.entidades;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Ernesto
 */
public class Permiso {

    private Integer id;
    private String permisoTexto;
    private Integer permisoPadreId;
    private String permisoPagina;
    private int Estado;
    private Set<Perfil> perfiles = new HashSet<Perfil>(0);

    public Permiso() {
    }

    public Permiso(Integer id, String permisoTexto, Integer permisoPadreId, String permisoPagina, int Estado) {
        this.id = id;
        this.permisoTexto = permisoTexto;
        this.permisoPadreId = permisoPadreId;
        this.permisoPagina = permisoPagina;
        this.Estado = Estado;
    }

    public Integer getId() {
        return id;
    }

    public Set<Perfil> getPerfiles() {
        return perfiles;
    }

    public void setPerfiles(Set<Perfil> perfiles) {
        this.perfiles = perfiles;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermisoTexto() {
        return permisoTexto;
    }

    public void setPermisoTexto(String permisoTexto) {
        this.permisoTexto = permisoTexto;
    }

    public Integer getPermisoPadreId() {
        return permisoPadreId;
    }

    public void setPermisoPadreId(Integer permisoPadreId) {
        this.permisoPadreId = permisoPadreId;
    }

    public String getPermisoPagina() {
        return permisoPagina;
    }

    public void setPermisoPagina(String permisoPagina) {
        this.permisoPagina = permisoPagina;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

}
