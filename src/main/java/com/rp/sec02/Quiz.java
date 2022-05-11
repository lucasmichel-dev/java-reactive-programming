package com.rp.sec02;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

public class Quiz {

    public static void main(String[] args) {

        Flux<Integer> flux = Flux.range(3, 5)
                .map(i -> i / (i - 4));

        flux.subscribe(Util.onNext());
    }
}
