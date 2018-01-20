package rm.iamjosephvarghese.glidesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {


    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageView = findViewById(R.id.imageView);


        Glide.with(this)
                .load("https://static.giantbomb.com/uploads/original/15/157771/2312719-a6.jpg")
                .placeholder(R.drawable.placeholder)
                .crossFade()
                .override(500,500)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .into(imageView);







    }
}
