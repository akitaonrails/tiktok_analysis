package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LinkerWaitingListChangeContent_ProtoDecoder implements C0IMD<LinkerWaitingListChangeContent> {
    @Override // X.C0IMD
    public final LinkerWaitingListChangeContent LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LinkerWaitingListChangeContent linkerWaitingListChangeContent = new LinkerWaitingListChangeContent();
        long jLIZJ = c1516680pZS.LIZJ();
        while (c1516680pZS.LJI() != -1) {
            C1516700pZU.LJ(c1516680pZS);
        }
        c1516680pZS.LJ(jLIZJ);
        return linkerWaitingListChangeContent;
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LinkerWaitingListChangeContent linkerWaitingListChangeContent) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LinkerWaitingListChangeContent linkerWaitingListChangeContent, List list) {
    }
}
