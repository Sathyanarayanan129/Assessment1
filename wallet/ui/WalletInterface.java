package wallet.ui;

import java.util.*;
import wallet.entity.*;
public class WalletInterface {

	public static void main(String[] args) 
	{
		WalletInterface wi = new WalletInterface();
		wi.execute();
	}
    Map<String,CustomerWallet> store=new HashMap<>();
    public void execute()
    {
    	CustomerWallet c1=new CustomerWallet("9001236834","Vineet",20000);
    	CustomerWallet c2=new CustomerWallet("8790426732","pranav",80000);
    	store.put(c1.getMobile(),c1);
    	store.put(c2.getMobile(),c2);
    	print(store);
    	CustomerWallet cw=getDetails("9001236824");
    	if(cw!=null)
    	System.out.println(cw.toString());
    	else System.out.println("Not in the database");
    	c1.transferMoney(c2,1000);
    	System.out.println("After transfer");
    	print(store);
    }
    public void print(Map<String,CustomerWallet> m)
    {
    	Set<String> key=m.keySet();
    	for(String s:key)
    	{   CustomerWallet c=m.get(s);
    		System.out.println(c.toString());
    	}
    }
    public CustomerWallet getDetails(String number)
    {
    	CustomerWallet ck=new CustomerWallet();
    	if(store.containsKey(number))
    	{
    	ck=store.get(number);
    	return ck;
    	}
    	else return null;
    }
    
}
