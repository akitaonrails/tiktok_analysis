package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftsInfo_ViewerPicksInfo_ProtoDecoder implements C0IMD<GiftsInfo.ViewerPicksInfo> {
    public static GiftsInfo.ViewerPicksInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftsInfo.ViewerPicksInfo viewerPicksInfo = new GiftsInfo.ViewerPicksInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    viewerPicksInfo.enableClientForceInsertion = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return viewerPicksInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final GiftsInfo.ViewerPicksInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GiftsInfo.ViewerPicksInfo viewerPicksInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftsInfo.ViewerPicksInfo viewerPicksInfo, List list) {
    }
}
