package br.com.poc.kafka.producer.resource;




import br.com.poc.kafka.producer.service.MensagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mensagem")
public class MensagemResource {
    @Autowired
    MensagemService mensagemService;

    @PostMapping
    public ResponseEntity<String> enviarMensagem(@RequestBody String mensagem) {
        mensagemService.sendMensagem(mensagem);
        return ResponseEntity.ok().body("Mensagem Enviada com Sucesso: " + mensagem);
    }
}
