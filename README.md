# Sanagel Website Testing Project

## Overview
This project focuses on testing the Sanagel website's shopping cart functionality using Java with Serenity, Cucumber, and the Screenplay pattern. The tests ensure that products can be added to the shopping cart with the correct quantities and that the shopping cart reflects these quantities accurately.

## Prerequisites
- Java Development Kit (JDK) 8 or higher
- Gradle (version 7 or higher)

## Setup
1. Clone the repository:
    ```sh
    git clone "https://github.com/YourUsername/Sanagel_Testing_Project.git"
    cd Sanagel_Testing_Project
    ```

2. Install the dependencies:
    ```sh
    gradle build
    ```

## Project Structure
```plaintext
Sanagel_Testing_Project/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── ... (application code)
│   └── test/
│       ├── java/
│       │   ├── steps/
│       │   │   └── ... (step definitions)
│       │   ├── tasks/
│       │   │   └── ... (task implementations)
│       │   ├── features/
│       │   │   └── shopping_cart.feature
│       │   └── runners/
│       │       └── TestRunner.java
│       └── resources/
│           └── serenity.conf
├── build.gradle
├── settings.gradle
└── README.md
```

## Author

Jinson Stevenson Moreno Aguilar - jinson.moreno@gmail.com
