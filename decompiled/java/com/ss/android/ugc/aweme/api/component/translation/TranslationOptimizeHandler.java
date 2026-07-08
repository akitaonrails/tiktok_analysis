package com.ss.android.ugc.aweme.api.component.translation;

import X.C0S7B;
import X.C1C7U;
import X.C2187451AjH;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.IAdTranslatableData;
import com.ss.android.ugc.aweme.feed.model.IAdTranslationData;

/* JADX INFO: loaded from: classes12.dex */
public final class TranslationOptimizeHandler extends BPEAHandler {
    public final C0S7B LL;

    public TranslationOptimizeHandler(C0S7B c0s7b) {
        super(Looper.getMainLooper());
        this.LL = c0s7b;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("TranslationOptimizeHandler@52c9.handleMessage");
        super.handleMessage(message);
        if (message.what == 1) {
            Object messageObj = HandlerHook.getMessageObj(message.obj);
            if (messageObj instanceof IAdTranslatableData) {
                IAdTranslatableData iAdTranslatableData = (IAdTranslatableData) messageObj;
                removeMessages(1);
                if (C2187451AjH.LJ) {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 1;
                    messageObtain.obj = iAdTranslatableData;
                    sendMessageDelayed(messageObtain, 16L);
                } else {
                    this.LL.Nn(iAdTranslatableData);
                }
            } else if (messageObj instanceof IAdTranslationData) {
                IAdTranslationData iAdTranslationData = (IAdTranslationData) messageObj;
                removeMessages(1);
                if (C2187451AjH.LJ) {
                    Message messageObtain2 = Message.obtain();
                    messageObtain2.what = 1;
                    messageObtain2.obj = iAdTranslationData;
                    sendMessageDelayed(messageObtain2, 16L);
                } else {
                    this.LL.qh(iAdTranslationData);
                }
            }
        }
        C1C7U.LIZIZ("TranslationOptimizeHandler@52c9.handleMessage");
    }
}
