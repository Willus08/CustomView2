package posidenpalace.com.customview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CustomLayout cstLay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cstLay = (CustomLayout) findViewById(R.id.clHolder);
    }

    public void showDoom(View view) {
        Toast.makeText(this, ""+cstLay.isDoomed(), Toast.LENGTH_SHORT).show();
    }

    public void vanish(View view) {
        if (cstLay.isDoomed()){
            view.setVisibility(View.GONE);
        }
    }

    public void childCount(View view) {
        Toast.makeText(this, "Theis layout has" + cstLay.getChildCount() + "children", Toast.LENGTH_SHORT).show();
    }


    public void changeColor(View view) {
        cstLay.setDoomed(true);
        Toast.makeText(this, "comming soon", Toast.LENGTH_SHORT).show();
    }
}
