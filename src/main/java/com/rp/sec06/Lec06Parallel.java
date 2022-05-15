package com.rp.sec06;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

import java.util.ArrayList;
import java.util.List;

public class Lec06Parallel {

    public static void main(String[] args) {

        Flux.range(1, 10)
                        .parallel(2)
                        .runOn(Schedulers.boundedElastic())
                        .doOnNext(i -> printThreadName("next " + i))
                        .subscribe(v -> printThreadName("sub " + v));

        Util.sleepSeconds(5);
    }

    private static void printThreadName(String msg) {
        System.out.println(msg + "\t\t: Thread : " + Thread.currentThread().getName());
    }
}
