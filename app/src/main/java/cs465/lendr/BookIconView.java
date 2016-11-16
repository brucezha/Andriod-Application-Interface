package cs465.lendr;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

/**
 * TODO: document your custom view class.
 */
public class BookIconView extends ImageView implements View.OnClickListener {

    private static final String TAG = "BookIconView";

    private BookIconListener listener;

    public static interface BookIconListener {
        public void onBookClicked(BookIconView book);
    }

    public BookIconView(Context context) {
        super(context);
        init(context);
    }

    public BookIconView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public BookIconView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    private void init(Context ctx) {
        Log.d(TAG, "init");
        listener = (BookIconListener) ctx;
        setClickable(true);
        setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.d(TAG, "onClick");
        listener.onBookClicked(this);
    }
}
