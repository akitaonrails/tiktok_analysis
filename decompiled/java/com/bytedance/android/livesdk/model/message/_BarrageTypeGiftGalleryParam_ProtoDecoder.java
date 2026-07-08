package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _BarrageTypeGiftGalleryParam_ProtoDecoder implements C0IMD<BarrageTypeGiftGalleryParam> {
    public static BarrageTypeGiftGalleryParam LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        BarrageTypeGiftGalleryParam barrageTypeGiftGalleryParam = new BarrageTypeGiftGalleryParam();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        barrageTypeGiftGalleryParam.toUserId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    barrageTypeGiftGalleryParam.fromUserId = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return barrageTypeGiftGalleryParam;
            }
        }
    }

    @Override // X.C0IMD
    public final BarrageTypeGiftGalleryParam LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(BarrageTypeGiftGalleryParam barrageTypeGiftGalleryParam) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, BarrageTypeGiftGalleryParam barrageTypeGiftGalleryParam, List list) {
    }
}
