package com.codeclan.example.FileSystemService.repositories;

import com.codeclan.example.FileSystemService.models.File;
import com.codeclan.example.FileSystemService.projections.EmbedToFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedToFile.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
