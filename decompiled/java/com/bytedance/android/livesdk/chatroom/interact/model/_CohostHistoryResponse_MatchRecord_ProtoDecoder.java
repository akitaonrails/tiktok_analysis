package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.CohostHistoryResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CohostHistoryResponse_MatchRecord_ProtoDecoder implements C0IMD<CohostHistoryResponse.MatchRecord> {
    public static CohostHistoryResponse.MatchRecord LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CohostHistoryResponse.MatchRecord matchRecord = new CohostHistoryResponse.MatchRecord();
        matchRecord.opposingTeams = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        matchRecord.matchId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        matchRecord.historyGroupChannelId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        matchRecord.matchType = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        matchRecord.startTimestampSec = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        matchRecord.myInfo = _CohostHistoryResponse_MatchRecord_Team_User_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        matchRecord.result = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        matchRecord.myTeam = _CohostHistoryResponse_MatchRecord_Team_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        matchRecord.opposingTeams.add(_CohostHistoryResponse_MatchRecord_Team_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return matchRecord;
            }
        }
    }

    public static void LJ(CohostHistoryResponse.MatchRecord matchRecord) {
        CohostHistoryResponse.MatchRecord.Team team = matchRecord.myTeam;
        if (team != null) {
            _CohostHistoryResponse_MatchRecord_Team_ProtoDecoder.LJ(team);
        }
        List<CohostHistoryResponse.MatchRecord.Team> list = matchRecord.opposingTeams;
        if (list == null) {
            matchRecord.opposingTeams = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (CohostHistoryResponse.MatchRecord.Team team2 : matchRecord.opposingTeams) {
            if (team2 != null) {
                _CohostHistoryResponse_MatchRecord_Team_ProtoDecoder.LJ(team2);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CohostHistoryResponse.MatchRecord matchRecord) {
        LJ(matchRecord);
    }

    @Override // X.C0IMD
    public final CohostHistoryResponse.MatchRecord LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostHistoryResponse.MatchRecord matchRecord, List list) {
    }
}
