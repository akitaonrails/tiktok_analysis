package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RankToastMessage_ProtoDecoder implements C0IMD<RankToastMessage> {
    @Override // X.C0IMD
    public final void LIZ(RankToastMessage rankToastMessage) {
        CommonMessageData commonMessageData = rankToastMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final RankToastMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        RankToastMessage rankToastMessage = new RankToastMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        rankToastMessage.toast = _RankToastMessage_RankToast_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    rankToastMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rankToastMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RankToastMessage rankToastMessage, List list) {
    }
}
