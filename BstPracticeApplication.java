
package bstpracticeapplication;
import java.util.Scanner;
/**
 *
 * @author Trevor
 */
public class BstPracticeApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        BST bst = new BST();
        char c;
        do{
            System.out.println("\nBinary Search Tree Operations\n");
            System.out.println("1. insert ");
            System.out.println("2. delete");
            System.out.println("3. search");
            System.out.println("4. check empty");
            int choice =  scan.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter int to insert");
                    bst.insert( scan.nextInt());
                    break;
                case 2:
                    System.out.println("Enter int to delete");
                    bst.delete(scan.nextInt());
                    break;
                case 3:
                    System.out.println("Enter int to search for");
                    System.out.println("Search Result: " + bst.search(scan.nextInt()));
                    break;
                case 4:
                    System.out.println("Empty status of BST: " + bst.isEmpty());
                default:
                    System.out.println("Invalid entry");
                    break;
            }
            System.out.print("\nPost Order: ");
            bst.postorder();
            System.out.print("\nPre Order");
            bst.preorder();
            System.out.print("\nIn Order");
            bst.inorder();
            
            System.out.println("\nDo you wish to coninue? (y for yes)");
            c = scan.next().charAt(0);
        }while(c == 'y' || c == 'Y');
        
        
        
    }
    
}
