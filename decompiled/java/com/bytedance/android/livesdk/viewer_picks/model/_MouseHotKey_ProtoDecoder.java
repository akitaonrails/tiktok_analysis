package com.bytedance.android.livesdk.viewer_picks.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MouseHotKey_ProtoDecoder implements C0IMD<MouseHotKey> {
    public static MouseHotKey LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MouseHotKey mouseHotKey = new MouseHotKey();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    mouseHotKey.mouseType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return mouseHotKey;
            }
        }
    }

    @Override // X.C0IMD
    public final MouseHotKey LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(MouseHotKey mouseHotKey) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MouseHotKey mouseHotKey, List list) {
    }
}
