package AimsProject_package;


public class Cart {
		public static final int MAX_NUMBERS_ORDER = 20;		
		private DigitalVideoDisc [] items0rdered  =	new DigitalVideoDisc [MAX_NUMBERS_ORDER];//item 
		private int qtyOrdered;//qty item
//getter & setter		
		public DigitalVideoDisc getItems0rdered(int i) {
			return items0rdered[i];
		}
		public void setItems0rdered(DigitalVideoDisc items0rdered, int i) {
			this.items0rdered[i] = items0rdered;
		}
//add & remove
		public void addDigitalVideoDisc(DigitalVideoDisc discA) {
			if (qtyOrdered == MAX_NUMBERS_ORDER) {
				System.out.println("Items current max. Unable get new order.");
			}else {
				for (int i = 0; i< MAX_NUMBERS_ORDER; i++) {
					if (getItems0rdered(i) == null) {
						setItems0rdered(discA, i);
						qtyOrdered += 1;
						System.out.println("Cart.Add success.");
						break;
					}
				}
			}
		}
		public void removeDigitalVideoDisc(DigitalVideoDisc discB) {
			short count = 0;
			for (int i = 0; i< MAX_NUMBERS_ORDER; i++) {
				if (items0rdered[i] == discB) {
					setItems0rdered(null, i);
					System.out.println("Cart.Remove success.");
					qtyOrdered -= 1;
                    break;
				}else count += 1;
			}
			if (count == MAX_NUMBERS_ORDER) 	System.out.println("remove. Can't find " + discB.getTitle());
		}
//total
		public float totalCost() {
			float total;
			total = 0;
			for (int i = 0; i< qtyOrdered; i++) {
				if (getItems0rdered(i) != null) {
					total += items0rdered[i].getCost();				}
			}
			return total;
		}
		public void print() {
			System.out.println("***********************CART***********************");
			for(int i = 0; i<qtyOrdered; i++) {
				if (getItems0rdered(i) != null) System.out.println(getItems0rdered(i).getId() + ".DVD - ["+getItems0rdered(i).getTitle()+"] - ["+getItems0rdered(i).getCategory()+"] - ["+getItems0rdered(i).getDirector()+"] - ["
						+getItems0rdered(i).getLength()+"]: "+getItems0rdered(i).getCost()+"$");
			}
			System.out.println("Total cost: " + totalCost());
			System.out.println("***************************************************");
		}
		public void searchbyID(int id) {
			short count = 0;
			for (int i = 0; i < qtyOrdered; i++) {
				if (getItems0rdered(i).getId() == id) {
					System.out.println("Id: "+id+ ". DVD -["+getItems0rdered(i).getTitle()+"] - ["+getItems0rdered(i).getCategory()+"] - ["+getItems0rdered(i).getDirector()+"] - ["
							+getItems0rdered(i).getLength()+"]: "+getItems0rdered(i).getCost()+"$");
					return;
				}else count++;
			}
			if (count == qtyOrdered) System.out.println("No match result for id: "+ id);		

		}
		public void searchbyTitle(String title) {
			short count = 0;
			for (int i = 0; i < qtyOrdered; i++) {
				if (getItems0rdered(i).getTitle().toUpperCase().equals(title.toUpperCase())) {
					System.out.println("DVD -["+getItems0rdered(i).getTitle()+"] - ["+getItems0rdered(i).getCategory()+"] - ["+getItems0rdered(i).getDirector()+"] - ["
							+getItems0rdered(i).getLength()+"]: "+getItems0rdered(i).getCost()+"$");
					return;
				}else count++;
			}
			if (count == qtyOrdered) System.out.println("No match result for title: "+ title);		
		}
		
}
