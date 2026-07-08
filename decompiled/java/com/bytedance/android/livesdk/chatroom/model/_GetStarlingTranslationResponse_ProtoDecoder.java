package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GetStarlingTranslationResponse_ProtoDecoder implements C0IMD<GetStarlingTranslationResponse> {
    @Override // X.C0IMD
    public final void LIZ(GetStarlingTranslationResponse getStarlingTranslationResponse) {
    }

    @Override // X.C0IMD
    public final GetStarlingTranslationResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GetStarlingTranslationResponse getStarlingTranslationResponse = new GetStarlingTranslationResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    getStarlingTranslationResponse.data = _GetStarlingTranslationResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return getStarlingTranslationResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetStarlingTranslationResponse getStarlingTranslationResponse, List list) {
    }
}
