package sb.dti;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "taxinvoices")
@Getter @Setter
public class Taxinvoice {
    @Id @GeneratedValue
    private Long conversationId;
    //회원 사업자번호
    private String CorpNum;
    //회원 아이디
    private String userID;

}
