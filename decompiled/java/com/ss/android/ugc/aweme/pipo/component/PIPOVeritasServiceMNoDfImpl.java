package com.ss.android.ugc.aweme.pipo.component;

import X.C0KY9;
import X.C0KYE;
import X.C14WP;
import X.C1543490qGh;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pipo.veritas.IPIPOVeritasServiceNoDf;
import defpackage.g5;

/* JADX INFO: loaded from: classes3.dex */
public final class PIPOVeritasServiceMNoDfImpl implements IPIPOVeritasServiceNoDf {
    public volatile boolean LIZ;

    @Override // com.ss.android.ugc.aweme.pipo.veritas.IPIPOVeritasServiceNoDf
    public final void LIZ() {
        if (this.LIZ) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.LIZ) {
                    C1543490qGh.LIZIZ(C0KY9.class, null, 6);
                    C1543490qGh.LIZIZ(C0KYE.class, null, 6);
                    C1543490qGh.LIZIZ(C14WP.class, null, 6);
                    C1543490qGh.LIZIZ(g5.class, null, 6);
                    this.LIZ = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
