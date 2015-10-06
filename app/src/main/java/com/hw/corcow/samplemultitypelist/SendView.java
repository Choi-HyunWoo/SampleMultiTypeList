package com.hw.corcow.samplemultitypelist;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by Tacademy on 2015-10-06.
 */
public class SendView extends FrameLayout {

    // SendView가 가진 멤버
    TextView messageView;

    public SendView(Context context) {
        super(context);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.view_send, this);
        messageView = (TextView) findViewById(R.id.text_message);

    }

    public void setData(SendData data) {
        messageView.setText(data.message);
    }
}
