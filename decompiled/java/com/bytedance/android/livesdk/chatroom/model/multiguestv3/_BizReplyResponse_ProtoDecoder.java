package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message._PerceptionMessage_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BizReplyResponse_ProtoDecoder implements C0IMD<BizReplyResponse> {
    public static BizReplyResponse LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizReplyResponse bizReplyResponse = new BizReplyResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    bizReplyResponse.responseData = _BizReplyResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bizReplyResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(BizReplyResponse bizReplyResponse) {
        PerceptionMessage perceptionMessage;
        BizReplyResponseData bizReplyResponseData = bizReplyResponse.responseData;
        if (bizReplyResponseData != null && (perceptionMessage = bizReplyResponseData.hostPerceptionInfo) != null) {
            _PerceptionMessage_ProtoDecoder.LJ(perceptionMessage);
        }
    }

    @Override // X.C0IMD
    public final BizReplyResponse LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizReplyResponse bizReplyResponse, List list) {
    }
}
