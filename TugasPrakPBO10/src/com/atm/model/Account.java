package com.atm.model;

import java.util.Scanner;

public class Account {
    private String accountNumber;
    private String pin;
    private double balance;

    public static final double MINIMUM_BALANCE = 50000.0;

    public Account(String accountNumber, String pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    // Getter dan Setter
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void credit(double amount) {
        this.balance += amount;
    }

    public void debit(double amount) {
        this.balance -= amount;
    }

    // Tambahkan method ini ke kelas Account
    public void changePin() {
        // Menggunakan try-with-resources untuk menutup Scanner secara otomatis
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan PIN lama: ");
            String oldPin = scanner.nextLine();
    
            // Verifikasi PIN lama
            if (!oldPin.equals(this.pin)) {
                System.out.println("PIN lama tidak cocok.");
                return;
            }
    
            // Minta pengguna memasukkan PIN baru dua kali
            System.out.print("Masukkan PIN baru: ");
            String newPin1 = scanner.nextLine();
            System.out.print("Masukkan PIN baru sekali lagi: ");
            String newPin2 = scanner.nextLine();
    
            // Validasi bahwa kedua input PIN baru cocok
            if (!newPin1.equals(newPin2)) {
                System.out.println("PIN baru tidak cocok.");
                return;
            }
    
            // Perbarui PIN jika validasi berhasil
            this.pin = newPin1;
            System.out.println("PIN berhasil diubah.");
        } // Scanner otomatis ditutup di sini
    }
}
