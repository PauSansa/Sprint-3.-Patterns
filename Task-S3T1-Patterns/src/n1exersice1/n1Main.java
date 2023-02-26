package n1exersice1;

public class n1Main {
    public static void main(String[] args) {
        Undo undo = Undo.getInstance();
        Undo duplicate = Undo.getInstance();
        undo.addComand("CD /");
        undo.addComand("ls");
        undo.addComand("mkdir src");
        undo.listComands();
        System.out.println("   ########   ");
        undo.undo();
        undo.listComands();
    }
}
