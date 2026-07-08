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
public final class _CohostHistoryResponse_CohostSession_ProtoDecoder implements C0IMD<CohostHistoryResponse.CohostSession> {
    public static CohostHistoryResponse.CohostSession LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CohostHistoryResponse.CohostSession cohostSession = new CohostHistoryResponse.CohostSession();
        cohostSession.hosts = new ArrayList();
        cohostSession.takeTheStageRecords = new ArrayList();
        cohostSession.matchRecords = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        cohostSession.id = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        cohostSession.historyGroupChannelId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        cohostSession.startTimestampSec = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        cohostSession.viewersAccumulated = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        cohostSession.hosts.add(_CohostHistoryResponse_CohostSession_Host_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 6:
                        cohostSession.matchRecords.add(_CohostHistoryResponse_MatchRecord_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 7:
                        cohostSession.takeTheStageRecords.add(_CohostHistoryResponse_TakeTheStageRecord_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return cohostSession;
            }
        }
    }

    public static void LJ(CohostHistoryResponse.CohostSession cohostSession) {
        List<CohostHistoryResponse.CohostSession.Host> list = cohostSession.hosts;
        if (list == null) {
            cohostSession.hosts = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<CohostHistoryResponse.CohostSession.Host> it2 = cohostSession.hosts.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<CohostHistoryResponse.MatchRecord> list2 = cohostSession.matchRecords;
        if (list2 == null) {
            cohostSession.matchRecords = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (CohostHistoryResponse.MatchRecord matchRecord : cohostSession.matchRecords) {
                if (matchRecord != null) {
                    _CohostHistoryResponse_MatchRecord_ProtoDecoder.LJ(matchRecord);
                }
            }
        }
        List<CohostHistoryResponse.TakeTheStageRecord> list3 = cohostSession.takeTheStageRecords;
        if (list3 == null) {
            cohostSession.takeTheStageRecords = new ArrayList();
            return;
        }
        if (list3.isEmpty()) {
            return;
        }
        for (CohostHistoryResponse.TakeTheStageRecord takeTheStageRecord : cohostSession.takeTheStageRecords) {
            if (takeTheStageRecord != null) {
                _CohostHistoryResponse_TakeTheStageRecord_ProtoDecoder.LJ(takeTheStageRecord);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CohostHistoryResponse.CohostSession cohostSession) {
        LJ(cohostSession);
    }

    @Override // X.C0IMD
    public final CohostHistoryResponse.CohostSession LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CohostHistoryResponse.CohostSession cohostSession, List list) {
    }
}
