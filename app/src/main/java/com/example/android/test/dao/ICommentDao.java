package com.example.android.test.dao;

import com.example.android.test.model.Comment;

import java.util.List;

/**
 * Created by Siris on 2/25/2017.
 */

public interface ICommentDao {
    List<Comment> save(Comment comment);

    Comment get(String id);

    List<Comment> getAllComments();
}
