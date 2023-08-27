
public class Application
{

	public static void main(String[] args) 
	{
	   
		Item<String> firstItem = new Item();
		
		firstItem.setE("Sean");
		
		Item<Integer> secondItem = new Item();
		
		secondItem.setE(1);
		
		SmallBag<Item> myBag = new SmallBag<>();
		
		myBag.setVari(firstItem);
		
		System.out.println(myBag.getVari());
		
		myBag.setVari(secondItem);
		
		System.out.println(myBag.getVari());
		
		

	}

}
