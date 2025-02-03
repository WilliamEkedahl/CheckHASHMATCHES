import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program compares hashes, input your hash" + "\n");

        String hash1 = input.nextLine();
        System.out.println("Type the hash to compare with");

        String hash2 = input.nextLine();
        System.out.println("Type the hash to compare with");


        if (hash1.equals(hash2)) {
            System.out.println("The program is safe to download " + subtractHashes(hash1, hash2));
        } else {
            System.out.println("Something is wrong!!!!! " + subtractHashes(hash1, hash2));
        }
    }

    private static boolean subtractHashes(String hash1, String hash2){
        if (hash1.equals(hash2)){
            return true;
        }
        return false;
    }
}