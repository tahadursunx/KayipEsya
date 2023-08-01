import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int a=1;

        int b=1;

        int c=1;

        int d=1;

        int e=1;

        int f=1;

        int g=1;

        Scanner klavye=new Scanner(System.in);


        System.out.println("Kayıp eşya bulma programına hoş geldiniz");
        System.out.println("***********");
        System.out.println("bu program size eşyanızı bulmak adına bazı adımlar sönericektir");
        System.out.println("***********");
        System.out.println("eşyanızı sıkça koyduğunuz bir yer varsa kontrol ettiniz mi");
        System.out.println("(lütfen cevabı evet veya hayır olarak girin)");
        for (int i = 0; i <a; i++) {
            String cevap1= klavye.next();
            if (cevap1.equals("evet") || cevap1.equals("Evet") || cevap1.equals("EVET")) {

                System.out.println("*");

            }
            else if (cevap1.equals("hayır") || cevap1.equals("Hayır") || cevap1.equals("Hayır")) {
                System.out.println("kontrol edip bulamazsanız kodu tekrar çalıştırın.");
                System.out.println("umarız bulursunuz");
                System.out.println("program sonlandırılıyor...");
                System.exit(0);
            } else {
                System.out.println("Geçersiz bir cevap yazdınız lütfen tekrar deneyiniz ");
                a++;
            }
    }
        System.out.println("büyük eşyaların altını ve etrafını kontrol ettiniz mi");
        System.out.println("(lütfen cevabı evet veya hayır olarak girin)");
        for (int i = 0; i <b; i++) {
            String cevap2= klavye.next();
            if (cevap2.equals("evet") || cevap2.equals("Evet") || cevap2.equals("EVET")) {

                System.out.println("*");

            }
            else if (cevap2.equals("hayır") || cevap2.equals("Hayır") || cevap2.equals("Hayır")) {
                System.out.println("kontrol edip bulamazsanız kodu tekrar çalıştırın.");
                System.out.println("umarız bulursunuz");
                System.out.println("program sonlandırılıyor...");
                System.exit(0);
            } else {
                System.out.println("Geçersiz bir cevap yazdınız lütfen tekrar deneyiniz ");
                b++;
            }
        }
       /* System.out.println("eşyanızı sıkça koyduğunuz bir yer varsa kontrol ettiniz mi");
        System.out.println("(lütfen cevabı evet veya hayır olarak girin)");
        for (int i = 0; i <c; i++) {
            String cevap3= klavye.next();
            if (cevap3.equals("evet") || cevap3.equals("Evet") || cevap3.equals("EVET")) {

                System.out.println("*");

            }
            else if (cevap3.equals("hayır") || cevap3.equals("Hayır") || cevap3.equals("Hayır")) {
                System.out.println("kontrol edip bulamazsanız kodu tekrar çalıştırın.");
                System.out.println("umarız bulursunuz");
                System.out.println("program sonlandırılıyor...");
                System.exit(0);
            } else {
                System.out.println("Geçersiz bir cevap yazdınız lütfen tekrar deneyiniz ");
                c++;
            }
        }*/
        System.out.println("Eşyayı en son kullandığınız yeri kontrol ettiniz mi");
        System.out.println("(lütfen cevabı evet veya hayır olarak girin)");
        for (int i = 0; i <d; i++) {
            String cevap4= klavye.next();
            if (cevap4.equals("evet") || cevap4.equals("Evet") || cevap4.equals("EVET")) {

                System.out.println("*");

            }
            else if (cevap4.equals("hayır") || cevap4.equals("Hayır") || cevap4.equals("Hayır")) {
                System.out.println("kontrol edip bulamazsanız kodu tekrar çalıştırın.");
                System.out.println("umarız bulursunuz");
                System.out.println("program sonlandırılıyor...");
                System.exit(0);
            } else {
                System.out.println("Geçersiz bir cevap yazdınız lütfen tekrar deneyiniz ");
                d++;
            }
        }
        System.out.println("Gözünün önünde olmadığından emin ol, bazen hemen gözümüzün önünde olabiliyor");
        System.out.println("(lütfen cevabı evet veya hayır olarak girin)");
        for (int i = 0; i <e; i++) {
            String cevap5= klavye.next();
            if (cevap5.equals("evet") || cevap5.equals("Evet") || cevap5.equals("EVET")) {

                System.out.println("*");

            }
            else if (cevap5.equals("hayır") || cevap5.equals("Hayır") || cevap5.equals("Hayır")) {
                System.out.println("kontrol edip bulamazsanız kodu tekrar çalıştırın.");
                System.out.println("umarız bulursunuz");
                System.out.println("program sonlandırılıyor...");
                System.exit(0);
            } else {
                System.out.println("Geçersiz bir cevap yazdınız lütfen tekrar deneyiniz ");
                e++;
            }
        }
        System.out.println("Arkadaşlardan veya üçüncü kişilerden yardım istediniz mi");
        System.out.println("(lütfen cevabı evet veya hayır olarak girin)");
        for (int i = 0; i <f; i++) {
            String cevap6= klavye.next();
            if (cevap6.equals("evet") || cevap6.equals("Evet") || cevap6.equals("EVET")) {

                System.out.println("*");

            }
            else if (cevap6.equals("hayır") || cevap6.equals("Hayır") || cevap6.equals("Hayır")) {
                System.out.println("kontrol edip bulamazsanız kodu tekrar çalıştırın.");
                System.out.println("umarız bulursunuz");
                System.out.println("program sonlandırılıyor...");
                System.exit(0);
            } else {
                System.out.println("Geçersiz bir cevap yazdınız lütfen tekrar deneyiniz ");
                f++;
            }
        }
        System.out.println("Eşya evinin dışında kaybolmuş olabilir gittiğin son mekânları aradınız mı");
        System.out.println("(lütfen cevabı evet veya hayır olarak girin)");
        for (int i = 0; i <a; i++) {
            String cevap7= klavye.next();
            if (cevap7.equals("evet") || cevap7.equals("Evet") || cevap7.equals("EVET")) {

                System.out.println("*");

            }
            else if (cevap7.equals("hayır") || cevap7.equals("Hayır") || cevap7.equals("Hayır")) {
                System.out.println("kontrol edip bulamazsanız kodu tekrar çalıştırın.");
                System.out.println("umarız bulursunuz");
                System.out.println("program sonlandırılıyor...");
                System.exit(0);
            } else {
                System.out.println("Geçersiz bir cevap yazdınız lütfen tekrar deneyiniz ");
                a++;
            }
        }

        System.out.println("görünüşe göre bütün adımları yaptın benim elimden gelen yardım bu kadar :)");


    }
}
