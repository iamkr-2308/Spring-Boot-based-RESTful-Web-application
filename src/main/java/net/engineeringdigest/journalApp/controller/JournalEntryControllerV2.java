package net.engineeringdigest.journalApp.controller;
import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.services.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/journal") // This adds mapping to the whole class.
public class JournalEntryControllerV2 {

    @Autowired
    private JournalEntryService journalEntryService;

//    private Map<Long, JournalEntry> journalEntries = new HashMap<>();

    @GetMapping  // localhost:8080/journal GET
    // Methods inside a class should be made public so that they can be accessed and invoked by the Spring Framework or External Files.
    public List<JournalEntry> getAll() {
//        return new ArrayList<>(journalEntries.values());
        return journalEntryService.getAll();
    }

    @PostMapping // localhost:8080/journal POST
    public JournalEntry createEntry(@RequestBody JournalEntry myEntry) // It will become instance of JournalEntry
    // Its Like saying, "Hey Spring, please data from the request and turn it into a JAVA OBJECT that i can use in my code"
    {
        journalEntryService.saveEntry(myEntry);
//        journalEntryService.saveEntry(myEntry);
//        journalEntries.put(myEntry.getId(), myEntry);
        return myEntry;
    }

    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable ObjectId myId) {
//        return journalEntries.get(myId);
        return journalEntryService.findById(myId).orElse(null);
    }

    @DeleteMapping("id/{myId}")
    public boolean deleteJournalEntryById(@PathVariable ObjectId myId) {
//        return journalEntries.remove(myId);
        journalEntryService.deleteById(myId);
        return true;
    }

    @PutMapping("id/{id}")
    public JournalEntry updateJournalEntryById(@PathVariable ObjectId id, @RequestBody JournalEntry newEntry) {

        JournalEntry old = getJournalEntry(id);
        if (old != null) {
            old.setTitle(newEntry.getTitle() != null && !newEntry.getTitle().equals("") ? newEntry.getTitle() : old.getTitle());
            old.setContent(newEntry.getContent() != null && !newEntry.equals("") ? newEntry.getContent() : old.getContent());
        }
        journalEntryService.saveEntry(old);
        return old;

    }

    private JournalEntry getJournalEntry(ObjectId id) {
        JournalEntry old = journalEntryService.findById(id).orElse(null);
        return old;
    }
}

