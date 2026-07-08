package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftIMPriority_ProtoDecoder implements C0IMD<GiftIMPriority> {
    public static GiftIMPriority LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftIMPriority giftIMPriority = new GiftIMPriority();
        giftIMPriority.queueSizes = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            giftIMPriority.priority = (int) c1516680pZS.LJIIJJI();
                        }
                    } else {
                        giftIMPriority.selfQueuePriority = c1516680pZS.LJIIJJI();
                    }
                } else {
                    giftIMPriority.queueSizes.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftIMPriority;
            }
        }
    }

    public static void LJ(GiftIMPriority giftIMPriority) {
        if (giftIMPriority.queueSizes == null) {
            giftIMPriority.queueSizes = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftIMPriority giftIMPriority) {
        LJ(giftIMPriority);
    }

    @Override // X.C0IMD
    public final GiftIMPriority LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftIMPriority giftIMPriority, List list) {
    }
}
