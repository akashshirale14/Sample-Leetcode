import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        TreeBuilder t=new TreeBuilder();
       Node ll=new Node(5000,"H");
        t.insertNode(ll.B_number,"H",ll);
        //System.out.println(" "+k.B_number);
        ll=new Node(1234,"A");
        t.insertNode(ll.B_number,"A",ll);
        //System.out.println(" "+k.B_number);

        ll=new Node(9876,"A");
        t.insertNode(ll.B_number,"A",ll);
        //System.out.println(" "+k.B_number);
        //System.out.println(t.root);
        Node ans=t.search(t.root,5000);
        System.out.println(ans);
         ans=t.search(t.root,1234);
        System.out.println(ans);
        ans=t.search(t.root,1000);

        System.out.println(ans);
        HashMap<String,Integer> hm=new LinkedHashMap<>();
        hm.put("C",1);
        hm.put("B",1);
        String course="B";
        int flag=0;
        for(String i:hm.keySet()){
            if (i==course){
                System.out.println("Match found :"+i);
                flag=1;
            }
        }

        System.out.println("flag :"+flag);

        List<String> h=new ArrayList<>();

                h.add("sss");
        h.add("B");

        course="B";
        for(int i=0;i<h.size();i++){
            if(course==h.get(i)){
                System.out.println("Mxatch found");
            }
        }





    }

}
