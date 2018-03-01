public class Contacto{
private String nombre;
private String direccion;
private String telefono;

public Contacto(){
nombre=null;
direccion=null;
telefono=null;
}

public Contacto(String nombre, String direccion, String telefono){
this.nombre= nombre;
this.direccion=direccion;
this.telefono=telefono;

}

public void setNombre(String nom){
  this.nombre=nom;
}

public void setDireccion(String dir){
this.direccion=dir;
}

public void setTelefono(String telf){
this.telefono=telf;
}

public String getNombre(){
return this.nombre;
}

public String getDireccion(){
return this.direccion;
}

public String getTelefono(){
return this.telefono;
}

}
