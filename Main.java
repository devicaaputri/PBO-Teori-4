public class Main {
    public static void main(String[] args) throws Exception {

        Smartphone Oppo = new Smartphone("Oppo", "Reno 8");
        FeaturePhone Adv = new FeaturePhone("Advan", "Hammer R6");

        Oppo.nyalakan();
        Oppo.aksesInternet();
        Oppo.kirimpesan("devicahadiyanti@gmail.com", "Pengumpulan Nilai", "Hi!");
        Oppo.kirimpesan("085881331326", "Hello");
        Oppo.matikan();
        Adv.nyalakan();
        Adv.mainGameSnake();
        Adv.kirimpesan("082249025358", "085881331326", "Hai");
        Adv.matikan();
    }
}