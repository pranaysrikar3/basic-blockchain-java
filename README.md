# Basic Blockchain Project (Java)

This is a simple blockchain prototype built in Java to demonstrate the core concepts behind blockchain technology such as block creation, hashing, immutability, and proof-of-work.

## 🚀 Features
- ✅ Creates blocks linked together with SHA-256 hash
- ✅ Stores transaction-like data inside each block
- ✅ Implements proof-of-work (mining) to ensure block validity
- ✅ Genesis block creation for starting the chain
- ✅ Console output to visualize the blockchain

## 🛠️ Tech Stack
- Java (OOP concepts)
- SHA-256 hashing (MessageDigest)
- Maven (build tool)

## 📂 Project Structure
basic-blockchain-project
└── src
└── main
└── java
└── org.example
├── Block.java
├── Blockchain.java
└── Main.java


## ▶️ How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/basic-blockchain-java.git
   cd basic-blockchain-java
   
2.Compile and run using Maven:   
mvn clean install
mvn exec:java -Dexec.mainClass="org.example.Main"

3.Expected output (example):
Block mined: 00a8b9f6...
Block mined: 009c1d2a...
Block mined: 003f6b7e...

Block #1 [hash: 00a8b9f6...]
Data: Alice pays Bob 10 coins
Previous Hash: 0
-------------------------------------
Block #2 [hash: 009c1d2a...]
Data: Bob pays Charlie 5 coins
Previous Hash: 00a8b9f6...
-------------------------------------
Block #3 [hash: 003f6b7e...]
Data: Charlie pays Dave 2 coins
Previous Hash: 009c1d2a...
-------------------------------------


📖 Explanation

Each block contains:

Index

Timestamp

Transaction data

Previous block hash

Current block hash (generated with SHA-256)

Proof-of-work ensures that each block requires computation (mining) before being added.

Changing any block invalidates the rest of the chain, ensuring immutability.

💡 Future Improvements

Add user input for transactions (via console or REST API).

Implement blockchain validation logic.

Create a simple frontend to visualize the chain.

👨‍💻 Made as a learning project to understand blockchain basics in Java.

---

👉 Replace `<your-username>` in the `git clone` link with your actual GitHub username.  

Do you want me to also add a **console-input feature** (so you can type transactions instead of hardcoding them) and update the README with that? That will impress interviewers even more.
