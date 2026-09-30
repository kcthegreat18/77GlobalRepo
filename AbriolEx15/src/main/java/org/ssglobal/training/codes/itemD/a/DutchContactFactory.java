package org.ssglobal.training.codes.itemD.a;

public class DutchContactFactory implements ContactFactory {

	@Override
	public Address createAddress() {
		
		return new DutchAddress();
	}

	@Override
	public Telephone createTelephoneContact() {
		
		return new DutchTelephone();
	}

}
