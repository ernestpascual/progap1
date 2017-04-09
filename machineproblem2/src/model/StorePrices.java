package model;

public class StorePrices extends StoreDetails{
	public StorePrices(int order){
		StoreDetails store = new StoreDetails();
		switch (order){
		case 1:
			// 1 pc CJ
			store.setPrice(80);
			break;
		case 2:
			// 2 pc CJ
			store.setPrice(139);
			break;
		case 3:
			// 1pc CJ with Spag
			store.setPrice(105);
			break;
		case 4:
			// 1pc CJ with Palabok
			store.setPrice(130);
			break;
		case 5:
			// Yum
			store.setPrice(69);
			break;
		case 6:
			// Yum with cheese
			store.setPrice(80);
			break;
		case 7:
			// Yum With TLC
			store.setPrice(95);
			break;
		case 8:
			// Aloha
			store.setPrice(179);
			break;
		case 9:
			// Champ
			store.setPrice(155);
			break;
		case 10:
			// BS
			store.setPrice(129);
			break;
		}
	}
		
		
	}

