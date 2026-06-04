package net.engineeringdigest.journalApp.entity;

import lombok.NonNull;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Document(collection = "users" )
// 1.This @Document will tell Spring the below class code i.e. JournalEntry class is mapped with Collections of MongoDB entity.
// 2.Journal Entry class instance will be just like Document.
// 3. Created "journal_entries" will be mapped with the class JournalEntry

@Data
public class User {

//    @Id
//    private ObjectId id;
//
//    @Indexed(unique = true)
//    @NonNull // Lombok anotation while set using setter annptation processerchecks null. If null appears in username and password it will be thrown nullpointerexception.
//    private String userName;
////    @NotNull
//    @NonNull
//    private String password;
//
//    @DBRef
//    private List<JournalEntry> journalEntries = new ArrayList<>();

    @Id
    private ObjectId id;

    @Indexed(unique = true)

    private String userName;

    private String password;

    @DBRef
    private List<JournalEntry> journalEntries = new ArrayList<>();

}


