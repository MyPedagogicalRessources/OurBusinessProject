package ourbusinessproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Enterprise {

    @NotEmpty
    private String name;
    @Size(min = 10)
    private String description;
    @NotEmpty
    private String contactName;
    @NotEmpty @Email
    private String contactEmail;
    @Id
    @GeneratedValue
    private Long id;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the contact name
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Set the contact name
     * @param contactName the new contact name
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * @return the contact email
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Set the contact email
     * @param contactEmail the new contact email
     */
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }
}
