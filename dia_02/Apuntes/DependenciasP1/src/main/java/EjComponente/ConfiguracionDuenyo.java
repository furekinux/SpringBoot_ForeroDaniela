package EjComponente;

import EjBean.Persona;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Gato.class)
public class ConfiguracionDuenyo {
    @Bean
    public EjComponente.Persona getPersona(){
        return new EjComponente.Persona("Chocoblancocrispi");
    }

}
