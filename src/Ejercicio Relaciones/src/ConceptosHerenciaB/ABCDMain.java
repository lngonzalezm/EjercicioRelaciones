/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConceptosHerenciaB;

public class ABCDMain { // Este es el Main que vota los metodos de cada una de las clases
    public static void main(String[] args) {
        G[] elements= {new G(), new F(), new H(), new E()};
        
        for(int i=0; i<elements.length; i++){
            System.out.println(elements[i]);
            elements[i].method1();
            elements[i].method2();
            System.out.println();
        }
    }
    
}
