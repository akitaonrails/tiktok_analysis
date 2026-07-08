package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.EsportsMatchUpdateMessage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EsportsMatchUpdateMessage_MatchInfo_ProtoDecoder implements C0IMD<EsportsMatchUpdateMessage.MatchInfo> {
    public static EsportsMatchUpdateMessage.MatchInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EsportsMatchUpdateMessage.MatchInfo matchInfo = new EsportsMatchUpdateMessage.MatchInfo();
        matchInfo.participantInfoList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            matchInfo.participantInfoList.add(_EsportsMatchUpdateMessage_ParticipantInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        matchInfo.status = c1516680pZS.LJIIJ();
                    }
                } else {
                    matchInfo.matchId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return matchInfo;
            }
        }
    }

    public static void LJ(EsportsMatchUpdateMessage.MatchInfo matchInfo) {
        List<EsportsMatchUpdateMessage.ParticipantInfo> list = matchInfo.participantInfoList;
        if (list == null) {
            matchInfo.participantInfoList = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<EsportsMatchUpdateMessage.ParticipantInfo> it2 = matchInfo.participantInfoList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EsportsMatchUpdateMessage.MatchInfo matchInfo) {
        LJ(matchInfo);
    }

    @Override // X.C0IMD
    public final EsportsMatchUpdateMessage.MatchInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EsportsMatchUpdateMessage.MatchInfo matchInfo, List list) {
    }
}
