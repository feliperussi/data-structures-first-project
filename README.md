## T1_202020
## Grupo 2 (202020)
1. Felipe Arias Russi 201914996
2. Luisa Fernanda Estrada 201631037
3. Mario Alejandro Ruiz 2019206953.

# Movie Ratings Analysis System

## Introduction
This Java project provides a system for analyzing movie ratings. It uses an MVC architecture to manage data, logic, and views, allowing users to interact with and query movie information.

## Setup
1. Clone the repository.
2. Ensure Java (JDK) is installed on your system.
3. Add the `commons-lang3-3.11.jar` and `opencsv-5.2.jar` libraries to your classpath.
4. Compile the Java files in the `src` directory.

## Running the Application
Execute `Main.java` to start the application. Use the command `java main.Main` in the command line, assuming all files have been compiled and the classpath is set.

## Features
- Load and analyze movie data from CSV files.
- Query for good movies by a particular director.
- Utilize dynamic arrays for data management.

## Data
The project operates on two key CSV data files:
- `MoviesCastingRaw-small.csv`: Raw casting details.
- `SmallMoviesDetailsCleaned.csv`: Cleaned movie details.

## Documentation
The `estructura_de_datos.png` image in the `docs` directory visualizes the data structure used within the project.

## Code Structure
- `main/Main.java`: Entry point of the application.
- `controller/Controller.java`: Handles user input and application flow.
- `model/Peliculas.java`: Represents the movie data model.
- `model/data_structures/`: Contains the dynamic array implementation and its interface.
- `view/View.java`: Manages the user interface and display.

## Contributing
Contributions are welcome. Please ensure to maintain the coding standards and provide documentation for your code.
