/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package faculty;

/**
 *
 * @author Sergio y Camilo
 */
public class Faculty extends Employee { //La facultad hereda los métodos del empleado

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Faculty(); //Crea un nuevo objeto de tipo Facultad
    }
    
    public Faculty(){
        System.out.println("Performs Faculty's Tasks"); //Aunque aquí solo se encuentra la acción de imprimir "Performs Faculty Tasks" se ejecutan los métodos del empleado y la persona ya que ambas clases son progenitoras de esta
    }
}

class Employee extends Person{ // A su vez el empleado hereda los métodos de la persona, por lo que transmite sus métodos y los de la persona a la clase Facultad
    public Employee(){
        this("Invoke Employee's"); //Imprime un mensaje diciendo "Invoke Employee's". Esta acción la ejecuta la clase facultad, ya que es una clase descendiente de esta
        System.out.println("Performs Employee's Tasks"); //Imprime un mensaje diciendo "Performs Employee Tasks". Esta acción la ejecuta la clase facultad, ya que es una clase descendiente de esta
    }
    
    public Employee(String s)
    {
        System.out.println(s);
    }
    
}

class Person{
    public Person(){
        System.out.println("Performs Person's tasks"); //Imprime un mensaje diciendo "Performs Person Tasks". Este método es trasmitido al empleado, que a su vez lo transmite a la facultad que es la clase hija de esta para que esta última lo ejecute
    }
}