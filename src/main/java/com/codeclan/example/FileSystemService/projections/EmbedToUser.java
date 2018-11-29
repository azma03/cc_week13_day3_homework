package com.codeclan.example.FileSystemService.projections;

import com.codeclan.example.FileSystemService.models.Folder;
import com.codeclan.example.FileSystemService.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedToUser", types = User.class)
public interface EmbedToUser {
    String getName();
    List<Folder> getFolders();
}
