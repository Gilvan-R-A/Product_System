package br.com.springboot.sistema_produtos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.sistema_produtos.models.Produto;
import br.com.springboot.sistema_produtos.repository.ProdutoRepository;


@RestController
public class ProdutosController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@PostMapping(value="salvar")
	@ResponseBody
	public ResponseEntity<Produto> salvar(@RequestBody Produto produto){
		Produto product = produtoRepository.save(produto);
		return new ResponseEntity<Produto>(product, HttpStatus.CREATED);
	}
	
	
	
	
	
	
	
	
   
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String greetingText(@PathVariable String name) {
        return "Hello " + name + "!";
    }
}
