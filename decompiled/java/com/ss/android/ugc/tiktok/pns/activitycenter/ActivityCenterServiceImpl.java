package com.ss.android.ugc.tiktok.pns.activitycenter;

import X.AbstractC1216410hl9;
import X.AbstractC1255880imo;
import X.C1255920ims;
import X.C1617600sCE;
import X.C1617610sCF;
import X.C1884220z8G;
import X.C2189821An6;
import X.InterfaceC1603360rpG;
import com.ss.android.ugc.tiktok.pns.activitycenter.api.IActivityCenterService;
import com.ss.android.ugc.tiktok.pns.activitycenter.watchhistory.WatchHistoryInterceptor;

/* JADX INFO: loaded from: classes25.dex */
public final class ActivityCenterServiceImpl implements IActivityCenterService {
    @Override // com.ss.android.ugc.tiktok.pns.activitycenter.api.IActivityCenterService
    public final void LIZ() {
    }

    @Override // com.ss.android.ugc.tiktok.pns.activitycenter.api.IActivityCenterService
    public final void LJFF() {
    }

    @Override // com.ss.android.ugc.tiktok.pns.activitycenter.api.IActivityCenterService
    public final WatchHistoryInterceptor LIZIZ() {
        return new WatchHistoryInterceptor();
    }

    @Override // com.ss.android.ugc.tiktok.pns.activitycenter.api.IActivityCenterService
    public final boolean LJ(InterfaceC1603360rpG interfaceC1603360rpG) {
        return interfaceC1603360rpG instanceof C1617610sCF;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0sCF] */
    @Override // com.ss.android.ugc.tiktok.pns.activitycenter.api.IActivityCenterService
    public final C1617610sCF LIZJ(Object obj, Object obj2) {
        final AbstractC1255880imo abstractC1255880imo;
        final C2189821An6 c2189821An6 = null;
        if (obj instanceof AbstractC1255880imo) {
            abstractC1255880imo = (AbstractC1255880imo) obj;
        } else {
            abstractC1255880imo = null;
        }
        if (obj2 instanceof C2189821An6) {
            c2189821An6 = (C2189821An6) obj2;
        }
        return new AbstractC1216410hl9<C1884220z8G, C1255920ims<C1884220z8G>>(abstractC1255880imo, c2189821An6) { // from class: X.0sCF
            public final AbstractC1255880imo<?, ?> LL;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[PHI: r5
              0x0028: PHI (r5v2 X.0imo<?, ?>) = (r5v1 X.0imo<?, ?>), (r5v0 X.0imo<?, ?>) binds: [B:9:0x0026, B:4:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Type inference failed for: r0v5, types: [PRESENTER extends X.0ims<MODEL>, X.0ims] */
            {
                /*
                    r4 = this;
                    r4.<init>()
                    r4.LL = r5
                    boolean r0 = r5 instanceof X.C1884220z8G
                    r3 = 0
                    if (r0 == 0) goto Lc
                    if (r5 != 0) goto L28
                Lc:
                    if (r6 == 0) goto L29
                    java.lang.String r2 = r6.getReactSessionId()
                    if (r2 == 0) goto L29
                    com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                    java.lang.Class<com.ss.android.ugc.tiktok.pns.jsbridgekit.biz.interfaces.IACFeedsService> r0 = com.ss.android.ugc.tiktok.pns.jsbridgekit.biz.interfaces.IACFeedsService.class
                    java.lang.Object r0 = r1.getService(r0)
                    com.ss.android.ugc.tiktok.pns.jsbridgekit.biz.interfaces.IACFeedsService r0 = (com.ss.android.ugc.tiktok.pns.jsbridgekit.biz.interfaces.IACFeedsService) r0
                    X.0z8G r5 = r0.LIZLLL(r2)
                    boolean r0 = r5 instanceof X.C1884220z8G
                    if (r0 == 0) goto L29
                L28:
                    r3 = r5
                L29:
                    r4.mModel = r3
                    X.0ims r0 = new X.0ims
                    r0.<init>()
                    r4.mPresenter = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1617610sCF.<init>(X.0imo, X.1An6):void");
            }

            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final void request(int i, C2189821An6 c2189821An62, int i2, boolean z) {
                this.mPresenter.LIZJ(Integer.valueOf(i));
            }
        };
    }

    @Override // com.ss.android.ugc.tiktok.pns.activitycenter.api.IActivityCenterService
    public final C1617600sCE LIZLLL(Object obj, Object obj2) {
        return new C1617600sCE(obj, obj2);
    }
}
