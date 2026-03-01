package net.engineeringdigest.journalApp.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "journal_entries" )
// 1.This @Document will tell Spring the below class code i.e. JournalEntry class is mapped with Collections of MongoDB entity.
// 2.Journal Entry class instance will be just like Document.
// 3. Created "journal_entries" will be mapped with the class JournalEntry
public class JournalEntry {

    @Id // As due to mapping for Primary Key
    private ObjectId id;

    private String title;

    private String content;

    private LocalDateTime date;

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
