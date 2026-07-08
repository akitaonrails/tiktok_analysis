package com.ss.android.ugc.aweme.abretrieve;

import X.C0C64;

/* JADX INFO: loaded from: classes3.dex */
public final class AbRetrieveServiceImpl implements IAbRetrieveService {
    @Override // com.ss.android.ugc.aweme.abretrieve.IAbRetrieveService
    public final AbRetrieveTask LIZ() {
        return new AbRetrieveTask();
    }

    @Override // com.ss.android.ugc.aweme.abretrieve.IAbRetrieveService
    public final boolean isOpen() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "studio_enable_ab_retrieve_expr", true, false);
    }
}
