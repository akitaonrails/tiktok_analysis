package com.bytedance.android.livesdk.viewer_picks.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftPickExtra_ProtoDecoder implements C0IMD<GiftPickExtra> {
    public static GiftPickExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftPickExtra giftPickExtra = new GiftPickExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        giftPickExtra.gameInteraction = _GiftPickExtraGameInteraction_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    giftPickExtra.gameTricks = _GiftPickExtraGameTricks_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftPickExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftPickExtra giftPickExtra) {
        GiftPickExtraGameTricksStorage giftPickExtraGameTricksStorage;
        ControlChaosInfo controlChaosInfo;
        GiftPickExtraGameTricks giftPickExtraGameTricks = giftPickExtra.gameTricks;
        if (giftPickExtraGameTricks != null && (giftPickExtraGameTricksStorage = giftPickExtraGameTricks.storage) != null && (controlChaosInfo = giftPickExtraGameTricksStorage.controlChaosInfo) != null) {
            _ControlChaosInfo_ProtoDecoder.LJ(controlChaosInfo);
        }
    }

    @Override // X.C0IMD
    public final GiftPickExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftPickExtra giftPickExtra, List list) {
    }
}
