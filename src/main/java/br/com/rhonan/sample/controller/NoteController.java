package br.com.rhonan.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.rhonan.sample.model.Note;
import br.com.rhonan.sample.service.NoteService;

@Controller
public class NoteController {

	@Autowired
	private NoteService noteService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(final ModelMap model) {
		model.addAttribute("list", noteService.findAll());
		return "index";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(final Note note) {
		noteService.save(note);
		return "redirect:/";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable("id") final long id) {
		noteService.delete(id);
		return "redirect:/";
	}

}
