package com.codeclan.example.FileSystemService.components;

import com.codeclan.example.FileSystemService.models.File;
import com.codeclan.example.FileSystemService.models.Folder;
import com.codeclan.example.FileSystemService.models.User;
import com.codeclan.example.FileSystemService.repositories.FileRepository;
import com.codeclan.example.FileSystemService.repositories.FolderRepository;
import com.codeclan.example.FileSystemService.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) throws Exception {
        User user1 = new User("Asma");
        userRepository.save(user1);

        Folder folder1 = new Folder("week12", user1);
        folderRepository.save(folder1);

        Folder folder2 = new Folder("week13", user1);
        folderRepository.save(folder2);

        File file1 = new File("lab", ".java", 200, folder1);
        fileRepository.save(file1);

        File file2 = new File("homework", ".txt", 100, folder1);
        fileRepository.save(file2);

        File file3 = new File("notes", ".txt", 100, folder2);
        fileRepository.save(file3);

        File file4 = new File("task", ".txt", 200, folder2);
        fileRepository.save(file4);

//        user1.addFolders(folder1);
//        user1.addFolders(folder2);
//        userRepository.save(user1);

    }
}

