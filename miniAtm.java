import java.util.Scanner;

public class miniAtm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int bakiye = 100000;
        int limit = 5000;
        String islemler = "Ana Menu:\n"
                            + "1.Islem: Bakiye Ogrenme\n"   
                            + "2.Islem: Para Cekme\n"
                            + "3.Islem: Para Yatirma\n"
                            + "4. Islem Para Transferi\n"
                            + "Cikis icin \"q\"'a basin";

        while (true){
        System.out.println("Lutfen kullanici adinizi girin:");
        String kullaniciadi = scanner.nextLine();
        System.out.println("Pin kodunuzu girin:");
        String pin = scanner.nextLine();
            if (pin.equals("350302") && kullaniciadi.equals("bugra")){
                System.out.println("\n\n\nGiris islemi basarili...");
                while (true){ //*(Kullanici q'a basana kadar devam etsin)
                    System.out.println("Islemi seciniz:");
                    System.out.println("**************************");
                    System.out.println(islemler);
                    System.out.println("**************************");
                    String islem = scanner.nextLine();
        
                    if (islem.equalsIgnoreCase("q")){ //? Buyugu ve kucugu ayırt etmez
                        System.out.println("Programdan cikiliyor...");
                        break;
                    }
                    else if (islem.equals("1")){ // Enter Enter enter ENTER
                        System.out.println("Bakiyeniz:" + bakiye);
                    }
                    else if (islem.equals("2")){
                        System.out.println("Cekmek istediginiz tutar:");
                        int tutar = scanner.nextInt();
                        scanner.nextLine();
                        if (tutar <= limit){
                            if (bakiye < tutar){
                                System.out.println("Yeterli bakiye yok.  Bakiyeniz:" + bakiye 
                                + "Ana ekrana yonlendiriliyorsunuz...\n\n\n");
                            }
                            else if(tutar > 0){
                                bakiye -= tutar;
                                System.out.println("Yeni bakiyeniz" + bakiye + "\n\n\n");
                            }
                            else {
                                System.out.println("Gecersiz islem...\nAna ekrana yonlendiriliyorsunuz...\n\n\n");
                            }
                        }
                        else 
                            System.out.println("Günlük para çekme limitiz:" 
                                                + limit
                                                + "\n\n\n"
                                                + "Ana ekrana yonlendiriliyorsunuz...");
                    }
                    else if (islem.equals("3")){
                        System.out.println("Yatirmak istediğiniz tutari giriniz:");
                        int yatirim = scanner.nextInt();
                        scanner.nextLine();
                        if(yatirim > 0) {
                            bakiye += yatirim;
                            System.out.println("Yeni bakiyeniz:" + bakiye + "\n\n\n");
                        }
                        else {
                            System.out.println("Gecersiz islem...\nAna ekrana yonlendiriliyorsunuz...\n\n\n");
                        }
                    }
                    else if (islem.equals("4")){
                        System.out.println("Transfer etmek istediginiz tutari giriniz:");
                        int fast = scanner.nextInt();
                        scanner.nextLine();
                        if(fast <= bakiye && fast > 0){
                            bakiye -= fast;
                            System.out.println("Transfer isleminiz basariyla gerceklestirildi...\n\n\n");
                        }
                        else{
                            System.out.println("Gecersiz islem\nAna ekrana yonlendiriliyorsunuz...\n\n\n");
                        }
                    }
                    else {
                        System.out.println("Gecersiz Islem...\nAna ekrana yonlendiriliyorsunuz...\n\n\n");
                    }
                    
                }
                scanner.close();
                
            }
            else{
                System.out.println("Giris islemi basarisiz...\nTekrar deneyin...\n\n\n");
            }

        }
    }
    
}
