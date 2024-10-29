package ifrn.pi.eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ifrn.pi.eventos.modells.Evento;

public interface EventoRepository extends JpaRepository<Evento, Long>{

}