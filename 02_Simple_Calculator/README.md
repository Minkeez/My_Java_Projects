# Java Console Calculator

### Overview
This is a simple calculator program written in Java. It allows users to input two numbers, select an arithmetic operation (+, -, *, /), and perform the calculation. The program runs in a loop, enabling multiple calculations until the user decides to exit.

---

### Features
- Supports addition (`+`), subtraction (`-`), multiplication (`*`), and division (`/`).
- Handles division by zero gracefully.
- Prevents crashes due to invalid inputs using exception handling.
- Allows the user to perform multiple calculations until they choose to exit.

---

### Prerequisites
Ensure you have **Java Development Kit (JDK)** installed on your system. You can check by running:
```
java -version
```
If Java is not installed, download and install it from [Oracle's official website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

---

### Installation & Running the Program
#### Clone the Repository (Optional)
```
git clone https://github.com/yourusername/java-console-calculator.git
cd java-console-calculator
```

#### Compile and Run the Program
```
javac Main.java
java Main
```

---

### Usage
1. Run the program in a terminal.
2. Enter the first number.
3. Enter the second number.
4. Enter an operation (`+`, `-`, `*`, `/`).
5. View the result.
6. Repeat steps 2-5 for more calculations.
7. Type `exit` instead of a number to quit the program.

### Example Runs
#### **Valid Input**
```
Enter first number (or type 'exit' to quit): 10
Enter second number: 5
Enter an operation (+, -, *, /): *
Result: 50.0
```

#### **Invalid Input (Letters Instead of Numbers)**
```
Enter first number (or type 'exit' to quit): hello
Invalid input! Please enter numeric values.
```

#### **Division by Zero**
```
Enter first number (or type 'exit' to quit): 10
Enter second number: 0
Enter an operation (+, -, *, /): /
Error! Division by zero is not allowed.
```

#### **Exit Program**
```
Enter first number (or type 'exit' to quit): exit
Calculator exited. Thank you for using!
```