package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftRecommendInfo_ProtoDecoder implements C0IMD<GiftRecommendInfo> {
    public static GiftRecommendInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftRecommendInfo giftRecommendInfo = new GiftRecommendInfo();
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
                                giftRecommendInfo.text = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            giftRecommendInfo.shouldCallRealtimeAfterSent = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        giftRecommendInfo.recommendReason = c1516680pZS.LJIIJJI();
                    }
                } else {
                    giftRecommendInfo.starlingKey = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftRecommendInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftRecommendInfo giftRecommendInfo) {
        Text text = giftRecommendInfo.text;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final GiftRecommendInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftRecommendInfo giftRecommendInfo, List list) {
    }
}
