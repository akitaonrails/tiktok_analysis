package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftModeMetaList_ProtoDecoder implements C0IMD<GiftModeMetaList> {
    public static GiftModeMetaList LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftModeMetaList giftModeMetaList = new GiftModeMetaList();
        giftModeMetaList.giftModeMeta = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    giftModeMetaList.giftModeMeta.add(_GiftModeMeta_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftModeMetaList;
            }
        }
    }

    public static void LJ(GiftModeMetaList giftModeMetaList) {
        List<GiftModeMeta> list = giftModeMetaList.giftModeMeta;
        if (list == null) {
            giftModeMetaList.giftModeMeta = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (GiftModeMeta giftModeMeta : giftModeMetaList.giftModeMeta) {
            if (giftModeMeta != null) {
                _GiftModeMeta_ProtoDecoder.LJ(giftModeMeta);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftModeMetaList giftModeMetaList) {
        LJ(giftModeMetaList);
    }

    @Override // X.C0IMD
    public final GiftModeMetaList LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftModeMetaList giftModeMetaList, List list) {
    }
}
