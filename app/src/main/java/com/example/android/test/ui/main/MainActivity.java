package com.example.android.test.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.test.R;
import com.example.android.test.dao.CommentDao;
import com.example.android.test.dao.ICommentDao;
import com.example.android.test.model.Comment;

import org.w3c.dom.Text;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private EditText et;
    private TextView tv;
    private ProgressBar prgBar;

    private MainContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new MainPresenter();
        presenter.attachView(this);

        tv = (TextView) findViewById(R.id.text_main);
        et = (EditText) findViewById(R.id.edit_text);
        prgBar = (ProgressBar) findViewById(R.id.prg_main);
    }

    public void addComment(View view) {
        String text = et.getText().toString();

        if (!text.equals("")) {
            Comment comment = new Comment();
            comment.setText(text);
            presenter.saveComment(comment);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        presenter.detachView();
    }

    @Override
    public void showData(List<Comment> comments) {
        tv.setText("");
        for (Comment c : comments) {
            tv.append(c.getText() + "\n");
        }
    }

    @Override
    public void showProgress() {
        prgBar.setVisibility(View.VISIBLE);
        tv.setVisibility(View.INVISIBLE);
    }

    @Override
    public void hideProgress() {
        prgBar.setVisibility(View.INVISIBLE);
        tv.setVisibility(View.VISIBLE);
    }

    @Override
    public void showError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }
}
