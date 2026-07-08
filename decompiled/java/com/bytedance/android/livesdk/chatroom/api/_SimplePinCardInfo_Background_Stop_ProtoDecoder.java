package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.api.SimplePinCardInfo;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SimplePinCardInfo_Background_Stop_ProtoDecoder implements C0IMD<SimplePinCardInfo.Background.Stop> {
    public static SimplePinCardInfo.Background.Stop LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SimplePinCardInfo.Background.Stop stop = new SimplePinCardInfo.Background.Stop();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        stop.color = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    stop.pos = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return stop;
            }
        }
    }

    @Override // X.C0IMD
    public final SimplePinCardInfo.Background.Stop LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SimplePinCardInfo.Background.Stop stop) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SimplePinCardInfo.Background.Stop stop, List list) {
    }
}
