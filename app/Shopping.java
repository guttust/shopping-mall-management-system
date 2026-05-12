package app;

public class Shopping {
    private String name;
    private Address address;
    private Store[] stores;

    public Shopping(String name, Address address, int maximumStoreCount){
        this.name = name;
        this.address = address;
        this.stores = new Store[maximumStoreCount];
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Address getAddress(){
        return this.address;
    }

    public void setAddress(Address address){
        this.address = address;
    }

    public Store[] getStores(){
        return this.stores;
    }

    public String toString(){
        String result = "Shopping: " + this.name
            + "\nAddress: " + this.address
            + "\nStores:\n";

        for(int i = 0; i < this.stores.length; i++){
            if(this.stores[i] != null){
                result += this.stores[i].getName() + "\n";
            }
        }
        return result;
    }

    public boolean addStore(Store store){
        for(int i = 0; i < this.stores.length; i++){
            if(this.stores[i] == null){
                this.stores[i] = store;
                return true;
            }
        }
        return false;
    }

    public boolean removeStore(String name){
        for(int i = 0; i < this.stores.length; i++){
            if(this.stores[i] != null && this.stores[i].getName().equals(name)){
                this.stores[i] = null;
                return true;
            }
        }
        return false;
    }

    public int countStoresByType(String storeType){
        int count = 0;

        for(int i = 0; i < this.stores.length; i++){
            Store store = this.stores[i];

            if(store != null){
                if(storeType.equalsIgnoreCase("Cosmetic") && store instanceof CosmeticStore){
                    count++;
                }else if(storeType.equalsIgnoreCase("Clothing") && store instanceof ClothingStore){
                    count++;
                }else if(storeType.equalsIgnoreCase("Jewelry") && store instanceof JewelryStore){
                    count++;
                }else if(storeType.equalsIgnoreCase("Food") && store instanceof FoodStore){
                    count++;
                }else if(storeType.equalsIgnoreCase("Electronics") && store instanceof ElectronicsStore){
                    count++;
                }
            }
        }

        if(storeType.equalsIgnoreCase("Cosmetic")
            || storeType.equalsIgnoreCase("Clothing")
            || storeType.equalsIgnoreCase("Jewelry")
            || storeType.equalsIgnoreCase("Food")
            || storeType.equalsIgnoreCase("Electronics")){
            return count;
        }

        return -1;
    }

    public ElectronicsStore store
}
