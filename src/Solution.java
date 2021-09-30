public class Solution {
    public static void main(String[] args) {
        Queue testQ=new Queue();
        enQueue(testQ,1);
        enQueue(testQ,3);
        enQueue(testQ,5);
        enQueue(testQ,7);
        displayQueue(testQ);
        deQueue(testQ);
        deQueue(testQ);
        displayQueue(testQ);
    }
    public static void enQueue(Queue e,int valve){
        Node temp= new Node();
        temp.data= valve;
        if(e.front==null){
            e.front=temp;
        }else {
            e.rear.link=temp;
        }
        e.rear=temp;
        e.rear.link=e.front;
    }
    public static void deQueue(Queue e){
        int number;
        if(e.front==null){
            System.out.println("DeQueue is empty");
        }
        if(e.front==e.rear){
            number=e.front.data;
            e.front=null;
            System.out.println("deleted number is:"+number);
        }
        if(e.front!=null&&e.front!=e.rear){
            Node temp= e.front;
            number=temp.data;
            e.front=e.front.link;
            e.rear.link=e.front;
            System.out.println("deleted number is:"+number);
        }
    }
    public static void displayQueue(Queue q) {
        System.out.println("Circular Queue are: ");
        Node temp = q.front;
        while (temp.link != q.front){
            System.out.println(temp.data);
            temp = temp.link;
        }
        System.out.println(temp.data);
    }
}
