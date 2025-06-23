/*
 Comic Book Hero Management System
 ----------------------------------

 This file contains explanations of how each class in the project works.
 It serves as a guide to help understand the structure and functionality of the system.

 ----------------------------------
 1. Affiliation.java
 ----------------------------------
 - This file defines an enum called Affiliation.
 - It includes predefined hero teams:
      AVENGERS, JUSTICE_LEAGUE, X_MEN, FANTASTIC_FOUR
 - Using an enum ensures consistent and valid team names for all heroes.

 ----------------------------------
 2. Hero.java
 ----------------------------------
 - This class represents a single comic book hero.
 - It contains:
     - A String `name` for the hero's name.
     - An int `powerLevel` to represent how powerful the hero is.
     - An `Affiliation` object to represent the hero's team.
 - It includes:
     - A constructor to initialize all fields.
     - Getter methods for each field.
     - A `toString()` method to return a string representation of the hero.

 ----------------------------------
 3. HeroManager.java
 ----------------------------------
 - This class manages a list of Hero objects using an `ArrayList<Hero>`.
 - It includes:
     - `addHero(Hero hero)`: Adds a new hero to the list.
     - `removeHero(String name)`: Removes a hero by matching name (case-insensitive).
     - `bubbleSortByPower()`: Sorts heroes by power level using Bubble Sort.
     - `insertionSortByPower()`: Sorts heroes by power level using Insertion Sort.
     - `displayHeroes()`: Prints each hero's details using their `toString()` method.
     - `displayHeroes2DArray()`: Converts the list into a 2D String array and prints using `Arrays.deepToString()`.

 ----------------------------------
 4. Main.java
 ----------------------------------
 - This is the main application that demonstrates the features of the system.
 - Steps performed:
     1. Instantiates `HeroManager`.
     2. Adds four initial heroes with varying names, power levels, and affiliations.
     3. Displays the original list of heroes.
     4. Applies Bubble Sort and prints the sorted list.
     5. Re-adds the heroes to restore the original order.
     6. Applies Insertion Sort and prints the sorted list.
     7. Removes a hero (e.g., "Batman").
     8. Adds a new hero (e.g., "Invisible Woman").
     9. Displays the updated list.
     10. Displays the hero list in a 2D array format.

 ----------------------------------
 Notes:
 - The sorting is based only on the `powerLevel` field.
 - You can easily extend the system by adding more affiliations or hero attributes.
 - This system is a clean example of how enums, custom classes, ArrayLists, and sorting algorithms work in Java.

 End of README
 */
 
