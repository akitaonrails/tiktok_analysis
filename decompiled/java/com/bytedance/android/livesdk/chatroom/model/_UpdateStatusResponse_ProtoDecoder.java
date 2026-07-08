package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _UpdateStatusResponse_ProtoDecoder implements C0IMD<UpdateStatusResponse> {
    @Override // X.C0IMD
    public final void LIZ(UpdateStatusResponse updateStatusResponse) {
    }

    @Override // X.C0IMD
    public final UpdateStatusResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        UpdateStatusResponse updateStatusResponse = new UpdateStatusResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    updateStatusResponse.data = _UpdateStatusResponse_Data_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return updateStatusResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UpdateStatusResponse updateStatusResponse, List list) {
    }
}
