package com.example.demo;

public class Comment {
	
	public int commentId;
	
	public String commentName;

	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", commentName=" + commentName + "]";
	}

	public Comment(int commentId, String commentName) {
		super();
		this.commentId = commentId;
		this.commentName = commentName;
	}
}
