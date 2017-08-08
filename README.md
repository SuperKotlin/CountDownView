#CountDownView
#欢迎star~感谢
### 效果图预览
![](/art/countdownview.gif)

#属性值：

	```
    <declare-styleable name="CountDownView">
        <!--view半径-->
        <attr name="cd_circle_radius" format="dimension" />
        <!--画笔宽度-->
        <attr name="cd_arc_width" format="dimension" />
        <!--画笔颜色-->
        <attr name="cd_arc_color" format="color" />
        <!--背景颜色-->
        <attr name="cd_bg_color" format="color" />
        <!--字体颜色-->
        <attr name="cd_text_color" format="color" />
        <!--字体尺寸-->
        <attr name="cd_text_size" format="dimension" />
        <!--动画执行时长-->
        <attr name="cd_animator_time" format="integer" />
        <!--时间单位-->
        <attr name="cd_animator_time_unit" format="string" />
        <!--动画进退方式-->
        <attr name="cd_retreat_type" format="enum">
            <!--外层的圆弧逐渐变长-->
            <enum name="forward" value="1" />
            <!--外层的圆弧逐渐减短-->
            <enum name="back" value="2" />
        </attr>
        <!--加载进度的开始位置-->
        <attr name="cd_location" format="enum">
            <enum name="left" value="1" />
            <enum name="top" value="2" />
            <enum name="right" value="3" />
            <enum name="bottom" value="4" />
        </attr>
    </declare-styleable>

	```

#如何使用：

	```
        <com.zhuyong.countdownciew.CountDownView
            android:id="@+id/cd_view3"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            app:cd_animator_time="6"
            app:cd_animator_time_unit="S"
            app:cd_arc_color="#000000"
            app:cd_arc_width="2dp"
            app:cd_bg_color="#AFF2F2"
            app:cd_circle_radius="40dp"
            app:cd_location="left"
            app:cd_retreat_type="forward"
            app:cd_text_color="#FF4081"
            app:cd_text_size="14sp" />
	```

##如何添加依赖库:

 - **Add it in your root build.gradle at the end of repositories:**

	```

	    allprojects {
		   repositories {
				...
				maven { url 'https://jitpack.io' }
		    }
	    }

	```


 -  **Add the dependency**
	
	```

	    dependencies {
	    
	    	 compile 'com.github.SuperKotlin:CountDownView:1.0.0'
	    
	    }

	```



### 详细博客介绍地址： [自定义View_手撸一个启动页倒计时View](http://www.jianshu.com/p/2b5ef5e18fe5)

### 关于我
 - 我的简书：[BraveJoy](http://www.jianshu.com/users/c96d2a9d160f/timeline)
 - 我的github：[SuperKotlin](https://github.com/SuperKotlin)