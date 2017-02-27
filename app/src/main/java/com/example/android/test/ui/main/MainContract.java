package com.example.android.test.ui.main;

import com.example.android.test.model.Comment;
import com.example.android.test.ui.BasePresenter;
import com.example.android.test.ui.BaseView;

import java.util.List;

/**
 * Created by Siris on 2/27/2017.
 */

public interface MainContract {

    interface View extends BaseView {
        void showData(List<Comment> comments);
    }

    interface Presenter extends BasePresenter<View> {
        void loadCommentLog();
        void saveComment(Comment comment);
    }
}
