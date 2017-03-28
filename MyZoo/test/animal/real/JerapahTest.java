package animal.real;

import animal.Animal;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Husnulzaki Wibisono Haryadi (13515005) on 3/28/17.
 */
class JerapahTest {
  @Test
  public void getName() {
    System.out.println("Test Name..");
    Animal b = new Jerapah(1, 2);
    assertTrue(Objects.equals("Jerapah", b.GetName()));
  }

  @Test
  public void getLocX() {
    System.out.println("Test X Position..");
    Animal b = new Jerapah(1, 2);
    assertTrue(1 == b.GetLocX());
  }

  @Test
  public void getLocY() {
    System.out.println("Test Y Position..");
    Animal b = new Jerapah(1, 2);
    assertTrue(2 == b.GetLocY());
  }

  @Test
  public void getFodder() {
    System.out.println("getFodder");
    Animal b = new Jerapah(1, 2);
    assertTrue(0.025 * b.GetWeight() == b.GetFodder());
  }

  @Test
  public void getContent() {
    System.out.println("Test Content..");
    Animal b = new Jerapah(1, 2);
    assertTrue('J' == b.GetContent());
  }

  @Test
  public void getWeight() {
    System.out.println("Test Weight..");
    Animal b = new Jerapah(1, 2);
    assertTrue(500 == b.GetWeight());
  }

  @Test
  public void isTamed() {
    System.out.println("Test Tamed..");
    Animal b = new Jerapah(1, 2);
    assertTrue(b.IsTamed());
  }

  @Test
  public void getLegs() {
    System.out.println("Test Legs..");
    Animal b = new Jerapah(1, 2);
    assertTrue(4 == b.GetLegs());
  }

  @Test
  public void interact() {
    System.out.println("Test Interact..");
    Animal b = new Jerapah(1, 2);
    assertTrue(Objects.equals("Ngoet ngoet", b.Interact()));
  }
}