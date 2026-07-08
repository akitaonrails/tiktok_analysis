package com.bytedance.android.livesdk.model.message.ext;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EcTaskRefreshCouponListMessage_ProtoDecoder implements C0IMD<EcTaskRefreshCouponListMessage> {
    @Override // X.C0IMD
    public final void LIZ(EcTaskRefreshCouponListMessage ecTaskRefreshCouponListMessage) {
        CommonMessageData commonMessageData = ecTaskRefreshCouponListMessage.baseMessage;
        if (commonMessageData != null) {
            _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
        }
    }

    @Override // X.C0IMD
    public final EcTaskRefreshCouponListMessage LIZJ(C1516680pZS c1516680pZS) throws IOException {
        EcTaskRefreshCouponListMessage ecTaskRefreshCouponListMessage = new EcTaskRefreshCouponListMessage();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        ecTaskRefreshCouponListMessage.entity = _EcTaskRefreshCouponListEntity_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    ecTaskRefreshCouponListMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return ecTaskRefreshCouponListMessage;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EcTaskRefreshCouponListMessage ecTaskRefreshCouponListMessage, List list) {
    }
}
