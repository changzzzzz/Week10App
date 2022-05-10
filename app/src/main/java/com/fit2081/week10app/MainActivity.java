package com.fit2081.week10app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MotionEventCompat;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView actionType;
    TextView getXY;
    TextView getRawXY;
    int count;
    boolean flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View view=findViewById(R.id.frame_layout_id);
        actionType=findViewById(R.id.action_type);
        getXY=findViewById(R.id.get_x_y_id);
        getRawXY=findViewById(R.id.get_raw_x_y_id);
        count=0;
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int x=(int)event.getX();
                int y=(int)event.getY();
                int rawX=(int)event.getRawX();
                int rawY=(int)event.getRawY();
                getXY.setText(x+","+y);
                getRawXY.setText(rawX+","+rawY);


                flag=true;
                int action = event.getActionMasked();
                if(action == MotionEvent.ACTION_DOWN){
                    Toast.makeText(getApplicationContext(),"Action DOWN",Toast.LENGTH_SHORT).show();

                }
                if(action == MotionEvent.ACTION_UP){
                    Toast.makeText(getApplicationContext(),"Action UP",Toast.LENGTH_SHORT).show();
                }
                return flag;
//                switch(action) {
//                    case (MotionEvent.ACTION_DOWN) :
//                        actionType.setText("Down");
//                        return true;
//                    case (MotionEvent.ACTION_MOVE) :
//                        count+=1;
//                        actionType.setText("MOVE"+count);
//
//                        return true;
//                    case (MotionEvent.ACTION_UP) :
//                        actionType.setText("UP");
//                        return true;
//                    default :
//                        return false;
//                }








            }
        });
    }
}
