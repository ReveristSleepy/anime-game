import java.util.*;
public class genshinweaponstuff {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String suffer;
        int rarity, currentalevel,alevelgoal,greenl1=0,bluel2=0,bluel3=0,purplel4=0,purplel5=0,goldl6=0;
        int maxascension=0;
        System.out.print("Are you ready to suffer(y/n)?: ");
        suffer = s.nextLine();
        if (suffer.equalsIgnoreCase ("y")) {
            System.out.print("Enter the rarity of your weapon(1-5 stars): ");
            rarity=s.nextInt();
            if (rarity==1) {
                System.out.print("Why the actual fuck are you leveling a 1* weapon?\nWhat the fuck are you, a canon traveler main?\nAnyways\n");
                greenl1=greenl1+1;
                bluel2=bluel2+1;
                bluel3=bluel3+2;
                purplel4=purplel4+1;
                maxascension=maxascension+4;
            }
            if (rarity==2) {
                System.out.print("Genuinely I dont know why you want to do this");
                greenl1=greenl1+1;
                bluel2=bluel2+1;
                bluel3=bluel3+3;
                purplel4=purplel4+1;
                maxascension=maxascension+4;
            }
            if (rarity==3) {
                System.out.print("better be the \"meta\" 3  stars");
                greenl1=greenl1+2;
                bluel2=bluel2+2;
                bluel3=bluel3+4;
                purplel4=purplel4+2;
                purplel5=purplel5+4;
                goldl6=goldl6+3;
                maxascension=maxascension+6;
            }
            if (rarity==4) {
                System.out.print("no comment");
                greenl1=greenl1+3;
                bluel2=bluel2+3;
                bluel3=bluel3+6;
                purplel4=purplel4+3;
                purplel5=purplel5+6;
                goldl6=goldl6+4;
                maxascension=maxascension+6;
            }
            if (rarity==5) {
                System.out.print("How much did you pay for this?\n");
                greenl1=greenl1+5;
                bluel2=bluel2+5;
                bluel3=bluel3+9;
                purplel4=purplel4+5;
                purplel5=purplel5+9;
                goldl6=goldl6+6;
                maxascension=maxascension+6;
            }
            System.out.print("Enter the ascension level you'd like to reach'(1-6): ");
            alevelgoal=s.nextInt();
            if (alevelgoal>maxascension || alevelgoal<=0) {
                System.out.println("The ascension level you are trying to reach is either 0 or invalid.\nProgram stopped.");
                System.exit(0);
            }
            if (alevelgoal<=maxascension) {
                System.out.print("aight bet, now enter the Ascension level you are currently at: ");
                currentalevel=s.nextInt();
                if (currentalevel<=-1 || currentalevel>maxascension) {
                    System.out.println("The ascension level you are trying to reach is invalid.\nProgram stopped.");
                }
                if (currentalevel==0) {
                    
                }
                if (currentalevel==1) {
                    
                }
                if (currentalevel==2) {
                    
                }
                if (currentalevel==3) {
                    
                }
                if (currentalevel==4 && maxascension==4) {
                    System.out.println("You're already at max level");
                }
                if (currentalevel==4 && maxascension ==6) {
                    
                }
                if (currentalevel==5 ) {
                    
                }
                if (currentalevel==6 ) {
                    System.out.println("You're already at max level");
                }
            }
        }
    }
}
