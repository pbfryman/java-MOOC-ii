
public class Main {

    public static void main(String[] args) {
        // Test your program here
        IOU iou = new IOU();
        iou.setSum("Arthur", 51.5);
        iou.setSum("Michael", 30);
        
        System.out.println(iou.howMuchDoIOweTo("Arthur"));
        System.out.println(iou.howMuchDoIOweTo("Michael"));
    }
}
