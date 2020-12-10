package com.example.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/*
fragment 尤其适用于大屏幕 比如平板电脑
    一般的一个屏幕的跳转常常是一张一张的全体跳转
    但是有了fragment之后 可以将一块大屏幕分为两个部分 相互不相互冲突
    类似于屏幕分屏为两个 这样子的话 提高用户使用好感
  特点:
  1必须放在一个activity中
  2一个fragment有自己的生命周期 但是它不可能比一个activity的周期长
  3每个fragment有自己的布局 同时可以自己的生命周期中填写自己的回调函数
  4.代码复用 一个fragment可以被多个activity复用

对于要修改在一个fragment的内容是 是找了一个Activity 在这个Activity中呢
去修改其余控件的属性
但是如果是对于两个或者多个控件 组合在一起 那么就只能去找这多个Fragment所在的
控件  这样子才能去同时在这两控件之家进行交互

 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextImagine(View view) {
        TextView tv =findViewById(R.id.text1);
        tv.setText("利用本身的fragment修改的");
    }

    public void lastImage(View view) {

        //我自己把我子的图片复制了 太秀了
        //通过这就实现了静态的复制  我发现了 id都是一个数字 而那个ImagineView也是一个数字
        ImageView imageView=findViewById(R.id.imageInTextView);
        Drawable drawable1=imageView.getDrawable();
        ImageView imageView1=findViewById(R.id.imageforUse);
        imageView1.setImageDrawable(drawable1);

        TextView tv =findViewById(R.id.textImage);
        tv.setText(R.string.newStr);
    }
}