package reto1;

    public class TransicionSimple implements TransicionHistoria {
        public void realizarTransicion(String decision) {
            if (decision.equalsIgnoreCase("A")) {
                System.out.println("Neo decide tomarse la pastilla roja...");
            } else {
                System.out.println("Neo decide tomarse la pastilla ...");
            }
        }
    }

