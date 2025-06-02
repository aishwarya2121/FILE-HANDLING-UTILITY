# FILE-HANDLING-UTILITY

COMPANY : CODTECH IT SOLUTIONS

NAME :  AISHWARYA PATIL

INTERN ID : CT08DF1561

DOMAIN : JAVA PROGRAMMING

DURATION : 8 WEEKS

MENTOR : NEELA SANTOSH

#TASK DESCRIPTION

Task Title: File Handling Utility
Internship: CODTECH – Java Internship
Language Used: Java
Package: filehandling

1. Objective:
To create a Java program that demonstrates basic file operations including:
using Eclipse IDE

Writing content to a file (overwriting any existing content).

Reading content from a file.

Appending new content to an existing file.

2. Tools and Technologies:
Java I/O classes from java.io package (FileWriter, BufferedReader, FileReader)

Scanner class from java.util for reading user input

Text file used: myfile.txt located inside the src/filehandling/ directory

3.  How It Works:
Upon running the program:

The user is shown a menu with three options:

Write to File

Read from File

Append to File

Based on the user’s input:

If option 1 is selected, the program asks the user for input and writes it to the file (replaces old content).

If option 2 is selected, it reads and displays the content of the file line by line.

If option 3 is selected, it appends new text to the end of the file (without deleting existing content).

Proper exception handling is done using try-catch to handle file-related errors.

4. The program uses a file at this path:
src/filehandling/myfile.txt

This is a relative path pointing to a file inside the project structure, allowing easy reading, writing, and appending.

5. Skills Demonstrated:
File handling using Java

User interaction through console

Use of conditional statements (if-else)

Exception handling (try-catch)

Proper use of Java I/O streams

The program is developed under the package filehandling, and it includes a class named FileUtility. I used Java’s built-in classes from the java.io package such as FileWriter, BufferedReader, and FileReader to carry out file operations. Additionally, the Scanner class from java.util was used to read input from the user via the console.

The text file used for the demonstration is named myfile.txt and is placed inside the src/filehandling/ directory of the project, which follows standard Eclipse project structure. The program starts by displaying a menu with three options:

Write to File – This option allows the user to enter text, which then gets written to the file. If the file already contains data, it is overwritten with the new input.

Read from File – This option opens the file and reads its content line by line using BufferedReader. It prints each line to the console for the user to view the current content of the file.

Append to File – This option asks the user for new input and appends the text to the end of the file without deleting the existing content.

The program takes the user’s choice as input using Scanner, and based on the choice, the corresponding file operation is performed using appropriate Java file handling classes. To ensure robustness, all file operations are enclosed within a try-catch block to handle possible IOException errors. This includes scenarios where the file might not exist or an issue occurs while reading or writing to it.

This task helped me understand the importance of handling files in Java, which is a critical concept for any real-world application that deals with data persistence. It also reinforced my understanding of file streams and how Java handles input/output operations through high-level and low-level I/O classes.

Moreover, this task taught me how to navigate and manage files using Eclipse IDE, such as setting file paths correctly and managing the src directory structure. I also gained experience in exception handling and the use of conditional statements to control the flow of the program based on user input.

In conclusion, the File Handling Utility task gave me practical exposure to Java file operations and how they can be implemented efficiently using simple logic and built-in Java classes. 

OUTPUT 

[myfile.txt](https://github.com/user-attachments/files/20540170/myfile.txt)



