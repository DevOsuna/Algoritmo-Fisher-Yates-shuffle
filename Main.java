public class Main {

   public static void main(String[] args) {
       
        String[] randomMusic = {"Safaera", "Morado", "Sigues Con El",
         "Tusa", "Sodio", "Dance Monkey", "Fantasias"};

        int count = 1;
        while(count <= 3) {
            
            Shuffle.shuffle(randomMusic); // Hacemos un random de música

            System.out.println("-----------------------------");
            System.out.println("        RANDOM MUSIC");
            System.out.println("-----------------------------");
    
            for (int i = 0; i < randomMusic.length; i++) {
                System.out.println(randomMusic[i]);
            }

            count += 1;
            System.out.println("-----------------------------");
        }

   }

}