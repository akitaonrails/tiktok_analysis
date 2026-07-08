package com.ss.android.ugc.aweme.net;

import X.C0X52;
import X.C1185040gwY;
import X.C1533950q1J;
import X.C2097608Jq;
import X.InterfaceC1196330hEl;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.retrofit2.client.Request;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes19.dex */
public final class LsPreloadCheckerBystander implements NetworkPartner.Bystander {
    public static final LsPreloadCheckerBystander LIZ = new LsPreloadCheckerBystander();

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
        if (c0x52 != null && c0x52.LIZJ() && !request.isResponseStreaming()) {
            T t = c0x52.LIZIZ;
            if (t instanceof InterfaceC1196330hEl) {
                InterfaceC1196330hEl interfaceC1196330hEl = (InterfaceC1196330hEl) t;
                if (C1533950q1J.LJ(interfaceC1196330hEl.getPreloadFlag())) {
                    C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                    Pair[] pairArr = new Pair[2];
                    pairArr[0] = new Pair("path", request.getPath());
                    String preloadFlag = interfaceC1196330hEl.getPreloadFlag();
                    if (preloadFlag == null) {
                        preloadFlag = "";
                    }
                    pairArr[1] = new Pair("preload_flag", preloadFlag);
                    Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                    c1185040gwY.getClass();
                    C1185040gwY.LIZIZ("ttls_rd_network_preload_data_used", mapLJIIJ, null);
                }
            }
        }
    }
}
