
public class Scope {
    String z = "Azul";
    public void metodo1() {
       String z = "hola";
       {
          System.out.println(z);
       }    
       // Tiene prevalencia el mas adentrado
       // innerMost
    }    
}