package com.bytedance.android.livesdk.chatroom.api;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.chatroom.api.SimplePinCardInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SimplePinCardInfo_Background_ProtoDecoder implements C0IMD<SimplePinCardInfo.Background> {
    public static SimplePinCardInfo.Background LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SimplePinCardInfo.Background background = new SimplePinCardInfo.Background();
        background.stops = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            background.stops.add(_SimplePinCardInfo_Background_Stop_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        background.angleDeg = c1516680pZS.LJIIJJI();
                    }
                } else {
                    background.type = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return background;
            }
        }
    }

    public static void LJ(SimplePinCardInfo.Background background) {
        List<SimplePinCardInfo.Background.Stop> list = background.stops;
        if (list == null) {
            background.stops = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<SimplePinCardInfo.Background.Stop> it2 = background.stops.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SimplePinCardInfo.Background background) {
        LJ(background);
    }

    @Override // X.C0IMD
    public final SimplePinCardInfo.Background LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SimplePinCardInfo.Background background, List list) {
    }
}
