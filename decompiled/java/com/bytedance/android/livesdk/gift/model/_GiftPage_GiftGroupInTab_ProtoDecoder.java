package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftPage_GiftGroupInTab_ProtoDecoder implements C0IMD<GiftPage.GiftGroupInTab> {
    public static GiftPage.GiftGroupInTab LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftPage.GiftGroupInTab giftGroupInTab = new GiftPage.GiftGroupInTab();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            giftGroupInTab.description = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        giftGroupInTab.title = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    giftGroupInTab.groupInTab = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftGroupInTab;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftPage.GiftGroupInTab giftGroupInTab) {
        GiftPage.GiftGroupInTab giftGroupInTab2 = giftGroupInTab;
        Text text = giftGroupInTab2.title;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
        Text text2 = giftGroupInTab2.description;
        if (text2 != null) {
            _Text_ProtoDecoder.LJ(text2);
        }
    }

    @Override // X.C0IMD
    public final GiftPage.GiftGroupInTab LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftPage.GiftGroupInTab giftGroupInTab, List list) {
    }
}
