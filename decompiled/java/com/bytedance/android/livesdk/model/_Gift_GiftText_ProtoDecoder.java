package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.Gift;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Gift_GiftText_ProtoDecoder implements C0IMD<Gift.GiftText> {
    public static Gift.GiftText LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Gift.GiftText giftText = new Gift.GiftText();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        giftText.giftTextName = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    giftText.giftTextId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftText;
            }
        }
    }

    @Override // X.C0IMD
    public final Gift.GiftText LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(Gift.GiftText giftText) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Gift.GiftText giftText, List list) {
    }
}
