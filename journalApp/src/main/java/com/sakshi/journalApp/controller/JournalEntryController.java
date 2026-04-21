package com.sakshi.journalApp.controller;

import com.sakshi.journalApp.entity.JournalEntry;
import com.sakshi.journalApp.repository.JournalEntryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

  @Autowired
  private JournalEntryRepo repo;

  // GET ALL
  @GetMapping
  public List<JournalEntry> getAll() {
    return repo.findAll();
  }

  // POST (SAVE DATA)
  @PostMapping
  public JournalEntry createEntry(@RequestBody JournalEntry entry) {
    return repo.save(entry);
  }

  // GET BY ID
  @GetMapping("/{id}")
  public JournalEntry getById(@PathVariable Long id) {
    return repo.findById(id).orElse(null);
  }

  // DELETE
  @DeleteMapping("/id{myId}")
  public void delete(@PathVariable Long id) {
    repo.deleteById(id);
  }

  // UPDATE
  @PutMapping("/id/{id}")
  public JournalEntry update(@PathVariable Long id, @RequestBody JournalEntry entry) {
    entry.setId(id);
    return repo.save(entry);
  }
}