package com.hw.corcow.samplemultitypelist;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Tacademy on 2015-10-06.
 */
public class ReceiveView extends FrameLayout {

    // ReceiveView가 가진 멤버
    ImageView iconView;
    TextView messageView;

    public ReceiveView(Context context) {
        super(context);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.view_receive, this);
        iconView = (ImageView) findViewById(R.id.image_icon);
        messageView = (TextView) findViewById(R.id.text_message);

    }

    public void setData(ReceiveData data) {
        iconView.setImageResource(data.resId);
        messageView.setText(data.message);
    }
}
