package javaapplication2;

import java.util.*;
import java.io.*;

class Ders implements DersAdıYaz {

    @Override
    public void DersAdi(String dersID) {
        try {
            FileInputStream fi = new FileInputStream("Dersler.txt");

            BufferedReader buf = new BufferedReader(new InputStreamReader(fi));
            String satir;
            while ((satir = buf.readLine()) != null) {
                if (!(satir.equals(""))) {
                    var ayrim = satir.split(" ");
                    if (ayrim[0].equals(dersID)) {

                        System.out.printf(ayrim[1]);

                    }
                }
            }
        } catch (FileNotFoundException f) {
            System.out.println("dosya yok");
        } catch (IOException ioex) {
            System.out.println("başka bir hata oldu");
        }
    }

}

class Not implements NotKontrol {

    @Override
    public void NotOku(String a, String b) {
        try {
            FileInputStream fi = new FileInputStream("Notlar.txt");

            BufferedReader buf = new BufferedReader(new InputStreamReader(fi));
            String satir;
            while ((satir = buf.readLine()) != null) {
                if (!satir.equals("")) {
                    var ayrim = satir.split(" ");
                    if (ayrim[0].equals(a) && ayrim[1].equals(b)) {

                        System.out.printf(ayrim[2]);
                        int harfNotu = Integer.parseInt(ayrim[2]);
                        if (harfNotu < 20) {
                            System.out.printf(" ");
                            System.out.printf("FF");
                        }
                        if (20 <= harfNotu && harfNotu < 40) {
                            System.out.printf(" ");
                            System.out.printf("DD");
                        }
                        if (40 <= harfNotu && harfNotu < 60) {
                            System.out.printf(" ");
                            System.out.printf("CC");
                        }
                        if (60 <= harfNotu && harfNotu < 80) {
                            System.out.printf(" ");
                            System.out.printf("BB");
                        }
                        if (80 <= harfNotu) {
                            System.out.printf(" ");
                            System.out.printf("AA");
                        }
                    }
                }
            }
        } catch (FileNotFoundException f) {
            System.out.println("dosya yok");
        } catch (IOException ioex) {
            System.out.println("başka bir hata oldu");
        }
    }
}

class NotGoster {

    String Ders1;
    String Ders2;

    NotGoster() {

    }

    NotGoster(String ID) {
        try {
            FileInputStream fi = new FileInputStream("Ogrenci.txt");

            BufferedReader buf = new BufferedReader(new InputStreamReader(fi));
            String satir;
            while ((satir = buf.readLine()) != null) {
                if (!satir.equals("")) {
                    var ayrim = satir.split(" ");
                    if (ayrim[0].equals(ID)) {
                        Ders1 = ayrim[4];
                        Ders2 = ayrim[5];
                        Not a = new Not();
                        Ders c = new Ders();
                        c.DersAdi(Ders1);
                        System.out.printf(" ");
                        a.NotOku(ID, Ders1);
                        System.out.printf("\n");
                        c.DersAdi(Ders2);
                        System.out.printf(" ");
                        a.NotOku(ID, Ders2);

                        System.out.printf("\n");
                    }
                }

            }
        } catch (FileNotFoundException f) {
            System.out.println("dosya yok");
        } catch (IOException ioex) {
            System.out.println("başka bir hata oldu");
        }
    }

}

class OgrenciGiris implements Login {

    public static String girisKontrol() {
        Scanner girdi = new Scanner(System.in);

        System.out.printf("\nID:");
        String ID = girdi.next();
        System.out.printf("\nSifre:");
        String Sifre = girdi.next();

        try {
            FileInputStream fi = new FileInputStream("Ogrenci.txt");

            BufferedReader buf = new BufferedReader(new InputStreamReader(fi));
            String satir;
            while ((satir = buf.readLine()) != null) {
                if (!satir.equals("")) {

                    var ayrim = satir.split(" ");
                    if (ID.equals(ayrim[0]) && Sifre.equals(ayrim[3])) {
                        System.out.printf("Giris basarili\n");
                        return ID;
                    }

                }
            }

        } catch (FileNotFoundException f) {
            System.out.println("dosya yok");
        } catch (IOException ioex) {
            System.out.println("başka bir hata oldu");
        }

        String a = "";
        return a;
    }
}

class MemurGiris implements Login {

