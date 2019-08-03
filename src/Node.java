
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Node  {
    public enum Operations{
        INSERT,DELETE
    }

    public int B_number;
    public Map<String,Integer> hm=new HashMap<>();
    public List<Node> listners_list=new ArrayList<>();
    public Node left;
    public Node right;

    /**
     * It calls all references and run the update method of them to
     * update the course by the B-number which is newly added
     * @param
     */
    public Node(int key,String course){
        B_number=key;
        hm.put(course,1);
    }

    public void add(Node n){
        listners_list.add(n);
    }

    /**
     * It calls all references and run the update method of them to
     * update the course by the B-number which is newly added
     * @param listners_list- the list which stores references of backup nodes
     * @param course-Enter the new course added by that respective B-number
     *
     */
    public void notifyAll(List listners_list,String course,Operations myvar){
        Node k;
        for (int i = 0; i < listners_list.size(); i++) {
            //System.out.println("Here notify");
            k = (Node) listners_list.get(i);
            k.update(course, myvar);
        }
    }
    /**
     * This method updates the course in all backup nodes
     *
     * @param course-Enter the new course added by that respective B-number
     *
     */
    public void update(String course,Operations myvar){
        if(myvar==Operations.INSERT) {
            System.out.println(course);
            System.out.println("Course added : "+course);
            hm.put(course, 1);
        }else{
            System.out.println("Course removed : "+course);
            hm.remove(course);
        }
    }

}
