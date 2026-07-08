package com.bytedance.android.livesdk.chatroom.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.GetStarlingTranslationResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GetStarlingTranslationResponse_ResponseData_ProtoDecoder implements C0IMD<GetStarlingTranslationResponse.ResponseData> {
    public static GetStarlingTranslationResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GetStarlingTranslationResponse.ResponseData responseData = new GetStarlingTranslationResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        responseData.content = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    responseData.brandName = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final GetStarlingTranslationResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GetStarlingTranslationResponse.ResponseData responseData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetStarlingTranslationResponse.ResponseData responseData, List list) {
    }
}
