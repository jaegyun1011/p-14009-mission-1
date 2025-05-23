package com.back;

import java.util.Scanner;

public class Main {
    public static final int MAX_NUM = 1000;

    public static void main(String[] args) {
        boolean exit = false;
        WiseSaying[] db = new WiseSaying[MAX_NUM+1];
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("== 명언 앱 ==");
        while(!exit) {
            System.out.print("명령) ");
            String input = scanner.nextLine().trim();
            String cmd = input.split("\\?")[0];
            String[] param = cmd.contains("?") ? cmd.split("\\?")[1].split("&") : new String[]{};

            switch(cmd) {
                case "등록" -> {
                    System.out.print("명언 : ");
                    String content = scanner.nextLine().trim();
                    System.out.print("작가 : ");
                    String author = scanner.nextLine().trim();
                    db[++num] = new WiseSaying(num, content, author);
                    System.out.println(num + "번 명언이 등록되었습니다.");
                }
                case "삭제" -> {
                    System.out.print("삭제");
                }
                case "수정" -> {
                    System.out.println("수정");
                }
                case "목록" -> {
                    System.out.println("번호 / 작가 / 명언");
                    System.out.println("----------------------");
                    for(int i=num; i>0; i--)
                        System.out.printf("%d / %s / %s\n", db[i].id, db[i].author, db[i].content);
                }
                case "종료" -> exit = true;
                default -> System.out.println("잘못된 명령어입니다.");
            }
        }

        scanner.close();
    }
}
