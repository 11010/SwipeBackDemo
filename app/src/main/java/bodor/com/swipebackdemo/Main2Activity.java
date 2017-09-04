package bodor.com.swipebackdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.liuguangqiang.swipeback.SwipeBackActivity;
import com.liuguangqiang.swipeback.SwipeBackLayout;

public class Main2Activity extends SwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setDragEdge(SwipeBackLayout.DragEdge.RIGHT);
    }
}