    public static String girisKontrol() {
        Scanner girdi = new Scanner(System.in);

        System.out.printf("\nID:");
        String ID = girdi.next();
        System.out.printf("\nSifre:");
        String Sifre = girdi.next();

        try {
            FileInputStream fi = new FileInputStream("Memur.txt");

            BufferedReader buf = new BufferedReader(new InputStreamReader(fi));
            String satir;
            while ((satir = buf.readLine()) != null) {
                if (!satir.equals("")) {

                    var ayrim = satir.split(" ");
                    if (ID.equals(ayrim[0]) && Sifre.equals(ayrim[3])) {
                        System.out.printf("Giris basarili\n");
                        return ID;
                    }

                }
            }

        } catch (FileNotFoundException f) {
            System.out.println("dosya yok");
        } catch (IOException ioex) {
            System.out.println("başka bir hata oldu");
        }

        String a = "";
        return a;
    }
}

class AkademisyenGiris implements Login {

    public static String girisKontrol() {
        Scanner girdi = new Scanner(System.in);

        System.out.printf("\nID:");
        String ID = girdi.next();
        System.out.printf("\nSifre:");
        String Sifre = girdi.next();

        try {
            FileInputStream fi = new FileInputStream("Akademisyen.txt");

            BufferedReader buf = new BufferedReader(new InputStreamReader(fi));
            String satir;
            while ((satir = buf.readLine()) != null) {
                if (!satir.equals("")) {

                    var ayrim = satir.split(" ");
                    if (ID.equals(ayrim[0]) && Sifre.equals(ayrim[3])) {
                        System.out.printf("Giris basarili\n");
                        return ID;
                    }

                }
            }

        } catch (FileNotFoundException f) {
            System.out.println("dosya yok");
        } catch (IOException ioex) {
            System.out.println("başka bir hata oldu");
        }

        String a = "";
        return a;
    }
}

class DersProgrami {

    DersProgrami() {

    }

    DersProgrami(String ID) {
        try {
            FileInputStream fi = new FileInputStream("Ogrenci.txt");

            BufferedReader buf = new BufferedReader(new InputStreamReader(fi));
            String satir;
            while ((satir = buf.readLine()) != null) {
                if (!satir.equals("")) {
                    var ayrim = satir.split(" ");
                    if (ayrim[0].equals(ID)) {
                        String a = ayrim[4];
                        String b = ayrim[5];
                        DersProgramiYaz program = new DersProgramiYaz();
                        System.out.printf("\n");
                        program.DersYaz(a);

                        System.out.printf("\n");
                        program.DersYaz(b);
                        System.out.printf("\n");
                    }
                }

            }
        } catch (FileNotFoundException f) {
            System.out.println("dosya yok");
        } catch (IOException ioex) {
            System.out.println("başka bir hata oldu");
        }
    }
}

class DersProgramiYaz {

    void DersYaz(String DersID) {
        try {
            FileInputStream fi = new FileInputStream("Dersler.txt");

            BufferedReader buf = new BufferedReader(new InputStreamReader(fi));
            String satir;
            while ((satir = buf.readLine()) != null) {
                if (!satir.equals("")) {
                    var ayrim = satir.split(" ");

                    if (ayrim[0].equals(DersID)) {
                        System.out.printf(ayrim[1]);
                        System.out.printf(" ");
                        System.out.printf(ayrim[2]);
                    }

                }
            }
        } catch (FileNotFoundException f) {
            System.out.println("dosya yok");
        } catch (IOException ioex) {
            System.out.println("başka bir hata oldu");
        }
    }
}

abstract class NotGiris {

    public abstract void notGir(String ID);
}

class akademisyenNotGiris extends NotGiris {

    String DersID;

    @Override
    public void notGir(String ID) {

        try {
            FileInputStream fi = new FileInputStream("Akademisyen.txt");

            BufferedReader buf = new BufferedReader(new InputStreamReader(fi));
            String satir;
            while ((satir = buf.readLine()) != null) {
                if (!satir.equals("")) {
                    var ayrim = satir.split(" ");
                    if (ayrim[0].equals(ID)) {
                        DersID = ayrim[4];
                        OgrenciYaz ogr = new OgrenciYaz();
                        ogr.OgrYaz(DersID);

                    }

                }
            }
        } catch (FileNotFoundException f) {
            System.out.println("dosya yok");
        } catch (IOException ioex) {
            System.out.println("başka bir hata oldu");
        }
    }
}

abstract class OgrNot {

    public abstract void OgrYaz(String DersID);
}

class OgrenciYaz extends OgrNot {

