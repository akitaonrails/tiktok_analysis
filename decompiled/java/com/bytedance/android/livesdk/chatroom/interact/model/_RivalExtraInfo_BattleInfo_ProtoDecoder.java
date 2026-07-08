package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RivalExtraInfo_BattleInfo_ProtoDecoder implements C0IMD<RivalExtraInfo.BattleInfo> {
    public static RivalExtraInfo.BattleInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RivalExtraInfo.BattleInfo battleInfo = new RivalExtraInfo.BattleInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        battleInfo.value = c1516680pZS.LJIIJJI();
                    }
                } else {
                    battleInfo.infoType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return battleInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final RivalExtraInfo.BattleInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(RivalExtraInfo.BattleInfo battleInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RivalExtraInfo.BattleInfo battleInfo, List list) {
    }
}
