package activite3;

import java.io.IOException;
import java.net.Socket;

/**
 * @author Malek Hentati
 *
 */
public class ClientProcess extends Thread{
    Socket s;
    int ord;
    public ClientProcess(Socket s, int ord){
        this.s = s;
        this.
                ord = ord;
    }

    public void run(){
        System.out.println("client connecté " + s.getRemoteSocketAddress() + " ordre : " + this.ord );
        try {
            s.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
