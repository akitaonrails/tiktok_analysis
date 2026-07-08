package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RefreshLiveBagInfo_ProtoDecoder implements C0IMD<RefreshLiveBagInfo> {
    public static RefreshLiveBagInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RefreshLiveBagInfo refreshLiveBagInfo = new RefreshLiveBagInfo();
        refreshLiveBagInfo.refreshLiveBagTypes = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    refreshLiveBagInfo.refreshLiveBagTypes.add(Integer.valueOf(c1516680pZS.LJIIJ()));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return refreshLiveBagInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RefreshLiveBagInfo refreshLiveBagInfo) {
        RefreshLiveBagInfo refreshLiveBagInfo2 = refreshLiveBagInfo;
        if (refreshLiveBagInfo2.refreshLiveBagTypes == null) {
            refreshLiveBagInfo2.refreshLiveBagTypes = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final RefreshLiveBagInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RefreshLiveBagInfo refreshLiveBagInfo, List list) {
    }
}
