package com.example.cap06backend.cap06backend.Contacts.Repositories;

import com.example.cap06backend.cap06backend.Contacts.Entities.Contacts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactsRepository extends JpaRepository<Contacts, Long> {

    boolean existsByName(String name);
}
