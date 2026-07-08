package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CommerceStruct_ProtoDecoder implements C0IMD<CommerceStruct> {
    public static CommerceStruct LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CommerceStruct commerceStruct = new CommerceStruct();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        commerceStruct.commercePermission = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        commerceStruct.oecInitDataString = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        commerceStruct.asyncLoad = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        commerceStruct.productNum = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        commerceStruct.useNewPromotion = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        commerceStruct.bottomButtonLayout = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return commerceStruct;
            }
        }
    }

    @Override // X.C0IMD
    public final CommerceStruct LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(CommerceStruct commerceStruct) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CommerceStruct commerceStruct, List list) {
    }
}
