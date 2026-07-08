package com.ss.android.ugc.aweme.im.saas.host.impl.homepage;

import X.C0ZJF;
import X.C0ZJK;
import X.C0ZJL;
import X.C1058550deX;
import X.C19EG;
import X.C343710Ddh;
import X.InterfaceC1586360rNq;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.saas.host.api.homepage.IMSaasTabApi;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class IMSaasTabService implements IMSaasTabApi {
    public final ConcurrentHashMap<C0ZJK, C0ZJL> LIZIZ = new ConcurrentHashMap<>();

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.homepage.IMSaasTabApi
    public final boolean LIZJ(C19EG c19eg) {
        return C1058550deX.LIZIZ(c19eg, "NOTIFICATION");
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.homepage.IMSaasTabApi
    public final void LIZ(C19EG c19eg, C0ZJF c0zjf) {
        synchronized (this) {
            try {
                C0ZJL c0zjlRemove = this.LIZIZ.remove(c0zjf);
                if (c0zjlRemove != null) {
                    C343710Ddh.LIZ(c19eg).HQ2(c0zjlRemove);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.homepage.IMSaasTabApi
    public final void LIZIZ(C19EG c19eg, final C0ZJF c0zjf) {
        if (!this.LIZIZ.contains(c0zjf)) {
            InterfaceC1586360rNq interfaceC1586360rNq = new InterfaceC1586360rNq(c0zjf) { // from class: X.0ZJL
                public final C0ZJK LL;

                {
                    this.LL = c0zjf;
                }

                @Override // X.InterfaceC1586360rNq
                public final void LLLZLZ(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
                    this.LL.LJJIIJ(Intrinsics.LJFF(str, "NOTIFICATION"));
                }
            };
            this.LIZIZ.put(c0zjf, (C0ZJL) interfaceC1586360rNq);
            C343710Ddh.LIZ(c19eg).wQ2(interfaceC1586360rNq);
        }
    }
}
