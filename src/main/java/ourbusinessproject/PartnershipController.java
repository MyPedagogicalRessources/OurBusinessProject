package ourbusinessproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST Controller relative to Partnership
 */
@RestController
public class PartnershipController {

    private EnterpriseProjectService enterpriseProjectService;
    private PartnershipService partnershipService;

    /**
     * Create a PartnershipController
     *
     * @param enterpriseProjectService the enterprise project  service
     * @param partnershipService the partnership service
     */
    public PartnershipController(@Autowired EnterpriseProjectService enterpriseProjectService,
                                 @Autowired PartnershipService partnershipService) {
        this.enterpriseProjectService = enterpriseProjectService;
        this.partnershipService = partnershipService;
    }

    /**
     * Add a new partnership
     *
     * @param projectId the project id
     * @param enterpriseId the enterprise id
     */
    @PostMapping("/api/v1/partnerships")
    public Partnership addPartnership(@RequestParam("project_id") long projectId, @RequestParam("enterprise_id")long enterpriseId) {
        Project project = enterpriseProjectService.findProjectById(projectId);
        Enterprise enterprise = enterpriseProjectService.findEnterpriseById(enterpriseId);
        return partnershipService.newPartnership(project,enterprise);
    }

    /**
     * Remove a partnership
     *
     * @param partnershipId the id of the partnership to remove
     */
    @DeleteMapping("/api/v1/partnerships/{partnership_id}")
    public void removePartnership(@PathVariable("partnership_id") long partnershipId) {
        Partnership partnership = partnershipService.findPartnershipById(partnershipId);
        partnershipService.remove(partnership);
    }

    /**
     * Search partnerships
     *
     * @param projectTitle the project title of partnerships
     * @param enterpriseName the enterprise name of partnerships
     * @return the list of found partnerships
     */
    @RequestMapping("/api/v1/partnerships/search")
    public List<Partnership> search(@RequestParam(value = "project_title", required = false) String projectTitle,
                                    @RequestParam(value = "enterprise_name", required = false) String enterpriseName) {
        return partnershipService.search(projectTitle, enterpriseName);
    }
}
