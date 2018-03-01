import java.util.Scanner;
public class PruebaDirectorio{
  private static Scanner reader;

public static void main(String[] args){
    reader = new Scanner(System.in);
    Directorio test = new Directorio();
    byte opc = 0;



        do{
          System.out.println();
          System.out.println("Bienvenido a tu Directorio");
          System.out.println("Escribe el número de la opción deseada");
          System.out.println("1. Agregar nuevo contacto");
          System.out.println("2. Modificar Contacto");
          System.out.println("3. Eliminar Contacto");
          System.out.println("4. Buscar Contacto");
          System.out.println("5. Ver Lista de Contactos");
          System.out.println("6. Limpiar Directorio");
          System.out.println("0. Salir");
          System.out.print("Ingresa la opcion que deseas: ");
          opc = reader.nextByte();
          System.out.println();

          switch(opc){
           case 1:
                   String nombre, direccion, telefono;
                   System.out.print("Introduce el nombre: ");
                   nombre = reader.next();

                   reader.nextLine();

                   System.out.print("Introduce la direccion: ");
                   direccion = reader.nextLine();
                   System.out.print("Introduce el telefono: ");
                   telefono = reader.nextLine();

                        test.nuevoContacto(nombre,direccion,telefono);
                    break;
           case 2:
                    byte opc1=0;

                    System.out.println("Ingresa el nombre del contacto que deseas MODIFICAR: ");
                    nombre = reader.next();
                    //test.contactoExiste(nombre);

                    if(test.contactoExiste(nombre)){
                    do{
                    System.out.println("¿Que apartado de este contacto quieres modificar?");
                    System.out.println("Escribe el número de la opción deseada");
                    System.out.println("1. Nombre");
                    System.out.println("2. Direccion");
                    System.out.println("3. Telefono");
                    System.out.println("0. Terminar de modificar");
                    System.out.print("Ingresa la opcion que deseas: ");
                    opc1 = reader.nextByte();
                    System.out.println();

                    switch(opc1){
                      case 1:
                              String nombre1;
                              System.out.print("Introduce el nuevo nombre: ");
                              nombre1 = reader.next();
                              test.modContactoNombre(nombre, nombre1);
                      break;

                      case 2:
                              String direccion1;
                              System.out.print("Introduce la nueva direccion: ");
                              direccion1 = reader.next();
                              test.modContactoDireccion(nombre, direccion1);
                      break;

                      case 3:
                            String telefono1;
                            System.out.print("Introduce el nuevo telefono: ");
                            telefono1 = reader.next();
                            test.modContactoTelefono(nombre, telefono1);
                      break;
                      }
                    }while(opc1 != 0);
                  }

                        else{
                            System.out.println("\nEL CONTACTO " + nombre + " NO EXISTE EN ESTA AGENDA :/");
                        }
                      break;

           case 3:
                   System.out.println("Ingresa el nombre del contacto que deseas ELIMINAR: ");
                   nombre = reader.next();
                   test.eliminarContacto(nombre);
                    break;
           case 4:
                   System.out.println("Ingresa el nombre del contacto que deseas BUSCAR: ");
                   nombre = reader.next();
                   test.buscarContacto(nombre);
                   break;
           case 5: test.listaContactos();
                   break;
           case 6: test.limpiarContactos();
                   break;

          }
        } while(opc != 0);

  }
}
