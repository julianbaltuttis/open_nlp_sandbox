package org;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        log.debug("--> Main().");

        log.info("Hello World!");

        log.debug("<-- Main().");
    }
}
