package tmnt.example.lableviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private LabelView mLabelView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLabelView = (LabelView) findViewById(R.id.label);
        mLabelView.setLabelBackgroundResource(R.drawable.label_back);
        List<String> list = new ArrayList<>();
        list.add("Android");
        list.add("IOS");
        list.add("前端");
        list.add("后台");
        list.add("微信开发");
        list.add("Java");
        list.add("JavaScript");
        list.add("C++");
        list.add("PHP");
        list.add("Python");

        mLabelView.setLable(list);

        mLabelView.setOnLabelListener((v, position) ->
                Toast.makeText(MainActivity.this, "click:" + position, Toast.LENGTH_SHORT).show()
        );

    }
}
