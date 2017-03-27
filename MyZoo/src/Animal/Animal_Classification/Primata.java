package Animal.Animal_Classification;

/**
 * Created by root on 3/27/17.
 */
public abstract class Primata extends Biped {
  /**@brief Constructor
   * Melakukan inisialisasi kelas Primata
   * @param w untuk weight
   * @param x untuk koordinat x pada map
   * @param y untuk koordinat y pada map
   * @param tame true jika jinak, false jika tidak jinak
   */
  public Primata(float w, int x, int y, boolean tame) {
    super(w, x, y, tame);
    SetDiet("Fruit");
  }
  /**@brief mengembalikan string yang menggambarkan interaksi
   * user dengan hewan
   * @return suara hewan
   */
  public String Interact() {
    return "No Interact";
  }
  /**@brief Menamplkan informasi tentang hewan
   */
  public void GetInfo() {

  }
}