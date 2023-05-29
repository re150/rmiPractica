/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miinterfazremota;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.RMISocketFactory;
/**
 *
 * @author angel
 */
public class MiClienteRMI {
    public static void main(String[] args) {
        try {
            RMISocketFactory.setSocketFactory(new RMISocketFactory() {
                public java.net.Socket createSocket(String host, int port) throws java.io.IOException {
                    return new java.net.Socket(host, port);
                }
                public java.net.ServerSocket createServerSocket(int port) throws java.io.IOException {
                    if (port == 0)
                        port = 0;
                    return new java.net.ServerSocket(port);
                }
            });
            
            
            Registry registry = LocateRegistry.getRegistry("192.168.100.5", 1099);
            
            MiInterfazRemota remoteMi = (MiInterfazRemota) registry.lookup("MiInterfazRemota");
            
         for (int i = 1; i <= remoteMi.miMetodo2(); i++){
            // System.out.println("adshfa");
             remoteMi.miMetodo1();
         }
             
         
        } catch (Exception e) {
            System.err.println("Error en el cliente: " + e.toString());
        }
    }
}
