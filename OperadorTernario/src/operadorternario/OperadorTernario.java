/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadorternario;

/**
 *
 * @author DELL
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n1, n2, r;
        n1 = 4;
        n2 = 8;
        r = (n1>n2) ? 0 : 1;
        System.out.println(r);*/
        
        String nome1 = "Fabio";
        String nome2 = "Fabio";
        String nome3 = new String ("Fabio");
        String res;
        //res = (nome1==nome2) ? "Igual" : "Diferente";
        res = (nome1.equals(nome3)) ? "Igual" : "Diferente"; //verifica se o conteúdo é igual
        System.out.println(res);
    }
    
}
