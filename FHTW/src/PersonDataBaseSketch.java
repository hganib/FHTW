public class PersonDataBaseSketch {
    public static void main(String[] args) {
        long[] pUIDs = {1,2,3};
        String[] VN ={"Jim", "Jane", "John"};
        String[] NN ={"Doe", "Deer", "Jackson"};
        int[] dobD={1,3,15};
        int[] dobM={9,11,1};
        int[] dobY={1959,2010,1987};

        printDB(pUIDs,VN,NN,dobD,dobM,dobY);

    }

    public static void printDB (long[] uid, String[] VN, String[] NN, int[] d, int[] m, int[] y) {
        for (int i = 0; i < uid.length; i++) {
            System.out.printf("%05d %-10.10S %-10.10S %02d-%02d-%02d\n",uid[i], VN[i], NN[i], d[i], m[i], y[i]);
        }
    }
}
