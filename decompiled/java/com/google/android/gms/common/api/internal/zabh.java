package com.google.android.gms.common.api.internal;

import X.AbstractC832250Wkp;
import X.C1C7U;
import X.C831840WkA;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.internal.base.zaq;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes14.dex */
public final class zabh extends zaq {
    public final /* synthetic */ C831840WkA LL;

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        Lock lock;
        C1C7U.LIZ("zabh@ed2.handleMessage");
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                C1C7U.LIZIZ("zabh@ed2.handleMessage");
                return;
            }
            throw ((Throwable) HandlerHook.getMessageObj(message.obj));
        }
        AbstractC832250Wkp abstractC832250Wkp = (AbstractC832250Wkp) HandlerHook.getMessageObj(message.obj);
        C831840WkA c831840WkA = this.LL;
        abstractC832250Wkp.getClass();
        c831840WkA.LL.lock();
        try {
            if (c831840WkA.LLJIJIL == abstractC832250Wkp.LIZ) {
                abstractC832250Wkp.LIZ();
                lock = c831840WkA.LL;
            } else {
                lock = c831840WkA.LL;
            }
            lock.unlock();
            C1C7U.LIZIZ("zabh@ed2.handleMessage");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c831840WkA.LL.unlock();
            throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zabh(C831840WkA c831840WkA, Looper looper) {
        super(looper);
        this.LL = c831840WkA;
    }
}
