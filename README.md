DOCUMENTATION
# Project - Number Guessing Game
## Project Description
   This project is a simple implementation of the “Guess the Number” game using the Java programming language. The player will be asked to guess a secret number    randomly selected by the program, within the range of 1 to 10. The program will give hints whether the guess is too low, too high, or already correct. The game continues until the player successfully guesses the right number.
## How the Game Works
   1.	The program will randomly select an integer number between 1 and 10 (inclusive). 
   2.	Players will be required to enter their guesses. 
   3.	After each guess, the program will tell whether the player's guess is: 
      - `Too low!` if the guess number is smaller than the secret number. 
      - `Too high! ` if the guessed number is greater than the secret number. 
      - `Congratulations! You guessed the number in X tries!` if the guess is correct. 
   4.	The game will keep repeating until the player successfully guesses the secret number correctly. At the end of the game, the number of tries required will be        displayed.
## Example of Display in Console
Selamat Datang di Permainan Tebak Angka!
Saya telah memilih sebuah angka antara 1 dan 10.
Bisakah kamu menebaknya?
Tebakanmu: 4
Terlalu rendah! Coba lagi.
Tebakanmu: 6
Terlalu rendah! Coba lagi.
Tebakanmu: 8
Terlalu rendah! Coba lagi.
Tebakanmu: 9
Selamat! Kamu berhasil menebak angkanya dalam 4 percobaan!
## Project Structure
The project is very simple and consists of only one Java file:
. 
└── src/ 
    └── GameTebakAngka.java 	
└── README.md
(Notes: It is recommended to put the `GameTebakAngka.java` file inside the `src/` folder.)
## How to Run a Project
To run this game, you need to have the Java Development Kit (JDK) installed on your system.
   1.	Prepare Files
      Make sure the `GameTebakAngka.java` file is inside the `src/` folder inside your project directory.
   2.	Compile Code
      Open your terminal or command prompt, navigate to the project root directory (`your-project-folder-name/`), then compile the Java files:
    	```bash
 	    javac src/GameTebakAngka.java
      ```
   3.	Run the Program
      Once successfully compiled, you can run the game:
   	  ```bash
 	    java -cp src GameTebakAngka
 	    ```
