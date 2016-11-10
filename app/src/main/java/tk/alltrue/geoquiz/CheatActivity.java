package tk.alltrue.geoquiz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CheatActivity extends AppCompatActivity {
    public static final String EXTRA_ANSWER_IS_TRUE="tk.alltrue.geoquiz.answer_is_true";

    public static Intent newIntent(Context packageContext, boolean answerTrue) {
        Intent i = new Intent(packageContext, CheatActivity.class);
        i.putExtra(EXTRA_ANSWER_IS_TRUE, answerTrue);
        return i;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);
    }
}
