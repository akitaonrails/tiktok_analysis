package com.bytedance.ies.ugc.aweme.network.interceptor;

import X.C080U;
import X.C0X52;
import X.C0XMB;
import X.C1494590ozp;
import X.C1908207dg;
import X.InterfaceC1904907d9;
import X.InterfaceC841770X0l;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class PnSIsolationZoneInterceptor implements InterfaceC1904907d9 {
    public final int LL;
    public final boolean LLILLJJLI;

    @Override // X.InterfaceC1904907d9
    public final C0X52<?> intercept(InterfaceC841770X0l interfaceC841770X0l) {
        C1494590ozp c1494590ozp = (C1494590ozp) interfaceC841770X0l;
        Request request = c1494590ozp.LIZJ;
        ArrayList arrayList = new ArrayList(request.getHeaders());
        arrayList.add(new C080U("x-metasec-network-zone", String.valueOf(this.LL)));
        if (this.LL == 0) {
            C0XMB c0xmbNewBuilder = request.newBuilder();
            c0xmbNewBuilder.LIZJ = arrayList;
            return c1494590ozp.LIZ(c0xmbNewBuilder.LIZ());
        }
        PnsZoneConfig pnsZoneConfig = (PnsZoneConfig) C1908207dg.LIZIZ.getValue();
        if (pnsZoneConfig == null) {
            pnsZoneConfig = C1908207dg.LIZ;
        }
        if (pnsZoneConfig.enableTTNetParams) {
            arrayList.add(new C080U("x-metasec-bypass-ttnet-features", "1"));
            if (this.LL == 1) {
                arrayList.add(new C080U("x-tt-bypass-dp", "1"));
            }
            if (this.LLILLJJLI) {
                arrayList.add(new C080U("x-ttnet-bypass-cookie", CardStruct.IStatusCode.DEFAULT));
            }
        }
        C0XMB c0xmbNewBuilder2 = request.newBuilder();
        c0xmbNewBuilder2.LIZJ = arrayList;
        return c1494590ozp.LIZ(c0xmbNewBuilder2.LIZ());
    }

    public PnSIsolationZoneInterceptor(int i, boolean z) {
        this.LL = i;
        this.LLILLJJLI = z;
    }
}
