public class Driver05{

    public static void main(String[]args){
        Maze m1 = new Maze("data1.dat", true);
        m1.clearTerminal();
        m1.solve();
        m1.clearTerminal();
        System.out.println(m1);
    }
}
