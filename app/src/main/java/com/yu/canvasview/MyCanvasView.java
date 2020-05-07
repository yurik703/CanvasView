package com.yu.canvasview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

public class MyCanvasView extends View {

    public MyCanvasView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);

        //rectangle
        canvas.drawRGB(255,0,0);
        canvas.drawRoundRect(new RectF(50,50,150,300), 0, 0, new Paint(Paint.ANTI_ALIAS_FLAG));

        //triangle
        Path path = new Path();
        path.moveTo(100,520);
        path.lineTo(340,200);
        path.lineTo(510,520);
        Paint p = new Paint(Paint.ANTI_ALIAS_FLAG);
        p.setStyle(Paint.Style.FILL);
        p.setColor(Color.GREEN);
        canvas.drawPath(path,p);

        //circle
        path.reset();
        path.addCircle(550,750,150, Path.Direction.CW);
        p.setColor(Color.YELLOW);
        canvas.drawPath(path,p);

        //text
        p.setColor(Color.GRAY);
        p.setTextSize(90);
        canvas.drawText("Yuri krasavchik", 200, 1000, p);
    }

}
