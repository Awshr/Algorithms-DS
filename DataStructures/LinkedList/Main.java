package DataStructures.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.append(880);
        ls.append(230948);

        // ls.pop(1);
        
        // ls.pop(0);
        
        ls.append(76);
        ls.append(243);
        ls.append(103);
        ls.append(253);
        ls.pop(ls.getSize()-1);
        ls.pop(ls.getSize()-1);
        ls.pop(ls.getSize()-1);

        ls.append(5);
        ls.pop(0);
        ls.pop(0);
        ls.pop(1);
        System.out.println(ls);
    }  
}
