package br.com.rhonan.sample.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.rhonan.sample.model.Note;

public interface NoteRepository extends CrudRepository<Note, Long> {

}
