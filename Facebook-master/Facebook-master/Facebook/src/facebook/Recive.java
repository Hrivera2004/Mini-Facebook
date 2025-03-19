package facebook;

import UserManagementClases.Usuario;
import java.io.BufferedReader;
import java.text.DateFormat;
import javax.swing.JTextArea;

public class Recive extends Thread {

    private BufferedReader entrada;
    private JTextArea txt;
    private String selected;
    private String currentUser;

    public Recive(BufferedReader entrada, JTextArea txt, String currentUser) {
        this.entrada = entrada;
        this.txt = txt;
        this.currentUser = currentUser;
    }

    public BufferedReader getEntrada() {
        return entrada;
    }

    public void setEntrada(BufferedReader entrada) {
        this.entrada = entrada;
    }

    public JTextArea getTxt() {
        return txt;
    }

    public void setTxt(JTextArea txt) {
        this.txt = txt;
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        this.currentUser = currentUser;
    }

    public void run() {
        try {
            while (true) {
                if (entrada != null) {
                    System.out.println("enter");
                    String message = entrada.readLine();
                    String[] x = message.split(";");
                    if (selected != null) {
                        try {
                            if (x[0].equals(currentUser)) {
                                if ((selected).contains(x[1])) {
                                    txt.append(x[1] + ": " + x[2] + "[" + x[3] + "]" + "\n");
                                }
                            }
                        } catch (NullPointerException e) {
                            e.printStackTrace();
                            System.out.println("recivir exploto");
                        }

                        try {
                            Thread.sleep(500);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
