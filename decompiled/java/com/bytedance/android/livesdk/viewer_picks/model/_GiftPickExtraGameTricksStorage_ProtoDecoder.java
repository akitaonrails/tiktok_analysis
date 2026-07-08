package com.bytedance.android.livesdk.viewer_picks.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftPickExtraGameTricksStorage_ProtoDecoder implements C0IMD<GiftPickExtraGameTricksStorage> {
    public static GiftPickExtraGameTricksStorage LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftPickExtraGameTricksStorage giftPickExtraGameTricksStorage = new GiftPickExtraGameTricksStorage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        giftPickExtraGameTricksStorage.controlChaosInfo = _ControlChaosInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    giftPickExtraGameTricksStorage.gameTricksType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftPickExtraGameTricksStorage;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftPickExtraGameTricksStorage giftPickExtraGameTricksStorage) {
        ControlChaosInfo controlChaosInfo = giftPickExtraGameTricksStorage.controlChaosInfo;
        if (controlChaosInfo != null) {
            _ControlChaosInfo_ProtoDecoder.LJ(controlChaosInfo);
        }
    }

    @Override // X.C0IMD
    public final GiftPickExtraGameTricksStorage LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftPickExtraGameTricksStorage giftPickExtraGameTricksStorage, List list) {
    }
}
