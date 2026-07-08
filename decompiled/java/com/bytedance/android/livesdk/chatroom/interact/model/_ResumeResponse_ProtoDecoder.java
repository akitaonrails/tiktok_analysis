package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.ResumeResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ResumeResponse_ProtoDecoder implements C0IMD<ResumeResponse> {
    @Override // X.C0IMD
    public final void LIZ(ResumeResponse resumeResponse) {
        ResumeResponse.ResponseData responseData = resumeResponse.data;
        if (responseData != null) {
            _ResumeResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final ResumeResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ResumeResponse resumeResponse = new ResumeResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    resumeResponse.data = _ResumeResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return resumeResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ResumeResponse resumeResponse, List list) {
    }
}
