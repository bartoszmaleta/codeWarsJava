package javaExe.kyu8;

public class BeConciseITheTernaryOperator {
    public static String describeAge(int age) {
        return age <= 12 ? "You're a(n) kid"
                : age <= 17 ? "You're a(n) teenager"
                : age <= 64 ? "You're a(n) adult"
                : "You're a(n) elderly";
    }
}
