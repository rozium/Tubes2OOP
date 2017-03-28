package animal.real;

import animal.classification.flying.bird.meat.BirdMeat;

/**
 * BurungHantu
 * Hewan yang tidur di siang hari dan berburu di malam hari
 */
public class BurungHantu extends BirdMeat {
  /**
   * Constructor.
   * Melakukan inisialisasi kelas burung hantu dengan parameter absis dan ordinat lokasi
   */
  public BurungHantu(int i, int j) {
    super(2, i, j, true);
    SetName("Burung Hantu");
    SetContent('B');
    consumerate += GetFodder();
  }

  /**
   * Menghasilkan suara hewan yang khas
   *
   * @return string suara hewan.
   */
  public String Interact() {
    return "Kur kur kur";
  }
}