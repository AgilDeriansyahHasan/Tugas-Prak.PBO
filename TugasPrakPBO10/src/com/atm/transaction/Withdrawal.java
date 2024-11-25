package com.atm.transaction;

import com.atm.model.Account;
import java.util.Scanner;

public class Withdrawal extends Transaction {

    public Withdrawal(Account account) {
        super(account);
    }

    @Override
    public void execute() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah penarikan: ");
            double amount = scanner.nextDouble();

            // Validasi saldo minimal
            if (getAccount().getBalance() - amount < Account.MINIMUM_BALANCE) {
                System.out.println("Penarikan gagal. Saldo harus tetap minimal Rp50.000 setelah penarikan.");
            } else {
                // Lakukan penarikan jika saldo mencukupi
                getAccount().debit(amount);
                System.out.println("Penarikan berhasil. Saldo saat ini: Rp" + getAccount().getBalance());
            }
        }
    }
}
