package com.stackroute.godeliver.recommendationmicroservice.listners;

public class BookListner {
	private Long nodeId;
	private int id;
	private String title;
	private int rating;
	private int publishedYear;

	public BookListner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookListner(Long nodeId, int id, String title, int rating, int publishedYear) {
		super();
		this.nodeId = nodeId;
		this.id = id;
		this.title = title;
		this.rating = rating;
		this.publishedYear = publishedYear;
	}

	public Long getNodeId() {
		return nodeId;
	}

	public void setNodeId(Long nodeId) {
		this.nodeId = nodeId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}

	@Override
	public String toString() {
		return "Book [nodeId=" + nodeId + ", id=" + id + ", title=" + title + ", rating=" + rating + ", publishedYear="
				+ publishedYear + "]";
	}

}
