public abstract class FrameworkBuilder {
    protected FrameworkProduct fProduct = new FrameworkProduct();

    public abstract void buildFrameworkName();

    public abstract void buildAnoDeLancamento();

    public abstract void buildVersaoAtual();

    public abstract void buildAutorOriginal();

    public abstract void buildLinguagemOficial();

    public FrameworkProduct getFProduct() {
        return fProduct;
    };
}