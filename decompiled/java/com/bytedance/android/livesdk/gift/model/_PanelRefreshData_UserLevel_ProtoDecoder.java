package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.PanelRefreshData;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PanelRefreshData_UserLevel_ProtoDecoder implements C0IMD<PanelRefreshData.UserLevel> {
    public static PanelRefreshData.UserLevel LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PanelRefreshData.UserLevel userLevel = new PanelRefreshData.UserLevel();
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
                                userLevel.didUserOptOut = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            userLevel.nextLevelScore = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        userLevel.currentLevel = c1516680pZS.LJIIJJI();
                    }
                } else {
                    userLevel.currentScore = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userLevel;
            }
        }
    }

    @Override // X.C0IMD
    public final PanelRefreshData.UserLevel LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PanelRefreshData.UserLevel userLevel) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PanelRefreshData.UserLevel userLevel, List list) {
    }
}
