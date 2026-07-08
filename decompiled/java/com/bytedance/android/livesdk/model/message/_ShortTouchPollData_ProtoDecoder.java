package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ShortTouchPollData_ProtoDecoder implements C0IMD<ShortTouchPollData> {
    public static ShortTouchPollData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ShortTouchPollData shortTouchPollData = new ShortTouchPollData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            shortTouchPollData.pollShowResult = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        shortTouchPollData.pollEndTime = c1516680pZS.LJIIJJI();
                    }
                } else {
                    shortTouchPollData.pollId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return shortTouchPollData;
            }
        }
    }

    @Override // X.C0IMD
    public final ShortTouchPollData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ShortTouchPollData shortTouchPollData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ShortTouchPollData shortTouchPollData, List list) {
    }
}
