package com.bytedance.android.livesdk.viewer_picks.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftPickExtraGameTricks_ProtoDecoder implements C0IMD<GiftPickExtraGameTricks> {
    public static GiftPickExtraGameTricks LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftPickExtraGameTricks giftPickExtraGameTricks = new GiftPickExtraGameTricks();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        GiftPickExtraGameTricksExternal giftPickExtraGameTricksExternal = new GiftPickExtraGameTricksExternal();
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        while (c1516680pZS.LJI() != -1) {
                            C1516700pZU.LJ(c1516680pZS);
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        giftPickExtraGameTricks.external = giftPickExtraGameTricksExternal;
                    }
                } else {
                    giftPickExtraGameTricks.storage = _GiftPickExtraGameTricksStorage_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftPickExtraGameTricks;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftPickExtraGameTricks giftPickExtraGameTricks) {
        ControlChaosInfo controlChaosInfo;
        GiftPickExtraGameTricksStorage giftPickExtraGameTricksStorage = giftPickExtraGameTricks.storage;
        if (giftPickExtraGameTricksStorage != null && (controlChaosInfo = giftPickExtraGameTricksStorage.controlChaosInfo) != null) {
            _ControlChaosInfo_ProtoDecoder.LJ(controlChaosInfo);
        }
    }

    @Override // X.C0IMD
    public final GiftPickExtraGameTricks LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftPickExtraGameTricks giftPickExtraGameTricks, List list) {
    }
}
