package com.codeclan.example.FileSystemService;

import com.codeclan.example.FileSystemService.models.File;
import com.codeclan.example.FileSystemService.models.Folder;
import com.codeclan.example.FileSystemService.models.User;
import com.codeclan.example.FileSystemService.repositories.FileRepository;
import com.codeclan.example.FileSystemService.repositories.FolderRepository;
import com.codeclan.example.FileSystemService.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileSystemServiceApplicationTests {

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateFilesAndFoldersAndUsers() {
		User user1 = new User("Asma");
		userRepository.save(user1);

		Folder folder1 = new Folder("week12", user1);
		folderRepository.save(folder1);

		File file1 = new File("lab", ".java", 200, folder1);
		fileRepository.save(file1);


	}

}
