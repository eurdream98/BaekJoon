package src.main.java.A1B1O3.bodyrecord.exercise.dto.response;

import A1B1O3.bodyrecord.exercise.domain.Exercise;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.sql.Date;
import java.sql.Time;

import static lombok.AccessLevel.PRIVATE;

@Getter
@RequiredArgsConstructor(access = PRIVATE)
public class ExerciseResponse {

    private final String exerciseName;

    private final float exerciseWeight;

    private final int exerciseCount;

    private final Time exerciseTime;

    private final String exerciseImageName;

    private final String exerciseImagePath;

    private final Boolean exerciseShare;

    private final Date exerciseDate;


    public static ExerciseResponse from(final Exercise exercise) {
        return new ExerciseResponse(
                exercise.getExerciseName(),
                exercise.getExerciseWeight(),
                exercise.getExerciseCount(),
                exercise.getExerciseTime(),
                exercise.getExerciseImageName(),
                exercise.getExerciseImagePath(),
                exercise.getExerciseShare(),
                exercise.getExerciseDate()
        );
    }
}