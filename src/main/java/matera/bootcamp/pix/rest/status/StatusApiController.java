package matera.bootcamp.pix.rest.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import matera.bootcamp.pix.service.ContaCorrenteService;

@RequiredArgsConstructor
@RestController
public class StatusApiController {

    @Autowired
    private ContaCorrenteService contaCorrenteService;

    @GetMapping("/api/v1/status")
    public String statusCheck(){
        return "UP";
    }
}
