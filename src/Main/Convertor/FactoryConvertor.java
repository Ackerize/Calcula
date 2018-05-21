/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.Convertor;

import Main.AbstractFactory;
import Main.Artimetica.Aritmetica;

/**
 *
 * @author LN710Q
 */
public class FactoryConvertor implements AbstractFactory {

    @Override
    public Convertor getConvertor(String type) {
        switch(type){
            case "convertir":
                return new Conversor();
        }
        return null;
    }

    @Override
    public Aritmetica getAritmetica(String type) {
        return null; //To change body of generated methods, choose Tools | Templates.
    }
    
}
