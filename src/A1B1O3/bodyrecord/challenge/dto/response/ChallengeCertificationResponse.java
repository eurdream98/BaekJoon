package A1B1O3.bodyrecord.challenge.dto.response;

import A1B1O3.bodyrecord.challenge.domain.repository.Challenge;
import A1B1O3.bodyrecord.challenge.domain.repository.ChallengeCertification;
import A1B1O3.bodyrecord.member.domain.Member;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

import static lombok.AccessLevel.PRIVATE;

@Setter
@Getter
@RequiredArgsConstructor(access = PRIVATE)
public class ChallengeCertificationResponse {

    private final int challengecerCode;
    private final String challengeImage;
    private final int challengeCode; //수정 가능성
    private final String memberName;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private final LocalDateTime createdAt;

    public static ChallengeCertificationResponse from(final ChallengeCertification challengeCertification, Challenge challenge, Member member) {
        return new ChallengeCertificationResponse(
                challengeCertification.getChallengecerCode(),
                challengeCertification.getChallengeImage(),
                challenge.getChallengeCode(),
                member.getMemberName(),
                challengeCertification.getCreatedAt()
        );
    }
}