    @Override
    public void OgrYaz(String DersID) {
        try {

            FileInputStream fi = new FileInputStream("Ogrenci.txt");

            BufferedReader buf = new BufferedReader(new InputStreamReader(fi));
            String satir;
            while ((satir = buf.readLine()) != null) {
                if (!satir.equals("")) {
                    var ayrim = satir.split(" ");

                    if (ayrim[4].equals(DersID)) {
                        System.out.printf("%s %s isimli ogrenci icin not giriniz", ayrim[1], ayrim[2]);
                        OgrenciNotyaz a = new OgrenciNotyaz();
                        a.notyaz(ayrim[0], DersID);

                    }
                }
            }
        } catch (FileNotFoundException f) {
            System.out.println("dosya yok");
        } catch (IOException ioex) {
            System.out.println("başka bir hata oldu");
        }
    }
}

class OgrenciNotyaz {

    public void notyaz(String ogrID, String DersID) {
        try {
            FileOutputStream f = new FileOutputStream("Notlar.txt", true);
            PrintStream yaz = new PrintStream(f);
            Scanner girdi = new Scanner(System.in);
            String not = girdi.next();
            String satir = ogrID + " " + DersID + " " + not;
            yaz.println(satir);
        } catch (IOException e) {
        }
    }
}

public class JavaApplication2 {

    static class Kayit {

        static String memurKayit() {
            FileWriter fileWriter = null;

            String ID;
            String Sifre;
            String Ad;
            String Soyad;
            String bosluk = " ";
            Scanner girdi = new Scanner(System.in);

            System.out.printf("\nMemur ID giriniz   :");
            ID = girdi.next();

            System.out.printf("\nSifre giriniz  :");
            Sifre = girdi.next();

            System.out.printf("İsim giriniz  :");
            Ad = girdi.next();

            System.out.printf("\nSoyad giriniz  :");
            Soyad = girdi.next();

            try {
                FileOutputStream f = new FileOutputStream("Memur.txt", true);
                PrintStream yaz = new PrintStream(f);
                String satir;
                satir = ID + " " + Ad + " " + Soyad + " " + Sifre;
                yaz.println(satir);
            } catch (IOException e) {
            }
            return ID;
        }

        static String akademisyenKayit() {
            FileWriter fileWriter = null;

            String ID;
            String Sifre;
            String Ad;
            String Soyad;
            String bosluk = " ";
            Scanner girdi = new Scanner(System.in);

            System.out.printf("\nAkademisyen ID giriniz   :");
            ID = girdi.next();

            System.out.printf("\nSifre giriniz  :");
            Sifre = girdi.next();

            System.out.printf("İsim giriniz  :");
            Ad = girdi.next();

            System.out.printf("\nSoyad giriniz  :");
            Soyad = girdi.next();

            try {
                FileOutputStream f = new FileOutputStream("Akademisyen.txt", true);
                PrintStream yaz = new PrintStream(f);
                String satir;
                satir = ID + " " + Ad + " " + Soyad + " " + Sifre;
                yaz.println(satir);
            } catch (IOException e) {
            }
            return ID;
        }

        static String ogrenciKayit() {
            FileWriter fileWriter = null;

            String ID;
            String Sifre;
            String Ad;
            String Soyad;
            String bosluk = " ";
            Scanner girdi = new Scanner(System.in);

            System.out.printf("\nOgrenci ID giriniz   :");
            ID = girdi.next();

            System.out.printf("\nSifre giriniz  :");
            Sifre = girdi.next();

            System.out.printf("İsim giriniz  :");
            Ad = girdi.next();

            System.out.printf("\nSoyad giriniz  :");
            Soyad = girdi.next();

            try {
                FileOutputStream f = new FileOutputStream("Ogrenci.txt", true);
                PrintStream yaz = new PrintStream(f);
                String satir;
                satir = ID + " " + Ad + " " + Soyad + " " + Sifre;
                yaz.println(satir);

            } catch (IOException e) {
            }
            return ID;
        }

    }

    static class Listele {

        static void liste() {
            try {
                FileInputStream fi = new FileInputStream("Ogrenci.txt");

                BufferedReader buf = new BufferedReader(new InputStreamReader(fi));
                String satir;
                while ((satir = buf.readLine()) != null) {
                    if (!satir.equals("")) {
                        var ayrim = satir.split(" ");
                        System.out.print(ayrim[0]);
                        System.out.print(" ");
                        System.out.print(ayrim[1]);
                        System.out.print(" ");
                        System.out.print(ayrim[2]);
                        System.out.print("\n");
                    }
                }
            } catch (FileNotFoundException f) {
                System.out.println("dosya yok");
            } catch (IOException ioex) {
                System.out.println("başka bir hata oldu");
            }
        }
    }

