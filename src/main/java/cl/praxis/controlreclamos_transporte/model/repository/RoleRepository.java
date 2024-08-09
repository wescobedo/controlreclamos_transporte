package cl.praxis.controlreclamos_transporte.model.repository;

import cl.praxis.controlreclamos_transporte.model.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}