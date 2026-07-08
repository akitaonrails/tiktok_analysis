package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftConfigs_ProtoDecoder implements C0IMD<GiftConfigs> {
    public static GiftConfigs LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftConfigs giftConfigs = new GiftConfigs();
        giftConfigs.configInfos = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    giftConfigs.configInfos.add(_GiftConfigInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftConfigs;
            }
        }
    }

    public static void LJ(GiftConfigs giftConfigs) {
        List<GiftConfigInfo> list = giftConfigs.configInfos;
        if (list == null) {
            giftConfigs.configInfos = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<GiftConfigInfo> it2 = giftConfigs.configInfos.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftConfigs giftConfigs) {
        LJ(giftConfigs);
    }

    @Override // X.C0IMD
    public final GiftConfigs LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftConfigs giftConfigs, List list) {
    }
}
