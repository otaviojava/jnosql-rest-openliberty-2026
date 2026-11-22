package com.github.otaviojava.rest;

import jakarta.nosql.Column;
import jakarta.nosql.Embeddable;

@Embeddable(Embeddable.EmbeddableType.GROUPING)
public record Manufacturer(
        @Column String name,
        @Column String country) {
}