package webcast.data.oec_msg;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LiveFlashSaleInfo_ProtoDecoder implements C0IMD<LiveFlashSaleInfo> {
    public static LiveFlashSaleInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LiveFlashSaleInfo liveFlashSaleInfo = new LiveFlashSaleInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        liveFlashSaleInfo.activityId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        liveFlashSaleInfo.type = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        liveFlashSaleInfo.status = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        liveFlashSaleInfo.stockStatus = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        liveFlashSaleInfo.availableStock = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        liveFlashSaleInfo.totalStock = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        liveFlashSaleInfo.enhancementInfo = _FlashSaleEnhancementInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        liveFlashSaleInfo.pdpViewerCount = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return liveFlashSaleInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(LiveFlashSaleInfo liveFlashSaleInfo) {
        FlashSaleEnhancementInfo flashSaleEnhancementInfo = liveFlashSaleInfo.enhancementInfo;
        if (flashSaleEnhancementInfo != null) {
            _FlashSaleEnhancementInfo_ProtoDecoder.LJ(flashSaleEnhancementInfo);
        }
    }

    @Override // X.C0IMD
    public final LiveFlashSaleInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LiveFlashSaleInfo liveFlashSaleInfo, List list) {
    }
}
