package Repo;

public class NotFoundException extends RuntimeException {
    public NotFoundException(int id) {
        super("ID не может быть отрицательным: " + id);
    }
}
