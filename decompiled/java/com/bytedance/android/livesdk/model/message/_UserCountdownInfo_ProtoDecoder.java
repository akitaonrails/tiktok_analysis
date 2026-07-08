package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UserCountdownInfo_ProtoDecoder implements C0IMD<UserCountdownInfo> {
    public static UserCountdownInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UserCountdownInfo userCountdownInfo = new UserCountdownInfo();
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
                                userCountdownInfo.completionProgressPercent = c1516680pZS.LJIIJ();
                            }
                        } else {
                            userCountdownInfo.targetScore = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        userCountdownInfo.score = c1516680pZS.LJIIJJI();
                    }
                } else {
                    userCountdownInfo.countdownId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userCountdownInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final UserCountdownInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(UserCountdownInfo userCountdownInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserCountdownInfo userCountdownInfo, List list) {
    }
}
