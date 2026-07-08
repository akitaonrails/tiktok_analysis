package com.ss.android.ugc.aweme.lego.common;

import android.os.Handler;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: loaded from: classes14.dex */
public class LegoHandler extends BPEAHandler {
    public LegoHandler(Handler.Callback callback) {
        super(callback);
    }

    public final void LJ(int i) {
        LJFF(i, 0L);
    }

    public final void LJFF(int i, long j) {
        Message messageObtainMessage = obtainMessage();
        messageObtainMessage.what = i;
        messageObtainMessage.obj = null;
        removeMessages(i);
        sendMessageDelayed(messageObtainMessage, j);
    }
}
