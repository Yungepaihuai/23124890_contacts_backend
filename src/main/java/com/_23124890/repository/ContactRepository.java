package com._23124890.repository;

import com._23124890.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
    // 空接口，Spring Data JPA会自动实现CRUD操作
}
