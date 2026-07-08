package com.bytedance.android.livesdkapi.depend.model.live.match;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GiftMode_ProtoDecoder implements C0IMD<GiftMode> {
    public static GiftMode LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GiftMode giftMode = new GiftMode();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        giftMode.giftId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        giftMode.giftName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        giftMode.giftIconImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        giftMode.giftPrice = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        giftMode.giftBackgroundImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        giftMode.releaseVersion = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        giftMode.hasFlashEffect = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 8:
                        giftMode.eventIconImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        giftMode.labelText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        giftMode.giftDisplayState = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        giftMode.customDescription = _Text_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return giftMode;
            }
        }
    }

    public static void LJ(GiftMode giftMode) {
        ImageModel imageModel = giftMode.giftIconImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
        ImageModel imageModel2 = giftMode.giftBackgroundImage;
        if (imageModel2 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel2);
        }
        ImageModel imageModel3 = giftMode.eventIconImage;
        if (imageModel3 != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel3);
        }
        Text text = giftMode.customDescription;
        if (text != null) {
            _Text_ProtoDecoder.LJ(text);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GiftMode giftMode) {
        LJ(giftMode);
    }

    @Override // X.C0IMD
    public final GiftMode LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GiftMode giftMode, List list) {
    }
}
