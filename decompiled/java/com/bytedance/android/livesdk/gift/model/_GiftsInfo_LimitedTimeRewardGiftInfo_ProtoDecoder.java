package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.model._GiftPanelBanner_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftsInfo_LimitedTimeRewardGiftInfo_ProtoDecoder implements C0IMD<GiftsInfo.LimitedTimeRewardGiftInfo> {
    public static GiftsInfo.LimitedTimeRewardGiftInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftsInfo.LimitedTimeRewardGiftInfo limitedTimeRewardGiftInfo = new GiftsInfo.LimitedTimeRewardGiftInfo();
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
                                limitedTimeRewardGiftInfo.giftPanelBanner = _GiftPanelBanner_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            limitedTimeRewardGiftInfo.validEnd = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        limitedTimeRewardGiftInfo.validStart = c1516680pZS.LJIIJJI();
                    }
                } else {
                    limitedTimeRewardGiftInfo.giftId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return limitedTimeRewardGiftInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftsInfo.LimitedTimeRewardGiftInfo limitedTimeRewardGiftInfo) {
        GiftPanelBanner giftPanelBanner = limitedTimeRewardGiftInfo.giftPanelBanner;
        if (giftPanelBanner != null) {
            _GiftPanelBanner_ProtoDecoder.LJ(giftPanelBanner);
        }
    }

    @Override // X.C0IMD
    public final GiftsInfo.LimitedTimeRewardGiftInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftsInfo.LimitedTimeRewardGiftInfo limitedTimeRewardGiftInfo, List list) {
    }
}
