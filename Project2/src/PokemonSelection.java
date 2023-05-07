import java.util.Scanner;
//The PokemonSelection class selects the values to create
//an instance of a Pokemon for each player using two methods
//createPokemon() and assignPokemon()
public class PokemonSelection {
    private Scanner scanner = new Scanner(System.in);
    public Pokemon createPokemon(){
        System.out.println("Enter the Pokemon name:");
        String name = scanner.nextLine();

        System.out.println("Enter the Pokemon Hit Points:");
        int hitPoints = scanner.nextInt();
        scanner.nextLine();//consume newline character

        System.out.println("Enter the Pokemon move:");
        String move = scanner.nextLine();

        System.out.println("Enter the Pokemon move power:");
        int movePower = scanner.nextInt();
        scanner.nextLine();//consume newline character

        System.out.println("Enter the Pokemon attack speed:");
        int attackSpeed = scanner.nextInt();
        scanner.nextLine();//consume newline character

        Pokemon pokemon = new Pokemon(name, hitPoints, move, movePower, attackSpeed);
        return pokemon;
    }
    public void assignPokemon(){
        Pokemon player1Pokemon = createPokemon();
        System.out.println("Player 1 Pokemon:");
        System.out.println(player1Pokemon.displayPokemonStats());

        Pokemon player2Pokemon = createPokemon();
        System.out.println("Player 2 Pokemon:");
        System.out.println(player2Pokemon.displayPokemonStats());

        scanner.close();
    }

}
