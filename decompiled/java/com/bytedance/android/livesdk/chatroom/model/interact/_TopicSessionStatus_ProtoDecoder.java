package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TopicSessionStatus_ProtoDecoder implements C0IMD<TopicSessionStatus> {
    public static TopicSessionStatus LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TopicSessionStatus topicSessionStatus = new TopicSessionStatus();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        topicSessionStatus.sessionHeat = c1516680pZS.LJIIJJI();
                    }
                } else {
                    topicSessionStatus.sessionId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return topicSessionStatus;
            }
        }
    }

    @Override // X.C0IMD
    public final TopicSessionStatus LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(TopicSessionStatus topicSessionStatus) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TopicSessionStatus topicSessionStatus, List list) {
    }
}
