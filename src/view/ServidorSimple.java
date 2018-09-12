package view;


import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Maury
 */
public class ServidorSimple extends Thread {

    StringBuffer stb = null;

    Socket cliente = null;
    DataInputStream entrada = null;
    DataOutputStream saida = null;

    public ServidorSimple(Socket cliente, StringBuffer stb) {
        this.stb = stb;
        this.cliente = cliente;
        try {
            entrada = new DataInputStream(cliente.getInputStream());
            saida = new DataOutputStream(cliente.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(ServidorSimple.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void run() {

        while (true) {
                    
            try {
                acao();
            } catch (IOException ex) {
                Logger.getLogger(ServidorSimple.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public synchronized void acao() throws IOException{
        try {

            stb.append(entrada.readUTF());
            saida.writeUTF(stb.toString());

            saida.flush();

        } catch (IOException ex) {
            Logger.getLogger(ServidorSimple.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ServidorSimple(int porta) {
        this.porta = porta;
    }
    

    public static int porta =30000;
    
    public void ligaServer() throws IOException {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //salvar no banco esta porta
                    ServerSocket server = new ServerSocket(porta);

                    StringBuffer stb = new StringBuffer();
                    
                    while (true) {
                        new ServidorSimple(server.accept(), stb).start();
                    }
                } catch (IOException ex) {
                    Logger.getLogger(ServidorSimple.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }).start();

    }
}
