package br.com.rhonan.sample.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rhonan.sample.model.Note;
import br.com.rhonan.sample.repository.NoteRepository;
import br.com.rhonan.sample.service.NoteService;

@Service
public class NoteServiceImpl implements NoteService {

	@Autowired
	private NoteRepository noteRepository;

	@Override
	public void save(final Note note) {
		noteRepository.save(note);
	}

	@Override
	public List<Note> findAll() {
		return (List<Note>) noteRepository.findAll();
	}

	@Override
	public void delete(final long id) {
		noteRepository.delete(id);
	}
}
