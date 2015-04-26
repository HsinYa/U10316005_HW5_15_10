import java.util.ArrayList; 

public class MyStack {
	private ArrayList<Object> list = new ArrayList<Object>() ;
	
	//Return true or false
	public boolean isEmpty(){
		return list.isEmpty();
	}
	//Return size
	public int getSize(){
		return list.size();
	}
	//Return the last element of the list
	public Object peek(){
		return list.get(getSize()-1);
	}
	//Return and remove the last value of the list
	public Object pop(){
		Object o = list.get(getSize()-1);
		list.remove(getSize()-1);
		return o ;
	}
	//Add the value to the list
	public void push(Object o){
		list.add(o);
	}
	
	@Override
	//Return toString()
	public String toString(){
		return "stack" + list.toString();
	}
	
}
