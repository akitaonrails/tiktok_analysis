package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.MinuteGameUpdateMessage;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MinuteGameUpdateMessage_TimedPropData_ProtoDecoder implements C0IMD<MinuteGameUpdateMessage.TimedPropData> {
    public static MinuteGameUpdateMessage.TimedPropData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MinuteGameUpdateMessage.TimedPropData timedPropData = new MinuteGameUpdateMessage.TimedPropData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    timedPropData.giftMessage = _GiftMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return timedPropData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MinuteGameUpdateMessage.TimedPropData timedPropData) {
        GiftMessage giftMessage = timedPropData.giftMessage;
        if (giftMessage != null) {
            _GiftMessage_ProtoDecoder.LJ(giftMessage);
        }
    }

    @Override // X.C0IMD
    public final MinuteGameUpdateMessage.TimedPropData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MinuteGameUpdateMessage.TimedPropData timedPropData, List list) {
    }
}
