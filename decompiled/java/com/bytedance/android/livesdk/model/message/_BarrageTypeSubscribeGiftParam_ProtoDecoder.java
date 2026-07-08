package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BarrageTypeSubscribeGiftParam_ProtoDecoder implements C0IMD<BarrageTypeSubscribeGiftParam> {
    public static BarrageTypeSubscribeGiftParam LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BarrageTypeSubscribeGiftParam barrageTypeSubscribeGiftParam = new BarrageTypeSubscribeGiftParam();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            barrageTypeSubscribeGiftParam.giftSource = c1516680pZS.LJIIJ();
                        }
                    } else {
                        barrageTypeSubscribeGiftParam.showGiftSubCount = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    barrageTypeSubscribeGiftParam.giftSubCount = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return barrageTypeSubscribeGiftParam;
            }
        }
    }

    @Override // X.C0IMD
    public final BarrageTypeSubscribeGiftParam LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BarrageTypeSubscribeGiftParam barrageTypeSubscribeGiftParam) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BarrageTypeSubscribeGiftParam barrageTypeSubscribeGiftParam, List list) {
    }
}
