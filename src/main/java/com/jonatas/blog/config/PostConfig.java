package com.jonatas.blog.config;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.jonatas.blog.model.PostModel;
import com.jonatas.blog.repository.PostRepository;

@Configuration
@Profile(value = "test")
public class PostConfig implements CommandLineRunner {

    @Autowired
    private PostRepository postRepository;

    PostModel post1 = new PostModel("Como user o Thymelead", "Jonatas Caetano", LocalDateTime.now(), "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed dictum nisl ultricies, commodo urna non, pharetra elit. Morbi auctor erat fermentum lacus tempor, et iaculis ante mollis. Etiam in velit ac mauris dapibus placerat a ut nulla. Proin luctus nisl a feugiat imperdiet. Pellentesque viverra tortor quis justo rhoncus, in hendrerit mauris posuere. Ut velit libero, dictum eget porta non, viverra ut nisl. Proin malesuada justo et massa pulvinar dictum. Maecenas ultricies venenatis egestas. Cras consectetur, ligula eget aliquam efficitur, lorem orci suscipit nibh, id ultrices diam nisi ac justo. Cras laoreet elit eget tincidunt cursus. Donec interdum metus metus, eu malesuada ex gravida sed. Duis sollicitudin placerat purus ac consectetur.");
    PostModel post2 = new PostModel("Crie um crud com mongodb", "Jonatas Caetano", LocalDateTime.now(), "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed dictum nisl ultricies, commodo urna non, pharetra elit. Morbi auctor erat fermentum lacus tempor, et iaculis ante mollis. Etiam in velit ac mauris dapibus placerat a ut nulla. Proin luctus nisl a feugiat imperdiet. Pellentesque viverra tortor quis justo rhoncus, in hendrerit mauris posuere. Ut velit libero, dictum eget porta non, viverra ut nisl. Proin malesuada justo et massa pulvinar dictum. Maecenas ultricies venenatis egestas. Cras consectetur, ligula eget aliquam efficitur, lorem orci suscipit nibh, id ultrices diam nisi ac justo. Cras laoreet elit eget tincidunt cursus. Donec interdum metus metus, eu malesuada ex gravida sed. Duis sollicitudin placerat purus ac consectetur.");
    PostModel post3 = new PostModel("Porque estudar Java em 2023?", "Jonatas Caetano", LocalDateTime.now(), "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed dictum nisl ultricies, commodo urna non, pharetra elit. Morbi auctor erat fermentum lacus tempor, et iaculis ante mollis. Etiam in velit ac mauris dapibus placerat a ut nulla. Proin luctus nisl a feugiat imperdiet. Pellentesque viverra tortor quis justo rhoncus, in hendrerit mauris posuere. Ut velit libero, dictum eget porta non, viverra ut nisl. Proin malesuada justo et massa pulvinar dictum. Maecenas ultricies venenatis egestas. Cras consectetur, ligula eget aliquam efficitur, lorem orci suscipit nibh, id ultrices diam nisi ac justo. Cras laoreet elit eget tincidunt cursus. Donec interdum metus metus, eu malesuada ex gravida sed. Duis sollicitudin placerat purus ac consectetur.");
    PostModel post4 = new PostModel("React.js vs Angular qual o melhor framework javascript? ", "Jonatas Caetano", LocalDateTime.now(), "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed dictum nisl ultricies, commodo urna non, pharetra elit. Morbi auctor erat fermentum lacus tempor, et iaculis ante mollis. Etiam in velit ac mauris dapibus placerat a ut nulla. Proin luctus nisl a feugiat imperdiet. Pellentesque viverra tortor quis justo rhoncus, in hendrerit mauris posuere. Ut velit libero, dictum eget porta non, viverra ut nisl. Proin malesuada justo et massa pulvinar dictum. Maecenas ultricies venenatis egestas. Cras consectetur, ligula eget aliquam efficitur, lorem orci suscipit nibh, id ultrices diam nisi ac justo. Cras laoreet elit eget tincidunt cursus. Donec interdum metus metus, eu malesuada ex gravida sed. Duis sollicitudin placerat purus ac consectetur.");

    @Override
    public void run(String... args) throws Exception {
        postRepository.saveAll(Arrays.asList(post1, post2, post3, post4));

        
    }
    
}
