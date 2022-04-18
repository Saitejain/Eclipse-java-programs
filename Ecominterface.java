package programs;

public class Ecominterface implements Products,Newproducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Products ec = new Ecominterface();
      Newproducts np = new Ecominterface();
      Ecominterface ad = new Ecominterface();
      ec.mobiles();
      ec.machines();
      ec.televisions();
      ad.iphone();
      np.Essentials();
      np.stores();
	}

	@Override
	public void mobiles() {
		// TODO Auto-generated method stub
		System.out.println("Micromax");
	}
	public static void iphone() {
		System.out.println("xr");
	}
	   

	@Override
	public void televisions() {
		// TODO Auto-generated method stub
		System.out.println("mitv");
	}

	@Override
	public void machines() {
		// TODO Auto-generated method stub
		System.out.println("printers");
	}

	@Override
	public void Essentials() {
		// TODO Auto-generated method stub
		System.out.println("medicines");
	}

	@Override
	public void stores() {
		// TODO Auto-generated method stub
		System.out.println("spices");
	}

}
