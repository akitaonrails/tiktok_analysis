package com.bytedance.android.livesdk.viewer_picks.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _HotKey_ProtoDecoder implements C0IMD<HotKey> {
    public static HotKey LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        HotKey hotKey = new HotKey();
        hotKey.mouseKeys = new ArrayList();
        hotKey.keyboardKeys = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            hotKey.mouseKeys.add(_MouseHotKey_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        hotKey.keyboardKeys.add(_KeyBoardHotKey_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    hotKey.keyType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return hotKey;
            }
        }
    }

    public static void LJ(HotKey hotKey) {
        List<KeyBoardHotKey> list = hotKey.keyboardKeys;
        if (list == null) {
            hotKey.keyboardKeys = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<KeyBoardHotKey> it2 = hotKey.keyboardKeys.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        List<MouseHotKey> list2 = hotKey.mouseKeys;
        if (list2 == null) {
            hotKey.mouseKeys = new ArrayList();
        } else {
            if (list2.isEmpty()) {
                return;
            }
            Iterator<MouseHotKey> it3 = hotKey.mouseKeys.iterator();
            while (it3.hasNext()) {
                it3.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(HotKey hotKey) {
        LJ(hotKey);
    }

    @Override // X.C0IMD
    public final HotKey LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HotKey hotKey, List list) {
    }
}
