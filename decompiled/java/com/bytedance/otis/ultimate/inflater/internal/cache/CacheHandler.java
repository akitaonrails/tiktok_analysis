package com.bytedance.otis.ultimate.inflater.internal.cache;

import X.C1C7U;
import X.C21145717p1;
import X.InterfaceC21147317pH;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: loaded from: classes33.dex */
public final class CacheHandler extends BPEAHandler {
    public final InterfaceC21147317pH LL;

    public CacheHandler(C21145717p1 c21145717p1) {
        super(Looper.getMainLooper());
        this.LL = c21145717p1;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("CacheHandler@5906.handleMessage");
        super.handleMessage(message);
        Object messageObj = HandlerHook.getMessageObj(message.obj);
        if (!(messageObj instanceof String)) {
            messageObj = null;
        }
        String str = (String) messageObj;
        if (str != null) {
            int i = message.arg1;
            int i2 = message.what;
            if (i2 != 1) {
                if (i2 == 2) {
                    this.LL.LIZIZ(i, str);
                }
            } else {
                this.LL.LIZJ(i, str);
            }
            C1C7U.LIZIZ("CacheHandler@5906.handleMessage");
            return;
        }
        C1C7U.LIZIZ("CacheHandler@5906.handleMessage");
    }
}
