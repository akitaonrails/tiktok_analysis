package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model._Gift_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _CapsuleBizParamsRandomGift_ProtoDecoder implements C0IMD<CapsuleBizParamsRandomGift> {
    public static CapsuleBizParamsRandomGift LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CapsuleBizParamsRandomGift capsuleBizParamsRandomGift = new CapsuleBizParamsRandomGift();
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
                                    capsuleBizParamsRandomGift.filterHost = C1516700pZU.LIZ(c1516680pZS);
                                }
                            } else {
                                capsuleBizParamsRandomGift.type = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            capsuleBizParamsRandomGift.gift = _Gift_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        capsuleBizParamsRandomGift.effectNameKey = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    capsuleBizParamsRandomGift.round = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return capsuleBizParamsRandomGift;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CapsuleBizParamsRandomGift capsuleBizParamsRandomGift) {
        Gift gift = capsuleBizParamsRandomGift.gift;
        if (gift != null) {
            _Gift_ProtoDecoder.LJ(gift);
        }
    }

    @Override // X.C0IMD
    public final CapsuleBizParamsRandomGift LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CapsuleBizParamsRandomGift capsuleBizParamsRandomGift, List list) {
    }
}
