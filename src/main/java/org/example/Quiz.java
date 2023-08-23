package org.example;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

class Quiz {
    Scanner scanner = new Scanner(System.in);
    int correctAnswerCount = 0;
    int wrongAnswerCount = 0;

    public void logic() {
        Questions q1 = new Questions("Which statement is true about Java?",
                "A. Java is a sequence-dependent programming language",
                "B. Java is a code dependent programming language",
                "C. Java is a platform-dependent programming language",
                "D. Java is a platform-independent programming language");
        Questions q2 = new Questions("What is the extension of java code files?",
                "A. .txt",
                "B. .pdf",
                "C. .sql",
                "D. .java");
        Questions q3 = new Questions("Who invented Java Programming?",
                "A. Guido van Rossum",
                "B. James Gosling",
                "C. Dennis Richie",
                "D. Bjarne Stroustrup");
        Questions q4 = new Questions("Which one of the following is not a Java feature?",
                "A. Object-oriented",
                "B. Use of pointers",
                "C. Portable",
                "D. Dynamic and Extensible");
        Questions q5 = new Questions("Which of these cannot be used for a variable name in Java?",
                "A. identifier & keyword",
                "B. identifier",
                "C. Keyword",
                "D. none of the mentioned");

        Map<Questions, Character> hashMap = new HashMap<>();
        hashMap.put(q1, 'D');
        hashMap.put(q2, 'D');
        hashMap.put(q3, 'B');
        hashMap.put(q4, 'B');
        hashMap.put(q5, 'C');

        for (Map.Entry<Questions, Character> map : hashMap.entrySet()) {
            System.out.println(map.getKey().getQuestion());
            System.out.println(map.getKey().getOption1());
            System.out.println(map.getKey().getOption2());
            System.out.println(map.getKey().getOption3());
            System.out.println(map.getKey().getOption4());
            System.out.println("-------------------");

            System.out.println("Enter your answer:");
            char answer = scanner.next().charAt(0);
            System.out.println("-------------------");

            int correctAnswer = Character.compare(answer, map.getValue());
            if (correctAnswer == 0) {
                System.out.println("CORRECT");
                System.out.println();
                correctAnswerCount++;
            } else {
                System.out.println("WRONG");
                System.out.println();
                wrongAnswerCount++;
            }
        }

        System.out.println();
        System.out.println("------- RESULT -------");
        System.out.println("Total Question: " + hashMap.size());
        System.out.println("Correct Answered Questions: " + correctAnswerCount);
        System.out.println("Wrong Answered Questions: " + wrongAnswerCount);

        int percentage = (100 * correctAnswerCount) / hashMap.size();
        System.out.println("Percentage: " + percentage);

        if (percentage > 95) {
            System.out.println("Performance: Very Good");
        } else if (percentage < 35) {
            System.out.println("Performance: Very Low");
        } else {
            System.out.println("Performance: Medium");
        }

    }
}