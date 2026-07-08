package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _WatchReasonV2_ProtoDecoder implements C0IMD<WatchReasonV2> {
    public static WatchReasonV2 LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        WatchReasonV2 watchReasonV2 = new WatchReasonV2();
        watchReasonV2.reasons = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    watchReasonV2.reasons.add(_WatchReasonV2Item_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return watchReasonV2;
            }
        }
    }

    public static void LJ(WatchReasonV2 watchReasonV2) {
        List<WatchReasonV2Item> list = watchReasonV2.reasons;
        if (list == null) {
            watchReasonV2.reasons = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (WatchReasonV2Item watchReasonV2Item : watchReasonV2.reasons) {
            if (watchReasonV2Item != null) {
                if (watchReasonV2Item.tagIds == null) {
                    watchReasonV2Item.tagIds = new ArrayList();
                }
                if (watchReasonV2Item.watchReasonIds == null) {
                    watchReasonV2Item.watchReasonIds = new ArrayList();
                }
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(WatchReasonV2 watchReasonV2) {
        LJ(watchReasonV2);
    }

    @Override // X.C0IMD
    public final WatchReasonV2 LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, WatchReasonV2 watchReasonV2, List list) {
    }
}
