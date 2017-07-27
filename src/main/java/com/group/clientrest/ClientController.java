package com.group.clientrest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author afsilva
 */
@RestController
public class ClientController {

    private final ClientJDBCTemplate cliJDBCTemplate;

    public ClientController(ClientJDBCTemplate cliJDBCTemplate) {
        this.cliJDBCTemplate = cliJDBCTemplate;
    }

    @RequestMapping("/clients")
    public List<Client> getClients(@RequestParam(value="sex") String sex){
        return cliJDBCTemplate.getClients(sex);
    }

}
