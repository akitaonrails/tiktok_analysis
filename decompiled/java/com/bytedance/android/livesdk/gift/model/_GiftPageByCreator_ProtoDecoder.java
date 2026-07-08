package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftPageByCreator_ProtoDecoder implements C0IMD<GiftPageByCreator> {
    public static GiftPageByCreator LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftPageByCreator giftPageByCreator = new GiftPageByCreator();
        giftPageByCreator.gifts = new ArrayList();
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
                                giftPageByCreator.display = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            giftPageByCreator.gifts.add(_GiftStructByCreator_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        giftPageByCreator.pageName = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    giftPageByCreator.pageType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftPageByCreator;
            }
        }
    }

    public static void LJ(GiftPageByCreator giftPageByCreator) {
        List<GiftStructByCreator> list = giftPageByCreator.gifts;
        if (list == null) {
            giftPageByCreator.gifts = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (GiftStructByCreator giftStructByCreator : giftPageByCreator.gifts) {
            if (giftStructByCreator != null) {
                _GiftStructByCreator_ProtoDecoder.LJ(giftStructByCreator);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftPageByCreator giftPageByCreator) {
        LJ(giftPageByCreator);
    }

    @Override // X.C0IMD
    public final GiftPageByCreator LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftPageByCreator giftPageByCreator, List list) {
    }
}
