package com.example.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
/*
这节学习了如何利用按钮的回调函数来改变这个Activity中的控件的活动
     这里简单猜测一下：每一个xml文件 要是想要响应动作的反馈的话那就少不了
     要有一个对应Activity 事实上 每创建一个Activity都会自动的生成一个xml
     通过在xml文件上面绘制一些安卓界面
     然后利用对应的Activity编写相应的控制逻辑
  同时本节还学习了如何利用监听器 创建一个监听器的类来实现同样的功能
    但是要注意 一定要实现监听器的接口的类 在此之后才能创建一个实现类的对象
    实现监听器接口 重写onclick方法 创建对象
 注意：不同的控件又有不同的android回调方法
 */
public class EventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_textview);
//        Button btn=findViewById(R.id.btn1);//拿到
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ImageView imageView =findViewById(R.id.image);
//                //Drawable drawable = imageView.getDrawable();
//                //imageView.setImageDrawable(R.drawable.timg);
//                EventActivity.this.setTitle("这是利用监听器设置的图片");
//            }
//        });
    }


//    public void nextImagine(View view) {
////            TextView tv =findViewById(R.id.text1);
//        ImageView imageView =findViewById(R.id.image);
//        imageView.setMaxHeight(2);
//
//            /*
//            注意，这个tv对象是针对的文本框的一个输入的对象 专门用于修改文本框的
//            一些属性
//            而这个this是指的是整体的这个标题 他是针对的一个真题view 一个视图
//            可以单独称为一页的 this对象就有一些针对整体窗口的属性
//
//             */
//            this.setTitle("这是一个新标题");
//    }

//    public void lastimage(View view) {
//        TextView tv =findViewById(R.id.text1);
//        tv.setText("这是修改了");
//    }
}