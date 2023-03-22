![GitHub last commit](https://img.shields.io/github/last-commit/Jaykishan97/Binary-Decimal-Converter)

# Number Conversion App
This is a simple Java application that allows you to convert numbers between binary, decimal, octal, and hexadecimal formats.

## Getting Started
### Prerequisites
To run this application, you must have Java Development Kit (JDK) installed on your machine. You can download the latest version of JDK from the official website.

## Running the application
To run the application, follow these steps:

    1. Clone or download the source code from this repository.
    2. Open a terminal or command prompt in the project directory.
    3. Compile the source code by typing the following command: `javac Main.java`.
    4. Run the application by typing the following command: `java Main`. 
    5. The application will start running and you will be prompted to enter a choice from 1 to 6. Follow the instructions on the screen to convert a number from one format to another.
    6. Once you are done, the application will ask you if you want to continue. Enter "y" to convert another number or "n" to exit the application.

## How it works
The application uses six different classes to convert numbers between different formats:

* `BinaryToDecimalConverter:` Converts a binary number to decimal.
* `DecimalToBinaryConverter:` Converts a decimal number to binary.
* `OctalToDecimalConverter:` Converts an octal number to decimal.
* `DecimalToOctalConverter:` Converts a decimal number to octal.
* `HexadecimalToDecimalConverter:` Converts a hexadecimal number to decimal.
* `DecimalToHexadecimalConverter:` Converts a decimal number to hexadecimal.

When the application starts, it displays a menu with six options. The user can enter a choice from 1 to 6 to select a conversion method. The application then creates an instance of the appropriate converter class and calls its convert method, passing the user input as a parameter.

After the conversion is complete, the application asks the user if they want to continue. If the user enters "y", the menu is displayed again. If the user enters "n", the application terminates.

## License
This project is licensed under the MIT License.
