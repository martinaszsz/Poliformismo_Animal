public class App {
    public static void main(String[] args) throws Exception {
        
        Mamifero m = new Mamifero();
        m.emitirsom();

        Lobo l = new Lobo();
        l.emitirsom();

        Cachorro c = new Cachorro();
        c.emitirsom();
    
        c.reagir("Toma comida");
        c.reagir(true);
        c.reagir(11, 45);

        c.reagir(5, 10);
        
    }
}
