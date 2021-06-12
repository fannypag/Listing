
	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import com.google.gson.*;


	class Status {
		public int code;
		public String description;
	}
	class ServicePackage {
		public String service;
		public int value;
	}
	class City {
		public String origin;
		public String destination;
	}
	class Product {
		public Status status;
		public ServicePackage servicePackage;
		public City city;
		public int weight;
		public int quantity;
		public int priceItem;
		public String productName;
	}


	public class Collection {
		public static void main(String[] args) {
			//read file from data.json as Object
			BufferedReader bufferedReader;
			try {
				bufferedReader = new BufferedReader(new FileReader("D:\\kuliah\\SEMESTER 2\\Teknik Pemrograman\\Praktek\\Tugas Minggu ke-10\\barang.json"));
			} catch (FileNotFoundException e) {
				// Error
				e.printStackTrace();
				return;
			}
			
			//parse json into Product array class
	        Gson gson = new Gson();
	        Product[] json = gson.fromJson(bufferedReader, Product[].class);
	        
	        System.out.println("productName | quantity | weight | destination | service value | Total");
	        for(Product product : json) {
	        	System.out.println(product.productName + " | " + product.quantity + " | " + 
	        			product.weight + " | " + product.city.destination + " | " + 
	        			product.servicePackage.service + " " + product.servicePackage.value + " | " + 
	        			(product.priceItem*product.quantity + product.servicePackage.value));
	        }
			
			
		}
	}