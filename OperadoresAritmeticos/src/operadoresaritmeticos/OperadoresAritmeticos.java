/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresaritmeticos;

/**
 *
 * @author DELL
 */
public class OperadoresAritmeticos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*int n1 = 3;
        int n2 = 6;
        float m = (n1 + n2)/2;
        System.out.println("A média da operação é igual a " + m);*/
        
        /*double ale = Math.random();
        System.out.println(ale);*/
        //random prepara números aleatórios de 0 a 1
        
        double ale = Math.random();
        int n = (int) (15 + ale * (50 - 15));//15 a 50
        System.out.println(n);
    }
    
}