# Predator-Prey Simulator

This project is a simulation of predator-prey dynamics using Java. The simulation includes features such as animal population over time, graphical statistics, and the effects of weather and disease.

## Project Structure

- `src/main/java/com/yourdomain/predatorprey/` - Contains the main application code.
- `src/main/java/com/yourdomain/predatorprey/controller/` - Contains controller classes managing the simulation logic.
- `src/main/java/com/yourdomain/predatorprey/view/` - Contains classes for the graphical user interface and charts.
- `libs/` - Contains external libraries such as JFreeChart.

## Dependencies

- **JFreeChart**: Version 1.5.3 is used for creating charts. Ensure `jfreechart-1.5.3.jar` is placed in the `libs` directory.

## Current Status

This project currently has compilation errors that need to be resolved. The issues include:

- Missing classes and packages
- Errors related to the JFreeChart library

These issues will be addressed and fixed in a future update.

## Running the Project

To compile and run the project, follow these steps:

1. Compile the Java source files:
   ```sh
   javac -d out -cp "libs/jfreechart-1.5.3.jar" src/main/java/com/yourdomain/predatorprey/*.java src/main/java/com/yourdomain/predatorprey/controller/*.java src/main/java/com/yourdomain/predatorprey/view/*.java
