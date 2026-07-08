package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FreqLimitGiftOption_ProtoDecoder implements C0IMD<FreqLimitGiftOption> {
    public static FreqLimitGiftOption LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FreqLimitGiftOption freqLimitGiftOption = new FreqLimitGiftOption();
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
                                    freqLimitGiftOption.frequencyLimit = c1516680pZS.LJIIJ();
                                }
                            } else {
                                freqLimitGiftOption.workSingleAnchor = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            freqLimitGiftOption.closeGiftPanel = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        freqLimitGiftOption.refreshTimeStamp = c1516680pZS.LJIIJJI();
                    }
                } else {
                    freqLimitGiftOption.giftId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return freqLimitGiftOption;
            }
        }
    }

    @Override // X.C0IMD
    public final FreqLimitGiftOption LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(FreqLimitGiftOption freqLimitGiftOption) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FreqLimitGiftOption freqLimitGiftOption, List list) {
    }
}
