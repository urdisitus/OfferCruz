package bo.com.offercruz.entidades;
// Generated 13-oct-2014 18:48:07 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Categoriaempresa generated by hbm2java
 */
public class Categoriaempresa  implements java.io.Serializable {


     private Integer id;
     private Categoria categoria;
     private Empresa empresa;
     private Date fechaAsignacion;

    public Categoriaempresa() {
    }

    public Categoriaempresa(Categoria categoria, Empresa empresa, Date fechaAsignacion) {
       this.categoria = categoria;
       this.empresa = empresa;
       this.fechaAsignacion = fechaAsignacion;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Categoria getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public Date getFechaAsignacion() {
        return this.fechaAsignacion;
    }
    
    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }




}


