class Animal {
    public String nome;
    public double peso;
    public String raca;

    public void emitirSom() {
        System.out.println("O animal faz um som genérico.");
    }
}

class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro late: Au Au!");
    }
}

class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O gato mia: Miau!");
    }
}

class Camelo extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O camelo grincha: Brããã!");
    }
}

class Cavalo extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O cavalo relincha: Hiin in in!");
    }
}

class Tubarao extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O tubarão: nada!");
    }
}
public class Heranca2 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.emitirSom();

        Cachorro c = new Cachorro();
        c.nome = "Rex";
        c.peso = 20.5;
        c.raca = "Labrador";
        c.emitirSom();
        System.out.println("Nome: " + c.nome + " | Peso: " + c.peso + "kg | Raça: " + c.raca);

        Gato g = new Gato();
        g.nome = "Mimi";
        g.peso = 5.2;
        g.raca = "Siamês";
        g.emitirSom();
        System.out.println("Nome: " + g.nome + " | Peso: " + g.peso + "kg | Raça: " + g.raca);

        Camelo cam = new Camelo();
        cam.nome = "Duna";
        cam.peso = 480.0;
        cam.raca = "Dromedário";
        cam.emitirSom();
        System.out.println("Nome: " + cam.nome + " | Peso: " + cam.peso + "kg | Raça: " + cam.raca);
        
        Cavalo cav = new Cavalo();
        cav.nome = "Trovão";
        cav.peso = 380.0;
        cav.raca = "Mangalarga";
        cav.emitirSom();
        System.out.println("Nome: " + cav.nome + " | Peso: " + cav.peso + "kg | Raça: " + cav.raca);
        
        Tubarao tub = new Tubarao();
        tub.nome = "Tuné";
        tub.peso = 900.0;
        tub.raca = "Tubarão Branco";
        tub.emitirSom();
        System.out.println("Nome: " + tub.nome + " | Peso: " + tub.peso + "kg | Raça: " + tub.raca);
    }
}
