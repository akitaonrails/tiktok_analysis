package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UserRankComparison_ProtoDecoder implements C0IMD<UserRankComparison> {
    public static UserRankComparison LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        UserRankComparison userRankComparison = new UserRankComparison();
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
                                    userRankComparison.targetUid = c1516680pZS.LJIIJJI();
                                }
                            } else {
                                userRankComparison.deltaScore = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            userRankComparison.targetScore = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        userRankComparison.targetType = c1516680pZS.LJIIJ();
                    }
                } else {
                    userRankComparison.targetRank = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return userRankComparison;
            }
        }
    }

    @Override // X.C0IMD
    public final UserRankComparison LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(UserRankComparison userRankComparison) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UserRankComparison userRankComparison, List list) {
    }
}
