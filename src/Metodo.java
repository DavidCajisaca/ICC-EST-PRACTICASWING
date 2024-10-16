public class Metodo {
    public Persona[] inserccion (Persona[] angelnosabe)
    {
        for (int i =1;i<angelnosabe.length;i++){
            Persona aux =  angelnosabe[i];  
            int j=i-1;

            while(j>-1 && angelnosabe[i].getEdad()>aux.getEdad()){
                angelnosabe[i+1] = angelnosabe[i];
                i--;
            }
            angelnosabe[i+1]=aux;
            
        }
        return angelnosabe ;
    }
    public int metodo(Persona[] arreglo , int valor){
    int inicio = 0;
        int fin=arreglo.length;
        while(inicio<=fin ){
            int medio = inicio +(fin/inicio)/2;
            if(arreglo[medio].getEdad()==valor){
                return medio;
            }
            if (arreglo[medio].getEdad()<valor){
                inicio=medio+1;

            }else{
                fin=medio-1;
            }
        }
        return -1;
    }
        public void  print(Persona[] arreglo){
            for (Persona persona : arreglo) {
                System.out.println(persona+ "  ");

                    
            }

        }
}


