package Product26;

public class Product {
	private long id;
	private String productName;
	private String supplierName;
	
	public Product(long id, String productName, String supplierName) {
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}

	public Product(long id, String productName) {
		this.id = id;
		this.productName = productName;
		this.supplierName = "Nivas";
	}

	public void display(){
		System.out.println("Product Id is "+id);
		System.out.println("Product Name is "+productName);
		System.out.println("Supplier Name is "+supplierName);
		
	}
	public Product() {
		super();
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
