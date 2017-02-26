package com.example.android.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.android.test.dao.CommentDao;
import com.example.android.test.dao.IComentDao;
import com.example.android.test.model.Comment;

public class MainActivity extends AppCompatActivity {

    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.edit_text);
    }

    public void saveComment(View view) {
        String text = et.getText().toString();

        if (!text.equals("")) {
            Comment comment = new Comment();
            comment.setText(text);

            IComentDao comentDao = new CommentDao();
            comentDao.save(comment);
        }
    }
}
