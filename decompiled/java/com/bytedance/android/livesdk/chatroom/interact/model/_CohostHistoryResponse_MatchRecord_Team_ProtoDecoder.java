package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostHistoryResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostHistoryResponse_MatchRecord_Team_ProtoDecoder implements C0IMD<CohostHistoryResponse.MatchRecord.Team> {
    public static CohostHistoryResponse.MatchRecord.Team LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CohostHistoryResponse.MatchRecord.Team team = new CohostHistoryResponse.MatchRecord.Team();
        team.users = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    team.users.add(_CohostHistoryResponse_MatchRecord_Team_User_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return team;
            }
        }
    }

    public static void LJ(CohostHistoryResponse.MatchRecord.Team team) {
        List<CohostHistoryResponse.MatchRecord.Team.User> list = team.users;
        if (list == null) {
            team.users = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<CohostHistoryResponse.MatchRecord.Team.User> it2 = team.users.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CohostHistoryResponse.MatchRecord.Team team) {
        LJ(team);
    }

    @Override // X.C0IMD
    public final CohostHistoryResponse.MatchRecord.Team LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostHistoryResponse.MatchRecord.Team team, List list) {
    }
}
