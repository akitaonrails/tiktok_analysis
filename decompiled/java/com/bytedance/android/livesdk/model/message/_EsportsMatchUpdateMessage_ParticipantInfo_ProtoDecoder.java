package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.EsportsMatchUpdateMessage;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EsportsMatchUpdateMessage_ParticipantInfo_ProtoDecoder implements C0IMD<EsportsMatchUpdateMessage.ParticipantInfo> {
    public static EsportsMatchUpdateMessage.ParticipantInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EsportsMatchUpdateMessage.ParticipantInfo participantInfo = new EsportsMatchUpdateMessage.ParticipantInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        participantInfo.score = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    participantInfo.participantId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return participantInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final EsportsMatchUpdateMessage.ParticipantInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(EsportsMatchUpdateMessage.ParticipantInfo participantInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EsportsMatchUpdateMessage.ParticipantInfo participantInfo, List list) {
    }
}
