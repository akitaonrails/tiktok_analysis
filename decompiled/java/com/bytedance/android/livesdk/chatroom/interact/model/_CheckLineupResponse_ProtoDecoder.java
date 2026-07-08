package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CheckLineupResponse_ProtoDecoder implements C0IMD<CheckLineupResponse> {
    @Override // X.C0IMD
    public final void LIZ(CheckLineupResponse checkLineupResponse) {
    }

    @Override // X.C0IMD
    public final CheckLineupResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        CheckLineupResponse checkLineupResponse = new CheckLineupResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    checkLineupResponse.data = _CheckLineupResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return checkLineupResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CheckLineupResponse checkLineupResponse, List list) {
    }
}
