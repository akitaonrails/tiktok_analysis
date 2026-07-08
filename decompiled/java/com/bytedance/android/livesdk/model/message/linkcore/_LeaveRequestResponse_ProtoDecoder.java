package com.bytedance.android.livesdk.model.message.linkcore;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;
import webcast.data.multilive_biz._BizLeaveResponse_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _LeaveRequestResponse_ProtoDecoder implements C0IMD<LeaveRequestResponse> {
    @Override // X.C0IMD
    public final void LIZ(LeaveRequestResponse leaveRequestResponse) {
        LinkMicCommonResp linkMicCommonResp = leaveRequestResponse.commonResp;
        if (linkMicCommonResp != null) {
            _LinkMicCommonResp_ProtoDecoder.LJ(linkMicCommonResp);
        }
    }

    @Override // X.C0IMD
    public final LeaveRequestResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LeaveRequestResponse leaveRequestResponse = new LeaveRequestResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 9527) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        leaveRequestResponse.multiGuestRespExtra = _BizLeaveResponse_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    leaveRequestResponse.commonResp = _LinkMicCommonResp_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return leaveRequestResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LeaveRequestResponse leaveRequestResponse, List list) {
    }
}
