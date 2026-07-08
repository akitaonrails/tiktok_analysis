package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.Gift;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Gift_GiftSeriesInfo_ProtoDecoder implements C0IMD<Gift.GiftSeriesInfo> {
    public static Gift.GiftSeriesInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Gift.GiftSeriesInfo giftSeriesInfo = new Gift.GiftSeriesInfo();
        giftSeriesInfo.giftIds = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 2:
                        giftSeriesInfo.seriesName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        giftSeriesInfo.giftIds.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                        break;
                    case 4:
                        giftSeriesInfo.enabled = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 5:
                        giftSeriesInfo.containerBackground = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        giftSeriesInfo.sendGiftButtonColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        giftSeriesInfo.pointingBackTriColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        giftSeriesInfo.seriesNameColor = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        giftSeriesInfo.endTimeSec = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftSeriesInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Gift.GiftSeriesInfo giftSeriesInfo) {
        Gift.GiftSeriesInfo giftSeriesInfo2 = giftSeriesInfo;
        if (giftSeriesInfo2.giftIds == null) {
            giftSeriesInfo2.giftIds = new ArrayList();
        }
        ImageModel imageModel = giftSeriesInfo2.containerBackground;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final Gift.GiftSeriesInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Gift.GiftSeriesInfo giftSeriesInfo, List list) {
    }
}
