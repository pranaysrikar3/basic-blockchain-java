package org.example;

public class Main {
    public static void main(String[] args) {
        Blockchain blockchain = new Blockchain();

        blockchain.addBlock("Alice pays Bob 10 coins");
        blockchain.addBlock("Bob pays Charlie 5 coins");
        blockchain.addBlock("Charlie pays Dave 2 coins");

        blockchain.printBlockchain();
    }
}