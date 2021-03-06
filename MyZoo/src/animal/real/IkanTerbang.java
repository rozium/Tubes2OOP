package animal.real;

import animal.classification.waterair.finned.insect.FinnedWaInsect;

/**
 * IkanTerbang.
 * Hewan amphibi yang dapat hidup di air dan udara
 */
public class IkanTerbang extends FinnedWaInsect {
  /**
   * Constructor.
   * Melakukan inisialisasi kelas dengan parameter absis dan ordinat lokasi
   */
  public IkanTerbang(int i, int j) {
    super((float) 2, i, j, true);
    setName("Ikan Terbang");
    setContent('I');
    consumerate += getFodder();
  }

  /**
   * Mengembalikan string yang menggambarkan interaksi user dengan hewan.
   *
   * @return String sesuai implementasi pada kelas riil turunan
   */
  public String interact() {
    return "Cepok cepok cepok";
  }
}
