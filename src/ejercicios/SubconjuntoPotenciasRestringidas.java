package ejercicios;

import java.util.*;

public class SubconjuntoPotenciasRestringidas {

    public static boolean esPotenciaDeDos(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static boolean puedeAlcanzarObjetivo(int[] nums, int index, int objetivo, Set<Integer> obligatorios, Set<Integer> excluidos, Map<String, Boolean> memo) {
        if (objetivo == 0) return true;
        if (index == nums.length) return false;
    
    
    }

}
