package com.ss.android.ugc.aweme.feed.spi;

import X.C01GW;
import X.C098200Yq;
import X.C0X52;
import X.C1499510p7l;
import X.C1508720pMc;
import X.C189200o6;
import X.C452501pT;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes24.dex */
public final class FeedNetworkPartner implements NetworkPartner.Bystander {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1508720pMc());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1499510p7l());

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LIZLLL(C0X52<?> c0x52) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJI(Request request) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJ(Request request) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner
    public final boolean enable() {
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void onException(Throwable th) {
    }

    @Override // com.bytedance.frameworks.baselib.netx.partner.NetworkPartner.Bystander
    public final void LJIIJJI(Request request, C0X52<?> c0x52, Throwable th) {
        NetworkPartner.Bystander bystander;
        try {
            if (!((Boolean) this.LIZIZ.getValue()).booleanValue()) {
                return;
            }
            for (NetworkPartner networkPartner : (List) this.LIZ.getValue()) {
                if ((networkPartner instanceof NetworkPartner.Bystander) && (bystander = (NetworkPartner.Bystander) networkPartner) != null) {
                    bystander.LJIIJJI(request, c0x52, th);
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }
}
