package p1;

import java.util.ArrayList;

public class ArrayListExample3
{
	public void showList()
	{
	  ArrayList<Integer> list=new ArrayList<>();
	  list.add(263);
	  list.add(10);
	  list.add(0, 288);
	  list.add(0, 300);
	  System.out.println(list);
	  System.out.println("LIST SIZE is "+list.size());
	  for(Integer a:list) //also we can use Object which is a super class
	  {
		  System.out.print(a+"\t");
	  }
	}
	public static void main(String[] args)
	{
		ArrayListExample3 example=new ArrayListExample3();
		example.showList();
	}

}
