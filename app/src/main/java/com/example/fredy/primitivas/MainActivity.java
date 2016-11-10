package com.example.fredy.primitivas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Vista vista = new Vista(this);
        setContentView(vista);
    }

    class Vista extends View{

        public Vista(Context context){

            super(context);
        }

        public void onDraw(Canvas canvas){

            canvas.drawRGB(25,25,25);

            int ancho = canvas.getWidth();
            int alto = canvas.getHeight();

            Paint pincel1=new Paint();
            pincel1.setARGB(255,142,254,255);

            pincel1.setStyle(Paint.Style.FILL);

            canvas.drawCircle(ancho/2,alto/2,ancho/2,pincel1);

            /*Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(5);
            paint.setColor(Color.BLUE);

            int ancho = canvas.getWidth();
            canvas.drawRect(10,70,ancho-10,20,paint);*/
        }
    }
}
