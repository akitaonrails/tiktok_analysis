package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftModeList_ProtoDecoder implements C0IMD<GiftModeList> {
    public static GiftModeList LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftModeList giftModeList = new GiftModeList();
        giftModeList.giftMode = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    giftModeList.giftMode.add(_GiftMode_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftModeList;
            }
        }
    }

    public static void LJ(GiftModeList giftModeList) {
        List<GiftMode> list = giftModeList.giftMode;
        if (list == null) {
            giftModeList.giftMode = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (GiftMode giftMode : giftModeList.giftMode) {
            if (giftMode != null) {
                _GiftMode_ProtoDecoder.LJ(giftMode);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftModeList giftModeList) {
        LJ(giftModeList);
    }

    @Override // X.C0IMD
    public final GiftModeList LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftModeList giftModeList, List list) {
    }
}
