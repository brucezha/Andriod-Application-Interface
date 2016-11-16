package cs465.lendr;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/**
 * TODO: document your custom view class.
 */
public class SearchResult extends TextView implements View.OnClickListener {

    Context context;

    public SearchResult(Context context) {
        super(context);
        init(context);
    }

    public SearchResult(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public SearchResult(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    private void init(Context ctx) {
        context = ctx;
        setOnClickListener(this);
    }

    public void onClick(View v) {
        Intent intent = new Intent(context, BookActivity.class);
        context.startActivity(intent);
    }
}
