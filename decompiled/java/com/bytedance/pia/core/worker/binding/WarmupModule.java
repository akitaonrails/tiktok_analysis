package com.bytedance.pia.core.worker.binding;

import X.C1BP7;
import X.InterfaceC1522160piI;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vmsdk.jsbridge.JSModule;

/* JADX INFO: loaded from: classes35.dex */
public class WarmupModule extends JSModule {
    public final C1BP7 worker;

    @InterfaceC1522160piI
    public void finishWarmup() {
        C1BP7 c1bp7 = this.worker;
        synchronized (c1bp7) {
            try {
                c1bp7.LJII = System.currentTimeMillis();
                c1bp7.LIZLLL = true;
                if (c1bp7.LJ != null) {
                    c1bp7.LJ.run();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public WarmupModule(Context context, Object obj) {
        super(context, obj);
        this.worker = (C1BP7) obj;
    }
}
