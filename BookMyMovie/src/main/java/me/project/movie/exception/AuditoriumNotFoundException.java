package me.project.movie.exception;

public class AuditoriumNotFoundException extends RuntimeException {
    public AuditoriumNotFoundException(Long auditorium_id) {
    }
}