    static class DersProgramiHazirla {

        static void DersProgrami() {
            System.out.print("Ders ID giriniz ");

            Scanner girdi = new Scanner(System.in);
            String sonuc = girdi.next();
            System.out.print("Ders tarihini giriniz");
            String yeniTarih = girdi.next();
            String[] dizi = new String[100];
            int index = 0;
            try {
                FileInputStream fi = new FileInputStream("Dersler.txt");

                BufferedReader buf = new BufferedReader(new InputStreamReader(fi));
                String satir;
                while ((satir = buf.readLine()) != null) {
                    if (!satir.equals("")) {
                        var ayrim = satir.split(" ");
                        if (ayrim[0].equals(sonuc)) {
                            dizi[index] = ayrim[0] + " " + ayrim[1] + " " + yeniTarih;
                        } else {
                            dizi[index] = satir;
                        }
                        index++;

                    }
                }
            } catch (FileNotFoundException f) {
                System.out.println("dosya yok");
            } catch (IOException ioex) {
                System.out.println("başka bir hata oldu");
            }

            try {
                FileOutputStream f = new FileOutputStream("Dersler.txt");
                PrintStream yaz = new PrintStream(f);
                for (int i = 0; i < 4; i++) {
                    yaz.println(dizi[i]);
                }

            } catch (IOException e) {
            }

        }
    }

    static class Islem {

        static void islemYaz(String ID, String islemAdi) {
            try {
                String satir;
                FileOutputStream f = new FileOutputStream("Islemler.txt", true);
                PrintStream yaz = new PrintStream(f);

                Date now = new Date();
                satir = ID + " ID li " + islemAdi + " " + now.toString();
                yaz.println(satir);
            } catch (IOException e) {
            }
        }
    }

    static class Duyuru {

        static void duyurular() {
            try {
                FileInputStream fi = new FileInputStream("Duyurular.txt");

                BufferedReader buf = new BufferedReader(new InputStreamReader(fi));
                String satir;
                while ((satir = buf.readLine()) != null) {
                    if (!satir.equals("")) {
                        System.out.println(satir);
                    }
                }
            } catch (FileNotFoundException f) {
                System.out.println("dosya yok");
            } catch (IOException ioex) {
                System.out.println("başka bir hata oldu");
            }
        }

