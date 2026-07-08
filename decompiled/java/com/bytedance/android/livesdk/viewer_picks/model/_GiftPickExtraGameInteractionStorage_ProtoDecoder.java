package com.bytedance.android.livesdk.viewer_picks.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftPickExtraGameInteractionStorage_ProtoDecoder implements C0IMD<GiftPickExtraGameInteractionStorage> {
    public static GiftPickExtraGameInteractionStorage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftPickExtraGameInteractionStorage giftPickExtraGameInteractionStorage = new GiftPickExtraGameInteractionStorage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        giftPickExtraGameInteractionStorage.instructionDescKey = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    giftPickExtraGameInteractionStorage.instruction = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftPickExtraGameInteractionStorage;
            }
        }
    }

    @Override // X.C0IMD
    public final GiftPickExtraGameInteractionStorage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GiftPickExtraGameInteractionStorage giftPickExtraGameInteractionStorage) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftPickExtraGameInteractionStorage giftPickExtraGameInteractionStorage, List list) {
    }
}
