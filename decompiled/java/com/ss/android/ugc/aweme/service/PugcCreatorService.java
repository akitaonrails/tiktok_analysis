package com.ss.android.ugc.aweme.service;

import X.C0CHQ;
import X.C0M0L;
import X.C19292410dm;
import X.C376930EqB;
import com.ss.android.ugc.aweme.api.tab.IPugcCreatorService;

/* JADX INFO: loaded from: classes23.dex */
public final class PugcCreatorService implements IPugcCreatorService {
    @Override // com.ss.android.ugc.aweme.api.tab.IPugcCreatorService
    public final boolean LIZ() {
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        boolean z = currentUser != null && currentUser.LIZLLL() == 3;
        boolean zLIZ = C0CHQ.LIZ().getAccountService().LIZ();
        C19292410dm currentUser2 = C0CHQ.LIZ().getAccountService().getCurrentUser();
        return C0M0L.LIZ() && !(z || zLIZ || (currentUser2 != null && currentUser2.LJIIIZ()) || (C376930EqB.LIZ() ^ true));
    }
}
