package ourbusinessproject;


import jakarta.validation.constraints.NotNull;

import java.util.Date;

public class Partnership {
    @NotNull
    private Date creationDate;
    @NotNull
    private Enterprise enterprise;
    @NotNull
    private Project project;
    private Long id;

    /**
     * Set the creation date
     * @param creationDate the new creation date
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Get the creation date
     *
     * @return the creation date
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * Set the enterprise
     *
     * @param enterprise the new enterprise
     */
    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    /**
     * Get the enterprise
     *
     * @return the enterprise
     */
    public Enterprise getEnterprise() {
        return enterprise;
    }

    /**
     * Set the project
     *
     * @param project the new project
     */
    public void setProject(Project project) {
        this.project = project;
    }

    /**
     * Get the project
     *
     * @return the project
     */
    public Project getProject() {
        return project;
    }

    /**
     * Get the id
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }
}
