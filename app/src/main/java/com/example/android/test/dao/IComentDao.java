package com.example.android.test.dao;

import com.example.android.test.model.Comment;

/**
 * Created by Siris on 2/25/2017.
 */

public interface IComentDao {
    void save(Comment comment);

    Comment get(String id);
}
