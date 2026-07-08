package com.bytedance.android.livesdk.message.proto;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreIdentityLabel_ProtoDecoder implements C0IMD<EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel> {
    public static EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel storeIdentityLabel = new EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        storeIdentityLabel.labelType = c1516680pZS.LJIIJ();
                        break;
                    case 2:
                        storeIdentityLabel.identityLabelText = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        storeIdentityLabel.identityLogoLight = _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreIdentityLabel_ShopLabelImage_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        storeIdentityLabel.identityLogoDark = _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreIdentityLabel_ShopLabelImage_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        storeIdentityLabel.identityLabelBgColorLight = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        storeIdentityLabel.identityLabelBgColorDark = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        storeIdentityLabel.identityLabelTextColorLight = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        storeIdentityLabel.identityLabelTextColorDark = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        storeIdentityLabel.shopExplanationPageSchema = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        storeIdentityLabel.shopIdentityLabelKey = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return storeIdentityLabel;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel storeIdentityLabel) {
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel storeIdentityLabel2 = storeIdentityLabel;
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel.ShopLabelImage shopLabelImage = storeIdentityLabel2.identityLogoLight;
        if (shopLabelImage != null) {
            _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreIdentityLabel_ShopLabelImage_ProtoDecoder.LJ(shopLabelImage);
        }
        EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel.ShopLabelImage shopLabelImage2 = storeIdentityLabel2.identityLogoDark;
        if (shopLabelImage2 != null) {
            _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreIdentityLabel_ShopLabelImage_ProtoDecoder.LJ(shopLabelImage2);
        }
    }

    @Override // X.C0IMD
    public final EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel storeIdentityLabel, List list) {
    }
}
