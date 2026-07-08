package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RivalsListsData_TopHostInfo_ProtoDecoder implements C0IMD<RivalsListsData.TopHostInfo> {
    public static RivalsListsData.TopHostInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RivalsListsData.TopHostInfo topHostInfo = new RivalsListsData.TopHostInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        topHostInfo.topIndex = c1516680pZS.LJIIJJI();
                    }
                } else {
                    topHostInfo.rankType = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return topHostInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final RivalsListsData.TopHostInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(RivalsListsData.TopHostInfo topHostInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RivalsListsData.TopHostInfo topHostInfo, List list) {
    }
}
