package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _StreamSnapShot_ProtoDecoder implements C0IMD<StreamSnapShot> {
    public static StreamSnapShot LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        StreamSnapShot streamSnapShot = new StreamSnapShot();
        streamSnapShot.urls = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        streamSnapShot.uri = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        streamSnapShot.urls.add(C1516700pZU.LIZLLL(c1516680pZS));
                        break;
                    case 3:
                        streamSnapShot.height = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        streamSnapShot.width = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        streamSnapShot.faceCenterX = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        streamSnapShot.faceCenterY = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return streamSnapShot;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(StreamSnapShot streamSnapShot) {
        StreamSnapShot streamSnapShot2 = streamSnapShot;
        if (streamSnapShot2.urls == null) {
            streamSnapShot2.urls = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final StreamSnapShot LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, StreamSnapShot streamSnapShot, List list) {
    }
}
