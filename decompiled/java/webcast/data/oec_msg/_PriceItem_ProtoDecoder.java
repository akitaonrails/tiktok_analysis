package webcast.data.oec_msg;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class _PriceItem_ProtoDecoder implements C0IMD<PriceItem> {
    public static PriceItem LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PriceItem priceItem = new PriceItem();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 2:
                        priceItem.currencyName = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        priceItem.currencySymbol = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        priceItem.symbolPosition = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        priceItem.salePriceDecimal = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        priceItem.originPriceDecimal = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 7:
                        priceItem.salePriceFormat = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 8:
                        priceItem.originPriceFormat = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        priceItem.discountFormat = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        priceItem.discountDecimal = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        priceItem.pricePrefix = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        priceItem.reducePriceFormat = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        priceItem.singleProductPriceFormat = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 14:
                        priceItem.showCurrencySpace = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 15:
                        priceItem.currencyShowMode = c1516680pZS.LJIIJ();
                        break;
                    case 16:
                        priceItem.priceDisplayMode = c1516680pZS.LJIIJ();
                        break;
                    case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                        priceItem.priceHideInfo = _PriceHideInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return priceItem;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(PriceItem priceItem) {
    }

    @Override // X.C0IMD
    public final PriceItem LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PriceItem priceItem, List list) {
    }
}
