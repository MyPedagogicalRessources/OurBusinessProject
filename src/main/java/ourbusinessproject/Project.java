package ourbusinessproject;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;


/**
 * Class representing a project
 */
@Entity
public class Project {

    @NotEmpty // or @NotNull @NotBlank
    private String title;
    private String description;
    @Id
    @GeneratedValue
    private Long id;

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the title
     * @param title the new title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description
     * @param description the new description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
}
