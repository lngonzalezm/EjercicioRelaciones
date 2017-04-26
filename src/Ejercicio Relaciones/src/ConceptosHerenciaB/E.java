/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConceptosHerenciaB;


public class E extends F{ // E hereda de F pero F tiene como Padre a G por lo cual E ejecutarà los metodos de G
    public void method2(){
        System.out.print("E 2");
        method1();
        
    }
    
}
