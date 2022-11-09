
import java.util.Random;

class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Random random = new Random();
        String nomes[] = { "Eduardo", "Arthur", "Juliana", "Pedro" };

        Livro livro1 = new Livro("As aventuras de TimTim", "Hergé", "Aventura", "978-85-35912-67-8");
        for (int i = 0; i < 5; i++) {
            Livro copiaLivro = livro1.clone();
            copiaLivro.setDedicatoria(nomes[random.nextInt(4)]);
            System.out.println(copiaLivro.toString());
            System.out.println("\n");

        }

        Livro livro2 = new Livro("Design Patterns com Java", "Eduardo Guerra", "Programação", "978-85-66250-11-4");
        for (int i = 0; i < 5; i++) {
            Livro copiaLivro = livro2.clone();
            copiaLivro.setDedicatoria(nomes[random.nextInt(4)]);
            System.out.println(copiaLivro.toString());
            System.out.println("\n");
        }

    }

}