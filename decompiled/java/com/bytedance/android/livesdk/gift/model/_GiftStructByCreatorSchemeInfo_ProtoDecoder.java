package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftStructByCreatorSchemeInfo_ProtoDecoder implements C0IMD<GiftStructByCreatorSchemeInfo> {
    public static GiftStructByCreatorSchemeInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftStructByCreatorSchemeInfo giftStructByCreatorSchemeInfo = new GiftStructByCreatorSchemeInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        giftStructByCreatorSchemeInfo.schemeDescribe = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    giftStructByCreatorSchemeInfo.schemeUrl = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftStructByCreatorSchemeInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final GiftStructByCreatorSchemeInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GiftStructByCreatorSchemeInfo giftStructByCreatorSchemeInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftStructByCreatorSchemeInfo giftStructByCreatorSchemeInfo, List list) {
    }
}
