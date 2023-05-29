/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miinterfazremota;

import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author angel
 */
public interface MiInterfazRemota extends Remote{
     void miMetodo1() throws RemoteException;
     int miMetodo2() throws RemoteException;
}
