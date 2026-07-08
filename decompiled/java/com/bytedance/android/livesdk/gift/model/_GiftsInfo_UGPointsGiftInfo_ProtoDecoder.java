package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftsInfo_UGPointsGiftInfo_ProtoDecoder implements C0IMD<GiftsInfo.UGPointsGiftInfo> {
    public static GiftsInfo.UGPointsGiftInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftsInfo.UGPointsGiftInfo uGPointsGiftInfo = new GiftsInfo.UGPointsGiftInfo();
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
                                uGPointsGiftInfo.validEndAt = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            uGPointsGiftInfo.validStartAt = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        uGPointsGiftInfo.hasSendGiftsInHistory = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    uGPointsGiftInfo.maxAnchorTimes = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return uGPointsGiftInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final GiftsInfo.UGPointsGiftInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GiftsInfo.UGPointsGiftInfo uGPointsGiftInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftsInfo.UGPointsGiftInfo uGPointsGiftInfo, List list) {
    }
}
