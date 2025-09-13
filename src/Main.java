//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    //ejemplos principios Poo
    //encapsulamiento
    public class Persona {
        private String nombre;
        private int edad;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }
    }

  //abstraccion
    abstract class Animal {
        abstract void hacerSonido();
    }

    class Perro extends Animal {
        void hacerSonido() {
            System.out.println("Guau");
        }
    }

    class Gato extends Animal {
        void hacerSonido() {
            System.out.println("Miau");
        }
    }

   //herencia
   class Animal {
       void comer() {
           System.out.println("Este animal come");
       }
   }

   //polimorfismo
    class Perro extends Animal {
        void ladrar() {
            System.out.println("Guau");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Perro perro = new Perro();
            perro.comer(); // Heredado de Animal
            perro.ladrar();
        }
    }

  //ejemplo records
  public record Persona(String nombre, int edad) {
      // Puedes agregar métodos si lo necesitas
      public String saludo() {
          return "Hola, mi nombre es " + nombre + " y tengo " + edad + " años.";
      }
  }

    public class Main {
        public static void main(String[] args) {
            Persona persona = new Persona("Jacob", 30);

            System.out.println(persona.nombre()); // Accede al campo 'nombre'
            System.out.println(persona.edad());   // Accede al campo 'edad'
            System.out.println(persona.saludo()); // Llama al método personalizado
        }
    }

}


