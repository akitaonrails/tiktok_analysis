package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PreviewCTA_ProtoDecoder implements C0IMD<PreviewCTA> {
    public static PreviewCTA LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PreviewCTA previewCTA = new PreviewCTA();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        previewCTA.subtitleExpiredTime = c1516680pZS.LJIIJJI();
                    }
                } else {
                    previewCTA.subtitle = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return previewCTA;
            }
        }
    }

    @Override // X.C0IMD
    public final PreviewCTA LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PreviewCTA previewCTA) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PreviewCTA previewCTA, List list) {
    }
}
