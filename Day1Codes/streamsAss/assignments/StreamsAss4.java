package streams.assignments;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Transaction{
	Trader trader;
	int year;
	int value;
	
	public Transaction(Trader trader, int year, int value) {
		this.trader=trader;
		this.year=year;
		this.value=value;
	}
	
	public Trader getTrader() {
		return trader;
	}
	
	public void setTrader(Trader trader) {
		this.trader=trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value=value;
	}
	
	@Override
	public String toString() {
		return "Transaction{" +
	           "trader=" + trader +
	           ", year=" + year +
	           ", value=" + value +
	           '}';
	}
	
}
public class TransactionMain {

	public static void main(String[] args) {
		List<Transaction> transactions=Arrays.asList(
				new Transaction(new Trader("Naveen","Bangaluru"),2015,2000),
				new Transaction(new Trader("mani","mumbai"),2003,2000),
				new Transaction(new Trader("vinny","Vizag"),2015,2000),
				new Transaction(new Trader("prasad","pune"),2011,2300));
		
		transactions.stream()
		.filter(p -> p.trader.getCity().equalsIgnoreCase("mumbai"))
		.forEach(p -> System.out.println(p.getValue()));
		
		List<Transaction>sortedlist3= transactions.stream()
				.filter(p -> p.getYear()==(2011))
				.sorted(Comparator.comparingInt(Transaction::getValue))
				.collect(Collectors.toList());
		
		sortedlist3.forEach(System.out::println);
		
		Optional<Transaction> sortedlist9=transactions.stream()
				.max(Comparator.comparing(Transaction::getValue));
		
		System.out.println(sortedlist9);
		
		Optional<Transaction>sortedlist10=transactions.stream()
				.min(Comparator.comparingInt(Transaction::getValue));
		
		System.out.println(sortedlist10);
	}
}
