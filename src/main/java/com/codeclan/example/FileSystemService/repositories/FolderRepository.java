package com.codeclan.example.FileSystemService.repositories;

import com.codeclan.example.FileSystemService.models.Folder;
import com.codeclan.example.FileSystemService.projections.EmbedToFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedToFolder.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}