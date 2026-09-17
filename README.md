# Personal Finance & Ledger System

## Overview
A lightweight, fully CLI-based Java application designed to help users track their personal finances[cite: 1]. It allows users to securely log income and expenses, persistently save their data locally, and generate quick financial summaries[cite: 1].

## Features
* **Authentication Module:** Secure CLI PIN login system[cite: 1].
* **Ledger Module:** Add and view categorized transactions (Income/Expense)[cite: 1].
* **Reporting Module:** Calculates total balance and summarizes spending[cite: 1].
* **File Persistence:** Automatically saves records to `data.csv` so data is preserved across sessions[cite: 1].

## Technologies & Tools Used
* **Language:** Java (JDK 11 or higher)[cite: 1]
* **Libraries:** Native `java.util` and `java.io` (No external dependencies)[cite: 1]
* **Architecture:** Command Line Interface (CLI)[cite: 1]

## Steps to Install & Run
1. Ensure Java is installed by running `java -version` in your terminal[cite: 1].
2. Clone this repository: `git clone https://github.com/aryan-netizen-sys/java-finance-ledger.git`[cite: 1]
3. Navigate to the project directory: `cd java-finance-ledger`[cite: 1]
4. Compile all Java files: `javac *.java`[cite: 1]
5. Execute the main program: `java ExpenseTrackerApp`[cite: 1]

## Instructions for Testing
1. Run the application using `java ExpenseTrackerApp`[cite: 1].
2. On prompt, enter the default PIN (`1234`) to authenticate[cite: 1].
3. Select option `1` to add an income of 5000 (Category: Salary)[cite: 1].
4. Select option `1` again to add an expense of 200 (Category: Food)[cite: 1].
5. Select option `2` to view all logged transactions[cite: 1].
6. Select option `3` to generate the financial report (Balance should display 4800)[cite: 1].
7. Select option `5` to exit. Re-run the app and log back in to verify data persistence from `data.csv`[cite: 1].
