package com.ss.android.ugc.tiktok.pns.activitycenter.watchhistory.feeds;

import X.C1876590yvx;
import X.C1876640yw2;
import X.C1879590z0n;
import X.C1884130z87;
import X.C1884140z88;
import X.C23250099c;
import X.InterfaceC1876610yvz;
import X.InterfaceC1876740ywC;
import android.app.Activity;
import com.ss.android.ugc.tiktok.pns.jsbridgekit.biz.interfaces.IWHFeedsService;

/* JADX INFO: loaded from: classes29.dex */
public final class WHFeedsServiceImpl implements IWHFeedsService {
    @Override // com.ss.android.ugc.tiktok.pns.jsbridgekit.biz.interfaces.IWHFeedsService
    public final void LJII(InterfaceC1876610yvz interfaceC1876610yvz, C1876590yvx c1876590yvx) {
        C1884140z88.LIZ(interfaceC1876610yvz.getReactId()).LJIILLIIL(interfaceC1876610yvz.getAwemeList(), interfaceC1876610yvz.getPreCursor(), interfaceC1876610yvz.getNextCursor(), interfaceC1876610yvz.getLoadBehavior(), c1876590yvx);
    }

    @Override // com.ss.android.ugc.tiktok.pns.jsbridgekit.biz.interfaces.IWHFeedsService
    public final void LJIIL(Activity activity, InterfaceC1876740ywC interfaceC1876740ywC, C1876640yw2 c1876640yw2) {
        C1884130z87 c1884130z87LIZ = C1884140z88.LIZ(interfaceC1876740ywC.getReactId());
        C23250099c.LIZLLL(c1884130z87LIZ, null, null, new C1879590z0n(c1884130z87LIZ, c1876640yw2, interfaceC1876740ywC, activity, null), 3);
    }
}
