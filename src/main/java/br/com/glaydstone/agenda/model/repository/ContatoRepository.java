package br.com.glaydstone.agenda.model.repository;

import br.com.glaydstone.agenda.model.entity.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer>  {

}
