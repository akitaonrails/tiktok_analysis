package com.ss.ugc.android.editor.components.base;

import X.C0FDG;
import X.C1C7U;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.ss.ugc.android.editor.components.base.utils.HandlerWrapper;

/* JADX INFO: loaded from: classes6.dex */
public final class FrameInterpolator {
    public final FrameInterpolator$uiHandler$1 LIZ;
    public long LIZIZ;
    public int LIZJ;

    public final void LIZ() {
        removeMessages(100);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.ss.ugc.android.editor.components.base.FrameInterpolator$uiHandler$1] */
    public FrameInterpolator(final C0FDG c0fdg) {
        final Looper mainLooper = Looper.getMainLooper();
        this.LIZ = new HandlerWrapper(c0fdg, mainLooper) { // from class: com.ss.ugc.android.editor.components.base.FrameInterpolator$uiHandler$1
            @Override // com.ss.ugc.android.editor.components.base.utils.HandlerWrapper, android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("FrameInterpolator@d9fc.uiHandler$1");
                super.handleMessage(message);
                this.getClass();
                C1C7U.LIZIZ("FrameInterpolator@d9fc.uiHandler$1");
            }
        };
    }

    public final void LIZIZ(int i) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis - this.LIZIZ > 100) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            messageObtain.arg1 = i;
            sendMessageDelayed(messageObtain, 0L);
        } else {
            removeMessages(100);
            int i2 = this.LIZJ;
            if (i > i2) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 100;
                messageObtain2.arg1 = (i2 + i) / 2;
                sendMessageDelayed(messageObtain2, 0L);
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = 100;
                messageObtain3.arg1 = i;
                sendMessageDelayed(messageObtain3, 16L);
            }
        }
        this.LIZIZ = jUptimeMillis;
        this.LIZJ = i;
    }
}
