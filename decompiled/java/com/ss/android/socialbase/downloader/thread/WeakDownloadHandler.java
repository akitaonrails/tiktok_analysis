package com.ss.android.socialbase.downloader.thread;

import X.C0T95;
import X.C1C7U;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class WeakDownloadHandler extends BPEAHandler {
    public final WeakReference<C0T95> LL;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("WeakDownloadHandler@d6a2.handleMessage");
        C0T95 c0t95 = this.LL.get();
        if (c0t95 != null && message != null) {
            c0t95.handleMsg(message);
        }
        C1C7U.LIZIZ("WeakDownloadHandler@d6a2.handleMessage");
    }

    public WeakDownloadHandler(Looper looper, C0T95 c0t95) {
        super(looper);
        this.LL = new WeakReference<>(c0t95);
    }
}
