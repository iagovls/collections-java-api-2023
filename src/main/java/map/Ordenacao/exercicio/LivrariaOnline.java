package main.java.map.Ordenacao.exercicio;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livrariaMap;

    public LivrariaOnline() {
        this.livrariaMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livrariaMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()) {
            if (!livrariaMap.isEmpty()) {
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                    livrariaMap.remove(entry.getKey());
                    break;
                }
            } else {
                System.out.println("Lista vazia.");
            }
        }
    }

    public Map<String, Livro> mostrarLista(){
        return livrariaMap;
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosPreOrdenadosPorPreco = new ArrayList<>(livrariaMap.entrySet());
        Collections.sort(livrosPreOrdenadosPorPreco, (o1, o2) -> o1.getValue().getPreco() > o2.getValue().getPreco() ? 1 : -1);
        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrosPreOrdenadosPorPreco){
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());

        }
        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
        Map<String, Livro> livrosPorAutor = new HashMap<>();
        for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()){
            if (entry.getValue().getAutor().equalsIgnoreCase(autor)){
                livrosPorAutor.put(entry.getKey(), entry.getValue());
            }
        }
        return livrosPorAutor;
    }

    public void obterLivroMaisCaro(){
        Double maiorPreco = Double.MIN_VALUE;
        String livroMaisCaro = null;
        for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()){
            if (entry.getValue().getPreco() > maiorPreco){
                maiorPreco = entry.getValue().getPreco();
                livroMaisCaro = entry.getValue().getTitulo();
            }
        }
        System.out.println("Livro mais caro: " + livroMaisCaro + " Valor: R$ " + maiorPreco);
    }

    public void obterLivroMaisBarato(){
        Double menorPreco = Double.MAX_VALUE;
        String livroMaisBarato = null;
        for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()){
            if (entry.getValue().getPreco() < menorPreco){
                menorPreco = entry.getValue().getPreco();
                livroMaisBarato = entry.getValue().getTitulo();
            }
        }
        System.out.println("Livro mais caro: " + livroMaisBarato + " Valor: R$ " + menorPreco);
    }



    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        livrariaOnline.adicionarLivro(
                "https://www.amazon.com.br/Cristianismo-puro-simples-Gabriele-Greggersen/dp/8578601777/ref=sr_1_1?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=35U18FOQ6O95D&dib=eyJ2IjoiMSJ9.lONEETqbIFVtkkIuAmRn6b8OFBadEW2hcfJtTWxu5qSytBptHrdTN2JA8BT9QRYqS8hi6IyfO3YkH7Wx-x-R9clTjworrnOYipuG-dAhTqvcGlCNLZdgl3txNhO85dEbW_hdRBc7ytH58MaOKgjqGtufKgaA9FlcboHcLupRGhI68c1DAmvh33S00QhpYO2yA9gw-VyG-8fCZ1F4AgvYld6yDUES0w-A0oVEN_1K2hA.8hPBcRP23GmDvUzaHdcWux2DBUx27W98ACIllKZJL00&dib_tag=se&keywords=CS+LEWIS&qid=1745276487&s=books&sprefix=cs+lewi%2Cstripbooks%2C296&sr=1-1",
                "Cristianismo Puro e Simples",
                "C.S. Lewis",
                34.40);
        livrariaOnline.adicionarLivro(
                "https://www.amazon.com.br/Cartas-Um-Diabo-Seu-Aprendiz/dp/857860184X/ref=pd_bxgy_d_sccl_1/132-6157710-8383449?pd_rd_w=suiur&content-id=amzn1.sym.ea5263f5-901f-4a74-9b73-3fc0e530788d&pf_rd_p=ea5263f5-901f-4a74-9b73-3fc0e530788d&pf_rd_r=457WYY7HJB186EV3BPGX&pd_rd_wg=UbMDq&pd_rd_r=3bb8071a-8023-4ca4-b8e8-0249be5f05e3&pd_rd_i=857860184X&psc=1",
                "Cartas de um diabo a seu aprendiz",
                "C.S. Lewis",
                34.75);
        livrariaOnline.adicionarLivro(
                "https://www.amazon.com.br/Deus-que-destr%C3%B3i-sonhos/dp/6556891851/ref=pd_bxgy_thbs_d_sccl_2/132-6157710-8383449?pd_rd_w=6MHXX&content-id=amzn1.sym.ea5263f5-901f-4a74-9b73-3fc0e530788d&pf_rd_p=ea5263f5-901f-4a74-9b73-3fc0e530788d&pf_rd_r=QFP3P4RVFZSSF5Q0EQYR&pd_rd_wg=D4xaF&pd_rd_r=9ce6d009-0f1c-453d-b5c8-1935cbeef0ae&pd_rd_i=6556891851&psc=1",
                "O Deus que destrói sonhos",
                "Rodrigo Bibo",
                26.01);


        System.out.println(livrariaOnline.mostrarLista());
        System.out.println("----------------------------");
        for (Map.Entry<String, Livro> m : livrariaOnline.exibirLivrosOrdenadosPorPreco().entrySet()){
            System.out.println(m.getKey());
            System.out.println(m.getValue());
        }
//        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());
        System.out.println("----------------------------");
        System.out.println(livrariaOnline.pesquisarLivrosPorAutor("Rodrigo Bibo"));
        System.out.println("----------------------------");
        livrariaOnline.obterLivroMaisCaro();
        System.out.println("----------------------------");
        livrariaOnline.obterLivroMaisBarato();
    }



}
