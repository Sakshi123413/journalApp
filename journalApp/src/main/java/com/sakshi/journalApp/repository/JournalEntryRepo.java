package com.sakshi.journalApp.repository;

import com.sakshi.journalApp.entity.JournalEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalEntryRepo extends JpaRepository<JournalEntry, Long> {
}
