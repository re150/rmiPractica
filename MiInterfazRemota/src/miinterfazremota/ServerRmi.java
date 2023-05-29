/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miinterfazremota;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.RMISocketFactory;
/**
 *
 * @author angel
 */
public class ServerRmi {
    public static void main(String[] args) {
        
        try{
        
            RMISocketFactory.setSocketFactory(new RMISocketFactory() {
                public java.net.Socket createSocket(String host, int port) throws java.io.IOException {
                    return new java.net.Socket(host, port);
                }
                public java.net.ServerSocket createServerSocket(int port) throws java.io.IOException {
                    if (port == 0)
                        port = 1099;
                    return new java.net.ServerSocket(port);
                }
            });
            
            MiClaseRemota remoteMi =  new MiClaseRemota ();
            
            //se registara un puertto 
            Registry registry = LocateRegistry.createRegistry(1099);
            
            registry.rebind("MiInterfazRemota", remoteMi);
            
             System.out.println("Servidor RMI listo...");
        }catch(Exception e){
        System.err.println("Error en el servidor: " + e.toString());
            e.printStackTrace();
        }
    }
}
