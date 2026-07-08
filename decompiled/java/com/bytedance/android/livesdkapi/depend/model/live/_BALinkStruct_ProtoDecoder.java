package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BALinkStruct_ProtoDecoder implements C0IMD<BALinkStruct> {
    public static BALinkStruct LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BALinkStruct bALinkStruct = new BALinkStruct();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        bALinkStruct.baLinkData = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    bALinkStruct.baLinkPermission = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return bALinkStruct;
            }
        }
    }

    @Override // X.C0IMD
    public final BALinkStruct LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BALinkStruct bALinkStruct) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BALinkStruct bALinkStruct, List list) {
    }
}
