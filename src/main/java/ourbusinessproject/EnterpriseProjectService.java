package ourbusinessproject;


import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashSet;

@Service
public class EnterpriseProjectService {

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * @return the entity manager
     */
    public EntityManager getEntityManager() {
        return entityManager;
    }

    /**
     * Set the entity manager
     *
     * @param entityManager the new entity manager
     */
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * Save a project in the DB
     *
     * @param project the project to save
     */
    public void save(Project project) {
        Enterprise enterprise = project.getEnterprise();
        if (enterprise != null) {
            enterprise.addProject(project);
            saveProjectOrEnterprise(enterprise);
        }
        saveProjectOrEnterprise(project);
    }

    /**
     * Save an enterprise in the DB
     *
     * @param enterprise the enterprise to save
     */
    public void save(Enterprise enterprise) {
        saveProjectOrEnterprise(enterprise);
    }

    private void saveProjectOrEnterprise(Object perstistantObject) {
        this.entityManager.persist(perstistantObject);
        this.entityManager.flush();
    }

    /**
     * Find a project given its id
     *
     * @param anId the id of the requested project
     * @return the project corresponding with the given id
     */
    public Project findProjectById(Long anId) {
        return this.entityManager.find(Project.class, anId);
    }

    /**
     * Find a enterprise given its id
     *
     * @param anId the id of the requested enterprise
     * @return the enterprise corresponding with the given id
     */
    public Enterprise findEnterpriseById(Long anId) {
        return this.entityManager.find(Enterprise.class, anId);
    }
}
