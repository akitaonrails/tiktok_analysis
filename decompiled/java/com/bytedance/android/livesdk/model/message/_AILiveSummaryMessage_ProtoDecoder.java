package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import webcast.data.AILiveSummary;
import webcast.data._AILiveSummary_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _AILiveSummaryMessage_ProtoDecoder implements C0IMD<AILiveSummaryMessage> {
    @Override // X.C0IMD
    public final void LIZ(AILiveSummaryMessage aILiveSummaryMessage) {
        AILiveSummaryMessage aILiveSummaryMessage2 = aILiveSummaryMessage;
        CommonMessageData commonMessageData = aILiveSummaryMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        AILiveSummary aILiveSummary = aILiveSummaryMessage2.aiLiveSummary;
        if (aILiveSummary != null && aILiveSummary.aiSummaryList == null) {
            aILiveSummary.aiSummaryList = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final AILiveSummaryMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AILiveSummaryMessage aILiveSummaryMessage = new AILiveSummaryMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        aILiveSummaryMessage.aiLiveSummary = _AILiveSummary_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    aILiveSummaryMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return aILiveSummaryMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AILiveSummaryMessage aILiveSummaryMessage, List list) {
    }
}
