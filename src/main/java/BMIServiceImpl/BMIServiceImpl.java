/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BMIServiceImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BMIServiceImpl extends UnicastRemoteObject implements BMIService {
    public BMIServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public double calculateBMI(int feet, int inches, double weight) throws RemoteException {
        double height = (double) ((feet * 12) + inches) * 0.0254;
        return weight / (height * height);
    }
}

