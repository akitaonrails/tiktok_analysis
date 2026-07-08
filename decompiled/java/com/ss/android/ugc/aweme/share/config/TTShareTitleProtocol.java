package com.ss.android.ugc.aweme.share.config;

import X.C1371600lnS;
import com.ss.android.ugc.aweme.share.core.protocol.ShareTitleProtocol;

/* JADX INFO: loaded from: classes22.dex */
public class TTShareTitleProtocol implements ShareTitleProtocol {
    @Override // com.ss.android.ugc.aweme.share.core.protocol.ShareTitleProtocol
    public int getShareTitle() {
        return 0;
    }

    @Override // X.InterfaceC1372360log
    public final void tu(C1371600lnS c1371600lnS) {
        c1371600lnS.LJJI = getShareTitle();
        c1371600lnS.LJJJI = false;
    }
}
