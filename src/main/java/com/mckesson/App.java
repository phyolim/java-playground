package com.mckesson;

class App {

    public static void main(String[] args) {
        System.out.println("HELLO WORLD");
    }

    public String getGreeting(String arg) {
        return "Hello world. " + arg;
    }

    public String getLetterGrade(int score) {
        if (score < 59)
            return "F";
        else if (score >= 60 && score < 69)
            return "D";
        else if (score >= 70 && score < 79)
            return "C";
        else if (score >= 80 && score < 89)
            return "B";
        else
            return "A";
    }
}