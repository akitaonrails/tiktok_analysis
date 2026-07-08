package com.bytedance.android.livesdk.chatroom.model.interact;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.model.interact.EOYBanner;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EOYBanner_GradeInfo_ProtoDecoder implements C0IMD<EOYBanner.GradeInfo> {
    public static EOYBanner.GradeInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EOYBanner.GradeInfo gradeInfo = new EOYBanner.GradeInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            gradeInfo.target = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        gradeInfo.progress = c1516680pZS.LJIIJJI();
                    }
                } else {
                    gradeInfo.level = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gradeInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final EOYBanner.GradeInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(EOYBanner.GradeInfo gradeInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EOYBanner.GradeInfo gradeInfo, List list) {
    }
}
