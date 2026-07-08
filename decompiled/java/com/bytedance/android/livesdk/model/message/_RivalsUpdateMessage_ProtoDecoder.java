package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.RivalsUpdateMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RivalsUpdateMessage_ProtoDecoder implements C0IMD<RivalsUpdateMessage> {
    @Override // X.C0IMD
    public final void LIZ(RivalsUpdateMessage rivalsUpdateMessage) {
        RivalsUpdateMessage rivalsUpdateMessage2 = rivalsUpdateMessage;
        CommonMessageData commonMessageData = rivalsUpdateMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        RivalsUpdateMessage.UpdatedRivals updatedRivals = rivalsUpdateMessage2.updateRivals;
        if (updatedRivals != null) {
            _RivalsUpdateMessage_UpdatedRivals_ProtoDecoder.LJ(updatedRivals);
        }
    }

    @Override // X.C0IMD
    public final RivalsUpdateMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        RivalsUpdateMessage rivalsUpdateMessage = new RivalsUpdateMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 51) {
                            if (iLJI != 52) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                rivalsUpdateMessage.downgradeSignal = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            rivalsUpdateMessage.refreshSessionId = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        rivalsUpdateMessage.updateRivals = _RivalsUpdateMessage_UpdatedRivals_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    rivalsUpdateMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rivalsUpdateMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RivalsUpdateMessage rivalsUpdateMessage, List list) {
    }
}
