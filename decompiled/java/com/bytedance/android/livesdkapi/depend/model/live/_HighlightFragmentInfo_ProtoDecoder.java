package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _HighlightFragmentInfo_ProtoDecoder implements C0IMD<HighlightFragmentInfo> {
    public static HighlightFragmentInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        HighlightFragmentInfo highlightFragmentInfo = new HighlightFragmentInfo();
        highlightFragmentInfo.fragmentList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    highlightFragmentInfo.fragmentList.add(_LiveFragmentDetail_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return highlightFragmentInfo;
            }
        }
    }

    public static void LJ(HighlightFragmentInfo highlightFragmentInfo) {
        List<LiveFragmentDetail> list = highlightFragmentInfo.fragmentList;
        if (list == null) {
            highlightFragmentInfo.fragmentList = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<LiveFragmentDetail> it2 = highlightFragmentInfo.fragmentList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(HighlightFragmentInfo highlightFragmentInfo) {
        LJ(highlightFragmentInfo);
    }

    @Override // X.C0IMD
    public final HighlightFragmentInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HighlightFragmentInfo highlightFragmentInfo, List list) {
    }
}
