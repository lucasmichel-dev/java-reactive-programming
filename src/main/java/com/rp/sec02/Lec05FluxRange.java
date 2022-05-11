package com.rp.sec02;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.stream.Stream;

public class Lec05FluxRange {

    public static void main(String[] args) {

        Flux.range(1, 10)
                .log()
                .map(i -> Util.faker().name().fullName())
                .subscribe(Util.onNext());
    }
}
