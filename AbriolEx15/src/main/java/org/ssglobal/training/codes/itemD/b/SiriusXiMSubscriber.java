package org.ssglobal.training.codes.itemD.b;

public class SiriusXiMSubscriber implements ISubscriber {

	private String content;

	private String name;
	private SiruxXiM station;

	public SiriusXiMSubscriber(String name, SiruxXiM station) {
		this.name = name;
		this.station = station;
	}

	@Override
	public void update(String content) {
		this.content = content;
	}

	@Override
	public void getContent() {

		this.content = station.getContentfromStation();

		System.out.println(name + " pulled content: " + content);

	}

}
