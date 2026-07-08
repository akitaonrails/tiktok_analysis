package com.bytedance.android.livesdk.guide.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.guide.model.GuideInfoResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuideInfoResponse_UserStats_ProtoDecoder implements C0IMD<GuideInfoResponse.UserStats> {
    public static GuideInfoResponse.UserStats LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuideInfoResponse.UserStats userStats = new GuideInfoResponse.UserStats();
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
                                    userStats.watchDuration = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                userStats.likeCnt = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            userStats.giftGuidePopupShowCnt = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        userStats.shortcutGiftClickCnt = c1516680pZS.LJIIJJI();
                    }
                } else {
                    userStats.giftPanelShowCnt = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userStats;
            }
        }
    }

    @Override // X.C0IMD
    public final GuideInfoResponse.UserStats LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GuideInfoResponse.UserStats userStats) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuideInfoResponse.UserStats userStats, List list) {
    }
}
