package com.ss.ugc.android.editor.components.base.utils;

import X.C0FDG;
import X.C1C7U;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: loaded from: classes6.dex */
public class HandlerWrapper extends BPEAHandler {
    public final C0FDG LL;

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        C1C7U.LIZ("HandlerWrapper@e45d.handleMessage");
        C0FDG c0fdg = this.LL;
        if (c0fdg != null && message != null) {
            c0fdg.handleMsg(message);
        }
        C1C7U.LIZIZ("HandlerWrapper@e45d.handleMessage");
    }

    public HandlerWrapper(Looper looper, C0FDG c0fdg) {
        super(looper);
        this.LL = c0fdg;
    }
}
