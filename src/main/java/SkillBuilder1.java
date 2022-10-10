import java.util.Scanner;

/**
 * Skill Builder 3
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);
        double wallHeight;
        double wallWidth;
        double wallArea;
        double gallonsPaintNeeded;
        int cansNeeded;

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        wallWidth = input.nextDouble();

        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: "+wallArea+" square feet ");

        gallonsPaintNeeded = Math.round(wallArea/squareFeetPerGallons*100.0)/100.0;
        System.out.println("Paint needed: "+gallonsPaintNeeded+" gallons ");

        cansNeeded = (int)gallonsPaintNeeded;
        if (wallArea%squareFeetPerGallons>0)
        {
           cansNeeded += 1;
        }
        System.out.println("Cans needed: "+cansNeeded+" can(s) ");
    }
}
