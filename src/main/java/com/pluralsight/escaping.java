package com.pluralsight;

public class escaping {
    public static void mian(String[] args){
        String welcome = "Big tex says \"Howdy\"";
        System.out.println(welcome);

        String message = "This is a message. \nIt goes on and on blah, blah, blah.";
        System.out.println(message);

        String message1 = """
                This is a message.
                It goes on and on blah, blah, blah.
                Another line.
                """;
        System.out.println(message1);
        runComparingStringsExample();

        String fullName = "Dana Wyatt";
        int length = fullName.length();
        System.out.println(length);

        String username = " danaw ";
        username = username.trim();
        System.out.println(username);


        String trackingCode = "USA-12981-Y-22";
        char hasShipped = trackingCode.charAt(10);
        System.out.println(hasShipped);



        int hyphenPosition = trackingCode.indexOf("-");
        System.out.println(hyphenPosition);



    }

    public static void runComparingStringsExample() {
    }


    public static void CompairingStringsExample(){
        String s1 = "ABC";
        String s2 = "abc";

        if (s1.equals(s2)) {
            System.out.println("They are equal");
        }

    }

}
