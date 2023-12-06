package src.main.java.A1B1O3.bodyrecord.exercise.dto.response;

import A1B1O3.bodyrecord.exercise.domain.Exercise;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Time;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class SearchResponse {

    private final String exerciseName;

    private final float exerciseWeight;

    private final int exerciseCount;

    private final Time exerciseTime;

    private final Boolean exerciseShare;

    private final String memberNickName;

    @JsonFormat(pattern = "YYYY-MM-DD")
    private final LocalDateTime createdAt;

    @JsonFormat(pattern = "YYYY-MM-DD")
    private final LocalDateTime modifiedAt;

    public static SearchResponse from(final Exercise exercise){
        return new SearchResponse(
                exercise.getExerciseName(),
                exercise.getExerciseWeight(),
                exercise.getExerciseCount(),
                exercise.getExerciseTime(),
                exercise.getExerciseShare(),
                exercise.getMember().getMemberNickname(),
                exercise.getCreatedAt(),
                exercise.getModifiedAt()

        );
    }


}
