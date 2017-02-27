package com.example.android.test.dao;

import com.example.android.test.data.Firebase;
import com.example.android.test.model.Comment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Siris on 2/25/2017.
 */

public class CommentDao implements ICommentDao {

    //any source you want
    Firebase fb = new Firebase();
    List<Comment> commentsList = new ArrayList<Comment>();

    @Override
    public List<Comment> save(Comment comment) {
//        fb.SaveComment(comment);
        commentsList.add(comment);
        return commentsList;
    }

    @Override
    public Comment get(String id) {
        return new Comment();
    }

    @Override
    public List<Comment> getAllComments() {
        return commentsList;
    }
}
