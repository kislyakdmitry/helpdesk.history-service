package innowise.helpdesk.historyservice.specification;

import innowise.helpdesk.historyservice.model.History;
import org.springframework.data.jpa.domain.Specification;

public class HistorySpecification {

    private HistorySpecification() {
    }

    public static Specification<History> hasTicketId(Long ticketId) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("ticketId"), ticketId);
    }

}
