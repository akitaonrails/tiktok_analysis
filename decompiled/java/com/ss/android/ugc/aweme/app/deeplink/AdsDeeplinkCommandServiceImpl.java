package com.ss.android.ugc.aweme.app.deeplink;

import X.AbstractC2420009e2;
import X.C1400130mXT;
import X.C1400190mXZ;
import com.ss.android.ugc.aweme.deeplink.IAdsDeeplinkCommandService;

/* JADX INFO: loaded from: classes22.dex */
public final class AdsDeeplinkCommandServiceImpl implements IAdsDeeplinkCommandService {
    @Override // com.ss.android.ugc.aweme.deeplink.IAdsDeeplinkCommandService
    public final boolean LIZ(AbstractC2420009e2 abstractC2420009e2) {
        if (!C1400190mXZ.class.isInstance(abstractC2420009e2) && !C1400130mXT.class.isInstance(abstractC2420009e2)) {
            return false;
        }
        return true;
    }
}
