package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.gift.model.PanelRefresh;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PanelRefresh_FanClub_ProtoDecoder implements C0IMD<PanelRefresh.FanClub> {
    public static PanelRefresh.FanClub LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PanelRefresh.FanClub fanClub = new PanelRefresh.FanClub();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    fanClub.timeToSleep = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return fanClub;
            }
        }
    }

    @Override // X.C0IMD
    public final PanelRefresh.FanClub LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PanelRefresh.FanClub fanClub) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PanelRefresh.FanClub fanClub, List list) {
    }
}
