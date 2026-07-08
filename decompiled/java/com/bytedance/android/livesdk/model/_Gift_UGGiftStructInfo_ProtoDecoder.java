package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.Gift;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Gift_UGGiftStructInfo_ProtoDecoder implements C0IMD<Gift.UGGiftStructInfo> {
    public static Gift.UGGiftStructInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Gift.UGGiftStructInfo uGGiftStructInfo = new Gift.UGGiftStructInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        uGGiftStructInfo.ugPointsCost = c1516680pZS.LJIIJJI();
                    }
                } else {
                    uGGiftStructInfo.isUgGift = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return uGGiftStructInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final Gift.UGGiftStructInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(Gift.UGGiftStructInfo uGGiftStructInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Gift.UGGiftStructInfo uGGiftStructInfo, List list) {
    }
}
