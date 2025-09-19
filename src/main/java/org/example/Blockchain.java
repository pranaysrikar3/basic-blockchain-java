package org.example;

import java.util.ArrayList;

public class Blockchain {
    private ArrayList<Block> chain;
    private int difficulty = 3;

    public Blockchain() {
        chain = new ArrayList<>();
        // Genesis block
        chain.add(new Block(0, "Genesis Block", "0"));
    }

    // Add a new block
    public void addBlock(String data) {
        Block previousBlock = chain.get(chain.size() - 1);
        Block newBlock = new Block(chain.size(), data, previousBlock.getHash());
        newBlock.mineBlock(difficulty);
        chain.add(newBlock);
    }

    // Print the blockchain
    public void printBlockchain() {
        for (Block block : chain) {
            System.out.println(block.toString());
            System.out.println("-------------------------------------");
        }
    }
}
