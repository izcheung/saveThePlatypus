# Save the Platypus!

![SaveThePlatypusGif](assets/SaveThePlatypus.gif)

## Summary

"Save the Platypus!" is a 2D game built using Java and JavaFX. The objective of this game is to try to make your platypus survive as many cycles of enemy projectile attacks as possible.
Projectiles are shot across the screen both vertically and horizontally at randomly generated x and y-axis values.

To move the platypus, use the arrows keys, UP, DOWN, LEFT, and RIGHT to dodge these attacks. For every 5 cycles
that you
successfully dodge the projectiles, you increase a level and the speed of the enemies increases. If your platypus touches the enemies at any point, it is GAME OVER.

## Motivation

"Save the Platypus!" was developed as a fun way to apply and expand my Java and JavaFX knowledge while diving deeper
into object-oriented programming (OOP).

The game uses a class-based structure, where different game components (like the platypus and projectiles) are
represented as objects with their own properties and behaviors. This approach helped me reinforce my understanding of classes, inheritance, and encapsulation in a practical context. Throughout the development process, I focused on creating modular and reusable code, making the game easy to maintain and extend. Overall, this project not only helped improve my coding and problem-solving abilities but also gave me a chance to apply OOP concepts in a fun and engaging way.

## Requirements

- JDK 21 installed and active
- Maven installed (or use the included Maven Wrapper `./mvnw` if present)
- macOS: ensure Java 21 is selected

## Quick Start

Clone the repository:

```
git clone https://github.com/izcheung/saveThePlatypus.git
cd saveThePlatypus
```

### Run from IDE

You can run from your IDE by right-clicking `Run.java` and clicking "Run Java".

### Run from Terminal

In the project root, run:

```bash
./mvnw clean javafx:run
```

## Controls

- Click "Start Game" to begin
- Arrow Keys: UP / DOWN / LEFT / RIGHT to move

## Run Tests

Run:

```bash
./mvnw test
```

<b> Good luck and have fun! </b>
