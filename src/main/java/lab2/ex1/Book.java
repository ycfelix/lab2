package lab2.ex1;

public class Book 
{
	private String[] Chapters;
	public static final int DEFAULT_CHAPTER=10;
	public Book() 
	{
		Chapters=new String[DEFAULT_CHAPTER];
		for(int i=0;i<Chapters.length;i++) 
		{
			this.Chapters[i]="Chapter "+i;
		}
	}
	public Book(String[] argument) 
	{
		Chapters=new String[argument.length];
		for(int i=0;i<argument.length;i++) 
		{
			this.Chapters[i]= new String(argument[i]);
		}
	}
	
	public String GetChapter(int i) 
	{
		if(i>=this.Chapters.length||i<0) 
		{
			return null;
		}
		return this.Chapters[i];
	}
	
	public String[] getChapters() 
	{
		return this.Chapters;
	}
	
}
