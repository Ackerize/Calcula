/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Convertor;

/**
 *
 * @author LN710Q
 */
public class Conversor implements Convertor{

    @Override
    public int convertir(int numero) {
        int resultado = 0;
        String binario;
        int residuo = numero%2, cociente = numero/2;
        
        binario = Integer.toString(residuo);
        
        while(numero >= 2){
            System.out.println(binario);
            residuo = cociente%2;
            cociente = cociente/2;
            binario = Integer.toString(residuo) + binario;
        }
        
        return Integer.parseInt(binario);
    }
     
}
