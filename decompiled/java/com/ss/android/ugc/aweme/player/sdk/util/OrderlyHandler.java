package com.ss.android.ugc.aweme.player.sdk.util;

import X.C1474810oTv;
import Y.ARunnableS123S0100000_23;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class OrderlyHandler extends BPEAHandler {
    public static final /* synthetic */ int LLILZ = 0;
    public final Object LL;
    public final List<Runnable> LLILLJJLI;
    public final ARunnableS123S0100000_23 LLILLL;

    public OrderlyHandler(Looper looper) {
        super(looper);
        this.LL = new Object();
        this.LLILLJJLI = new ArrayList();
        this.LLILLL = new ARunnableS123S0100000_23(this, 34);
    }

    public final void LJ(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        synchronized (this.LL) {
            try {
                ((ArrayList) this.LLILLJJLI).add(runnable);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Message messageObtain = Message.obtain(this, this.LLILLL);
        if (((Boolean) C1474810oTv.LLLZZ.getValue()).booleanValue()) {
            messageObtain.setAsynchronous(true);
        }
        sendMessageAtFrontOfQueue(messageObtain);
    }
}
