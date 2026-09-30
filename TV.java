import java.util.Scanner;
public class TV {
    int status=0, volume=0, canal=1;

    void ligar_desligar(){
        if (status == 0){
            status = 1;
        }else{
            status = 0;
        }
    };

    void diminuir_volume(){
        if(status==1){
            if(volume>0){
                volume--;
            }
        }
    }

    void aumentar_volume(){
        if(status==1){
            if(volume<100){
                volume++;
            }
        }
    }

    int trocar_canal(int ncanal){
        if(status==1){
            if(ncanal==1 || ncanal==3 || ncanal==5 || ncanal==7 || ncanal==11){
                canal=ncanal;
                return ncanal;
            }
        }
        return -1;
    }
    void infoTv(){
        System.out.println("canal "+canal);
        System.out.println("volume "+volume);
        System.out.println("status "+status);
    }

     public static void main(String[] args) {
        TV tvSala = new TV();
        TV tvQuarto = new TV();
        TV tvCozinha = new TV();
        TV tvBanheiro = new TV();
        TV tvPiscina = new TV();
        TV tvAtual = tvSala;
        while (true) {
            Scanner scan = new Scanner(System.in);
            tvAtual.infoTv();
            if (tvAtual == tvSala){
                System.out.println("TV da sala");
            } else if (tvAtual == tvPiscina) {
                System.out.println("TV da piscina");
            }
            else if (tvAtual == tvQuarto) {
                System.out.println("TV do quarto");
            }
            else if (tvAtual == tvCozinha) {
                System.out.println("TV da cozinha");
            }
            else{
                System.out.println("TV do banheiro");
            }
            System.out.println("\nMenu da Televisão");
            System.out.println("\n[1] Ligar/desligar");
            System.out.println("[2] diminuir volume em 1");
            System.out.println("[3] aumentar volume em 1");
            System.out.println("[4] trocar de canal");
            System.out.println("[5] trocar de Televisão");
            int opcaoMenu = scan.nextInt();
            switch (opcaoMenu) {
                case (1):
                    tvAtual.ligar_desligar();
                    break;
                case (2):
                    tvAtual.diminuir_volume();
                    break;
                case (3):
                    tvAtual.aumentar_volume();
                    break;
                case (4):
                    System.out.println("Digite um dos canais disponíveis:");
                    System.out.println("[1] Drama");
                    System.out.println("[3] Comédia");
                    System.out.println("[5] Terror");
                    System.out.println("[7] Romance");
                    System.out.println("[11] Anime");
                    int ncanal = scan.nextInt();
                    tvAtual.trocar_canal(ncanal);
                    break;
                case (5):
                    System.out.println("Escolha entre:");
                    System.out.println("\n[1] Tv da sala");
                    System.out.println("[2] Tv do quarto");
                    System.out.println("[3] Tv do cozinha");
                    System.out.println("[4] Tv do banheiro");
                    System.out.println("[5] Tv do piscina");
                    int opTv = scan.nextInt();

                    switch(opTv) {
                        case (1):
                            tvAtual = tvSala;
                            break;
                        case (2):
                            tvAtual = tvQuarto;
                            break;
                        case (3):
                            tvAtual = tvCozinha;
                            break;
                        case (4):
                            tvAtual = tvBanheiro;
                            break;
                        case (5):
                            tvAtual = tvPiscina;
                            break;
                        default:
                            while(opTv != 1 && opTv != 2 && opTv != 3 && opTv != 4 && opTv != 5){
                            System.out.println("Digite uma opcao válida");
                            opTv = scan.nextInt();

                        }
                    }
                    break;
            }
        }
    }
}
