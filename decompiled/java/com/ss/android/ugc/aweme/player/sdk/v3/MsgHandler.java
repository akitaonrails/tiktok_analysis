package com.ss.android.ugc.aweme.player.sdk.v3;

import X.C0C2W;
import X.C1C7U;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: loaded from: classes5.dex */
public class MsgHandler extends BPEAHandler {
    public MsgHandler(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("MsgHandler@30a8.handleMessage");
        ((C0C2W) HandlerHook.getMessageObj(message.obj)).LIZ.run();
        C1C7U.LIZIZ("MsgHandler@30a8.handleMessage");
    }
}
