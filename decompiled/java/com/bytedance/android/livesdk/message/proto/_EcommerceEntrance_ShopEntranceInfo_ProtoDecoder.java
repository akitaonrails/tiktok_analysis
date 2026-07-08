package com.bytedance.android.livesdk.message.proto;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class _EcommerceEntrance_ShopEntranceInfo_ProtoDecoder implements C0IMD<EcommerceEntrance.ShopEntranceInfo> {
    public static EcommerceEntrance.ShopEntranceInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EcommerceEntrance.ShopEntranceInfo shopEntranceInfo = new EcommerceEntrance.ShopEntranceInfo();
        shopEntranceInfo.sellingPoint = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        shopEntranceInfo.shopId = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        shopEntranceInfo.shopName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        shopEntranceInfo.shopRating = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        shopEntranceInfo.storeLabel = _EcommerceEntrance_ShopEntranceInfo_StoreLabel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        shopEntranceInfo.formatSoldCount = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        shopEntranceInfo.soldCount = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        shopEntranceInfo.expRatePercentile = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        shopEntranceInfo.expRateTopDisplay = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        shopEntranceInfo.rateDisplayStyle = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        shopEntranceInfo.showRateNotApplicable = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        shopEntranceInfo.sellingPoint.add(_EcommerceEntrance_SellingPoint_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return shopEntranceInfo;
            }
        }
    }

    public static void LJ(EcommerceEntrance.ShopEntranceInfo shopEntranceInfo) {
        EcommerceEntrance.ShopEntranceInfo.StoreLabel storeLabel = shopEntranceInfo.storeLabel;
        if (storeLabel != null) {
            EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel storeOfficialLabel = storeLabel.officialLabel;
            if (storeOfficialLabel != null) {
                EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage shopLabelImage = storeOfficialLabel.labelImageLight;
                if (shopLabelImage != null) {
                    _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ShopLabelImage_ProtoDecoder.LJ(shopLabelImage);
                }
                EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreOfficialLabel.ShopLabelImage shopLabelImage2 = storeOfficialLabel.labelImageDark;
                if (shopLabelImage2 != null) {
                    _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreOfficialLabel_ShopLabelImage_ProtoDecoder.LJ(shopLabelImage2);
                }
            }
            EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel storeIdentityLabel = storeLabel.shopIdentityLabel;
            if (storeIdentityLabel != null) {
                EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel.ShopLabelImage shopLabelImage3 = storeIdentityLabel.identityLogoLight;
                if (shopLabelImage3 != null) {
                    _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreIdentityLabel_ShopLabelImage_ProtoDecoder.LJ(shopLabelImage3);
                }
                EcommerceEntrance.ShopEntranceInfo.StoreLabel.StoreIdentityLabel.ShopLabelImage shopLabelImage4 = storeIdentityLabel.identityLogoDark;
                if (shopLabelImage4 != null) {
                    _EcommerceEntrance_ShopEntranceInfo_StoreLabel_StoreIdentityLabel_ShopLabelImage_ProtoDecoder.LJ(shopLabelImage4);
                }
            }
        }
        List<EcommerceEntrance.SellingPoint> list = shopEntranceInfo.sellingPoint;
        if (list == null) {
            shopEntranceInfo.sellingPoint = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<EcommerceEntrance.SellingPoint> it2 = shopEntranceInfo.sellingPoint.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EcommerceEntrance.ShopEntranceInfo shopEntranceInfo) {
        LJ(shopEntranceInfo);
    }

    @Override // X.C0IMD
    public final EcommerceEntrance.ShopEntranceInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EcommerceEntrance.ShopEntranceInfo shopEntranceInfo, List list) {
    }
}
