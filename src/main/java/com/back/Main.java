package com.back;

import java.util.Scanner;

public class Main {
    public static final int MAX_NUM = 1000;

    public static void main(String[] args) {
        boolean exit = false;
        WiseSaying[] db = new WiseSaying[MAX_NUM];
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("== 명언 앱 ==");
        while(!exit) {
            System.out.print("명령) ");
            String cmd = scanner.nextLine().trim();

            switch(cmd.substring(0, 2)) {
                case "등록" -> {
                    System.out.print("명언 : ");
                    String content = scanner.nextLine().trim();
                    System.out.print("작가 : ");
                    String author = scanner.nextLine().trim();
                    db[++num] = new WiseSaying(num, content, author);
                    System.out.println(num + "번 명언이 등록되었습니다.");
                }
                case "삭제" -> {
                    System.out.println("삭제");
                }
                case "수정" -> {
                    System.out.println("수정");
                }
                case "목록" -> {
                    System.out.println("목록");
                }
                case "종료" -> exit = true;
                default -> System.out.println("잘못된 명령어입니다.");
            }
        }

        scanner.close();
    }

    public static class WiseSaying {
        public int id;
        public String content;
        public String author;

        WiseSaying(int id, String content, String author) {
            this.id = id;
            this.content = content;
            this.author = author;
        }
    }
}
