package webcast.data;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EcPreLiveCheckListStepData_ProtoDecoder implements C0IMD<EcPreLiveCheckListStepData> {
    public static EcPreLiveCheckListStepData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EcPreLiveCheckListStepData ecPreLiveCheckListStepData = new EcPreLiveCheckListStepData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        ecPreLiveCheckListStepData.ifFinish = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        ecPreLiveCheckListStepData.titleText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        ecPreLiveCheckListStepData.contentText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        ecPreLiveCheckListStepData.buttonText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        ecPreLiveCheckListStepData.jumpSchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        ecPreLiveCheckListStepData.checkListStepType = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return ecPreLiveCheckListStepData;
            }
        }
    }

    @Override // X.C0IMD
    public final EcPreLiveCheckListStepData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(EcPreLiveCheckListStepData ecPreLiveCheckListStepData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EcPreLiveCheckListStepData ecPreLiveCheckListStepData, List list) {
    }
}
