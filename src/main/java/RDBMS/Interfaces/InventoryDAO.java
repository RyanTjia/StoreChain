import java.util.List;

public interface InventoryDAO {

	//Basic CRUD operations
	public List<Item> getAllItems();
	public List<Item> getAllItemsById(String location);
	public void updateItemById(String id);
	public void deleteItemById(String id);
	public void addItemById(Item i);

	/*
	Specific operations on the item in relation to the store
	Ex: Store 1 now have 10 PS4 instead of 20 PS4
	*/
	public void getAllItemsInStore(String storeID);
	public void updateItemInStore(String storeID);
	public void removeItemInStore(String storeID);
}