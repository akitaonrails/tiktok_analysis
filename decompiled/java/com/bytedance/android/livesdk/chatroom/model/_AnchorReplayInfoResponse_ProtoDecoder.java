package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _AnchorReplayInfoResponse_ProtoDecoder implements C0IMD<AnchorReplayInfoResponse> {
    @Override // X.C0IMD
    public final void LIZ(AnchorReplayInfoResponse anchorReplayInfoResponse) {
        AnchorReplayInfoData anchorReplayInfoData = anchorReplayInfoResponse.data;
        if (anchorReplayInfoData != null) {
            _AnchorReplayInfoData_ProtoDecoder.LJ(anchorReplayInfoData);
        }
    }

    @Override // X.C0IMD
    public final AnchorReplayInfoResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        AnchorReplayInfoResponse anchorReplayInfoResponse = new AnchorReplayInfoResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    anchorReplayInfoResponse.data = _AnchorReplayInfoData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return anchorReplayInfoResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, AnchorReplayInfoResponse anchorReplayInfoResponse, List list) {
    }
}
