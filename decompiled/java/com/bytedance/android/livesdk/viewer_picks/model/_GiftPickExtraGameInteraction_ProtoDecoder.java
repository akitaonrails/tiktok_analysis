package com.bytedance.android.livesdk.viewer_picks.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftPickExtraGameInteraction_ProtoDecoder implements C0IMD<GiftPickExtraGameInteraction> {
    public static GiftPickExtraGameInteraction LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftPickExtraGameInteraction giftPickExtraGameInteraction = new GiftPickExtraGameInteraction();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        GiftPickExtraGameInteractionExternal giftPickExtraGameInteractionExternal = new GiftPickExtraGameInteractionExternal();
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        while (c1516680pZS.LJI() != -1) {
                            C1516700pZU.LJ(c1516680pZS);
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        giftPickExtraGameInteraction.external = giftPickExtraGameInteractionExternal;
                    }
                } else {
                    giftPickExtraGameInteraction.storage = _GiftPickExtraGameInteractionStorage_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftPickExtraGameInteraction;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftPickExtraGameInteraction giftPickExtraGameInteraction) {
    }

    @Override // X.C0IMD
    public final GiftPickExtraGameInteraction LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftPickExtraGameInteraction giftPickExtraGameInteraction, List list) {
    }
}
