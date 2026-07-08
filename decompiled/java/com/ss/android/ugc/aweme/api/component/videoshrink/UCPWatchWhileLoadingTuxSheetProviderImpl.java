package com.ss.android.ugc.aweme.api.component.videoshrink;

import X.C0DHB;
import X.C0DHC;
import X.C1954807lC;
import X.C335830DEn;
import X.InterfaceC335820DEm;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ucp.api.callback.IUCPWatchWhileLoadingTuxSheetProvider;

/* JADX INFO: loaded from: classes5.dex */
public final class UCPWatchWhileLoadingTuxSheetProviderImpl implements IUCPWatchWhileLoadingTuxSheetProvider {
    public volatile UcpShopVideoShrinkAssem LIZ;
    public final Object LIZIZ = new Object();
    public volatile C0DHB LIZJ;

    public final UcpShopVideoShrinkAssem LIZJ() {
        UcpShopVideoShrinkAssem ucpShopVideoShrinkAssem = this.LIZ;
        if (ucpShopVideoShrinkAssem != null) {
            return ucpShopVideoShrinkAssem;
        }
        synchronized (this.LIZIZ) {
            try {
                UcpShopVideoShrinkAssem ucpShopVideoShrinkAssem2 = this.LIZ;
                if (ucpShopVideoShrinkAssem2 != null) {
                    return ucpShopVideoShrinkAssem2;
                }
                UcpShopVideoShrinkAssem ucpShopVideoShrinkAssem3 = new UcpShopVideoShrinkAssem();
                this.LIZ = ucpShopVideoShrinkAssem3;
                return ucpShopVideoShrinkAssem3;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ucp.api.callback.IUCPWatchWhileLoadingTuxSheetProvider
    public final void LIZ(C0DHB c0dhb) {
        synchronized (this.LIZIZ) {
            try {
                if (this.LIZJ != c0dhb) {
                    return;
                }
                if (C335830DEn.LIZ == null) {
                    this.LIZJ = null;
                } else {
                    C335830DEn.LIZ = null;
                    this.LIZJ = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ucp.api.callback.IUCPWatchWhileLoadingTuxSheetProvider
    public final void LIZIZ(C0DHB c0dhb, InterfaceC335820DEm interfaceC335820DEm) {
        synchronized (this.LIZIZ) {
            try {
                int i = C0DHC.LIZ[c0dhb.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        if (this.LIZJ == C0DHB.IN_FLOW) {
                            return;
                        }
                        if (interfaceC335820DEm == null) {
                            interfaceC335820DEm = LIZJ();
                        }
                        C335830DEn.LIZ = interfaceC335820DEm;
                        this.LIZJ = C0DHB.OUT_FLOW;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    if (interfaceC335820DEm == null) {
                        return;
                    }
                    C335830DEn.LIZ = interfaceC335820DEm;
                    this.LIZJ = C0DHB.IN_FLOW;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
