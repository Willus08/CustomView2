package posidenpalace.com.customview2;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;


public class CustomButton extends android.support.v7.widget.AppCompatButton {


    String message;
    boolean doom;
    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = context.obtainStyledAttributes(attrs,R.styleable.CustomButton,0,0);
        message = typedArray.getNonResourceString(R.styleable.CustomButton_message);
        doom = typedArray.getBoolean(R.styleable.CustomLinearLayout_doomed,false);
        typedArray.recycle();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if(doom){

            setText("doom Approches");
            setBackgroundColor(Color.BLACK);
        }

        setBackgroundColor(Color.BLUE);

    }

    public void setDoom(boolean doom) {
        this.doom = doom;
    }
}
