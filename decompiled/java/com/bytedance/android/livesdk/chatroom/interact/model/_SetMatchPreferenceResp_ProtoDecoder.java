package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SetMatchPreferenceResp_ProtoDecoder implements C0IMD<SetMatchPreferenceResp> {
    @Override // X.C0IMD
    public final void LIZ(SetMatchPreferenceResp setMatchPreferenceResp) {
    }

    @Override // X.C0IMD
    public final SetMatchPreferenceResp LIZJ(C1516680pZS c1516680pZS) throws IOException {
        SetMatchPreferenceResp setMatchPreferenceResp = new SetMatchPreferenceResp();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    setMatchPreferenceResp.data = _SetMatchPreferenceResp_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return setMatchPreferenceResp;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SetMatchPreferenceResp setMatchPreferenceResp, List list) {
    }
}
