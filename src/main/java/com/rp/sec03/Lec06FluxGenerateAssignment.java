package com.rp.sec03;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

public class Lec06FluxGenerateAssignment {

    public static void main(String[] args) {


        Flux.generate(synchronousSink -> {
            String country = Util.faker().country().name();
            System.out.println("emitting " + country);
            synchronousSink.next(country);
            if ("Canada".equalsIgnoreCase(country))
                synchronousSink.complete();
        })
        .subscribe(Util.subscriber());
    }
}
