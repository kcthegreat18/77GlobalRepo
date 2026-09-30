package org.ssglobal.training.codes.itemD.a;

public class NorthAmericaContactFactory implements ContactFactory {

	@Override
	public Address createAddress() {
		
		return new NorthAmericaAddress();
	}

	@Override
	public Telephone createTelephoneContact() {
		
		return new DutchTelephone();
	}

}
