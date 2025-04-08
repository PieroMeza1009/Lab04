package actividades04;

public class TorresHanoi {
    public static void main(String[] args) {
        TorresHanoi(3, 1, 2, 3, )

    }
    public static void TorresHanoi(int discos, int torre1, int torre2, int torre3){
        if (discos==1) {
            System.out.println("Mover disco de la torre" +torre1 + "hacia la torre" + torre3);
        }else{
            TorresHanoi(discos -1, torre1, torre3,torre2);
            System.out.println("mover disco de torre "+ torre1 + " a torre " + torre3);
            TorresHanoi(discos -1, torre2, torre1, torre3);
        }
    }

}
