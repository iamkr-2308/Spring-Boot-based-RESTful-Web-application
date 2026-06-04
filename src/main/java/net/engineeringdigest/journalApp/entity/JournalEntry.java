package net.engineeringdigest.journalApp.entity;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "journal_entries" )
// 1.This @Document will tell Spring the below class code i.e. JournalEntry class is mapped with Collections of MongoDB entity.
// 2.Journal Entry class instance will be just like Document.
// 3. Created "journal_entries" will be mapped with the class JournalEntry

@Data
public class JournalEntry {

    @Id // As due to mapping for Primary Key
    private ObjectId id;
    @NonNull
    private String title;

    private String content;

    private LocalDateTime date;

}


