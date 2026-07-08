package com.bytedance.android.livesdk.gift.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftIconInfo_ProtoDecoder implements C0IMD<GiftIconInfo> {
    public static GiftIconInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftIconInfo giftIconInfo = new GiftIconInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        giftIconInfo.mIconId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        giftIconInfo.mName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        giftIconInfo.mValidStartAt = c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        giftIconInfo.mValidEndAt = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        giftIconInfo.mIconUri = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        giftIconInfo.mIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        giftIconInfo.mWith_effect = Boolean.valueOf(C1516700pZU.LIZ(c1516680pZS));
                        break;
                    case 8:
                        giftIconInfo.mEffectUri = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        giftIconInfo.mEffect = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftIconInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftIconInfo giftIconInfo) {
        GiftIconInfo giftIconInfo2 = giftIconInfo;
        ImageModel imageModel = giftIconInfo2.mIcon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = giftIconInfo2.mEffect;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
    }

    @Override // X.C0IMD
    public final GiftIconInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftIconInfo giftIconInfo, List list) {
    }
}
