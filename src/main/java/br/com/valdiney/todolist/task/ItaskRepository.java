package br.com.valdiney.todolist.task;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ItaskRepository extends JpaRepository<TaskModel, UUID> {
    List<TaskModel> findAllByIdUser(UUID idUser);
}
