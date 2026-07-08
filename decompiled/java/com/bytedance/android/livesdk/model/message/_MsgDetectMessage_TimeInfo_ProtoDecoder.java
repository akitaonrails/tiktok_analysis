package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.MsgDetectMessage;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MsgDetectMessage_TimeInfo_ProtoDecoder implements C0IMD<MsgDetectMessage.TimeInfo> {
    public static MsgDetectMessage.TimeInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MsgDetectMessage.TimeInfo timeInfo = new MsgDetectMessage.TimeInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            timeInfo.apiSendToGoimMs = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        timeInfo.apiRecvTimeMs = c1516680pZS.LJIIJJI();
                    }
                } else {
                    timeInfo.clientStartMs = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return timeInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final MsgDetectMessage.TimeInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(MsgDetectMessage.TimeInfo timeInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MsgDetectMessage.TimeInfo timeInfo, List list) {
    }
}
