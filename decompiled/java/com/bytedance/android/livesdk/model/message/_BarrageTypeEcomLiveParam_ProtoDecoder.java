package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BarrageTypeEcomLiveParam_ProtoDecoder implements C0IMD<BarrageTypeEcomLiveParam> {
    public static BarrageTypeEcomLiveParam LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BarrageTypeEcomLiveParam barrageTypeEcomLiveParam = new BarrageTypeEcomLiveParam();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        barrageTypeEcomLiveParam.plpParams = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        barrageTypeEcomLiveParam.scene = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        barrageTypeEcomLiveParam.anchoredProductId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        barrageTypeEcomLiveParam.anchoredLabelKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        barrageTypeEcomLiveParam.entranceForm = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        barrageTypeEcomLiveParam.anchoredProductSource = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        barrageTypeEcomLiveParam.anchoredProductPlatform = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return barrageTypeEcomLiveParam;
            }
        }
    }

    @Override // X.C0IMD
    public final BarrageTypeEcomLiveParam LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BarrageTypeEcomLiveParam barrageTypeEcomLiveParam) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BarrageTypeEcomLiveParam barrageTypeEcomLiveParam, List list) {
    }
}
