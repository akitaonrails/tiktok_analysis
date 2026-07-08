package com.bytedance.android.livesdk.game.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameTaskRewardInfo_ProtoDecoder implements C0IMD<GameTaskRewardInfo> {
    public static GameTaskRewardInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GameTaskRewardInfo gameTaskRewardInfo = new GameTaskRewardInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            gameTaskRewardInfo.rewardValue = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        gameTaskRewardInfo.status = c1516680pZS.LJIIJ();
                    }
                } else {
                    gameTaskRewardInfo.rewardId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameTaskRewardInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final GameTaskRewardInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GameTaskRewardInfo gameTaskRewardInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameTaskRewardInfo gameTaskRewardInfo, List list) {
    }
}
