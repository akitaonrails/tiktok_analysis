package com.bytedance.android.livesdk.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ShortTouchTemplateData_ProtoDecoder implements C0IMD<ShortTouchTemplateData> {
    public static ShortTouchTemplateData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ShortTouchTemplateData shortTouchTemplateData = new ShortTouchTemplateData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        shortTouchTemplateData.status = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        shortTouchTemplateData.businessId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        shortTouchTemplateData.hasInteracted = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        shortTouchTemplateData.sendUserId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        shortTouchTemplateData.endTime = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        shortTouchTemplateData.bigCardLottieImgUrl = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        shortTouchTemplateData.businessCount = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        shortTouchTemplateData.logParams = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return shortTouchTemplateData;
            }
        }
    }

    @Override // X.C0IMD
    public final ShortTouchTemplateData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(ShortTouchTemplateData shortTouchTemplateData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ShortTouchTemplateData shortTouchTemplateData, List list) {
    }
}
