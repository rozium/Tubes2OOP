package animal.real;

import animal.Animal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Diki Ardian W (13515092) on 3/28/17.
 */

/**@class KepitingTest
 * @brief Kelas untuk mengetes kelas Kepiting
 */
class KepitingTest {
    @Test
    public void getName() {
        System.out.println("Test Name..");
        Animal H = new Kepiting(5, 4);
        assertTrue(H.GetName().equals("Kepiting"));
    }

    @Test
    void getLocX() {
        System.out.println("Test X Position..");
        Animal H = new Kepiting(5,4);
        assertTrue(H.GetLocX()==5);
    }

    @Test
    void getLocY() {
        System.out.println("Test Y Position..");
        Animal H = new Kepiting(5,4);
        assertTrue(H.GetLocY()==4);
    }

    @Test
    void getFodder() {
        System.out.println("Test Fodder..");
        Animal H = new Kepiting(5,4);
        assertTrue(H.GetFodder()==0.025*H.GetWeight());
    }

    @Test
    void getContent() {
        System.out.println("Test Content..");
        Animal H = new Kepiting(5,4);
        assertTrue(H.GetContent()=='M');
    }

    @Test
    void getWeight() {
        System.out.println("Test Weight..");
        Animal H = new Kepiting(5,4);
        assertTrue(H.GetWeight()==1);
    }

    @Test
    void isTamed() {
        System.out.println("Test Tamed..");
        Animal H = new Kepiting(5,4);
        assertTrue(H.IsTamed());
    }

    @Test
    void getLegs() {
        System.out.println("Test Legs..");
        Animal H = new Kepiting(5,4);
        assertTrue(H.GetLegs()==10);
    }

    @Test
    void interact() {
        System.out.println("Test Interact..");
        Animal H = new Kepiting(5,4);
        assertTrue(H.Interact().equals("Kuikk kuikk"));
    }

}