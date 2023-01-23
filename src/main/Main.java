package main;

import core.service.*;

public class Main {

	public static void main(String[] args) {
		Provider prov = new Provider();
		Bank bank = new Bank();
		IClientele store = new Store(prov,bank);
		Client cl = new Client(store);
		
		cl.run();

	}

}
