import java.util.concurrent.Semaphore;

public class Speed {
    // semáforo para controlar el acceso a la velocidad 
    private final Semaphore semaphore = new Semaphore(1);

    // metodos para acelerar y frenar
    public void accelerate() throws InterruptedException {
        /** espera su turno tomando el permiso; 
         * si lo interrumpen mientras espera, lanza InterruptedException 
         * para no quedarse bloqueado.
        */
        semaphore.acquire();
    }

    public void brake() {
        /**
         * devuelve el permiso: indica que ya terminó 
         * y deja pasar al siguiente hilo.
         */
        semaphore.release();
    }
}

