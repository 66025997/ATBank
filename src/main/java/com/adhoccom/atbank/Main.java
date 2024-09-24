/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.adhoccom.atbank;

import java.util.Random;
import java.util.ArrayList;
import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author dermh
 */
public class Main {

    public static abstract class Transaction implements Serializable {

        protected double balance;
        protected double deposit;
        protected double withdraw;

        public Transaction(double balance) {
            this.balance = balance;
        }

        abstract public void deposit(double amount);

        abstract public void withdraw(double amount);

        abstract public void transfer(Account toAccount, double amount);
    }

    public static class Account extends Transaction implements Serializable {

        private final String id;
        private String name;
        private String password;

        public Account(String id, String name, String password) {
            super(1000.0);
            this.id = id;
            this.name = name;
            this.password = password;
        }

        public String getID() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPassword() {
            return this.password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public void deposit(double amount) {
            if (amount > 0) {
                deposit += amount;
                this.balance += amount;
            }
        }

        @Override
        public void withdraw(double amount) {
            if (amount > 0 && this.balance >= amount) {
                withdraw -= amount;
                this.balance -= amount;
            }
        }

        @Override
        public void transfer(Account toAccount, double amount) {
            if (amount > 0 && this.balance >= amount) {
                this.balance -= amount;
                toAccount.deposit(amount);
            }
        }
    }

    public static class Auth implements Serializable {

        private ArrayList<Account> accounts = new ArrayList<>();

        public Auth() {
            String filename = "accounts.ser";

            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
                ArrayList<Account> object = (ArrayList<Account>) in.readObject();

                if (object != null) {
                    this.accounts = object;
                }
            } catch (IOException | ClassNotFoundException e) {
                System.err.println(e.getMessage());
            }
        }

        public boolean exists(String text) {
            for (Account account : this.accounts) {
                if (account.getName().equals(text) || account.getID().equals(text)) {
                    return true;
                }
            }
            return false;
        }

        public Account get(String text) {
            for (Account account : this.accounts) {
                if (account.getName().equals(text) || account.getID().equals(text)) {
                    return account;
                }
            }
            return null;
        }
        
        public ArrayList<Account> getAccounts() {
            return this.accounts;
        }

        public Account login(String id, String password) {
            for (Account account : this.accounts) {
                if (account.getID().equals(id) && account.getPassword().equals(password)) {
                    return account;
                }
            }
            return null;
        }

        public Account register(String name, String password) {
            if (!exists(name)) {
                String filename = "accounts.ser";
                Random random = new Random();
                StringBuilder id = new StringBuilder();

                for (int i = 0; i < 12; i++) {
                    id.append(random.nextInt(10));
                }

                Account account = new Account(id.toString(), name, password);

                this.accounts.add(account);

                try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
                    out.writeObject(this.accounts);
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }

                return account;
            }
            return null;
        }
    }
}
