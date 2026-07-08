package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.EsportsScoreBoardUpdateMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EsportsScoreBoardUpdateMessage_ProtoDecoder implements C0IMD<EsportsScoreBoardUpdateMessage> {
    @Override // X.C0IMD
    public final void LIZ(EsportsScoreBoardUpdateMessage esportsScoreBoardUpdateMessage) {
        EsportsScoreBoardUpdateMessage esportsScoreBoardUpdateMessage2 = esportsScoreBoardUpdateMessage;
        CommonMessageData commonMessageData = esportsScoreBoardUpdateMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        List<EsportsScoreBoardUpdateMessage.ParticipantScoreInfo> list = esportsScoreBoardUpdateMessage2.participantScores;
        if (list == null) {
            esportsScoreBoardUpdateMessage2.participantScores = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (EsportsScoreBoardUpdateMessage.ParticipantScoreInfo participantScoreInfo : esportsScoreBoardUpdateMessage2.participantScores) {
            if (participantScoreInfo != null) {
                _EsportsScoreBoardUpdateMessage_ParticipantScoreInfo_ProtoDecoder.LJ(participantScoreInfo);
            }
        }
    }

    @Override // X.C0IMD
    public final EsportsScoreBoardUpdateMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        EsportsScoreBoardUpdateMessage esportsScoreBoardUpdateMessage = new EsportsScoreBoardUpdateMessage();
        esportsScoreBoardUpdateMessage.participantScores = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        esportsScoreBoardUpdateMessage.participantScores.add(_EsportsScoreBoardUpdateMessage_ParticipantScoreInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    esportsScoreBoardUpdateMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return esportsScoreBoardUpdateMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EsportsScoreBoardUpdateMessage esportsScoreBoardUpdateMessage, List list) {
    }
}
