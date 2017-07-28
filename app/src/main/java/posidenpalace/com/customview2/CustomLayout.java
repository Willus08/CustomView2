package posidenpalace.com.customview2;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;


public class CustomLayout extends LinearLayout {

    boolean organized;
    boolean doomed;

    public CustomLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomLinearLayout, 0, 0);
        organized = typedArray.getBoolean(R.styleable.CustomLinearLayout_organized, true);
        doomed = typedArray.getBoolean(R.styleable.CustomLinearLayout_doomed, false);

        typedArray.recycle();
    }

    @Override
    public int getChildCount() {
        return super.getChildCount();
    }

    public boolean isDoomed() {
        return doomed;
    }

    public void setDoomed(boolean doomed) {

        this.doomed = doomed;
    }

}


