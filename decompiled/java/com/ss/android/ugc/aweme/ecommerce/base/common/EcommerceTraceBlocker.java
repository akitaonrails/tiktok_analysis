package com.ss.android.ugc.aweme.ecommerce.base.common;

import X.AnonymousClass0317;
import X.C034S;
import X.C0X52;
import X.C0XLG;
import X.C0XLO;
import X.C0XM9;
import X.C1120604Zw;
import X.C13LP;
import X.C1499330p7T;
import X.C1AQS;
import X.C718040SEo;
import android.os.SystemClock;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.apm.ApmDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public final class EcommerceTraceBlocker implements NetworkPartner.Blocker {
    public final Set<String> LIZ;
    public final Set<String> LIZIZ;

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Blocker
    public final C0X52<?> LJFF(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final String LJII() {
        return C718040SEo.LIZ(this);
    }

    public EcommerceTraceBlocker(List<String> list, List<String> list2) {
        this.LIZ = C13LP.LLIIJI(list);
        this.LIZIZ = C13LP.LLIIJI(list2);
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Blocker
    public final C0X52<?> LIZJ(C0XM9 c0xm9, C1499330p7T c1499330p7T) {
        boolean z;
        AnonymousClass0317 anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin;
        boolean z2;
        String name;
        C0XLO c0xlo = c0xm9.LIZJ;
        String str = c0xlo.LIZLLL;
        String strLIZ = c0xlo.LJFF.LIZ();
        if (((!this.LIZ.isEmpty()) && !this.LIZ.contains(str)) || !(!this.LIZIZ.isEmpty()) || !this.LIZIZ.contains(strLIZ)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            try {
                C0XLG c0xlg = c0xm9.LIZLLL;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin = ApmDependencyService.createIApmDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String name2 = IApmDependencyService.class.getName();
                    if (anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApmDependencyService.class);
                }
                c0xlg.LIZ("x-traceparent", ((IApmDependencyService) anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin).newNetworkTraceparent());
                return null;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }
}
