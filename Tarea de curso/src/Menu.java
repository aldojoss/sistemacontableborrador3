import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {


       //PARA VER SI PUEDO MEJORAR EL CODIGO VOY A CREAR UN METODO QUE MUESTRE EL SWITCH DE 
       //EL DE RESULTADOS Y OTRO  DEL BALANCE PARA ASI PODER CREAR UN SWITCH DE ESOS DOS Y
       //EL USUARIO PUEDA ACCEDER AL ESTADO FINANCIERO QUE QUIERA AUN Q
       //EL PROBLEMA ES QUE PRIMERO SE TIENE Q EJECUTAR EL DE RESUTLADOS
       //ENTONCES SERIA METERIAMOS ESOS DOS METODOS EN UN SWITHC Y DECIRLE AL USUARIO 
       //QUE ES RECOMENDABLE INICIAR CON EL DE RESULTADO  Y LUEGO BALANCE Y CUANDO SE TERMINEN 
       //LOS DOS LE PREGUNTE SI VA A VOLVER A INGRESAR DATOS O SE VA A SALIR DEL TODO
    
     public void menuEstadoResultadosyBalance(){

      Scanner leer=new Scanner(System.in);
        BalanceGen balance = new BalanceGen();
        EstadoResultado est = new EstadoResultado();
        boolean salir2=false;
        

      //aqui comienza el estado de resultado
     do{
      try {
        System.out.println(" BIENVENIDO AL SISTEMA CONTABLE DE LA EMPRESA X");
      System.out.println("----------Ingrese la opcion solicitada---------");
      System.out.println("-------------Estado de Resultados--------------");

      System.out.println("1. Agregar Ingresos - Reestablecer sus valores ");
      System.out.println("2. Agregar Gastos   - Reestablecer sus valores   ");
      System.out.println("3. Mostrar Ingresos");
      System.out.println("4. Mostrar Gastos Generales");
      System.out.println("5. Calcular la Utilidad del ejercicio o Utilidad neta");
      System.out.println("6. Salir");
      System.out.print("Ingrese su opcion: ");
      int op = leer.nextInt();
      
      switch (op) {
        case 1:
          est.agregarvalordeingresos();
          break;

          case 2:
          est.agregarvalordegastos();
          break;
          
          case 3:
          est.mostraringresos();
          break;

          case 4:
          est.mostrargastos();
          break;

          case 5:
          System.out.println("La utilidad el ejercicio es igual a "+est.resultadofinal(est.calcularingresos(),est.calculargastos() )); 
          
          break;

          case 6:
          System.out.println("Estado de resultados Completado");
          int utilidaddelejercicio=  est.resultadofinal(est.calcularingresos(),est.calculargastos() ); 
          balance.agregarutilidaddelejercicio(utilidaddelejercicio);
          salir2=true;
          break;
      
        default:
        System.out.println("Valor invalido");
        leer.nextLine();
          break;
      }
      } catch (Exception e) {
        System.out.println(e);
        leer.nextLine();
      }
    
    }while(!salir2);



    
    //balance
    boolean salir = false;
           do{
   
             try {
           System.out.println("BIENVENIDO AL SISTEMA CONTABLE DE LA EMPRESA X");
           System.out.println("---------------Balance General----------------");
           System.out.println("--------------Elija una opcion----------------");
           
           System.out.println("1. Agregar Activos - Reestablecer sus valores ");
           System.out.println("2. Agregar Pasivos - Reestablecer sus valores ");
           System.out.println("3. Agregar Capital - Reestablecer sus valores ");
           System.out.println("4. Mostrar Activos");
           System.out.println("5. Mostrar Pasivos");
           System.out.println("6. Mostrar Capital");
           System.out.println("7. Balance General");
           System.out.println("8. Salir");
           System.out.print("Ingrese su opcion: ");
           int opcion = leer.nextInt();
   
           
   
           switch (opcion) {
                    case 1:
                    balance.agregarvalordeactivo();
                     
                    break;
   
                    case 2:
                    balance.agregarvalordepasivo();
                    
                    break;
   
                    case 3: 
                    balance.agregarvalordecapital();
                     
                    break;
                    case 4 :
                    balance.mostaractivos();
                    break;
   
                    case 5:
                    balance.mostrarpasivos();
                    break;
   
                    case 6:
                    balance.mostrarcapital();
                    break;
   
                    case 7:
                    balance.balancefinal(balance.calcularactivos(),balance.calcularpasivos(),balance.calcularcapital());
                    break;
   
                    case 8:
                    System.out.println("!Los Estados Financieros han sido completados exitosamente!");
                    salir=true;
                    break;
           
               default:
               System.out.println("Ingresaste un dato invalido!");
               leer.nextLine();
                   break;
           }
             } catch (Exception e) {
               System.out.println(e);
               leer.nextLine();
             }
   
           
       }while (!salir);
  
     }
//MENUPRINCIPAL
     public void menuPrincipal(){
      Scanner leer=new Scanner(System.in);
      boolean salida = false;
      BalanceGen balance = new BalanceGen();
      EstadoResultado est = new EstadoResultado();
      

      do {

        try {
          System.out.println("BIENVENIDO AL SISTEMA CONTABLE DE LA EMPRESA X");
          System.out.println("-----------------Menú Principal-----------------");
          System.out.println("1. Estado de Resultados Y Balance General");
          System.out.println("2. Salir ");
          System.out.print("Ingrese su opción: ");
          int opcionPrincipal = leer.nextInt();
          leer.nextLine(); 
          
          switch (opcionPrincipal) {
              case 1:
                  menuEstadoResultadosyBalance();
                  
                  break;
              
              case 2:
                  System.out.println("Gracias por utilizar nuestro sistema contable");
                  salida = true;
                  break;
              default:
                  System.out.println("Opción inválida");
                  
                  break;
          }

        } catch (Exception e) {
          System.out.println(e);
          leer.nextLine();
        }
        
      } while (!salida);

     }




   
   

}
