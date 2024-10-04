import java.util.Scanner;
public class Moba {

        public int[] ordenamientoBurbuja (int[] arreglo) {
    
            
    
            int tamanioVector = arreglo.length;
            boolean intercambiado = false;
    
           
    
            int aux = 0;
    
            
    
            System.out.println("Ordenando el arreglo....");
    
            for(int i = 0; i<(tamanioVector - 1) ; i++ ) {
                intercambiado = false;
                System.out.println("Pasada" + i);
                
                for(int j=0; j<(tamanioVector - 1) ; j++) {
                    System.out.println("j=" + j + "[j] = " + arreglo[j] + "j+1=" + j + 1 + "[j+1]=" + arreglo[j+1]);
                    if(arreglo[j] > arreglo[j + 1]) {
                        System.out.println("Si hay cambio");
                        aux = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = aux;
    
                        intercambiado = true;

                        
    
                    } 

                    
    
    
                    
                }

                if (!intercambiado) { 
                    break;
                }
            }
    
            return arreglo;
    
    
    
        
    
    
    
    
    
        
            }

        public void printArray(int[] array) {

            for (int num : array) {
                System.out.print(num + " ");
            }

        }

        public int[] crearArray () {

            Scanner s = new Scanner(System.in);

            System.out.println("Ingrese el tamanio del arreglo");



            int tamanio = 0;


            //VALIDAR LETRAS Y VALIDAR NUMEROS
           do {
            System.out.println("Ingrese el tamanio que sea positivo");
            while (!s.hasNextInt() ){
                System.out.println("Cualquier mensaje");
                s.next();



            }
            tamanio = s.nextInt();
            if (tamanio<=0) {
                System.out.println("El tamanio debe ser un entero positivo");
            }
           } while (tamanio<=0) ;

            int[] arreglo = new int[tamanio];

            for (int i = 0; i < tamanio; i++) {

                System.out.print("Introduce el elemento " + (i + 1) + ": ");
                arreglo[i] = leerEnteroValido(s, true);
            }


            s.close();




            return arreglo;


        }
    
        public static int leerEnteroValido (Scanner s , boolean numerosNegativos ) {

            int tamanio = 0;

            do {
                System.out.println("Ingrese el tamanio que sea positivo");
                while (!s.hasNextInt() ){
                    System.out.println("Cualquier mensaje");
                    s.next();
    
    
    
                }
                tamanio = s.nextInt();
                if (tamanio<=0 || numerosNegativos) {
                    System.out.println("El tamanio debe ser un entero positivo");
                }
               } while (tamanio<=0) ;
    
                int[] arreglo = new int[tamanio];
    
                for (int i = 0; i < tamanio; i++) {
                    System.out.print("Introduce el elemento " + (i + 1) + ": ");
                    arreglo[i] = s.nextInt();
                }
    
    
                s.close();
    
    
    
    
                return tamanio;
    

        }
} 
