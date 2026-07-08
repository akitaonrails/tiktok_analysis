package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.interact.EOYBanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EOYBanner_StreakInfo_ProtoDecoder implements C0IMD<EOYBanner.StreakInfo> {
    public static EOYBanner.StreakInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EOYBanner.StreakInfo streakInfo = new EOYBanner.StreakInfo();
        streakInfo.mileStones = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            streakInfo.mileStones.add(_EOYBanner_MileStone_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        streakInfo.progress = c1516680pZS.LJIIJJI();
                    }
                } else {
                    streakInfo.streakType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return streakInfo;
            }
        }
    }

    public static void LJ(EOYBanner.StreakInfo streakInfo) {
        List<EOYBanner.MileStone> list = streakInfo.mileStones;
        if (list == null) {
            streakInfo.mileStones = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<EOYBanner.MileStone> it2 = streakInfo.mileStones.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EOYBanner.StreakInfo streakInfo) {
        LJ(streakInfo);
    }

    @Override // X.C0IMD
    public final EOYBanner.StreakInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EOYBanner.StreakInfo streakInfo, List list) {
    }
}
