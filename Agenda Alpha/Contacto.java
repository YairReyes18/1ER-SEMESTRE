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

public void setNombre(String nombre){
  this.nombre=nombre;
}

public void setDireccion(String direccion){
this.direccion=direccion;
}

public void setTelefono(String telefono){
this.telefono=telefono;
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
