package org.example.controller;


import java.util.Optional;

import org.example.Processo;
import org.example.repository.ProcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;


@Controller
public class ProcessoController {
	@Autowired
	private ProcessoRepository processoRepository;

    @GetMapping("/processo")
    public String listar(Model model) {
        model.addAttribute("listaProcesso", processoRepository.findAll());
        return "gerenciar_processo";
    }

    @GetMapping("/processo/novo")
    public String novo(Model model) {
        model.addAttribute("processo", new Processo());
        return "editar_pessoa_fisica";
    }

    @GetMapping("/processo/{id}")
    public String editar(@PathVariable("id") long id, Model model) {
        Optional<Processo> processo = processoRepository.findById(id);
        model.addAttribute("pessoaFisica", processo.get());
        return "editar_processo";
    }

    @PostMapping("processos")
    public String salvar(@Valid Processo processo, BindingResult result) {
        if (result.hasErrors()) {
            return "editar_processos";
        }
        processoRepository.save(processo);
        return "redirect:/processo";
    }

    @DeleteMapping("/processos/{id}")
    public String excluir(@PathVariable("id") long id) {
    	processoRepository.deleteById(id);
        return "redirect:/processos";
    }
	

}
