package Ukoly.StatZnak;

public class StatZnak {
    private int[] pismena = new int[Character.MAX_CODE_POINT];
    private int cislice;
    private int malePismena;
    private int velkePismena;
    private int bilaMezera;
    private int isoControl;
    private int radky;
    private String nejdelsiRadek = "";
    private int celkovaDelka;

    public static void main(String[] args) {

        StatZnak stat = new StatZnak();
        stat.update("According to all known laws of aviation,there is no way a bee should be able to fly.\n" +
                "Its wings are too small to get its fat little body off the ground.\nThe bee, of course, flies " +
                "anyway because bees don't care what humans think is impossible.");
        System.out.println(stat.nejcastejsiZnak());
        System.out.println(stat.nejcastejsiPismeno());
        System.out.println(stat.getPrumernaDelkaRadku());
        System.out.println(stat.getMalePismena());
        System.out.println(stat.getRadky());
        stat.reset();
    }

    public void reset() {
        cislice = 0;
        malePismena = 0;
        velkePismena = 0;
        bilaMezera = 0;
        isoControl = 0;
        radky = 0;
        celkovaDelka = 0;
        nejdelsiRadek = "";
        pismena = new int[Character.MAX_CODE_POINT];
    }

    public void update(String s) {

        // jestliže je ve stringu víc řádků, pak zavolej update jen na jeden.
        // je to zbytecne komplikovane, ale rekurze je cool takze chill
        String[] lines = s.split("\n");
        if (lines.length > 1) {
            isoControl += lines.length - 1;
            for (String line : lines) {
                update(line);
            }
            return;
        }

        // spočítání typů a jednotlivých znaků
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) cislice++;
            else if (Character.isLowerCase(c)) malePismena++;
            else if (Character.isUpperCase(c)) velkePismena++;
            else if (Character.isSpaceChar(c)) bilaMezera++;
            else if (Character.isISOControl(c)) isoControl++;
            pismena[c]++;
        }

        // informace o řádcích
        radky++;
        if (nejdelsiRadek.length() < s.length()) nejdelsiRadek = s;
        celkovaDelka += s.length();
    }

    public char nejcastejsiZnak() {
        int max = 0;
        for (int i = 0; i < pismena.length; i++) {
            if (pismena[max] < pismena[i]) max = i;
        }
        return (char) max;
    }

    public char nejcastejsiPismeno() {
        int max = 65;
        for (int i = 65; i < pismena.length; i++) {
            if (pismena[max] < pismena[i] && Character.isAlphabetic(i)) max = i;
        }
        return (char) max;
    }

    public double getPrumernaDelkaRadku() {
        return (double) celkovaDelka / radky;
    }

    public int getCislice() {
        return cislice;
    }

    public int getMalePismena() {
        return malePismena;
    }

    public int getVelkePismena() {
        return velkePismena;
    }

    public int getBilaMezera() {
        return bilaMezera;
    }

    public int getIsoControl() {
        return isoControl;
    }

    public int getRadky() {
        return radky;
    }
}
