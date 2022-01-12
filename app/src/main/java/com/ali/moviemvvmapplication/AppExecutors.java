package com.ali.moviemvvmapplication;

import com.ali.moviemvvmapplication.repositories.MovieRepository;
import com.ali.moviemvvmapplication.request.MovieApiClient;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class AppExecutors {
    // singleton pattern


    private static AppExecutors instance;

    public static AppExecutors getInstance(){
        if(instance == null){
            instance = new AppExecutors();
        }
        return instance;
    }


    private final ScheduledExecutorService mNetworkIO = Executors.newScheduledThreadPool(3);


    public ScheduledExecutorService networkIO(){
        return mNetworkIO;
    }

}
