package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftSendResponse;
import java.io.IOException;
import java.util.List;
import webcast.data.RechargeCustomError;
import webcast.data._RechargeCustomError_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftSendResponse_GiftExtra_ProtoDecoder implements C0IMD<GiftSendResponse.GiftExtra> {
    @Override // X.C0IMD
    public final void LIZ(GiftSendResponse.GiftExtra giftExtra) {
        RechargeCustomError rechargeCustomError = giftExtra.customError;
        if (rechargeCustomError != null) {
            _RechargeCustomError_ProtoDecoder.LJ(rechargeCustomError);
        }
    }

    @Override // X.C0IMD
    public final GiftSendResponse.GiftExtra LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GiftSendResponse.GiftExtra giftExtra = new GiftSendResponse.GiftExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    giftExtra.customError = _RechargeCustomError_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftSendResponse.GiftExtra giftExtra, List list) {
    }
}
