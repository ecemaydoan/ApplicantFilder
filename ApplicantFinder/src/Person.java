
public class Person {

public static String name;
public int averagescore;


 	Person(String name,int averagescore) {

	this.name = name;
	this.averagescore=averagescore;
	
}
 		
 	public static void main(String[] args) {
 		Person p1=new Person("Beg�m Kaya",33);
 		Person p2=new Person("Ecem Aydo�an",66);
 		Person p3=new Person("Alper Kaan Mazino�lu",99);

}

 	static String getName() {
 		return name;
}

 	void setName(String name) {
 		this.name = name;
}

 	int getAveragescore() {
 		return averagescore;
}

 	void setAveragescore(int averagescore) {
 		this.averagescore = averagescore;
}


}
