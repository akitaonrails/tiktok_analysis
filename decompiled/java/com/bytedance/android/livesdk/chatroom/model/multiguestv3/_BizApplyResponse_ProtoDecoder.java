package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message._PerceptionMessage_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BizApplyResponse_ProtoDecoder implements C0IMD<BizApplyResponse> {
    public static BizApplyResponse LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizApplyResponse bizApplyResponse = new BizApplyResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    bizApplyResponse.responseData = _BizApplyResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bizApplyResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BizApplyResponse bizApplyResponse) {
        BizApplyResponseData bizApplyResponseData = bizApplyResponse.responseData;
        if (bizApplyResponseData != null) {
            PerceptionMessage perceptionMessage = bizApplyResponseData.perceptionInfo;
            if (perceptionMessage != null) {
                _PerceptionMessage_ProtoDecoder.LJ(perceptionMessage);
            }
            PerceptionMessage perceptionMessage2 = bizApplyResponseData.hostPerceptionInfo;
            if (perceptionMessage2 != null) {
                _PerceptionMessage_ProtoDecoder.LJ(perceptionMessage2);
            }
        }
    }

    @Override // X.C0IMD
    public final BizApplyResponse LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizApplyResponse bizApplyResponse, List list) {
    }
}
