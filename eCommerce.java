import java.util.Scanner;

public class eCom{
    static Scanner sc = new Scanner(System.in);
    static int[] cart = new int[20];
    static int i=0;

    public static void main(String args[]){        
        
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("              Welcome to PK Shoping Mall !!! Your Choice our first priority");
        System.out.println("--------------------------------------------------------------------------------------------");

        selectItem();
        
    }

    public static void selectItem(){

        int quantity;
        char ch;
        int choice;

        do
        {
            System.out.println("Following are the list of items that is availiable for you:---\n");
            System.out.println("                             A. Men's faishon\n                                1. Jeans--Rs. 299/-\n                                2. Shirt--Rs. 399/-\n                                3. Sweat Shirt--Rs. 599/-\n                                4. Jacket--Rs. 799/-\n\n                             B. Women's faishon\n                                5. Kurti--Rs. 199/-\n                                6. Lehenga--Rs. 1199/-\n                                7. Saree--Rs. 499\n                                8. Suit--Rs. 399/-");         
            System.out.println("\nEnter your choice for shoping as per the order given");
            choice = sc.nextInt();
            
            switch(choice){
            case 1:
                   System.out.println("-----------------------BEST OFFER---------------------");
                   System.out.println("**Lee Cooper jeans buy exclusivly at Rs. 299/- only**");
                   System.out.println("------------------------------------------------------");
                   System.out.println("\n Enter quantity");
                   quantity = sc.nextInt();
                   addToCart(299,quantity);
                   System.out.println("\n\nItem successfully added to cart\n");
                   break;

            case 2:
                   System.out.println("-----------------------BEST OFFER---------------------");
                   System.out.println("**Linen Shirts buy exclusivly at Rs. 399/- only**");
                   System.out.println("------------------------------------------------------");
                   System.out.print("\n Enter quantity");
                   quantity = sc.nextInt();
                   addToCart(399,quantity);
                   System.out.println("\n\nItem successfully added to cart\n");
                   break;

            case 3:
                   System.out.println("-----------------------BEST OFFER---------------------");
                   System.out.println("**Fashinable Sweat shirts buy exclusivly at Rs. 599/- only**");
                   System.out.println("------------------------------------------------------");
                   System.out.println("\n Enter quantity");
                   quantity = sc.nextInt();
                   addToCart(599,quantity);
                   System.out.println("\n\nItem successfully added to cart\n");
                   break;

            case 4:
                   System.out.println("-----------------------BEST OFFER---------------------");
                   System.out.println("**Warmer Jacket buy exclusivly at Rs. 799/- only**");
                   System.out.println("------------------------------------------------------");
                   System.out.println("\n Enter quantity");
                   quantity = sc.nextInt();
                   addToCart(799,quantity);
                   System.out.println("\n\nItem successfully added to cart\n");
                   break;

            case 5:
                   System.out.println("-----------------------BEST OFFER---------------------");
                   System.out.println("**Ladies Kurti buy exclusivly at Rs. 199/- only**");
                   System.out.println("------------------------------------------------------");
                   System.out.println("\n Enter quantity");
                   quantity = sc.nextInt();
                   addToCart(199,quantity);
                   System.out.println("\n\nItem successfully added to cart\n");
                   break;

            case 6:
                   System.out.println("-----------------------BEST OFFER---------------------");
                   System.out.println("**Wedding Lehenga buy exclusivly at Rs. 1199/- only**");
                   System.out.println("------------------------------------------------------");
                   System.out.println("\n Enter quantity");
                   quantity = sc.nextInt();
                   addToCart(1199,quantity);
                   System.out.println("n\nItem successfully added to cart\n");
                   break;

            case 7:
                   System.out.println("-----------------------BEST OFFER---------------------");
                   System.out.println("**Cotton Saree buy exclusivly at Rs. 499/- only**");
                   System.out.println("------------------------------------------------------");
                   System.out.println("\n Enter quantity");
                   quantity = sc.nextInt();
                   addToCart(499,quantity);
                   System.out.println("\n\nItem successfully added to cart\n");
                   break;

            case 8:
                   System.out.println("-----------------------BEST OFFER---------------------");
                   System.out.println("**Girl's Suit buy exclusivly at Rs. 399/- only**");
                   System.out.println("------------------------------------------------------");
                   System.out.println("\n Enter quantity");
                   quantity = sc.nextInt();
                   addToCart(399,quantity);
                   System.out.println("\n\nItem successfully added to cart\n");
                   break;

            default:
                   System.out.println("You have entered out of stocked item");
        }
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Do you want to have some more in your bag OR ready to fill our bank hahaha...\n Y to CONTINUE shopping\n N to proceed for CHECKOUT");
        System.out.println("-----------------------------------------------------------------------------");
        ch = sc.next().charAt(0);

        }while(ch=='y' || ch=='Y');
        checkOut();
    }

    public static void addToCart(int amount,int quantity){
        int totalPrice;

        cart[i]=amount*quantity;       
        System.out.println("--------------------");
        System.out.println("total price="+cart[i]);
        System.out.println("--------------------");
        i++;
    }
    
    public static void checkOut(){
        int totalPrice=0;

        for(int j=0;j<i;j++){
            totalPrice+=cart[j];
        }
        System.out.println("-------------------------------------");
        System.out.println("total amount to be paid:-"+totalPrice);
        System.out.println("-------------------------------------");
    }
                               
                               
                              
        
    }
