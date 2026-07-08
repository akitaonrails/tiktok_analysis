package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _WhiteBoxData_ProtoDecoder implements C0IMD<WhiteBoxData> {
    public static WhiteBoxData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        WhiteBoxData whiteBoxData = new WhiteBoxData();
        whiteBoxData.dataList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                whiteBoxData.trafficDiagnose = _TrafficDiagnose_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            whiteBoxData.dataList.add(_WhiteBoxDataItem_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        whiteBoxData.totalRecommendationViewers = c1516680pZS.LJIIJJI();
                    }
                } else {
                    whiteBoxData.totalViewers = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return whiteBoxData;
            }
        }
    }

    public static void LJ(WhiteBoxData whiteBoxData) {
        List<WhiteBoxDataItem> list = whiteBoxData.dataList;
        if (list == null) {
            whiteBoxData.dataList = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<WhiteBoxDataItem> it2 = whiteBoxData.dataList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        TrafficDiagnose trafficDiagnose = whiteBoxData.trafficDiagnose;
        if (trafficDiagnose != null && trafficDiagnose.diagnoseParams == null) {
            trafficDiagnose.diagnoseParams = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(WhiteBoxData whiteBoxData) {
        LJ(whiteBoxData);
    }

    @Override // X.C0IMD
    public final WhiteBoxData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, WhiteBoxData whiteBoxData, List list) {
    }
}
