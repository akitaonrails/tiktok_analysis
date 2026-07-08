package com.ss.android.ugc.aweme.ecommerce.dependency.transaction.pdp;

import X.C0N0Y;
import X.C1012040cRW;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.transaction.ISeaPdpDependencyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.IFeedSharePlayInfoHelperProvider;

/* JADX INFO: loaded from: classes17.dex */
public final class SeaPdpDependencyService implements ISeaPdpDependencyService {
    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.transaction.ISeaPdpDependencyService
    public void setPlayerManager(C0N0Y c0n0y) {
        C1012040cRW c1012040cRWLIZ;
        IFeedSharePlayInfoHelperProvider iFeedSharePlayInfoHelperProvider = (IFeedSharePlayInfoHelperProvider) PluggableExtentionKt.pluggableSpi$default(IFeedSharePlayInfoHelperProvider.class, false, false, false, 14, null);
        if (iFeedSharePlayInfoHelperProvider != null && (c1012040cRWLIZ = iFeedSharePlayInfoHelperProvider.LIZ()) != null) {
            c1012040cRWLIZ.LIZ = c0n0y;
        }
    }
}
