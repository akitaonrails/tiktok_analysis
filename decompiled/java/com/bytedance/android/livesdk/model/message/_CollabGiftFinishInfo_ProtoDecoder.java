package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CollabGiftFinishInfo_ProtoDecoder implements C0IMD<CollabGiftFinishInfo> {
    public static CollabGiftFinishInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CollabGiftFinishInfo collabGiftFinishInfo = new CollabGiftFinishInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    collabGiftFinishInfo.finishReason = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return collabGiftFinishInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final CollabGiftFinishInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CollabGiftFinishInfo collabGiftFinishInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CollabGiftFinishInfo collabGiftFinishInfo, List list) {
    }
}
