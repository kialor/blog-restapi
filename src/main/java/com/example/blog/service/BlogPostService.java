package com.example.blog.service;

import com.example.blog.model.BlogPost;
import com.example.blog.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogPostService {
    private final BlogPostRepository blogPostRepository;

    @Autowired
    public BlogPostService(BlogPostRepository blogPostRepository) {
        this.blogPostRepository = blogPostRepository;
    }
    public List<BlogPost> getAllBlogPosts() {
        return blogPostRepository.findAll();
    }
    public Optional<BlogPost> getBlogPostById(Long id) {
        return blogPostRepository.findById(id);
    }

    public BlogPost createBlogPost(BlogPost blogPost) {
        return blogPostRepository.save(blogPost);
    }

    public BlogPost updateBlogPost(Long id, BlogPost updatedBlogPost) {
        Optional<BlogPost> existingBlogPost = blogPostRepository.findById(id);
        if (existingBlogPost.isPresent()) {
            BlogPost blogPost = existingBlogPost.get();
            blogPost.setTitle(updatedBlogPost.getTitle());
            blogPost.setContent(updatedBlogPost.getContent());
            blogPost.setAuthor(updatedBlogPost.getAuthor());
            return blogPostRepository.save(blogPost);
        }
        return null;
    }

    public void deleteBlogPost(Long id) {
        blogPostRepository.deleteById(id);
    }
}
