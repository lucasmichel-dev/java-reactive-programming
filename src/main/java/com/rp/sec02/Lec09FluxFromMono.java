package com.rp.sec02;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

public class Lec09FluxFromMono {

    public static void main(String[] args) {

//        Mono<String> mono = Mono.just("a");
//        Flux<String> flux = Flux.from(mono);
//
//        flux.subscribe(Util.onNext());
//
//        doSomething(flux);

        Flux.range(1, 10)
                .filter(i -> i > 3) // gets the first element that matches the condition
                .next()
                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());
    }

    private static void doSomething(Flux<String> flux) {
        // does nothing
    }
}