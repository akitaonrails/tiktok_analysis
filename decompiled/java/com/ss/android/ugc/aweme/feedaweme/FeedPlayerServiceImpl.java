package com.ss.android.ugc.aweme.feedaweme;

import X.C1565330qpv;
import X.C2188811AlT;
import X.InterfaceC1126704av;
import com.ss.android.ugc.aweme.specact.api.IFeedPlayerService;

/* JADX INFO: loaded from: classes3.dex */
public final class FeedPlayerServiceImpl implements IFeedPlayerService {
    public InterfaceC1126704av LIZ;

    @Override // com.ss.android.ugc.aweme.specact.api.IFeedPlayerService
    public final void pause() {
        InterfaceC1126704av interfaceC1126704av = this.LIZ;
        if (interfaceC1126704av != null) {
            interfaceC1126704av.LIZIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.IFeedPlayerService
    public final void resume() {
        InterfaceC1126704av interfaceC1126704av = this.LIZ;
        if (interfaceC1126704av != null) {
            interfaceC1126704av.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.api.IFeedPlayerService
    public final void LIZ(C1565330qpv c1565330qpv) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setListener, is null: ");
        if (c1565330qpv == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LIZ = c1565330qpv;
    }

    @Override // com.ss.android.ugc.aweme.specact.api.IFeedPlayerService
    public final void LIZIZ(C1565330qpv c1565330qpv) {
        if (this.LIZ == c1565330qpv) {
            this.LIZ = null;
        }
    }
}
