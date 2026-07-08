package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FlashSaleAtmosphereInfo_ProtoDecoder implements C0IMD<FlashSaleAtmosphereInfo> {
    public static FlashSaleAtmosphereInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        FlashSaleAtmosphereInfo flashSaleAtmosphereInfo = new FlashSaleAtmosphereInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        flashSaleAtmosphereInfo.productId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        flashSaleAtmosphereInfo.activityId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        flashSaleAtmosphereInfo.flashSaleAtmosphere = _FlashSaleAtmosphere_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        flashSaleAtmosphereInfo.flashSaleStock = _FlashSaleStock_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        flashSaleAtmosphereInfo.pinnedProduct = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 6:
                        flashSaleAtmosphereInfo.liveOnlyChannel = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 7:
                        flashSaleAtmosphereInfo.creatorLimitType = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return flashSaleAtmosphereInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(FlashSaleAtmosphereInfo flashSaleAtmosphereInfo) {
        FlashSaleEnhancementInfo flashSaleEnhancementInfo;
        FlashSaleAtmosphere flashSaleAtmosphere = flashSaleAtmosphereInfo.flashSaleAtmosphere;
        if (flashSaleAtmosphere != null && (flashSaleEnhancementInfo = flashSaleAtmosphere.enhancementInfo) != null) {
            _FlashSaleEnhancementInfo_ProtoDecoder.LJ(flashSaleEnhancementInfo);
        }
    }

    @Override // X.C0IMD
    public final FlashSaleAtmosphereInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FlashSaleAtmosphereInfo flashSaleAtmosphereInfo, List list) {
    }
}
