import java.util.List;

public interface StoreDAO {

	//Basic CRUD operations
	public List<Store> getAllStores();
	public List<Store> getStoreByLocation(String location);

	/*
	All stores will have a unique location
	Ex: 80-01 Beguet St <-- The number in the beginning will
	be the unique identifier
	*/
	public void updateStoreById(String id);
	public void deleteStoreById(String id);
	public void addStoreById(Store s);

	//Specific operations on the store
	public List<Store> getAllStoresByCity(String city);
	public List<Store> getAllStoresByState(String state);
}