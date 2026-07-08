package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveLimitedTimeDiscountGiftInfo_ProtoDecoder implements C0IMD<LiveLimitedTimeDiscountGiftInfo> {
    public static LiveLimitedTimeDiscountGiftInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveLimitedTimeDiscountGiftInfo liveLimitedTimeDiscountGiftInfo = new LiveLimitedTimeDiscountGiftInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    liveLimitedTimeDiscountGiftInfo.discountPercentage = c1516680pZS.LJIIJ();
                                }
                            } else {
                                liveLimitedTimeDiscountGiftInfo.remainTimes = c1516680pZS.LJIIJ();
                            }
                        } else {
                            liveLimitedTimeDiscountGiftInfo.expireTime = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        liveLimitedTimeDiscountGiftInfo.originalPrice = c1516680pZS.LJIIJJI();
                    }
                } else {
                    liveLimitedTimeDiscountGiftInfo.giftId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveLimitedTimeDiscountGiftInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final LiveLimitedTimeDiscountGiftInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LiveLimitedTimeDiscountGiftInfo liveLimitedTimeDiscountGiftInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveLimitedTimeDiscountGiftInfo liveLimitedTimeDiscountGiftInfo, List list) {
    }
}
