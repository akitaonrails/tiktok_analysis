package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftHintInfo_ProtoDecoder implements C0IMD<GiftHintInfo> {
    public static GiftHintInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftHintInfo giftHintInfo = new GiftHintInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        giftHintInfo.hintId = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        giftHintInfo.hintIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        giftHintInfo.hintText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        giftHintInfo.hintShowDelayMs = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        giftHintInfo.giftId = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        giftHintInfo.hasGiftHistory = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftHintInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftHintInfo giftHintInfo) {
        ImageModel imageModel = giftHintInfo.hintIcon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final GiftHintInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftHintInfo giftHintInfo, List list) {
    }
}
