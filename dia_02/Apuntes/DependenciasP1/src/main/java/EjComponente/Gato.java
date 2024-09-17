package EjComponente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Gato implements SerVivo{
    @Autowired
    private Persona duenyo;

    public Gato(Persona duenyo) {
        this.duenyo = duenyo;
    }

    public Persona getDuenyo(){
        return duenyo;
    }
    @Override
    public String caminar() {
        return "Gato camina en 4 patas :cat:";
    }
}
