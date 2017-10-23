import java.util.ArrayList;
import java.util.Collections;

public class Shuffler
{
  public static void main(String[] args)
  {
    ArrayList<Integer> list = new ArrayList<Integer>();
    int i = 0;
    while(i < 10)
    {
      list.add(i);
      i++;
    }
    System.out.println(list);
    Collections.shuffle(list);
    System.out.println(list);
  }
}
