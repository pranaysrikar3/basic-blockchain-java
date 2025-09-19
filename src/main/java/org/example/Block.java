package org.example;

import java.security.MessageDigest;
import java.time.LocalDateTime;

public class Block {
    private int index;
    private String timestamp;
    private String data;
    private String previousHash;
    private String hash;
    private int nonce;

    public Block(int index, String data, String previousHash) {
        this.index = index;
        this.timestamp = LocalDateTime.now().toString();
        this.data = data;
        this.previousHash = previousHash;
        this.hash = calculateHash();
    }

    // SHA-256 hash function
    public String calculateHash() {
        try {
            String input = index + timestamp + data + previousHash + nonce;
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(input.getBytes("UTF-8"));

            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append("0");
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Proof of Work
    public void mineBlock(int difficulty) {
        String target = new String(new char[difficulty]).replace('\0', '0');
        while (!hash.substring(0, difficulty).equals(target)) {
            nonce++;
            hash = calculateHash();
        }
        System.out.println("Block mined: " + hash);
    }

    public String getHash() {
        return hash;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    @Override
    public String toString() {
        return "Block #" + index + " [hash: " + hash + "]\n" +
                "Data: " + data + "\n" +
                "Previous Hash: " + previousHash + "\n";
    }
}

