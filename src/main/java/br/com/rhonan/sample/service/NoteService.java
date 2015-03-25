package br.com.rhonan.sample.service;

import java.util.List;

import br.com.rhonan.sample.model.Note;

public interface NoteService {

	void save(Note note);

	List<Note> findAll();

	void delete(long id);

}
