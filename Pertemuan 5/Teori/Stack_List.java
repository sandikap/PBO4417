import java.util.Stack;

class S1{
    Stack<String> stack = new Stack<String>();
    
    public void TambahStack(String i){
    stack.push(i);
    }
    
    public void HapusStack(){
    System.out.println("Hapus Element: " + stack.pop());
    }   
}

class S2 extends S1{
    
    public void Atas(){
    System.out.println("Elemen Paling Atas: " + stack.peek());
    }
    
    public void Cetak(){
    System.out.println(stack);
    }
}


public class Stack_List{

        public static void main(String[] args) {

        S2 stack1 = new S2();
        System.out.println("----- Isi Stack -----");
        stack1.Cetak();
        System.out.println("----- Menambah Array ----");
        stack1.TambahStack("Soekarno");
        stack1.TambahStack("Supriyadi");
        stack1.TambahStack("Panjaitan");
        stack1.TambahStack("WR Supratman");
        stack1.TambahStack("Adi Sucipto");
        stack1.Cetak();
        System.out.println("---- Menghapus Element Paling Atas ----");
        stack1.HapusStack();
        stack1.HapusStack();
        stack1.Cetak();
        System.out.println("---- Melihat Element Paling Atas ----");
        stack1.Atas();
        stack1.Cetak();
    }
}
