package com.codeclan.example.FileSystemService.projections;

import com.codeclan.example.FileSystemService.models.File;
import com.codeclan.example.FileSystemService.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedToFile", types = File.class)
public interface EmbedToFile {
    String getName();
    String getExtension();
    Double getSize();
    Folder getFolder();
}