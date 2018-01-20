package rm.iamjosephvarghese.glidesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {


    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageView = findViewById(R.id.imageView);


        Glide.with(this).load("https://static.giantbomb.com/uploads/original/15/157771/2312719-a6.jpg").into(imageView);


    }
}
