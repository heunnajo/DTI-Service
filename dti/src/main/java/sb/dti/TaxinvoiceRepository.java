package sb.dti;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class TaxinvoiceRepository {

    @PersistenceContext
    private EntityManager em;

    public Long save(Taxinvoice taxinvoice){
        em.persist(taxinvoice);
        return taxinvoice.getConversationId();
    }

    public Taxinvoice find(Long conversationId){
        return em.find(Taxinvoice.class, conversationId);
    }
}
