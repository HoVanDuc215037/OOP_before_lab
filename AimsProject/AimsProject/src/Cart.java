package package0;


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
						System.out.println("add.Add success.");
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
					System.out.println("remove.Remove success.");
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
}
