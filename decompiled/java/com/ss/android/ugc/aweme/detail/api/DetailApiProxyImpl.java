package com.ss.android.ugc.aweme.detail.api;

import X.C04TD;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: loaded from: classes3.dex */
public final class DetailApiProxyImpl implements DetailApiProxy {
    public static DetailApiProxy LIZIZ() {
        Object objLIZ = C04TD.LIZ(DetailApiProxy.class, false);
        if (objLIZ != null) {
            return (DetailApiProxy) objLIZ;
        }
        if (C04TD.LLLLZI == null) {
            synchronized (DetailApiProxy.class) {
                if (C04TD.LLLLZI == null) {
                    C04TD.LLLLZI = new DetailApiProxyImpl();
                }
            }
        }
        return C04TD.LLLLZI;
    }

    @Override // com.ss.android.ugc.aweme.detail.api.DetailApiProxy
    public final Aweme LIZ(String str) {
        return DetailApi.LIZ(0, 0, str, "");
    }
}
