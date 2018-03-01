//Por Yair Reyes
public class Directorio{
    Contacto[] listaContactos = new Contacto[6]; //tamaño real de vector -1 por el 0, no quiero que imprima 0 para imprimir desde contacto 1
    private int ncontactos; // objetos contacto creados

public Directorio(){
  ncontactos=1;
}


public void nuevoContacto(String nombre, String direccion, String telefono){
  if(ncontactos<6){ //limite contactos (tamaño arreglo)
          this.listaContactos[ncontactos] = new Contacto(); //nuevo objeto de tipo contacot
          this.listaContactos[ncontactos].setNombre(nombre); //pasamos parametros al nuevo objetos
          this.listaContactos[ncontactos].setDireccion(direccion);
          this.listaContactos[ncontactos].setTelefono(telefono);
          this.ncontactos++;
        }
        else{
          System.out.println("LO SIENTO NO PUDE AGREGAR ESTE CONTACTO, ¡AGENDA LLENA! :(");
        }
}

public void listaContactos(){
  int i;
  if (this.ncontactos == 1) {
             System.out.println("¡LA AGENDA ESTA VACIA!");
         }
          else {
             for (i=1;i<this.ncontactos;i++) { //inicio contador 1 para que imprima contacto 1 //no puedo usar <= porque inicia de 0 el arreglo
                 System.out.print("\nContacto número: " + i + "\n" +"Nombre: " + this.listaContactos[i].getNombre()+ "\n" + "Direccion: " + this.listaContactos[i].getDireccion() + "\n" + "Telefono: " +  this.listaContactos[i].getTelefono() + "\n");
                 System.out.println();
             }
         }
     }

public void limpiarContactos(){
  int j;
  for (j=1;j<this.ncontactos;j++) { //igual en 1 porque empiezo a llenar el arreglo en 1 :v
                  this.listaContactos[j].setNombre(" ");
                  this.listaContactos[j].setDireccion(" ");
                  this.listaContactos[j].setTelefono(" ");
              }
              ncontactos=1;
              System.out.println("¡AHORA LA AGENDA ESTA VACIA! :)");
}

public void buscarContacto(String nombre){
  int k;
  boolean existe = false;

       for (k=1;k<ncontactos;k++){
           if (nombre.equals(this.listaContactos[k].getNombre())) {
             System.out.println("\n¡CONTACTO ENCONTRADO! :D");
             System.out.print("\nContacto número: " + k + "\n" +"Nombre: " + this.listaContactos[k].getNombre()+ "\n" + "Direccion: " + this.listaContactos[k].getDireccion() + "\n" + "Telefono: " +  this.listaContactos[k].getTelefono() + "\n");
               existe = true;
           }
       }
       if (!existe) {
           System.out.println("\nEL CONTACTO " + nombre + " NO EXISTE EN ESTA AGENDA :/");
           }

}

public void eliminarContacto(String nombre){
  int l;
  boolean existe = false;

    for(l=1;l<ncontactos;l++){
      if (nombre.equals(this.listaContactos[l].getNombre())) {
        System.out.print("\nContacto número: " + l + "\n" +"Nombre: " + this.listaContactos[l].getNombre()+ "\n" + "Direccion: " + this.listaContactos[l].getDireccion() + "\n" + "Telefono: " +  this.listaContactos[l].getTelefono() + "\n");
        System.out.println("ESTE CONTACTO " + "'" + nombre + "'" + " HA SIDO BORRADO ;)");
        this.listaContactos[l].setNombre(" ");
        this.listaContactos[l].setDireccion(" ");
        this.listaContactos[l].setTelefono(" ");
        ncontactos--;
      }
}

if (!existe) {
    System.out.println("\nEL CONTACTO " + nombre + " NO EXISTE EN ESTA AGENDA :/");
    }
}

/*public void modContacto(String nombre,String nombre1, String direccion1, String telefono1){
  int m;

//Borro el contenido en esa posicion
        for(m=1;m<ncontactos;m++){
          if (nombre.equals(this.listaContactos[m].getNombre())) {
            System.out.print("\nContacto número: " + m + "\n" +"Nombre: " + this.listaContactos[m].getNombre()+ "\n" + "Direccion: " + this.listaContactos[m].getDireccion() + "\n" + "Telefono: " +  this.listaContactos[m].getTelefono() + "\n");
            System.out.println("ESTE CONTACTO " + "'" + nombre + "'" + " SERA MODIFICADO :)");
            this.listaContactos[m].setNombre(" ");
            this.listaContactos[m].setDireccion(" ");
            this.listaContactos[m].setTelefono(" ");

//Modificamos
            this.listaContactos[m].setNombre(nombre1);
            this.listaContactos[m].setDireccion(direccion1);
            this.listaContactos[m].setTelefono(telefono1);
          }
      }

}  */

public void modContactoNombre(String nombre, String nombre1){
  int m;
    for(m=1;m<ncontactos; m++){
      if(nombre.equals(this.listaContactos[m].getNombre())){
        this.listaContactos[m].setNombre(" ");

        this.listaContactos[m].setNombre(nombre1);
      }
    }
}

public void modContactoDireccion(String nombre, String direccion1){
  int p;
    for(p=1;p<ncontactos; p++){
      if(nombre.equals(this.listaContactos[p].getNombre())){
        this.listaContactos[p].setDireccion(" ");

        this.listaContactos[p].setDireccion(direccion1);
      }
    }
}

public void modContactoTelefono(String nombre, String telefono1){
  int x;
    for(x=1;x<ncontactos; x++){
      if(nombre.equals(this.listaContactos[x].getNombre())){
        this.listaContactos[x].setTelefono(" ");

        this.listaContactos[x].setTelefono(telefono1);
      }
    }
}

public boolean contactoExiste(String nombre){
  int y;
  for(y=1;y<ncontactos;y++){
    if(nombre.equals(this.listaContactos[y].getNombre())){
      return true;
    }
}
return false;
}



} //fin clase
