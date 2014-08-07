/*
 * UVG
 * HDT4
 * Aaron Giron 13042
 * Javier Bucaro 130
 */

package calculadora;

/**
 *
 * @author Acer
 * Codigo tomado de: http://es.wikipedia.org/wiki/Singleton
 */
public class Singleton {
    private static Calculadora INSTANCE = null;
 
    // Private constructor suppresses 
    private Singleton(){}
 
    // creador sincronizado para protegerse de posibles problemas  multi-hilo
    // otra prueba para evitar instanciación múltiple 
    private synchronized static void createInstance() {
        if (INSTANCE == null) { 
            INSTANCE = new Calculadora();
        }
    }
 
    public static Calculadora getInstance() {
        if (INSTANCE == null) createInstance();
        return INSTANCE;
    }
}
