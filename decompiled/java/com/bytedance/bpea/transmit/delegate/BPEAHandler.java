package com.bytedance.bpea.transmit.delegate;

import X.C0W9T;
import X.C0W9U;
import X.C0WP5;
import X.C762010Tup;
import X.C762020Tuq;
import X.C786410Ut5;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public class BPEAHandler extends Handler {
    public static final C762020Tuq Companion = new Object() { // from class: X.0Tuq
    };
    public boolean mAsynchronous;

    public final void makeAsynchronous() {
        this.mAsynchronous = true;
    }

    public BPEAHandler() {
    }

    public BPEAHandler(Handler.Callback callback) {
        super(callback);
    }

    private final boolean replayContextFromMessage(Message message) {
        Bundle bundlePeekData;
        if (!C0WP5.LIZ()) {
            return false;
        }
        if (message.sendingUid != -1 && (bundlePeekData = message.peekData()) != null) {
            bundlePeekData.setClassLoader(getClass().getClassLoader());
        }
        if (replayWithObject(message)) {
            return true;
        }
        return replayWithBundle(message);
    }

    private final boolean replayWithBundle(Message message) {
        C0W9T c0w9t;
        Bundle bundlePeekData = message.peekData();
        if (bundlePeekData != null && bundlePeekData.containsKey("BPEAContext")) {
            Bundle bundlePeekData2 = message.peekData();
            Serializable serializable = null;
            if (bundlePeekData2 != null) {
                serializable = bundlePeekData2.getSerializable("BPEAContext");
            }
            if ((serializable instanceof C0W9T) && (c0w9t = (C0W9T) serializable) != null) {
                return C0W9U.LJ(c0w9t);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean replayWithObject(android.os.Message r4) {
        /*
            r3 = this;
            java.lang.Object r2 = r4.obj
            boolean r0 = r2 instanceof X.C0W9T
            r1 = 0
            if (r0 == 0) goto L16
            boolean r0 = r2 instanceof X.C0W9T
            if (r0 == 0) goto L14
            X.0W9T r2 = (X.C0W9T) r2
        Ld:
            boolean r0 = X.C0W9U.LJ(r2)
            r4.obj = r1
            return r0
        L14:
            r2 = r1
            goto Ld
        L16:
            boolean r0 = r2 instanceof X.C762010Tup
            if (r0 == 0) goto L32
            boolean r0 = r2 instanceof X.C762010Tup
            if (r0 == 0) goto L2f
            X.0Tup r2 = (X.C762010Tup) r2
            if (r2 == 0) goto L30
            X.0W9T r0 = r2.LIZIZ
        L24:
            boolean r0 = X.C0W9U.LJ(r0)
            if (r2 == 0) goto L2c
            java.lang.Object r1 = r2.LIZ
        L2c:
            r4.obj = r1
            return r0
        L2f:
            r2 = r1
        L30:
            r0 = r1
            goto L24
        L32:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bpea.transmit.delegate.BPEAHandler.replayWithObject(android.os.Message):boolean");
    }

    private final void transmitBPEAContextByMsg(Message message) {
        C0W9T c0w9tLIZIZ;
        if (C0WP5.LIZ() && (c0w9tLIZIZ = C0W9U.LIZIZ()) != null) {
            if (message.obj == null) {
                setMessageObj(message, c0w9tLIZIZ);
            } else {
                C786410Ut5.LJJIZ(message.getData(), "BPEAContext", c0w9tLIZIZ);
            }
        }
    }

    @Override // android.os.Handler
    public void dispatchMessage(Message message) {
        boolean zReplayContextFromMessage = replayContextFromMessage(message);
        try {
            super.dispatchMessage(message);
            if (zReplayContextFromMessage) {
                C0W9U.LJFF();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (zReplayContextFromMessage) {
                C0W9U.LJFF();
            }
            throw th;
        }
    }

    public final boolean postAtFrontOfQueueByBPEA(Runnable runnable) {
        return sendMessageAtFrontOfQueueByBPEA(Message.obtain(this, runnable));
    }

    public final boolean sendMessageAtFrontOfQueueByBPEA(Message message) {
        if (this.mAsynchronous) {
            message.setAsynchronous(true);
        }
        transmitBPEAContextByMsg(message);
        return sendMessageAtFrontOfQueue(message);
    }

    public BPEAHandler(Looper looper) {
        super(looper);
    }

    public BPEAHandler(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }

    private final void setMessageObj(Message message, C0W9T c0w9t) {
        Object obj = message.obj;
        if (obj == null) {
            message.obj = c0w9t;
        } else {
            message.obj = new C762010Tup(obj, c0w9t);
        }
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j) {
        if (this.mAsynchronous) {
            message.setAsynchronous(true);
        }
        transmitBPEAContextByMsg(message);
        return super.sendMessageAtTime(message, j);
    }
}
