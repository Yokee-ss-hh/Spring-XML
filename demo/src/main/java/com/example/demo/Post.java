package com.example.demo;

public class Post {
	
	public int postId;
	
	public String postName;
	
	public Comment postComment;

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", postName=" + postName + ", postComment=" + postComment + "]";
	}

	public Post(int postId, String postName, Comment postComment) {
		super();
		this.postId = postId;
		this.postName = postName;
		this.postComment = postComment;
	}
}
