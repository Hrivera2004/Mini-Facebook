package FacebookServer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;

public class UserOnline extends Thread {

    private Socket socket;
    private PrintWriter salida;
    private BufferedReader entrada;
    private String preguntaCliente;
    private String respuestaServer;
    private UsersOnlinesList amigos;

    public UserOnline(Socket socket, UsersOnlinesList amigos) {
        super();
        this.socket = socket;
        this.amigos = amigos;
    }

    @Override
    public void run() {
        try {
            salida =
                    new PrintWriter(socket.getOutputStream(), true);
            entrada = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            salida.println("Bienvenido al sistema");
            while (true) {
                preguntaCliente = entrada.readLine();
                //enviar mensaje a todos los otros usuarios
                for (UserOnline temp : amigos.getU()) {
                    if (!temp.equals(this)) {
                        temp.salida.println(preguntaCliente);
                    }
                }

                if (preguntaCliente.equals("salir")) {
                    socket.close();
                    System.out.println("Server Abajo......");
                    break;
                }
            }

            salida.close();
            entrada.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
