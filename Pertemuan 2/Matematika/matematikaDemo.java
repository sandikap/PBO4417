public class matematikaDemo {
      public static void main(String[] args){
      matematika mtk = new matematika();
      mtk.tambah(20, 20);
      mtk.kurang(10, 5);
      mtk.kali(10, 20);
      mtk.bagi(20, 2);
      }
}

class matematika{
      int hasil;

      public void tambah(int a, int b){
            hasil = a + b;
            System.out.println("Pertambahan :" + a + "+" + b + "=" + hasil);
      }
      public void kurang(int a, int b){
            hasil = a - b;
            System.out.println("Pengurangan :" + a + "-" + b + "=" + hasil);
      }
      public void kali(int a, int b){
            hasil = a * b;
            System.out.println("Perkalian   :" + a + "x" + b + "=" + hasil);
      }
      public void bagi(int a, int b){
            hasil = a / b;
            System.out.println("Permbagian  :" + a + "/" + b + "=" + hasil);
      }
}
