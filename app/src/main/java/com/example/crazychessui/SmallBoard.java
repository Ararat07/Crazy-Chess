package com.example.crazychessui;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class SmallBoard extends View {
    private static final int ROWS = 8;
    private static final int COLS = 8;
    private static final int SQUARE_SIZE = 50; // Size of each square in pixels

    private Paint darkSquarePaint;
    private Paint lightSquarePaint;

    public SmallBoard(Context context) {
        super(context);
        init();
    }

    public SmallBoard(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        darkSquarePaint = new Paint();
        darkSquarePaint.setColor(Color.DKGRAY);

        lightSquarePaint = new Paint();
        lightSquarePaint.setColor(Color.LTGRAY);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = getWidth();
        int height = getHeight();

        // Draw the chessboard squares
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                int left = col * SQUARE_SIZE;
                int top = row * SQUARE_SIZE;
                int right = left + SQUARE_SIZE;
                int bottom = top + SQUARE_SIZE;

                Paint paint = (row + col) % 2 == 0 ? lightSquarePaint : darkSquarePaint;
                canvas.drawRect(left, top, right, bottom, paint);
            }
        }
    }
}
