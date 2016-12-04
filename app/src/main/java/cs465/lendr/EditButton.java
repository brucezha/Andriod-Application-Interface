package cs465.lendr;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.List;
import java.util.ArrayList;

/**
 * TODO: document your custom view class.
 */
public class EditButton extends Button implements View.OnClickListener {

    private List<EditText> editTexts;

    private boolean isEditMode = false;


    public EditButton(Context context) {
        super(context);
        init(null, 0);
    }

    public EditButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public EditButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    private void init(AttributeSet attrs, int defStyle) {
        editTexts = new ArrayList<EditText>();
        setOnClickListener(this);
    }


    public void addEditText(EditText editText) {
        this.editTexts.add(editText);
        setEditMode(isEditMode);
    }

    private void setEditMode(boolean editMode) {
        isEditMode = editMode;

        for(EditText editText : editTexts) {
            editText.setFocusable(isEditMode);
            editText.setFocusableInTouchMode(isEditMode);
            editText.setCursorVisible(isEditMode);
            editText.setClickable(isEditMode);
            editText.setEnabled(isEditMode);
        }

        setText((isEditMode == true) ? "SAVE" : "EDIT");
    }
    
    public void onClick(View v) {
        if(editTexts == null) return;

        setEditMode(!isEditMode);
    }
}
