package com.bytedance.android.livesdk.viewer_picks.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GameTricksShortcut_ProtoDecoder implements C0IMD<GameTricksShortcut> {
    public static GameTricksShortcut LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GameTricksShortcut gameTricksShortcut = new GameTricksShortcut();
        gameTricksShortcut.hotKeys = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    gameTricksShortcut.hotKeys.add(_HotKey_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return gameTricksShortcut;
            }
        }
    }

    public static void LJ(GameTricksShortcut gameTricksShortcut) {
        List<HotKey> list = gameTricksShortcut.hotKeys;
        if (list == null) {
            gameTricksShortcut.hotKeys = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (HotKey hotKey : gameTricksShortcut.hotKeys) {
            if (hotKey != null) {
                _HotKey_ProtoDecoder.LJ(hotKey);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GameTricksShortcut gameTricksShortcut) {
        LJ(gameTricksShortcut);
    }

    @Override // X.C0IMD
    public final GameTricksShortcut LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GameTricksShortcut gameTricksShortcut, List list) {
    }
}
