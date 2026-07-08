package com.google.android.gms.internal.base;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: loaded from: classes14.dex */
public class zaq extends BPEAHandler {
    public zaq(Looper looper) {
        super(looper);
    }

    public zaq(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }
}
