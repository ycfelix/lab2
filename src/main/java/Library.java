import lab2.ex1.Book;
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Library {
	
	public static void main(String arg[]) 
	{
		final String array[]= {"Basic Java","Advance Java","Forget about Java"};
		Book b=new Book(array);
		System.out.println("the title of chapter 1 is "+b.GetChapter(1));
		String anotherArray[]=b.getChapters();
		
		System.out.println("There are "+anotherArray.length+ " chapters.");
		System.out.println(anotherArray);
		System.out.println(java.util.Arrays.toString(anotherArray));
		
	}
    public boolean someLibraryMethod() {
        return true;
    }
}
