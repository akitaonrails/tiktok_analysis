package com.bytedance.android.livesdk.model.message;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _Billboard_ProtoDecoder implements C0IMD<Billboard> {
    public static Billboard LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Billboard billboard = new Billboard();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        billboard.id = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        billboard.authorId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        billboard.title = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        billboard.type = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        billboard.status = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        billboard.promotionConfig = _BillboardPromotionConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        billboard.imageConfig = _BillboardImageConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        billboard.productConfig = _BillboardProductConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        billboard.bigSaleConfig = _BigSaleConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        billboard.desc = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        billboard.schema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        billboard.billboardTypeInt = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        billboard.uiType = c1516680pZS.LJIIJ();
                        break;
                    case 14:
                        billboard.sizeGuidanceConfig = _BillboardSizeGuidanceConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 15:
                        billboard.keyMessageConfig = _BillboardKeyMessageConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 16:
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        billboard.auctionConfig = _GroupConfig_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                        billboard.cSchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 19:
                        billboard.supportAutoSet = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                        billboard.triggerSource = c1516680pZS.LJIIJ();
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return billboard;
            }
        }
    }

    public static void LJ(Billboard billboard) {
        BillboardPromotionConfig billboardPromotionConfig = billboard.promotionConfig;
        if (billboardPromotionConfig != null) {
            _BillboardPromotionConfig_ProtoDecoder.LJ(billboardPromotionConfig);
        }
        BillboardProductConfig billboardProductConfig = billboard.productConfig;
        BillboardSizeGuidanceConfig billboardSizeGuidanceConfig = billboard.sizeGuidanceConfig;
        if (billboardSizeGuidanceConfig != null) {
            _BillboardSizeGuidanceConfig_ProtoDecoder.LJ(billboardSizeGuidanceConfig);
        }
        GroupConfig groupConfig = billboard.auctionConfig;
        if (groupConfig != null) {
            _GroupConfig_ProtoDecoder.LJ(groupConfig);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Billboard billboard) {
        LJ(billboard);
    }

    @Override // X.C0IMD
    public final Billboard LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Billboard billboard, List list) {
    }
}
