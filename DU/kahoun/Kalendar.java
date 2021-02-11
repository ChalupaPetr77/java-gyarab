package Ukoly.Kalendar;

// Autor: bain
public class Kalendar {
    int[] dny_v_mesicich = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    boolean prestupny;

    public static void main(String[] args) {
        Kalendar k = new Kalendar(2020);
        int poradiSestehoDubna          = k.poradiDne(4, 6);
        int[] sestehoDubna              = k.denVPoradi(poradiSestehoDubna);
        int intevalMezi1DubnaA1Prosince = k.inverval(4, 1, 12, 1);

        System.out.println("Pořadí šestého dubna: "+poradiSestehoDubna);
        System.out.println("Šestý duben je "+sestehoDubna[1]+". den v "+sestehoDubna[0]+". měsíci roku");
        System.out.println("Mezi prvním dubnem a prvním prosincem je "+intevalMezi1DubnaA1Prosince+" dnů.");
    }

    public Kalendar(int rok) {
        boolean prestupny = false;
        if (rok%4==0) {
            if (rok%100 == 0 && rok%400 != 0) prestupny = false;
            else prestupny = true;
        }
        this.prestupny = prestupny;
        dny_v_mesicich[1] += prestupny ? 1 : 0;
    }

    public boolean isPrestupny() { return prestupny; }

    public int poradiDne(int mesic, int den) {
        int sum = 0;
        for (int i = mesic-2; i >= 0; i--) sum += dny_v_mesicich[i];
        return sum+den;
    }

    public int[] denVPoradi(int poradi) {
        int sum = 0, i = 0;
        while (sum < poradi) {
            sum += dny_v_mesicich[i];
            i++;
        }
        return new int[]{i, dny_v_mesicich[i - 1] - sum + poradi};
    }

    public int inverval(int mesicOd, int denOd, int mesicDo, int denDo) {
        return Math.abs(poradiDne(mesicOd, denOd)-poradiDne(mesicDo, denDo));
    }

}
