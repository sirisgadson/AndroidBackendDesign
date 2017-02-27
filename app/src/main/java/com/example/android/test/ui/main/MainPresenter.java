package com.example.android.test.ui.main;

import com.example.android.test.dao.CommentDao;
import com.example.android.test.dao.ICommentDao;
import com.example.android.test.model.Comment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Siris on 2/27/2017.
 */

public class MainPresenter implements MainContract.Presenter {

    private MainContract.View view;
    ICommentDao commentDao = new CommentDao();

    List<Comment> commentList = new ArrayList<Comment>();

    @Override
    public void loadCommentLog() {
        view.showProgress();
        commentList = commentDao.getAllComments();
        view.showData(commentList);
        view.hideProgress();
    }

    @Override
    public void saveComment(Comment comment) {
        view.showProgress();
        commentList = commentDao.save(comment);
        view.showData(commentList);
        view.hideProgress();
    }

    @Override
    public void attachView(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
    }
}
