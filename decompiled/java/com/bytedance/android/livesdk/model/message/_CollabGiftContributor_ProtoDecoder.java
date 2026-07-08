package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CollabGiftContributor_ProtoDecoder implements C0IMD<CollabGiftContributor> {
    public static CollabGiftContributor LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CollabGiftContributor collabGiftContributor = new CollabGiftContributor();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        collabGiftContributor.avatarUrl = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    collabGiftContributor.nickname = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return collabGiftContributor;
            }
        }
    }

    @Override // X.C0IMD
    public final CollabGiftContributor LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CollabGiftContributor collabGiftContributor) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CollabGiftContributor collabGiftContributor, List list) {
    }
}
