package com.bytedance.android.livesdk.game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GuessRankUserInfo_ProtoDecoder implements C0IMD<GuessRankUserInfo> {
    public static GuessRankUserInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GuessRankUserInfo guessRankUserInfo = new GuessRankUserInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    guessRankUserInfo.avatarUri = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return guessRankUserInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final GuessRankUserInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GuessRankUserInfo guessRankUserInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GuessRankUserInfo guessRankUserInfo, List list) {
    }
}
