package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EcPreLiveChecklistData_ProtoDecoder implements C0IMD<EcPreLiveChecklistData> {
    public static EcPreLiveChecklistData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EcPreLiveChecklistData ecPreLiveChecklistData = new EcPreLiveChecklistData();
        ecPreLiveChecklistData.checkListStepData = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        ecPreLiveChecklistData.checklistSchema = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    ecPreLiveChecklistData.checkListStepData.add(_EcPreLiveCheckListStepData_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return ecPreLiveChecklistData;
            }
        }
    }

    public static void LJ(EcPreLiveChecklistData ecPreLiveChecklistData) {
        List<EcPreLiveCheckListStepData> list = ecPreLiveChecklistData.checkListStepData;
        if (list == null) {
            ecPreLiveChecklistData.checkListStepData = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<EcPreLiveCheckListStepData> it2 = ecPreLiveChecklistData.checkListStepData.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EcPreLiveChecklistData ecPreLiveChecklistData) {
        LJ(ecPreLiveChecklistData);
    }

    @Override // X.C0IMD
    public final EcPreLiveChecklistData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EcPreLiveChecklistData ecPreLiveChecklistData, List list) {
    }
}
