package bo.com.offercruz.entidades;
// Generated 13-oct-2014 18:48:07 by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Empresa generated by hbm2java
 */
public class Empresa  implements java.io.Serializable {


     private Integer id;
     private Imagen imagen;
     private Usuario usuario;
     private int estado;
     private Date fechaCreacion;
     private Date fechaModificacion;
     private String razonSocial;
     private String slogan;
     private String mision;
     private String vision;
     private String telefono;
     private String direccion;
     private String tipoSociedad;
     private Date fechaApertura;
     private String nit;
     private int tipoOferta;
     private String fax;
     private Set<Subscripcion> subscripcions = new HashSet<Subscripcion>(0);
     private Set<Categoriaempresa> categoriaempresas = new HashSet<Categoriaempresa>(0);
     private Set<Solicitud> solicituds = new HashSet<Solicitud>(0);

    public Empresa() {
    }

	
    public Empresa(Imagen imagen, Usuario usuario, int estado, Date fechaCreacion, Date fechaModificacion, String razonSocial, int tipoOferta) {
        this.imagen = imagen;
        this.usuario = usuario;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.razonSocial = razonSocial;
        this.tipoOferta = tipoOferta;
    }
    public Empresa(Imagen imagen, Usuario usuario, int estado, Date fechaCreacion, Date fechaModificacion, String razonSocial, String slogan, String mision, String vision, String telefono, String direccion, String tipoSociedad, Date fechaApertura, String nit, int tipoOferta, String fax, Set<Subscripcion> subscripcions, Set<Categoriaempresa> categoriaempresas, Set<Solicitud> solicituds) {
       this.imagen = imagen;
       this.usuario = usuario;
       this.estado = estado;
       this.fechaCreacion = fechaCreacion;
       this.fechaModificacion = fechaModificacion;
       this.razonSocial = razonSocial;
       this.slogan = slogan;
       this.mision = mision;
       this.vision = vision;
       this.telefono = telefono;
       this.direccion = direccion;
       this.tipoSociedad = tipoSociedad;
       this.fechaApertura = fechaApertura;
       this.nit = nit;
       this.tipoOferta = tipoOferta;
       this.fax = fax;
       this.subscripcions = subscripcions;
       this.categoriaempresas = categoriaempresas;
       this.solicituds = solicituds;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Imagen getImagen() {
        return this.imagen;
    }
    
    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public int getEstado() {
        return this.estado;
    }
    
    public void setEstado(int estado) {
        this.estado = estado;
    }
    public Date getFechaCreacion() {
        return this.fechaCreacion;
    }
    
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }
    
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    public String getRazonSocial() {
        return this.razonSocial;
    }
    
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public String getSlogan() {
        return this.slogan;
    }
    
    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }
    public String getMision() {
        return this.mision;
    }
    
    public void setMision(String mision) {
        this.mision = mision;
    }
    public String getVision() {
        return this.vision;
    }
    
    public void setVision(String vision) {
        this.vision = vision;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTipoSociedad() {
        return this.tipoSociedad;
    }
    
    public void setTipoSociedad(String tipoSociedad) {
        this.tipoSociedad = tipoSociedad;
    }
    public Date getFechaApertura() {
        return this.fechaApertura;
    }
    
    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }
    public String getNit() {
        return this.nit;
    }
    
    public void setNit(String nit) {
        this.nit = nit;
    }
    public int getTipoOferta() {
        return this.tipoOferta;
    }
    
    public void setTipoOferta(int tipoOferta) {
        this.tipoOferta = tipoOferta;
    }
    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }
    public Set<Subscripcion> getSubscripcions() {
        return this.subscripcions;
    }
    
    public void setSubscripcions(Set<Subscripcion> subscripcions) {
        this.subscripcions = subscripcions;
    }
    public Set<Categoriaempresa> getCategoriaempresas() {
        return this.categoriaempresas;
    }
    
    public void setCategoriaempresas(Set<Categoriaempresa> categoriaempresas) {
        this.categoriaempresas = categoriaempresas;
    }
    public Set<Solicitud> getSolicituds() {
        return this.solicituds;
    }
    
    public void setSolicituds(Set<Solicitud> solicituds) {
        this.solicituds = solicituds;
    }




}

