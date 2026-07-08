package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ShortTouchExtra_ProtoDecoder implements C0IMD<ShortTouchExtra> {
    public static ShortTouchExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ShortTouchExtra shortTouchExtra = new ShortTouchExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    shortTouchExtra.pollData = _ShortTouchPollData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return shortTouchExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ShortTouchExtra shortTouchExtra) {
    }

    @Override // X.C0IMD
    public final ShortTouchExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ShortTouchExtra shortTouchExtra, List list) {
    }
}
