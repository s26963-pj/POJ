package functions;

import java.text.DecimalFormat;

public class Functions {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static Player createUser(){
        Player user = new Player(1, 1,1,1,1,1);
        Classes myClass = new Classes(user.getStrength(), user.getDefence(), user.getIntelligence(), user.getDexterity(), user.getAgility(), user.getSpeed(), 1, 0, 0);
        user = myClass;
        return user;
    }
    public static Classes createClass(Player user){
        Classes myClass = new Classes(user.getStrength(), user.getDefence(), user.getIntelligence(), user.getDexterity(), user.getAgility(), user.getSpeed(), 1, 0, 0);
        return myClass;
    }
    public static boolean infoUser(Player user){
        System.out.println("------User Stats------");
        System.out.println("1. Attributes");
        System.out.println("Strength: " + df.format(user.getStrength()));
        System.out.println("Defence: " + df.format(user.getDefence()));
        System.out.println("Intelligence:  " + df.format(user.getIntelligence()));
        System.out.println("Dexterity:  " + df.format(user.getDexterity()));
        System.out.println("Agility:  " + df.format(user.getAgility()));
        System.out.println("Speed:  " + df.format(user.getSpeed()));
        System.out.println();
        System.out.println("2. Multiplicators");
        System.out.println("Strength Multiplication: " + user.getStrengthMul());
        System.out.println("Defence Multiplication: " + user.getDefenceMul());
        System.out.println("Intelligence Multiplication: " + user.getIntelligenceMul());
        System.out.println("Dexterity Multiplication: " + user.getDexterityMul());
        System.out.println("Agility Multiplication: " + user.getAgilityMul());
        System.out.println("Speed Multiplication: " + user.getSpeedMul());
        System.out.println();
        return true;
    }

    public static boolean infoClass(Classes classData){
        System.out.println("------Class Stats------");
        System.out.println("Class: " + classData.getClassData());
        System.out.println("Level: " + classData.getLvl());
        System.out.println("Experience Points: " + classData.getExp());
        System.out.println("Experience Bar: " + classData.getExpBar());
        System.out.println("Experience left to lvl up: " + (classData.getExpBar() - classData.getExp()));
        System.out.println("Points: " + classData.getPoints());
        return true;
    }
}
