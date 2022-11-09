public class FrameworkDirector {
    protected static FrameworkBuilder framework;
    public static FrameworkDirector singleton = new FrameworkDirector();

    private FrameworkDirector() {
    }

    public static FrameworkDirector getInstance(FrameworkBuilder fBuilder) {
        framework = fBuilder;
        return singleton;
    }

    public void buildFramework() {
        framework.buildFrameworkName();
        framework.buildAutorOriginal();
        framework.buildAnoDeLancamento();
        framework.buildLinguagemOficial();
        framework.buildVersaoAtual();
    }

    public FrameworkProduct getFProduct() {
        return framework.getFProduct();
    };

}