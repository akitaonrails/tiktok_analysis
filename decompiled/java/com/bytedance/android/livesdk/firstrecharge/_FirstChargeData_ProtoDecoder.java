package com.bytedance.android.livesdk.firstrecharge;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdk.wallet._Diamond_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FirstChargeData_ProtoDecoder implements C0IMD<FirstChargeData> {
    @Override // X.C0IMD
    public final void LIZ(FirstChargeData firstChargeData) {
        Diamond diamond = firstChargeData.diamond;
        if (diamond != null) {
            _Diamond_ProtoDecoder.LJ(diamond);
        }
    }

    @Override // X.C0IMD
    public final FirstChargeData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        FirstChargeData firstChargeData = new FirstChargeData();
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
                                firstChargeData.giftShowStyle = c1516680pZS.LJIIJ();
                            }
                        } else {
                            firstChargeData.diamond = _Diamond_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        firstChargeData.rule = _FirstChargeGuideEffectRule_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    firstChargeData.isFirstCharge = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return firstChargeData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FirstChargeData firstChargeData, List list) {
    }
}
