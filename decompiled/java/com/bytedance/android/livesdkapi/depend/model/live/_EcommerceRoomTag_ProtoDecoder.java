package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _EcommerceRoomTag_ProtoDecoder implements C0IMD<EcommerceRoomTag> {
    public static EcommerceRoomTag LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EcommerceRoomTag ecommerceRoomTag = new EcommerceRoomTag();
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
                                ecommerceRoomTag.daInfo = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        } else {
                            ecommerceRoomTag.tagShowTime = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        ecommerceRoomTag.tagType = c1516680pZS.LJIIJ();
                    }
                } else {
                    ecommerceRoomTag.tagName = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return ecommerceRoomTag;
            }
        }
    }

    @Override // X.C0IMD
    public final EcommerceRoomTag LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(EcommerceRoomTag ecommerceRoomTag) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EcommerceRoomTag ecommerceRoomTag, List list) {
    }
}
