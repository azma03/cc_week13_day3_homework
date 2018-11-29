package com.codeclan.example.FileSystemService.projections;

import com.codeclan.example.FileSystemService.models.File;
import com.codeclan.example.FileSystemService.models.Folder;
import com.codeclan.example.FileSystemService.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedToFolder", types = Folder.class)
public interface EmbedToFolder{
    String getTitle();
    List<File> getFiles();
    User getUser();
}
