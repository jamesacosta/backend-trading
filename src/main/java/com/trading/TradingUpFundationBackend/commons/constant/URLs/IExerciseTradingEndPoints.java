package com.trading.TradingUpFundationBackend.commons.constant.URLs;
/**
 * Interface who contains the endpoints of each controller of the entity ExerciseTrading
 */
public interface IExerciseTradingEndPoints {
    String URL_EXERCISE = "/exercise";//Go to de exercise area
    String URL_EXERCISE_CREATE = "/exercise_create";//Create a exercise area
    String URL_EXERCISE_DELETE = "/exercise_delete{id}";//Delete a exercise area
    String URL_EXERCISE_UPDATE = "/exercise_update";//Update a exercise area
    String URL_EXERCISE_READ = "/exercise_read{id}";//Search a exercise area
    String URL_EXERCISES_READ = "/exercises_read{level}";//Search all the exercises area
    String URL_EXERCISE_FILE = "/exercise_file{id}";
}
