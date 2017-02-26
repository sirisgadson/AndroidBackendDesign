package com.example.android.test.dao;

import com.example.android.test.data.Firebase;
import com.example.android.test.model.Comment;

/**
 * Created by Siris on 2/25/2017.
 */

public class CommentDao implements IComentDao {

    Firebase fb = new Firebase();

    @Override
    public void save(Comment comment) {
        fb.SaveComment(comment);
    }

    @Override
    public Comment get(String id) {
        return new Comment();
    }
}
