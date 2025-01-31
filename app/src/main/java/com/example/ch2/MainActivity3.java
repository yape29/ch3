package com.example.ch2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    private TextView testTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        testTextView = findViewById(R.id.test_text_view);  // 假设测试文本的 ID 为 test_text_view
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.font_size_small) {
            testTextView.setTextSize(10);  // 设置字体大小为 10
        } else if (item.getItemId() == R.id.font_size_medium) {
            testTextView.setTextSize(16);  // 设置字体大小为 16
        } else if (item.getItemId() == R.id.font_size_large) {
            testTextView.setTextSize(20);  // 设置字体大小为 20
        } else if (item.getItemId() == R.id.normal_item) {
            Toast.makeText(this, "普通菜单项被点击", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.font_color_red) {
            testTextView.setTextColor(getResources().getColor(android.R.color.holo_red_dark));  // 设置字体颜色为红色
        } else if (item.getItemId() == R.id.font_color_black) {
            testTextView.setTextColor(getResources().getColor(android.R.color.black));  // 设置字体颜色为黑色
        } else {
            return super.onOptionsItemSelected(item);
        }
        return super.onOptionsItemSelected(item);
    }
}
