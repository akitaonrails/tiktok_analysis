package webcast.api.first_recharge;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdk.wallet._Diamond_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import webcast.api.first_recharge.GetFirstRechargeInfoV2Resp;

/* JADX INFO: loaded from: classes.dex */
public final class _GetFirstRechargeInfoV2Resp_FirstRechargeCampaignV1_ProtoDecoder implements C0IMD<GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV1> {
    public static GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV1 LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV1 firstRechargeCampaignV1 = new GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV1();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        firstRechargeCampaignV1.isFirstCharge = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    case 2:
                        firstRechargeCampaignV1.guideEffectRule = _GetFirstRechargeInfoV2Resp_FirstChargeGuideEffectRule_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        firstRechargeCampaignV1.defaultDiamond = _Diamond_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        firstRechargeCampaignV1.firstChargeGiftStyle = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        firstRechargeCampaignV1.packageEntranceImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        firstRechargeCampaignV1.isGuideM2Account = C1516700pZU.LIZ(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return firstRechargeCampaignV1;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV1 firstRechargeCampaignV1) {
        GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV1 firstRechargeCampaignV12 = firstRechargeCampaignV1;
        GetFirstRechargeInfoV2Resp.FirstChargeGuideEffectRule firstChargeGuideEffectRule = firstRechargeCampaignV12.guideEffectRule;
        if (firstChargeGuideEffectRule != null && firstChargeGuideEffectRule.enterRoomShowTime == null) {
            firstChargeGuideEffectRule.enterRoomShowTime = new ArrayList();
        }
        Diamond diamond = firstRechargeCampaignV12.defaultDiamond;
        if (diamond != null) {
            _Diamond_ProtoDecoder.LJ(diamond);
        }
        ImageModel imageModel = firstRechargeCampaignV12.packageEntranceImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV1 LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV1 firstRechargeCampaignV1, List list) {
    }
}
