package com.github.nekit508.emkb.control.keys;

public interface Category {
    String id();

    default boolean filterValid(String filter) {
        return filter == null || id().contains(filter);
    }
}
