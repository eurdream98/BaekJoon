package src.main.java.A1B1O3.bodyrecord.body.domain;

import A1B1O3.bodyrecord.body.dto.request.BodyUpdateRequest;
import A1B1O3.bodyrecord.common.BaseEntity;
import A1B1O3.bodyrecord.member.domain.Member;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.springframework.stereotype.Component;

import javax.persistence.*;

import static A1B1O3.bodyrecord.common.type.StatusType.USEABLE;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PROTECTED;

@Component
@Entity
@Getter
@Setter
@NoArgsConstructor(access = PROTECTED)
@SQLDelete(sql = "UPDATE body SET state = 'DELETED' WHERE body_code = ?")
@Where(clause = "state = 'USEABLE'")
@Table(name = "body")
public class Body extends BaseEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer bodyCode;

    @Column(nullable = false, name = "weight")
    private float weight;

    @Column(nullable = false)
    private float fat;

    @Column(nullable = false)
    private float muscle;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "member_code")
    private Member memberCode;


    public Body(Integer bodyCode, float weight, float fat, float muscle, Member memberCode) {
        super(USEABLE);
        this.bodyCode = bodyCode;
        this.weight = weight;
        this.fat = fat;
        this.muscle = muscle;
        this.memberCode = memberCode;
    }


    public static Body of(float weight, float fat, float muscle,Member member) {
        return new Body(1, weight, fat, muscle,member);
//       return new Body();
    }

    public void update(BodyUpdateRequest bodyUpdateRequest) {
        this.weight = bodyUpdateRequest.getWeight();
        this.fat = bodyUpdateRequest.getFat();
        this.muscle = bodyUpdateRequest.getMuscle();
    }


}
