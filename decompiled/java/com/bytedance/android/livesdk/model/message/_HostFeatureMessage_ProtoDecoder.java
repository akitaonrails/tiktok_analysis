package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _HostFeatureMessage_ProtoDecoder implements C0IMD<HostFeatureMessage> {
    @Override // X.C0IMD
    public final void LIZ(HostFeatureMessage hostFeatureMessage) {
        HostFeatureMessage hostFeatureMessage2 = hostFeatureMessage;
        CommonMessageData commonMessageData = hostFeatureMessage2.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
        HostFeatureData hostFeatureData = hostFeatureMessage2.data;
        if (hostFeatureData != null && hostFeatureData.features == null) {
            hostFeatureData.features = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final HostFeatureMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        HostFeatureMessage hostFeatureMessage = new HostFeatureMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        hostFeatureMessage.data = _HostFeatureData_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    hostFeatureMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return hostFeatureMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HostFeatureMessage hostFeatureMessage, List list) {
    }
}
