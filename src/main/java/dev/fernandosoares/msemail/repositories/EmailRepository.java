package dev.fernandosoares.msemail.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.fernandosoares.msemail.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {
}
