package br.com.gcme.gcme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gcme.gcme.entity.Mdo;

public interface MdoRepository extends JpaRepository<Mdo, Long> {
    
}
