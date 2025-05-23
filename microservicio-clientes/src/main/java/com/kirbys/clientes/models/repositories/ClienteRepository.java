package com.kirbys.clientes.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.kirbys.commons.models.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
