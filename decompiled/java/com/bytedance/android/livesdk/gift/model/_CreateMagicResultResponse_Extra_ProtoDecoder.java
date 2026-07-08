package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.CreateMagicResultResponse;
import java.io.IOException;
import java.util.List;
import webcast.data.RechargeCustomError;
import webcast.data._RechargeCustomError_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _CreateMagicResultResponse_Extra_ProtoDecoder implements C0IMD<CreateMagicResultResponse.Extra> {
    public static CreateMagicResultResponse.Extra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CreateMagicResultResponse.Extra extra = new CreateMagicResultResponse.Extra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    extra.customError = _RechargeCustomError_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return extra;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CreateMagicResultResponse.Extra extra) {
        RechargeCustomError rechargeCustomError = extra.customError;
        if (rechargeCustomError != null) {
            _RechargeCustomError_ProtoDecoder.LJ(rechargeCustomError);
        }
    }

    @Override // X.C0IMD
    public final CreateMagicResultResponse.Extra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CreateMagicResultResponse.Extra extra, List list) {
    }
}
