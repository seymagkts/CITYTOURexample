import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
public class main {
    public static void bastır(){
        System.out.println("0.İslemleri görüntüle");
        System.out.println("1.Bir sonraki şehre git");
        System.out.println("2.Bir önceki şehre git");
        System.out.println("3.Uygulamadan çık");
    }
    public static void turla(LinkedList<String> sehirler){
        ListIterator<String> iterator= sehirler.listIterator();

        int islem;

        bastır();

        Scanner scanner = new Scanner(System.in);
        if(!iterator.hasNext()){
            System.out.println("Herhangi bir sehir bulunmamaktadır.");
        }
        boolean cikis=false;
        boolean ileri=true;

        while(!cikis){
            System.out.println("Bir islem seciniz: ");
            islem=scanner.nextInt();
            switch (islem){
                case 0:
                    bastır();
                    break;
                case 1:
                    if(!ileri){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                        ileri=true;
                    }

                    if(iterator.hasNext()) {
                        System.out.println("Sehre gidiliyor: " + iterator.next());
                    }
                    else{
                        System.out.println("Gidilecek sehir kalmadı.");
                        ileri=true;
                    }
                    break;
                case 2:
                    if(ileri){
                        if(iterator.hasPrevious()){
                            iterator.previous();
                        }
                        ileri=false;
                    }
                    if(iterator.hasPrevious()){
                        System.out.println("Sehre gidiliyor: "+iterator.previous());
                    }
                    else{
                        System.out.println("Sehir turu basladı.");
                    }
                    break;
                case 3:
                    cikis=true;
                    System.out.println("Uygulamadan cıkılıyor");
                    break;
            }


        }

    }
    public static void main(String[] args) {
        LinkedList<String> sehirler = new LinkedList<String>();
        sehirler.add("Afyon");
        sehirler.add("Eskisehir");
        sehirler.add("Denizli");

        turla(sehirler);
    }
}

