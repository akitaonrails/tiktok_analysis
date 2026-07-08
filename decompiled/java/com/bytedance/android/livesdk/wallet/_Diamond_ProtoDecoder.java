package com.bytedance.android.livesdk.wallet;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.wallet.model.CurrencyPriceItem;
import com.bytedance.android.live.wallet.model._CurrencyPriceItem_ProtoDecoder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class _Diamond_ProtoDecoder implements C0IMD<Diamond> {
    public static Diamond LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        Diamond diamond = new Diamond();
        diamond.currencyPrice = new ArrayList();
        diamond.backupIapIdList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 20) {
                    if (iLJI != 21) {
                        if (iLJI != 101) {
                            if (iLJI != 102) {
                                switch (iLJI) {
                                    case 1:
                                        diamond.id = (int) c1516680pZS.LJIIJJI();
                                        break;
                                    case 2:
                                        diamond.iapId = C1516700pZU.LIZLLL(c1516680pZS);
                                        break;
                                    case 3:
                                        diamond.price = String.valueOf(c1516680pZS.LJIIJ());
                                        break;
                                    case 4:
                                        diamond.exchangePrice = Integer.valueOf(c1516680pZS.LJIIJ());
                                        break;
                                    case 5:
                                        diamond.count = c1516680pZS.LJIIJ();
                                        break;
                                    case 6:
                                        diamond.givingCount = c1516680pZS.LJIIJ();
                                        break;
                                    case 7:
                                        diamond.describe = C1516700pZU.LIZLLL(c1516680pZS);
                                        break;
                                    case 8:
                                        diamond.currencyPrice.add(_CurrencyPriceItem_ProtoDecoder.LIZLLL(c1516680pZS));
                                        break;
                                    case BdTuring.TYPE_ECAF /* 9 */:
                                        diamond.couponId = C1516700pZU.LIZLLL(c1516680pZS);
                                        break;
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                        diamond.discountPrice = Integer.valueOf(c1516680pZS.LJIIJ());
                                        break;
                                    case BdTuring.TYPE_EMAIL /* 11 */:
                                        diamond.stallType = c1516680pZS.LJIIJ();
                                        break;
                                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                        diamond.genericIapId = C1516700pZU.LIZLLL(c1516680pZS);
                                        break;
                                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                        diamond.productId = C1516700pZU.LIZLLL(c1516680pZS);
                                        break;
                                    case 14:
                                        diamond.pricePointId = C1516700pZU.LIZLLL(c1516680pZS);
                                        break;
                                    case 15:
                                        diamond.purchaseOptionId = C1516700pZU.LIZLLL(c1516680pZS);
                                        break;
                                    case 16:
                                        diamond.isAlternative = C1516700pZU.LIZ(c1516680pZS);
                                        break;
                                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                        diamond.type = c1516680pZS.LJIIJ();
                                        break;
                                    default:
                                        switch (iLJI) {
                                            case 104:
                                                diamond.customPrice = C1516700pZU.LIZLLL(c1516680pZS);
                                                break;
                                            case 105:
                                                diamond.customPriceCurrency = C1516700pZU.LIZLLL(c1516680pZS);
                                                break;
                                            case 106:
                                                diamond.iapExternalPaymentLinkType = C1516700pZU.LIZLLL(c1516680pZS);
                                                break;
                                            default:
                                                C1516700pZU.LJ(c1516680pZS);
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                diamond.isFrequent = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            diamond.isLast = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        diamond.usdPrice = _CurrencyPriceItem_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    diamond.backupIapIdList.add(C1516700pZU.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return diamond;
            }
        }
    }

    public static void LJ(Diamond diamond) {
        List<CurrencyPriceItem> list = diamond.currencyPrice;
        if (list == null) {
            diamond.currencyPrice = new ArrayList();
        } else if (!list.isEmpty()) {
            Iterator<CurrencyPriceItem> it2 = diamond.currencyPrice.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        if (diamond.backupIapIdList == null) {
            diamond.backupIapIdList = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final void LIZ(Diamond diamond) {
        LJ(diamond);
    }

    @Override // X.C0IMD
    public final Diamond LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, Diamond diamond, List list) {
    }
}
