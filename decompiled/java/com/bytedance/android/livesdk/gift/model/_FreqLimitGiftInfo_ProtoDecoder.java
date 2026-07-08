package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FreqLimitGiftInfo_ProtoDecoder implements C0IMD<FreqLimitGiftInfo> {
    public static FreqLimitGiftInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FreqLimitGiftInfo freqLimitGiftInfo = new FreqLimitGiftInfo();
        freqLimitGiftInfo.freqLimitGiftOptions = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    freqLimitGiftInfo.freqLimitGiftOptions.add(_FreqLimitGiftOption_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return freqLimitGiftInfo;
            }
        }
    }

    public static void LJ(FreqLimitGiftInfo freqLimitGiftInfo) {
        List<FreqLimitGiftOption> list = freqLimitGiftInfo.freqLimitGiftOptions;
        if (list == null) {
            freqLimitGiftInfo.freqLimitGiftOptions = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<FreqLimitGiftOption> it2 = freqLimitGiftInfo.freqLimitGiftOptions.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(FreqLimitGiftInfo freqLimitGiftInfo) {
        LJ(freqLimitGiftInfo);
    }

    @Override // X.C0IMD
    public final FreqLimitGiftInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FreqLimitGiftInfo freqLimitGiftInfo, List list) {
    }
}
