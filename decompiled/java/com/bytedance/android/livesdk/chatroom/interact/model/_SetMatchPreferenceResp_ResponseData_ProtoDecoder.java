package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.SetMatchPreferenceResp;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SetMatchPreferenceResp_ResponseData_ProtoDecoder implements C0IMD<SetMatchPreferenceResp.ResponseData> {
    public static SetMatchPreferenceResp.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SetMatchPreferenceResp.ResponseData responseData = new SetMatchPreferenceResp.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.preferenceTag = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final SetMatchPreferenceResp.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SetMatchPreferenceResp.ResponseData responseData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SetMatchPreferenceResp.ResponseData responseData, List list) {
    }
}
