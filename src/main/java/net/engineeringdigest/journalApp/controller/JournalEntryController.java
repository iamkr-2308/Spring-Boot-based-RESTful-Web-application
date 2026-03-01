//package net.engineeringdigest.journalApp.controller;
//
//import net.engineeringdigest.journalApp.entity.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/journal") // This adds mapping to the whole class.
//public class JournalEntryController {
//
////    private Map<Long, JournalEntry> journalEntries = new HashMap<>();
//
//    @GetMapping  // localhost:8080/journal GET
//    // Methods inside a class should be made public so that they can be accessed and invoked by the Spring Framework or External Files.
//    public List<JournalEntry> getAll() {
////        return new ArrayList<>(journalEntries.values());
//        return null;
//    }
//
//    @PostMapping // localhost:8080/journal POST
//    public boolean createEntry(@RequestBody JournalEntry myEntry) // It will become instance of JournalEntry
//    // Its Like saying, "Hey Spring, please data from the request and turn it into a JAVA OBJECT that i can use in my code"
//    {
////        journalEntries.put(myEntry.getId(), myEntry);
//        return true;
//    }
//
//    @GetMapping("id/{myId}")
//    public JournalEntry getJournalEntryById(@PathVariable Long myId) {
////        return journalEntries.get(myId);
//        return null;
//    }
//
//    @DeleteMapping("id/{myId}")
//    public JournalEntry deleteJournalEntryById(@PathVariable Long myId) {
////        return journalEntries.remove(myId);
//        return null;
//    }
//
//    @PutMapping("id/{id}")
//    public JournalEntry updateJournalEntryById(@PathVariable Long id, @RequestBody JournalEntry myEntry) {
////        return journalEntries.put(id, myEntry);
//        return null;
//    }
//}
//
