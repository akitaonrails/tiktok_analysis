package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EcommerceActivityInfo_ProtoDecoder implements C0IMD<EcommerceActivityInfo> {
    public static EcommerceActivityInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EcommerceActivityInfo ecommerceActivityInfo = new EcommerceActivityInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        ecommerceActivityInfo.activityId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        ecommerceActivityInfo.activityStatus = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        ecommerceActivityInfo.activityType = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        ecommerceActivityInfo.mainTitle = _SimpleText_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        ecommerceActivityInfo.subTitle = _SimpleText_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        ecommerceActivityInfo.shareTitle = _SimpleText_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        ecommerceActivityInfo.activitySchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        ecommerceActivityInfo.shareSchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return ecommerceActivityInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EcommerceActivityInfo ecommerceActivityInfo) {
    }

    @Override // X.C0IMD
    public final EcommerceActivityInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EcommerceActivityInfo ecommerceActivityInfo, List list) {
    }
}
