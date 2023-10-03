import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

 class StreamApiEx {

	public static void main(String[] args) {
	List al=new ArrayList();
	al.add("10");
	al.add(100);
	al.add("Rahul");
	al.add(true);
	Stream s1= al.stream();  //for creating java stream object.we use stream()
	s1.forEach((ele)->System.out.println(ele));
    System.out.println(s1);   //we will get reference of the streamObject
	}

}