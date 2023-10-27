package Handelsakademin.citybuilder;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("                                  ,'\\");
        System.out.println("    _.----.        ____         ,'  _\\   ___    ___     ____");
        System.out.println("_,-'       `.     |    |  /`.   \\,-'    |   \\  /   |   |    \\  |`.");
        System.out.println("\\      __    \\    '-.  | /   `.  ___    |    \\/    |   '-.   \\ |  |");
        System.out.println(" \\    \\ \\   |  __  |  |/    ,','_  `.  |          | __  |    \\|  |");
        System.out.println("   \\    \\/   /,' _`.|      ,' / / / /   |          ,' _`.|     |  |");
        System.out.println("    \\     ,-'/  /   \\    ,'   | \\/ / ,`.|         /  /   \\  |     |");
        System.out.println("     \\    \\ |   \\_/  |   `-.  \\    `'  /|  |    ||   \\_/  | |\\    |");
        System.out.println("      \\    \\ \\      /       `-.`.___,-' |  |\\  /| \\      /  | |   |");
        System.out.println("       \\    \\ `.__,'|  |`-._    `|      |__| \\/ |  `.__,'|  | |   |");
        System.out.println("        \\_.-'       |__|    `-._ |              '-.|     '-.| |   |");
        System.out.println("                                `'                            '-._|");

            Scanner scanner = new Scanner(System.in);
            String tränarNamn;
            int pokeballs = 0;
            int money = 100;

            // Här börjar spelet.
            while (true) {
                tränarNamn = "";

                System.out.println(" ---|| Välkommen till världen av Pokémon, äventyrare!||---\n");
                System.out.println("Mitt namn är Professor Eken, och jag är byns ledande Pokémon-expert.\n" +
                        "Det är fantastiskt att äntligen få träffa dig. Vad sa du att ditt tränarnamn var igen?");

                System.out.println(" - Skriv ditt tränarnamn: - ");
                tränarNamn = scanner.nextLine();

                System.out.println("\nAh, just det " + tränarNamn + ", Ett Enastående namn! \n" +
                        //"  \n" +
                        "Jag kallade på dig idag eftersom vi har ett lite... kinkigt problem här i byn.\n" +
                        "Du ser, en särskild vild Pokémon har börjat ställa till med trubbel. \n" +
                        "En Rattata med en aptit för kaos har bestämt sig för att vår by är den perfekta platsen för sina rackartyg. \n" +
                        "Den har stulit bär, skrämt bort andra Pokémon och fått byborna att gå på tå.\n" +
                        "Vi behöver en modig tränare som kan hjälpa oss att hantera denna lilla bandit.\n" +
                        "\n" +
                        "Det har pratats om din kommande ankomst, och folk har stora förhoppningar om dig.\n" +
                        "Tror du att du kan hjälpa oss att lösa detta problem ? ");

                String platsInput = "";
                boolean körLoopen = true;
                while (!platsInput.toLowerCase().equals("ja"))
                {
                    System.out.println("Vill du hjälpa? Skriv: Ja / nej");
                    platsInput = scanner.nextLine();

                    if (platsInput.toLowerCase().equals("nej"))
                    {
                        körLoopen = false;
                        break;
                    }

                    körLoopen = true;
                }

                //System.out.println("Hurra! Tack, " + tränarNamn + "! Nu måste du besöka olika platser i byn för att klara ditt uppdrag!");

                while (körLoopen) {
                    if (platsInput.toLowerCase().equals("ja")) {

                        System.out.println("\n -- Platser att besöka i byn -- ");

                        System.out.println("Platser att besöka: (1)Skogen, (2)Affären, (3)Avsluta");
                        String valAvPlatser = scanner.nextLine();

                        switch (valAvPlatser) {
                            case "1":
                                if (pokeballs > 0) {
                                    System.out.println(" \n -Skogen- \n ");
                                    System.out.println(" (1). Du står i en skog och hör ett mystiskt ljud komma från buskarna.  \n" +
                                            " (2). Samtidigt ser du något röra sig i gräset i motsatt riktning ifrån ljudet \n" +
                                            " Vilken riktning väljer du att utforska? 1 / 2 ?");

                                    String inputVäg = scanner.nextLine();
                                    if (inputVäg.equals("1")) {
                                        System.out.println("Åh det är en Pidgey i buskarna!..");
                                        System.out.println("Vill du förska fånga Pidgey och som belöning om du lyckas få en 40 pengar som ökar dina chanser att klara din uppgift");
                                        System.out.println("Skriv 'ja' för att försöka fånga eller 'nej' för att fortsätta.");
                                        String fångaPidgey = scanner.nextLine();

                                        if (fångaPidgey.toLowerCase().equals("ja")) {
                                            if (pokeballs > 0) {
                                                Random rnd = new Random();
                                                int slump = rnd.nextInt(2); // Generera slumpmässigt 0 eller 1

                                                if (slump == 0) {
                                                    System.out.println("Du lyckades fånga Pidgey! Du har nu fått 40 pengar!");
                                                    pokeballs--;
                                                    money += 40;
                                                    System.out.println("Du har nu " + money + " pengar.");
                                                } else {
                                                    System.out.println("Du misslyckades med att fånga Pidgey.");
                                                    pokeballs--;
                                                }
                                            } else {
                                                System.out.println("Du har inga Pokébollar kvar, så du kan inte försöka fånga Pidgey.");
                                            }
                                        } else if (fångaPidgey.toLowerCase().equals("nej")) {
                                            System.out.println("Du valde att inte försöka fånga Pidgey. Du fortsätter din resa.");
                                        }
                                    } else if (inputVäg.equals("2")) {
                                        System.out.println("OH! Rattata! Skriv 'ja' för att försöka fånga Rattata eller 'nej' för att fortsätta utan att försöka fånga Rattata.");
                                        String kassta = scanner.nextLine();
                                        if (kassta.toLowerCase().equals("ja")) {

                                            Random rnd = new Random();
                                            int slump = rnd.nextInt(2);
                                            if (slump == 0) {
                                                System.out.println("Du lyckades fånga den! GRATTIS! DU KLARADE DET!");
                                                pokeballs--;
                                                break;
                                            } else {
                                                System.out.println("Du misslyckades.");
                                                pokeballs--;
                                            }
                                        } else {
                                            System.out.println("Du skrev inte 'ja', så du förlorade chansen att fånga den.");
                                        }
                                    }
                                } else if (pokeballs <= 0) {
                                    System.out.println("\nDu har inga Pokebollar, gå till affären för att köpa.");
                                } else {
                                    System.out.println("Välj väg 1 eller 2");
                                }
                                break;
                            case "2":
                                if (money > 0) {
                                    money -= 20;
                                    pokeballs++;
                                    System.out.println(" \n -Affären- \n ");
                                    System.out.println("Du är i affären och köpte en pokeball för 20 pengar du har nu kvar " + money + " pengar");
                                    System.out.println("Du har " + pokeballs + " bollar");
                                } else if (money >= 0 && pokeballs <= 0) {
                                    System.out.println("Du har inga pengar, GAME OVER");
                                    körLoopen = false;
                                    break;
                                } else {
                                    System.out.println("Du har inga pengar kvar. Men du har " + pokeballs + "pokebollar kvar. Använd dem väl.");
                                }
                                break;
                            case "3":
                                körLoopen = false;
                                break;
                            default:
                                break;
                        }
                    } else if (platsInput.toLowerCase().equals("nej")) {
                        // Avsluta om användaren säger 'nej'
                        break;
                    }
                }

                System.out.println("Skriv valfri sak för att starta om, eller q för att avsluta");
                String input = scanner.nextLine();

                if (input.equals("q")) {
                    break;
                }
            }

        }

}