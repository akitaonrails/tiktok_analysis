package com.ss.android.ugc.aweme.ecommerce.base.common;

import X.C080S;
import X.C0X52;
import X.C0XLQ;
import X.C1515820pY4;
import com.bytedance.frameworks.baselib.netx.partner.NetworkPartner;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.ecommerce.ab.EcMobSpliceCheckNetworkInterceptConfigV2;

/* JADX INFO: loaded from: classes4.dex */
public final class EcommerceMobSpliceNetworkPartner implements NetworkPartner.Bystander {
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
        String strLJFF;
        T t;
        C0XLQ c0xlqLJIIL = C0XLQ.LJIIL(request.getUrl());
        if (c0xlqLJIIL != null) {
            strLJFF = c0xlqLJIIL.LJFF();
        } else {
            strLJFF = null;
        }
        EcMobSpliceCheckNetworkInterceptConfigV2.InterceptConfig interceptConfigLIZ = EcMobSpliceCheckNetworkInterceptConfigV2.LIZ(strLJFF);
        if (interceptConfigLIZ != null && c0x52 != null && (t = c0x52.LIZIZ) != 0 && c0x52.LIZJ() && !(t instanceof C1515820pY4) && !request.isResponseStreaming()) {
            C080S.LIZ(interceptConfigLIZ, request, t);
        }
    }
}
