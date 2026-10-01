public class Main {
    public static void main(String[] args) {
        Members one = new Members("Tony", 800);

        one.showInfo("");

        String result = one.addPoints(300);
        one.showInfo(result);

        String result2 = one.usePoints(500);
        one.showInfo(result2);
    }
}

class Members {
    private String memberName;
    private int memberPoints;

    Members(String memberName, int memberPoints) {
        this.memberName = memberName;
        this.memberPoints = memberPoints;
    }

    String getMembershipStatus() {
        if (memberPoints >= 1000) {
            return "Diamond Member";
        } else if (memberPoints >= 500) {
            return "Gold Member";
        } else if (memberPoints >= 100) {
            return "Silver Member";
        } else {
            return "Normal Member";
        }
    }

    String addPoints(int points) {
        memberPoints += points;
        return "Points added: " + points;
    }

    String usePoints(int points) {
        if (memberPoints >= points) {
            memberPoints -= points;
            return "Redemption successful: " + points;
        } else {
            return "Insufficient points";
        }
    }

    void showInfo(String text) {
        System.out.println("Member: " + memberName);
        System.out.println("Points: " + memberPoints);
        System.out.println("Membership: " + getMembershipStatus());

        if (!text.isEmpty()) {
            System.out.println("Result: " + text);
        }

        System.out.println();
    }
}
