package com.nekisse.view;

import java.util.Scanner;

public class InputView {


    public static int getInputAmount() {
        System.out.println("구입금액을 입력해 주세요.");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
