package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.FansEventData;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FansEventData_TeamRankUpdate_ProtoDecoder implements C0IMD<FansEventData.TeamRankUpdate> {
    public static FansEventData.TeamRankUpdate LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FansEventData.TeamRankUpdate teamRankUpdate = new FansEventData.TeamRankUpdate();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        teamRankUpdate.updatedScore = c1516680pZS.LJIIJJI();
                    }
                } else {
                    teamRankUpdate.updatedRank = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return teamRankUpdate;
            }
        }
    }

    @Override // X.C0IMD
    public final FansEventData.TeamRankUpdate LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(FansEventData.TeamRankUpdate teamRankUpdate) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FansEventData.TeamRankUpdate teamRankUpdate, List list) {
    }
}
