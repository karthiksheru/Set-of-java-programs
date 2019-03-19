package p1;
import java.util.ArrayList;
import java.util.Collections;
public class comparableexamples implements Comparable<comparableexamples> 
{
  String name,email;
  int deptno,exp;
  public comparableexamples(String name, String email, int deptno, int exp) 
  {
	super();
	this.name = name;
	this.email = email;
	this.deptno = deptno;
	this.exp = exp;
  }
 public static void main(String[] args)
 {
	ArrayList<comparableexamples> list=new ArrayList<>();
	//we  are adding objects to the list.
	list.add(new comparableexamples("karthik","karthik@97",10,2));
	list.add(new comparableexamples("singh","karthik@98",11,3));
	list.add(new comparableexamples("ashok","karthik@99",12,1));
	list.add(new comparableexamples("sheru","karthik@100",13,0));
	list.add(new comparableexamples("raju","karthik@101",14,6));
    Collections.sort(list);//this method will be internally calling compareTo() internally and sorts based on given paramter ie deptno
    for(comparableexamples e1:list)
    {
    	System.out.println(e1.name+"  "+e1.deptno+" "+e1.email+" "+e1.exp);
    }    
 }
@Override
public int compareTo(comparableexamples emp) 
{
	//to compare strings we use 
	return name.compareTo(emp.name);
 }
}
