//vanding machine clas
/*
	player can buy items from machine if there cash is > price
*/
import java.util.*;

public class VendingMachine {
	
	//vending machine variables
	String[] items;
	double[] price;

	//vending machine constructor
	public VendingMachine(String[] items, double[] price) {
		this.items = items;
		this.price = price;
	}

	//buy items
	public void buyItem(VendingMachine machine, String item, Player player){

		//if machine has item && if player has cash
		//buy
		int itemIndex;
		double price;

		//if there the item exist, assign item to variables
		if(machine.findItem(item) > - 1) {

			itemIndex = machine.findItem(item);
			price = machine.price[itemIndex];

			//if player's bag isnt full && player has cash, buy item
			if(player.bagFull() == true) {
				System.out.println("bag is full.");
			}

			if(player.cash < price){
				System.out.println("I need more cash.");
			}

			//buy item
			else{
				player.cash = player.cash - price;
				player.addItem(item);
			}
		}


		//else
		//display message
		else {
			System.out.println("machine doesnt have requested item.");
		}

	}
	

	//see if vending machine has specific item
	public int findItem(String item){

		for(int i = 0; i < this.items.length; i++){

			if(this.items[i].equals(item)){
				return i;
			}
		}

		//returns negative number if machine doesnt have item
		return -1;
	}

	//display vending machine items
	public void printItems(){
		System.out.println(Arrays.toString(this.items));
		System.out.println(Arrays.toString(this.price));
	}

}