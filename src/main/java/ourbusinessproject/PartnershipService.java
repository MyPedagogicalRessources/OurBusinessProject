package ourbusinessproject;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;



/**
 * Service to manage PartnerShip entities
 */
@Service
public class PartnershipService {

    @PersistenceContext
    private EntityManager entityManager;

    /**
     * Create a new partnership
     *
     * @param project the project of the partnership
     * @param enterprise the enterprise of the partnership
     * @return the new partnership
     */
    public Partnership newPartnership(Project project, Enterprise enterprise) {
        Partnership partnership = new Partnership();
        partnership.setProject(project);
        partnership.setEnterprise(enterprise);
        entityManager.persist(partnership);
        return partnership;
    }

    /**
     * Find partnership by id
     *
     * @param id the id of the partnership
     * @return the found partnership,or null
     */
    public Partnership findPartnershipById(Long id) {
        return entityManager.find(Partnership.class,id);
    }

    /**
     * Remove a partnership
     *
     * @param partnership the partnership to remove
     */
    public void remove(Partnership partnership) {
        entityManager.remove(partnership);
    }
}
