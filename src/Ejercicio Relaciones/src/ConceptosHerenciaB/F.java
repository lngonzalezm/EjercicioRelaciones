/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConceptosHerenciaB;

/**
 *
 * @author USER
 */
public class F extends G{ // F hereda los metodos invocados en G
    public String toString(){
        return "F";
    }
    
    public void method2(){
    System.out.print("F 2");
        super.method2();
    }
    
}
