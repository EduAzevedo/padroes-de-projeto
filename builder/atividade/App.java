public class App {
    public static void main(String[] args) {
        System.out.println("===========================================================");

        FrameworkDirector flutterDirector = FrameworkDirector.getInstance(new FlutterBuilder());
        flutterDirector.buildFramework();
        FrameworkProduct flutter = flutterDirector.getFProduct();
        System.out.println("Framework: " + flutter.frameworkName + ", Ano de lançamento: " + flutter.anoDeLancamento
                + "\nLinguagem oficial: " + flutter.linguagemOficial + " \nVersão atual: " + flutter.versaoAtual
                + "\nAutor: " + flutter.autorOriginal);

        System.out.println("===========================================================");

        FrameworkDirector reactDirector = FrameworkDirector.getInstance(new ReactNativeBuilder());
        reactDirector.buildFramework();
        FrameworkProduct reactNative = reactDirector.getFProduct();
        System.out.println("Framework: " + reactNative.frameworkName + ", Ano de lançamento: "
                + reactNative.anoDeLancamento + "\nLinguagem oficial: " + reactNative.linguagemOficial
                + " \nVersão atual: " + reactNative.versaoAtual + "\nAutor: " + reactNative.autorOriginal);

        System.out.println("===========================================================");

    }
}