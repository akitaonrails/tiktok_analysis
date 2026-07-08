package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.game.model.EsportsParticipantDynamicScore;
import com.bytedance.android.livesdk.game.model._EsportsParticipantDynamicScore_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.EsportsScoreBoardUpdateMessage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EsportsScoreBoardUpdateMessage_ParticipantScoreInfo_ProtoDecoder implements C0IMD<EsportsScoreBoardUpdateMessage.ParticipantScoreInfo> {
    public static EsportsScoreBoardUpdateMessage.ParticipantScoreInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EsportsScoreBoardUpdateMessage.ParticipantScoreInfo participantScoreInfo = new EsportsScoreBoardUpdateMessage.ParticipantScoreInfo();
        participantScoreInfo.dynamicScoreList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            participantScoreInfo.rank = c1516680pZS.LJIIJ();
                        }
                    } else {
                        participantScoreInfo.dynamicScoreList.add(_EsportsParticipantDynamicScore_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    participantScoreInfo.teamId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return participantScoreInfo;
            }
        }
    }

    public static void LJ(EsportsScoreBoardUpdateMessage.ParticipantScoreInfo participantScoreInfo) {
        List<EsportsParticipantDynamicScore> list = participantScoreInfo.dynamicScoreList;
        if (list == null) {
            participantScoreInfo.dynamicScoreList = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<EsportsParticipantDynamicScore> it2 = participantScoreInfo.dynamicScoreList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EsportsScoreBoardUpdateMessage.ParticipantScoreInfo participantScoreInfo) {
        LJ(participantScoreInfo);
    }

    @Override // X.C0IMD
    public final EsportsScoreBoardUpdateMessage.ParticipantScoreInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EsportsScoreBoardUpdateMessage.ParticipantScoreInfo participantScoreInfo, List list) {
    }
}
