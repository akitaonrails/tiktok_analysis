package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EpiMessage_ProtoDecoder implements C0IMD<EpiMessage> {
    @Override // X.C0IMD
    public final void LIZ(EpiMessage epiMessage) {
        EpiMessage epiMessage2 = epiMessage;
        CommonMessageData commonMessageData = epiMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        EpiDecision epiDecision = epiMessage2.decisions;
        if (epiDecision != null) {
            _EpiDecision_ProtoDecoder.LJ(epiDecision);
        }
    }

    @Override // X.C0IMD
    public final EpiMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        EpiMessage epiMessage = new EpiMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        epiMessage.decisions = _EpiDecision_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    epiMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return epiMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EpiMessage epiMessage, List list) {
    }
}
