package com.mckesson;

class App {

    public static void main(String[] args) {
        System.out.println("HELLO WORLD");
    }

    public String getLetterGrade(int input) {
        if (input <= 59) {
            return "F";
        } else if (input <= 69) {
            return "D";
        } else if (input <= 79) {
            return "C";
        } else if (input <= 89) {
            return "B";
        } else {
            return "A";
        }
    }

    public String getGreeting(String arg) {
        return "Hello world. " + arg;
    }

    public void printNumbers(int start, int end) {
        int i = start;
        while (i <= end) {
            System.out.println(i++);
        }
    }
}