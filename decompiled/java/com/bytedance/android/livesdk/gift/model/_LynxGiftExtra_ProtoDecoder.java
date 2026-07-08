package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LynxGiftExtra_ProtoDecoder implements C0IMD<LynxGiftExtra> {
    public static LynxGiftExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LynxGiftExtra lynxGiftExtra = new LynxGiftExtra();
        lynxGiftExtra.params = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                if (iLJI != 5) {
                                    C1516700pZU.LJ(c1516680pZS);
                                } else {
                                    lynxGiftExtra.extra = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                lynxGiftExtra.params.add(C1516700pZU.LIZLLL(c1516680pZS));
                            }
                        } else {
                            lynxGiftExtra.type = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        lynxGiftExtra.code = c1516680pZS.LJIIJJI();
                    }
                } else {
                    lynxGiftExtra.id = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return lynxGiftExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LynxGiftExtra lynxGiftExtra) {
        LynxGiftExtra lynxGiftExtra2 = lynxGiftExtra;
        if (lynxGiftExtra2.params == null) {
            lynxGiftExtra2.params = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final LynxGiftExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LynxGiftExtra lynxGiftExtra, List list) {
    }
}
