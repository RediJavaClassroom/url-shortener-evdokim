package com.redi.shortener.model;

import java.util.UUID;

public record User(UUID id, String name, String email) {}
