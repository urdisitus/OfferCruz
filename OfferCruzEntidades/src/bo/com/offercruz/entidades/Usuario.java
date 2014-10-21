package bo.com.offercruz.entidades;
// Generated 13-oct-2014 18:48:07 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer id;
     private Perfil perfil;
     private String password;
     private String login;
     private Date fechaModificacion;
     private String passwordInicial;
     private int estado;
     private Date fechaCreacion;
     private int tipo;
     private String correoElectronico;     

    public Usuario() {
    }

	
    public Usuario(Perfil perfil, String password, String login, Date fechaModificacion, int estado, Date fechaCreacion, int tipo, String correoElectronico) {
        this.perfil = perfil;
        this.password = password;
        this.login = login;
        this.fechaModificacion = fechaModificacion;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.tipo = tipo;
        this.correoElectronico = correoElectronico;
    }
   
    public Integer getId() {
        return this.id;
    }

    public void setPasswordInicial(String passwordInicial) {
        this.passwordInicial = passwordInicial;
    }

    public String getPasswordInicial() {
        return passwordInicial;
    }   
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Perfil getPerfil() {
        return this.perfil;
    }
    
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }
    
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
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
    public int getTipo() {
        return this.tipo;
    }
    
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public String getCorreoElectronico() {
        return this.correoElectronico;
    }
    
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}

