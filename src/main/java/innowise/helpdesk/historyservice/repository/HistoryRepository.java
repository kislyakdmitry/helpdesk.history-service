package innowise.helpdesk.historyservice.repository;

import innowise.helpdesk.historyservice.model.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepository extends JpaRepository<History,Long> , JpaSpecificationExecutor<History> {

}