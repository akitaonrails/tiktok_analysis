package tikcast.api.privilege.enigma;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;
import tikcast.api.privilege.enigma.EnigmaProductsResponse;

/* JADX INFO: loaded from: classes32.dex */
public final class _EnigmaProductsResponse_Data_EnigmaIAPProductDetails_ProtoDecoder implements C0IMD<EnigmaProductsResponse.Data.EnigmaIAPProductDetails> {
    public static EnigmaProductsResponse.Data.EnigmaIAPProductDetails LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        EnigmaProductsResponse.Data.EnigmaIAPProductDetails enigmaIAPProductDetails = new EnigmaProductsResponse.Data.EnigmaIAPProductDetails();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            switch (iLJI) {
                                case BdTuring.TYPE_EMAIL /* 11 */:
                                    enigmaIAPProductDetails.mpProductId = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                    enigmaIAPProductDetails.mpPricePointId = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                    enigmaIAPProductDetails.mpSkuId = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case 14:
                                    enigmaIAPProductDetails.mpBasePlanId = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case 15:
                                    enigmaIAPProductDetails.mpOfferId = C1516700pZU.LIZLLL(c1516680pZS);
                                    break;
                                case 16:
                                    enigmaIAPProductDetails.iapUsdPrice = _PriceDetail_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                                    enigmaIAPProductDetails.iapLocalPrice = _PriceDetail_ProtoDecoder.LIZLLL(c1516680pZS);
                                    break;
                                default:
                                    C1516700pZU.LJ(c1516680pZS);
                                    break;
                            }
                        } else {
                            enigmaIAPProductDetails.canPurchase = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        enigmaIAPProductDetails.renewPeriod = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    enigmaIAPProductDetails.isSubscription = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return enigmaIAPProductDetails;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(EnigmaProductsResponse.Data.EnigmaIAPProductDetails enigmaIAPProductDetails) {
    }

    @Override // X.C0IMD
    public final EnigmaProductsResponse.Data.EnigmaIAPProductDetails LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EnigmaProductsResponse.Data.EnigmaIAPProductDetails enigmaIAPProductDetails, List list) {
    }
}
