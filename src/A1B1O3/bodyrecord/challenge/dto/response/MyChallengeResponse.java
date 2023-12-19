package A1B1O3.bodyrecord.challenge.dto.response;

import A1B1O3.bodyrecord.challenge.domain.repository.Challenge;
import A1B1O3.bodyrecord.member.domain.Member;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

import static lombok.AccessLevel.PUBLIC;

@Setter
@Getter
@RequiredArgsConstructor(access = PUBLIC)
public class MyChallengeResponse {

    private final int challengeCode;
    private final String challengeTitle;
    private final String memberName;
    private final LocalDate challengeStartdate;
    private final LocalDate challengeEnddate;

    public static MyChallengeResponse from(Challenge challenge, Member member) {
        return new MyChallengeResponse(
                challenge.getChallengeCode(),
                challenge.getChallengeTitle(),
                member.getMemberName(),
                challenge.getChallengeStartdate(),
                challenge.getChallengeEnddate()
        );
    }
}
