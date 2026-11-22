package com.github.otaviojava.rest;

import jakarta.nosql.Column;
import jakarta.nosql.Embeddable;

@Embeddable(Embeddable.EmbeddableType.GROUPING)
public record Supplier(
        @Column String name,
        @Column String accountManager,
        @Column String contractReference) {
}