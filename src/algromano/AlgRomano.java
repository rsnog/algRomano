    package algromano;

import javax.swing.JOptionPane;

/**
 *
 * @author Roberto
 */
public class AlgRomano {

    /**
     * @param args 0
     */
    static void Rom(int N) {
        String[] Un = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] Dec = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] Cen = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] Mil = {"", "M", "MM", "MMM", "_IV_", "_V_", "_VI_", "_VII_", "_VIII_", "_IX_"};
        int u = N % 10;
        int d = (N / 10) % 10;
        int c = (N / 100) % 10;
        int m = N / 1000;
        JOptionPane.showMessageDialog(null, Mil[m] + Cen[c] + Dec[d] + Un[u]);
    }

    public static void main(String[] args) {
        while (true) {
            int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero:", "Número até 9999...", JOptionPane.DEFAULT_OPTION));
            Rom(x);
        }

//        Scanner leia = new Scanner(System.in);
//        int vlr, n, sobra = 0;
//        while (true) {
//            String roma = "";
//            System.out.print("\n Informe um numero entre 1 e 4000: ");
//            vlr = leia.nextInt();
//            n = vlr;
//            if (vlr <= 4000) {
//                while (vlr >= 1000) {
//                    roma += "M";
//                    vlr -= 1000;
//                }
//                while (vlr >= 900) {
//                    roma += "CM";
//                    vlr -= 900;
//                }
//                while (vlr >= 500) {
//                    roma += "D";
//                    vlr -= 500;
//                }
//                while (vlr >= 400) {
//                    roma += "CD";
//                    vlr -= 400;
//                }
//                while (vlr >= 100) {
//                    roma += "C";
//                    vlr -= 100;
//                }
//                while (vlr >= 90) {
//                    roma += "XC";
//                    vlr -= 90;
//                }
//                while (vlr >= 50) {
//                    roma += "L";
//                    vlr -= 50;
//                }
//                while (vlr >= 40) {
//                    roma += "XL";
//                    vlr -= 40;
//                }
//                while (vlr >= 10) {
//                    roma += "X";
//                    vlr -= 10;
//                }
//                while (vlr >= 9) {
//                    roma += "IX";
//                    vlr -= 9;
//                }
//                while (vlr >= 5) {
//                    roma += "V";
//                    vlr -= 5;
//                }
//                while (vlr >= 4) {
//                    roma += "IV";
//                    vlr -= 4;
//                }
//                while (vlr >= 1) {
//                    roma += "I";
//                    vlr -= 1;
//                }
//                System.out.println("O Algarismo Romano correspondente a " + n + " é " + roma);
//            } else {
//                System.out.print("Valor Inválido!");
//            }
//    }
    }
}
