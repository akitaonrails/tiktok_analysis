package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FlashSaleAtmosphere_ProtoDecoder implements C0IMD<FlashSaleAtmosphere> {
    public static FlashSaleAtmosphere LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FlashSaleAtmosphere flashSaleAtmosphere = new FlashSaleAtmosphere();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        flashSaleAtmosphere.status = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        flashSaleAtmosphere.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        flashSaleAtmosphere.endTime = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        flashSaleAtmosphere.preheatTime = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        flashSaleAtmosphere.enhancementInfo = _FlashSaleEnhancementInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        flashSaleAtmosphere.pdpViewerCount = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return flashSaleAtmosphere;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(FlashSaleAtmosphere flashSaleAtmosphere) {
        FlashSaleEnhancementInfo flashSaleEnhancementInfo = flashSaleAtmosphere.enhancementInfo;
        if (flashSaleEnhancementInfo != null) {
            _FlashSaleEnhancementInfo_ProtoDecoder.LJ(flashSaleEnhancementInfo);
        }
    }

    @Override // X.C0IMD
    public final FlashSaleAtmosphere LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FlashSaleAtmosphere flashSaleAtmosphere, List list) {
    }
}
