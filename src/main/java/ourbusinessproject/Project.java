package ourbusinessproject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;

/**
 * A project is a business idea that an entrepreneur wants to develop.
 *
 */
@Entity
public class Project {
    @NotEmpty
    private String title;
    private String description;
    @Id
    @GeneratedValue
    private Long id;

    /**
     * Set the title of the project
     * @param title the title of the project
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Get the title of the project
     * @return the title of the project
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the description of the project
     * @param description the description of the project
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the description of the project
     * @return the description of the project
     */
    public String getDescription() {
        return description;
    }

    /**
     * Get the id of the project
     * @return the id of the project
     */
    public Long getId() {
        return id;
    }
}
