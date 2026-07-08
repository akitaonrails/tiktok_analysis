package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftSuspension_ProtoDecoder implements C0IMD<GiftSuspension> {
    public static GiftSuspension LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftSuspension giftSuspension = new GiftSuspension();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                giftSuspension.endTimeV2 = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            giftSuspension.endTime = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        giftSuspension.toast = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    giftSuspension.status = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftSuspension;
            }
        }
    }

    @Override // X.C0IMD
    public final GiftSuspension LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GiftSuspension giftSuspension) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftSuspension giftSuspension, List list) {
    }
}
