import java.util.Queue;
import java.util.*;

class Q1{
    Queue<String> queue = new LinkedList<>();
    
    public void TambahQueue(String i){
    queue.add(i);
    }
    
    public void HapusQueue(String i){
    queue.remove(i);
    }
}

class Q2 extends Q1{
    
    public void iterasi(){
    Iterator iterator = queue.iterator();
  
    while (iterator.hasNext()) {
        System.out.print(iterator.next() + " ");
    }
    }
    
    public void Melihat(){
    System.out.println("Element Paling Atas: " + queue.peek());
    }
    
    public void Cetak(){
    System.out.println(queue);
    }

}

public class Queue_List{
    public static void main(String[] args) {

        Q2 queue1 = new Q2();
        System.out.println("---- Isi Stack ----");
        queue1.Cetak();
        System.out.println("---- Menambah Array ----");
        queue1.TambahQueue("Soekarno");
        queue1.TambahQueue("Supriyadi");
        queue1.TambahQueue("Panjaitan");
        queue1.TambahQueue("WR Supratman");
        queue1.TambahQueue("Adi Sucipto");
        queue1.Cetak();
        System.out.println("---- Menghapus Element -----");
        queue1.HapusQueue("Panjaitan");
        queue1.HapusQueue("Adi Sucipto");
        queue1.Cetak();
        System.out.println("---- Iterasi Antrian ----");
        queue1.iterasi();
        System.out.println("");
        queue1.Melihat();
        
    }
    
}