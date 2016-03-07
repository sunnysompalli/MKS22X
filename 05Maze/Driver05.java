public class Driver05{

    public static void main(String[]args){
 Maze f;
        f = new Maze("data1.dat",true);
        System.out.println(f.toString());
	f.clearTerminal();
	f.solve();
        f.clearTerminal();
        System.out.println(f);
    }
}
