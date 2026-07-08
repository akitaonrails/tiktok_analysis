package com.bytedance.android.livesdk.viewer_picks.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _KeyBoardHotKey_ProtoDecoder implements C0IMD<KeyBoardHotKey> {
    public static KeyBoardHotKey LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        KeyBoardHotKey keyBoardHotKey = new KeyBoardHotKey();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        keyBoardHotKey.keyName = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    keyBoardHotKey.keyCode = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return keyBoardHotKey;
            }
        }
    }

    @Override // X.C0IMD
    public final KeyBoardHotKey LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(KeyBoardHotKey keyBoardHotKey) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, KeyBoardHotKey keyBoardHotKey, List list) {
    }
}
