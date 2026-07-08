package com.bytedance.common.utility.collection;

import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public class WeakHandler extends BPEAHandler {
    public WeakReference<IHandler> mRef;

    public interface IHandler {
        void handleMsg(Message message);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WeakHandler(IHandler iHandler) {
        Looper looperMyLooper;
        if (Looper.myLooper() == null) {
            looperMyLooper = Looper.getMainLooper();
        } else {
            looperMyLooper = Looper.myLooper();
        }
        this(looperMyLooper, iHandler);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        IHandler iHandler = this.mRef.get();
        if (iHandler != null && message != null) {
            iHandler.handleMsg(message);
        }
    }

    public WeakHandler(Looper looper, IHandler iHandler) {
        super(looper);
        this.mRef = new WeakReference<>(iHandler);
    }
}
