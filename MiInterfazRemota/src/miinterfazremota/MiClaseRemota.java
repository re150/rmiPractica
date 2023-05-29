/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miinterfazremota;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
/**
 *
 * @author angel
 */
public class MiClaseRemota extends UnicastRemoteObject implements MiInterfazRemota{
    
    public MiClaseRemota() throws RemoteException {
    // Código del constructor
    }

    public void miMetodo1() throws RemoteException {
    // Aquí ponemos el código que queramos
      System.out.println("Estoy en miMetodo1()");
    }
    
  
    public int miMetodo2() throws RemoteException {
    // Aquí ponemos el código que queramos
      
     return 5;
    }

}
