import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class EstadoResultado   {
   Scanner leer = new Scanner (System.in);
   private  ArrayList<Ingresos>ingresos = new ArrayList<>();
   private  ArrayList<Gastos>gastos = new ArrayList<>();


//constructor inicializar variables

   public EstadoResultado(){
    ingresos.add(new Ingresos("Ingresos Variados", 0));

    gastos.add(new Gastos("Gastos Generales", 0));
   }
//agregar el valor 
   public void agregarvalordegastos(){

    for (Gastos gastos2 : gastos) {
        while(true){
       try {
        System.out.println("Ingrese el valor de la cuenta "+gastos2.getNombre());
        int valor = leer.nextInt();
        gastos2.setValor(valor);
        break;
       } catch (Exception e) {
        System.out.println(e);
        leer.nextLine();
       }
    }
    }
   }

   public void agregarvalordeingresos(){

    for (Ingresos ingresos2 : ingresos) {
      while (true){
        try {
        System.out.println("Ingrese el valor de la cuenta "+ingresos2.getNombre());
        int valor = leer.nextInt();
        ingresos2.setValor(valor);
        break;
        } catch (Exception e) {
            System.out.println(e);
            leer.nextLine();
        }
    }
    }

   }

   public void mostrargastos(){
    System.out.println("SUS GASTOS SON DE ");
    System.out.println();
    for (Gastos gastos2 : gastos) {
        System.out.println(gastos2.getNombre()+"......."+gastos2.getValor());
    }
    System.out.println();
   }

   public void mostraringresos(){
    System.out.println("SUS INGRESOS SON DE ");
    System.out.println();
    for (Ingresos ingresos2 : ingresos) {
        System.out.println(ingresos2.getNombre()+"......."+ingresos2.getValor());   
    }
    System.out.println();
   }

   public int calcularingresos(){
    int total=0;
    for (Ingresos ingresos2 : ingresos) {
        total+=ingresos2.getValor();
    }
    return total;
    
   }

   public int calculargastos(){
    int total=0;
    for (Gastos gastos2 : gastos) {
        total+=gastos2.getValor(); 
    }
    return total;
    
   }

   public int resultadofinal(int ingresos, int gastos){

    int utilidaddelejercicio= ingresos-gastos;

    return utilidaddelejercicio;


   }


//gett y setterrs
   public ArrayList<Gastos> getGastos() {
       return gastos;
   }
   public ArrayList<Ingresos> getIngresos() {
       return ingresos;
   }
   public void setGastos(ArrayList<Gastos> gastos) {
       gastos = gastos;
   }
   public void setIngresos(ArrayList<Ingresos> ingresos) {
       this.ingresos = ingresos;
   }

   

   






}
