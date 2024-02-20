/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author 91935
 */


public class TestUserProfile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // list of possible genres
        String[] genres = {"Action", "Comedy", "Drama", "Fantasy", "Horror", "Romance", "Thriller"};
        System.out.println("Choose your favourite genre from the list below:");
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        // Guser's choice
        System.out.print("Enter the number to your favourite genre: ");
        int genreChoice = scanner.nextInt();
        String favouriteGenre = genres[genreChoice - 1];

        // Create the user profile
        UserProfile userProfile = new UserProfile(name, favouriteGenre);

        // Display a confirmation message
        System.out.println("Your user profile was created:");
        System.out.println("Name: " + userProfile.getName());
        System.out.println("Favourite Genre: " + userProfile.getFavouriteGenre());

        scanner.close();
    }
}

class UserProfile {
    private String name;
    private String favouriteGenre;

    public UserProfile(String name, String favouriteGenre) {
        this.name = name;
        this.favouriteGenre = favouriteGenre;
    }

    public String getName() {
        return name;
    }

    public String getFavouriteGenre() {
        return favouriteGenre;
    }
}
