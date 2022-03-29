package ourbusinessproject;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


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
    @NotNull
    @ManyToOne
    private Enterprise enterprise;

    /**
     * Create and initialize a Project
     * @param title the title of the Project
     * @param description the description of the Project
     * @param enterprise the Enterprise attached to the Project
     */
    public Project(String title, String description, Enterprise enterprise) {
        this.title = title;
        this.description = description;
        this.enterprise = enterprise;
    }

    /**
     * Create a Project
     */
    public Project() {}

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

    /**
     * Set the enterprise owning the project
     * @param enterprise the new enterprise
     */
    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    /**
     * @return the enterprise owner of the project
     */
    public Enterprise getEnterprise() {
        return enterprise;
    }
}
