package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BizJoinChannelResponseData_ProtoDecoder implements C0IMD<BizJoinChannelResponseData> {
    public static BizJoinChannelResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BizJoinChannelResponseData bizJoinChannelResponseData = new BizJoinChannelResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        bizJoinChannelResponseData.fixMicNumAction = c1516680pZS.LJIIJ();
                    }
                } else {
                    bizJoinChannelResponseData.layoutTypeAction = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bizJoinChannelResponseData;
            }
        }
    }

    @Override // X.C0IMD
    public final BizJoinChannelResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BizJoinChannelResponseData bizJoinChannelResponseData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BizJoinChannelResponseData bizJoinChannelResponseData, List list) {
    }
}
