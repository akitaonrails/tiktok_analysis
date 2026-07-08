package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _HighlightToolbarComInfo_ProtoDecoder implements C0IMD<HighlightToolbarComInfo> {
    public static HighlightToolbarComInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        HighlightToolbarComInfo highlightToolbarComInfo = new HighlightToolbarComInfo();
        highlightToolbarComInfo.highlightComTypes = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        highlightToolbarComInfo.priority = c1516680pZS.LJIIJJI();
                    }
                } else {
                    highlightToolbarComInfo.highlightComTypes.add(Integer.valueOf(c1516680pZS.LJIIJ()));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return highlightToolbarComInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(HighlightToolbarComInfo highlightToolbarComInfo) {
        HighlightToolbarComInfo highlightToolbarComInfo2 = highlightToolbarComInfo;
        if (highlightToolbarComInfo2.highlightComTypes == null) {
            highlightToolbarComInfo2.highlightComTypes = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final HighlightToolbarComInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HighlightToolbarComInfo highlightToolbarComInfo, List list) {
    }
}
