package webcast.api.first_recharge;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;
import webcast.api.first_recharge.GetFirstRechargeInfoV2Resp;

/* JADX INFO: loaded from: classes28.dex */
public final class _GetFirstRechargeInfoV2Resp_FirstRechargeCampaignV2_ProtoDecoder implements C0IMD<GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV2> {
    public static GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV2 LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV2 firstRechargeCampaignV2 = new GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV2();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        firstRechargeCampaignV2.isCashFirstCharge = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        firstRechargeCampaignV2.giftId = c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        firstRechargeCampaignV2.isShowCountdown = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 4:
                        firstRechargeCampaignV2.expireTime = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        firstRechargeCampaignV2.totalFrozenCoins = c1516680pZS.LJIIJ();
                        break;
                    case 6:
                        firstRechargeCampaignV2.remainingFrozenCoins = c1516680pZS.LJIIJ();
                        break;
                    case 7:
                        firstRechargeCampaignV2.minimumNumberOfCoinsToUnlockFrozenCoins = c1516680pZS.LJIIJ();
                        break;
                    case 8:
                        firstRechargeCampaignV2.frozenCoinsForLargePackages = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        firstRechargeCampaignV2.frozenCoinsForSmallPackages = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        firstRechargeCampaignV2.rechargeCoinsForLargePackages = c1516680pZS.LJIIJ();
                        break;
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        firstRechargeCampaignV2.rechargeCoinsForSmallPackages = c1516680pZS.LJIIJ();
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        firstRechargeCampaignV2.isFirstActiveConsumption = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        firstRechargeCampaignV2.firstCashRechargeTs = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return firstRechargeCampaignV2;
            }
        }
    }

    @Override // X.C0IMD
    public final GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV2 LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV2 firstRechargeCampaignV2) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV2 firstRechargeCampaignV2, List list) {
    }
}
