package com.gc.x45_popupwindow;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView textView;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
    }

    public void click(View view){
    	textView = new TextView(this);
    	textView.setText("�ٺ�~~");
    	textView.setBackgroundColor(Color.GRAY);
    	
    	//popup����
    	/**
    	 * ������1��Ҫ��ʾ�����      2�������       3������ߣ�
    	 */
    	PopupWindow popupWindow = new PopupWindow(textView, 200, 200);
    	/**
    	 * ������1����View   2���������Ŀ���     3��������x��ƫ����      4����y��ƫ������
    	 */
    	popupWindow.showAtLocation(findViewById(R.id.rl_root), Gravity.LEFT + Gravity.TOP, 300, 300);
    }
}
