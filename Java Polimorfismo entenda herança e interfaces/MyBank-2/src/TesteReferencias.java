public class TesteReferencias {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("Marcos");
        gerente.setSalario(5000);

        EditorDeVideo editorDeVideo = new EditorDeVideo();
        editorDeVideo.setNome("Ricardo");
        editorDeVideo.setSalario(3500);

        Designer designer = new Designer();
        designer.setNome("Mario");
        designer.setSalario(2000);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(gerente);
        controle.registra(editorDeVideo);
        controle.registra(designer);
    }
}
