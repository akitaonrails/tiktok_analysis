package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdkapi.depend.model.live.ShowInfo;
import com.bytedance.android.livesdkapi.depend.model.live._ShowInfo_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TopFrameSummary_ProtoDecoder implements C0IMD<TopFrameSummary> {
    public static TopFrameSummary LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TopFrameSummary topFrameSummary = new TopFrameSummary();
        topFrameSummary.showList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        topFrameSummary.id = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        topFrameSummary.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        topFrameSummary.schema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        topFrameSummary.showList.add(_ShowInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    case 5:
                        topFrameSummary.idStr = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        topFrameSummary.isPreRecorded = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 7:
                        topFrameSummary.preRecordedBadgeText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return topFrameSummary;
            }
        }
    }

    public static void LJ(TopFrameSummary topFrameSummary) {
        List<ShowInfo> list = topFrameSummary.showList;
        if (list == null) {
            topFrameSummary.showList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (ShowInfo showInfo : topFrameSummary.showList) {
            if (showInfo != null) {
                _ShowInfo_ProtoDecoder.LJ(showInfo);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TopFrameSummary topFrameSummary) {
        LJ(topFrameSummary);
    }

    @Override // X.C0IMD
    public final TopFrameSummary LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TopFrameSummary topFrameSummary, List list) {
    }
}