        static void duyuruEkle() {
           
            try {
                FileOutputStream f = new FileOutputStream("Duyurular.txt", true);
                PrintStream yaz = new PrintStream(f);
                Scanner girdi = new Scanner(System.in);
                Date simdikiZaman = new Date();
                System.out.print("Duyuru giriniz :");
                String cumle = girdi.nextLine();
                cumle = cumle + simdikiZaman.toString();
                yaz.println(cumle);

            } catch (IOException e) {
            }
        }
    }

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int secim;
        do {
            System.out.printf("Giris Yap (1)\n");
            System.out.printf("Kayıt Ol(2)\n");
            secim = girdi.nextInt();
            int girisSecim;
            if (secim == 1) {
                do {
                    System.out.printf("Memur giris(1)\n");
                    System.out.printf("Akademisyen giris (2)\n");
                    System.out.printf("Ogrenci giris(3)\n");
                    System.out.printf("Ana menu(4)\n");
                    girisSecim = girdi.nextInt();

                    if (girisSecim == 1) {

                        MemurGiris m = new MemurGiris();
                        String ID = MemurGiris.girisKontrol();
                        int memurSecim;
                        if (!ID.equals("")) {
                            Islem.islemYaz(ID, "memur giris yaptı");
                            do {
                                System.out.printf("Islem Seciniz :\n");
                                System.out.printf("Ders programi hazirla(1) :\n");
                                System.out.printf("Ogrenci listele(2) :\n");
                                System.out.printf("Duyurular(4) :\n");
                                System.out.printf("Duyuru ekle(5) :\n");
                                System.out.printf("Cikis yap(3) :");
                                memurSecim = girdi.nextInt();
                                if (memurSecim == 1) {
                                    Islem.islemYaz(ID, "memur ders programı düzenledi");
                                    DersProgramiHazirla.DersProgrami();
                                }

                                if (memurSecim == 2) {
                                    Islem.islemYaz(ID, "memur listeleme yaptı");
                                    Listele.liste();
                                }
                                if (memurSecim == 3) {
                                    Islem.islemYaz(ID, "memur çıkış yaptı");
                                }
                                if (memurSecim == 4) {
                                    Islem.islemYaz(ID, "memur duyurulara baktı");
                                    Duyuru.duyurular();
                                }

                                if (memurSecim == 5) {
                                    Islem.islemYaz(ID, "memur duyuru ekledi");
                                    Duyuru.duyuruEkle();
                                }
                            } while (memurSecim != 3);
                        } else {
                            System.out.print("Giris basarisiz\n");

                        }

                    }

                    if (girisSecim == 2) {
                        AkademisyenGiris a = new AkademisyenGiris();
                        String ID = AkademisyenGiris.girisKontrol();
                        if (!ID.equals("")) {
                            int akademisyenSecim;
                            Islem.islemYaz(ID, "Akademisyen giris yaptı");
                            do {
                                System.out.printf("Islem Seciniz :\n");
                                System.out.printf("Not girisi(1) :\n");
                                System.out.printf("Duyurular(3) :\n");
                                System.out.printf("Cikis yap(2) :");
                                akademisyenSecim = girdi.nextInt();
                                if (akademisyenSecim == 1) {
                                    Islem.islemYaz(ID, "Akademisyen not girişi yaptı");
                                    akademisyenNotGiris aka = new akademisyenNotGiris();
                                    aka.notGir(ID);
                                }
                                if (akademisyenSecim == 2) {
                                    Islem.islemYaz(ID, "akademisyen çıkış yaptı");
                                }

                                if (akademisyenSecim == 3) {
                                    Islem.islemYaz(ID, "akademisyen duyurulara baktı");
                                    Duyuru.duyurular();
                                }
                            } while (akademisyenSecim != 2);
                        } else {
                            System.out.print("Giris basarisiz\n");

                        }
                    }
                    if (girisSecim == 3) {
                        OgrenciGiris a = new OgrenciGiris();
                        String ID = OgrenciGiris.girisKontrol();
                        int ogrenciSecim;
                        if (!ID.equals("")) {
                            Islem.islemYaz(ID, "öğrenci giris yaptı");
                            do {
                                System.out.printf("Islem Seciniz :\n");
                                System.out.printf("Ders Secimi(1) :\n");
                                System.out.printf("Sınav Sonuclari ve Notlar(2) :\n");
                                System.out.printf("Ders programi göster(3) :\n");
                                System.out.printf("Duyurular(5) :\n");
                                System.out.printf("Cikis yap(4) :\n");
                                ogrenciSecim = girdi.nextInt();
                                if (ogrenciSecim == 1) {
                                    Islem.islemYaz(ID, "öğrenci ders alma islemini seçti");
                                    System.out.printf("Ders alma takvimi disindasiniz\n");
                                }
                                if (ogrenciSecim == 2) {
                                    Islem.islemYaz(ID, "öğrenci notlarına baktı");
                                    NotGoster not = new NotGoster(ID);

                                }

                                if (ogrenciSecim == 3) {
                                    Islem.islemYaz(ID, "öğrenci ders programina bakti");
                                    DersProgrami prog = new DersProgrami(ID);

                                }

                                if (ogrenciSecim == 4) {
                                    Islem.islemYaz(ID, "öğrenci çıkış yaptı");
                                }
                                if (ogrenciSecim == 5) {
                                    Islem.islemYaz(ID, "ogrenci duyurulara baktı");
                                    Duyuru.duyurular();
                                }

                            } while (ogrenciSecim != 4);
                        } else {
                            System.out.print("Giris basarisiz\n");

                        }
                    }
                } while (girisSecim != 4);
            } else if (secim == 2) {
                System.out.printf("Memur Kayıt(1)\n");
                System.out.printf("Akademisyen Kayıt (2)\n");
                System.out.printf("Ogrenci Kayıt(3)\n");
                int kayitSecim = girdi.nextInt();

                if (kayitSecim == 1) {
                    String ID = Kayit.memurKayit();
                    Islem.islemYaz(ID, "memur kayıt oldu");
                }
                if (kayitSecim == 2) {
                    String ID = Kayit.akademisyenKayit();
                    Islem.islemYaz(ID, "akademisyen kayıt oldu");
                }
                if (kayitSecim == 3) {

                    String ID = Kayit.ogrenciKayit();
                    Islem.islemYaz(ID, "öğrenci kayıt oldu");

                }

            }
        } while (secim == 1 || secim == 2);
    }
}
