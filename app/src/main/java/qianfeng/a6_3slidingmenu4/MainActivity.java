package qianfeng.a6_3slidingmenu4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 创建一个slidingMenu对象
        SlidingMenu slidingMenu = new SlidingMenu(this);

        // 设置侧滑模式(左菜单，左右侧滑菜单)
        slidingMenu.setMode(SlidingMenu.LEFT_RIGHT);

        // 设置左边的侧滑菜单，（可以传进去是一个Layout也可以是一个View）
        slidingMenu.setMenu(R.layout.left_layout);

        // 设置右边的侧滑菜单 setSecondardMenu
        slidingMenu.setSecondaryMenu(R.layout.right_layout);

        // 获取手机水平方向像素点的个数
        int widthPixels = getResources().getDisplayMetrics().widthPixels;

        // 设置主页面的偏移量
        slidingMenu.setBehindOffset(widthPixels / 3);

        // 将侧滑菜单加载到Activity上,SlidingMenu.SLIDING_CONTENT表示侧滑操作在ActionBar之下进行
        //SlidingMenu.SLIDING_WINDOW表示侧滑操作在ActionBar之上进行
        slidingMenu.attachToActivity(this,SlidingMenu.SLIDING_CONTENT);

    }
}
