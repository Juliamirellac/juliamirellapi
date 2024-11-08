package ifrn.pi.eventos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.pi.eventos.modells.Convidado;
import ifrn.pi.eventos.modells.Evento;

public interface ConvidadoRepository extends JpaRepository<Convidado, Long> {
	
	List<Convidado> findByEvento(Evento evento);

}