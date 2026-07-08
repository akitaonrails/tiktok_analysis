package com.bytedance.vmsdk.jsbridge.utils;

import X.C1C7U;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: loaded from: classes4.dex */
public class SystemMessageHandler extends BPEAHandler {
    public final long LL;
    public boolean LLILLJJLI = true;

    private native void nativeRunWork(long j);

    private void stop() {
        this.LLILLJJLI = false;
    }

    private void scheduleWork() {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.setAsynchronous(true);
        sendMessage(messageObtain);
    }

    public SystemMessageHandler(long j) {
        this.LL = j;
    }

    public static SystemMessageHandler create(long j) {
        return new SystemMessageHandler(j);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("SystemMessageHandler@9524.handleMessage");
        if (this.LLILLJJLI) {
            nativeRunWork(this.LL);
        }
        C1C7U.LIZIZ("SystemMessageHandler@9524.handleMessage");
    }
}
