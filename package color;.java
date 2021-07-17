import java.util.*;
public class color {
   public static void main(String args[]){  
    Scanner leer=new Scanner (System.in);   
    int c,e,N;
    double nota,s,promedio;
    String nombre;
    System.out.print("Ingrese la cantidad de estudiantes");
    N=leer.nextInt();
    e=1;
    s=0;
    c=0;
    while (e<=N){
         System.out.print("Ingrese el nombre del estudiante");
         nombre=leer.next();
          System.out.print("Ingrese la cantidad de estudiantes"+e); 
          nota=leer.nextDouble();
          if (nota>=3 & nota<=4){
            s=s+nota;
            c=c+1;   
       }
        e=e+1;
      }    
      if(c==0){
            System.out.print("No hay estudiantes con notas entre 3 y 4");
     }   
     else{
            promedio=s/c;
             System.out.print("Promedio de estudiante con notas entre 3 y 4 es "+promedio);           
        }
    }
}