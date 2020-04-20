package br.com.helenharumi.tarefaapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(value = "http://127.0.0.1:5500")
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @RequestMapping(value = "/tarefa", consumes = "application/json", produces = "application/json", method = RequestMethod.POST)
    public Tarefa salvar(@RequestBody Tarefa tarefa) {
        return tarefaService.salvar(tarefa);
    }

    @RequestMapping(value ="/tarefa", produces = "application/json", method = RequestMethod.GET)
    public Iterable<Tarefa> listar() {
        return tarefaService.listar();
    }
}
