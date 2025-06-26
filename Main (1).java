public class Main {
    public static void main(String[] args) {
        HeroManager manager = new HeroManager();

        // Adding initial heroes
        manager.addHero(new Hero("Spider-Man", 85, Affiliation.AVENGERS));
        manager.addHero(new Hero("Batman", 80, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Wolverine", 90, Affiliation.X_MEN));
        manager.addHero(new Hero("Invisible Woman", 95, Affiliation.FANTASTIC_FOUR));

        // Display original list
        System.out.println("Original List:");
        manager.displayHeroes();

        // Bubble sort
        manager.bubbleSortByPower();
        System.out.println("\nAfter Bubble Sort:");
        manager.displayHeroes();

        // Reset and insertion sort
        manager = new HeroManager();
        manager.addHero(new Hero("Spider-Man", 85, Affiliation.AVENGERS));
        manager.addHero(new Hero("Batman", 80, Affiliation.JUSTICE_LEAGUE));
        manager.addHero(new Hero("Wolverine", 90, Affiliation.X_MEN));
        manager.addHero(new Hero("Wonder Woman", 95, Affiliation.JUSTICE_LEAGUE));

        manager.insertionSortByPower();
        System.out.println("\nAfter Insertion Sort:");
        manager.displayHeroes();

        // Remove a hero
        manager.removeHero("Batman");
        System.out.println("\nAfter Removing Batman:");
        manager.displayHeroes();

        // Add a new hero
        manager.addHero(new Hero("Wonder Woman", 95, Affiliation.JUSTICE_LEAGUE));
        System.out.println("\nAfter Adding Wonder Woman:");
        manager.displayHeroes();

        // Display in 2D array format
        System.out.println("\n2D Array Format:");
        manager.displayHeroes2DArray();
    }
}
 
