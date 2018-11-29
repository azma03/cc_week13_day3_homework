package com.codeclan.example.FileSystemService.repositories;

import com.codeclan.example.FileSystemService.models.User;
import com.codeclan.example.FileSystemService.projections.EmbedToUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedToUser.class)
public interface UserRepository extends JpaRepository<User, Long> {
}