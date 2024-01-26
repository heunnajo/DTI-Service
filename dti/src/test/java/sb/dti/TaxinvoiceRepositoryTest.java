package sb.dti;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureTestDatabase
public class TaxinvoiceRepositoryTest {
    @Autowired
    TaxinvoiceRepository taxinvoiceRepository;

    @Test
    @Transactional
    @Rollback(false)
    public void testTaxinvoice() throws Exception{
        //given
        Taxinvoice taxinvoice = new Taxinvoice();
        taxinvoice.setUserID("id1234");

        //when
        Long savedId = taxinvoiceRepository.save(taxinvoice);
        Taxinvoice findTaxinvoice = taxinvoiceRepository.find(savedId);

        //then
        Assertions.assertThat(findTaxinvoice.getConversationId().equals(taxinvoice.getConversationId()));
        Assertions.assertThat(findTaxinvoice.getCorpNum().equals(taxinvoice.getCorpNum()));
    }
}