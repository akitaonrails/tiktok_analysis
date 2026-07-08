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
import java.util.HashMap;
import java.util.List;
import webcast.api.first_recharge.GetFirstRechargeInfoV2Resp;
import webcast.data.TouchPointData;
import webcast.data._TouchPointData_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _GetFirstRechargeInfoV2Resp_Data_ProtoDecoder implements C0IMD<GetFirstRechargeInfoV2Resp.Data> {
    public static GetFirstRechargeInfoV2Resp.Data LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GetFirstRechargeInfoV2Resp.Data data = new GetFirstRechargeInfoV2Resp.Data();
        data.tpDataList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 100) {
                    switch (iLJI) {
                        case 1:
                            data.campaignType = c1516680pZS.LJIIJ();
                            break;
                        case 2:
                            data.firstRechargeCampaignV1 = _GetFirstRechargeInfoV2Resp_FirstRechargeCampaignV1_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 3:
                            data.firstRechargeCampaignV2 = _GetFirstRechargeInfoV2Resp_FirstRechargeCampaignV2_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 4:
                            data.campaignSchemaUrl = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        case 5:
                            data.commonCampaignInfo = _GetFirstRechargeInfoV2Resp_CommonCampaignInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            break;
                        case 6:
                            data.serverUnixTime = c1516680pZS.LJIIJJI();
                            break;
                        case 7:
                            data.campaignFaqUrl = C1516700pZU.LIZLLL(c1516680pZS);
                            break;
                        default:
                            C1516700pZU.LJ(c1516680pZS);
                            break;
                    }
                } else {
                    data.tpDataList.add(_TouchPointData_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return data;
            }
        }
    }

    public static void LJ(GetFirstRechargeInfoV2Resp.Data data) {
        GetFirstRechargeInfoV2Resp.FirstRechargeCampaignV1 firstRechargeCampaignV1 = data.firstRechargeCampaignV1;
        if (firstRechargeCampaignV1 != null) {
            GetFirstRechargeInfoV2Resp.FirstChargeGuideEffectRule firstChargeGuideEffectRule = firstRechargeCampaignV1.guideEffectRule;
            if (firstChargeGuideEffectRule != null && firstChargeGuideEffectRule.enterRoomShowTime == null) {
                firstChargeGuideEffectRule.enterRoomShowTime = new ArrayList();
            }
            Diamond diamond = firstRechargeCampaignV1.defaultDiamond;
            if (diamond != null) {
                _Diamond_ProtoDecoder.LJ(diamond);
            }
            ImageModel imageModel = firstRechargeCampaignV1.packageEntranceImage;
            if (imageModel != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
        GetFirstRechargeInfoV2Resp.CommonCampaignInfo commonCampaignInfo = data.commonCampaignInfo;
        if (commonCampaignInfo != null) {
            _GetFirstRechargeInfoV2Resp_CommonCampaignInfo_ProtoDecoder.LJ(commonCampaignInfo);
        }
        List<TouchPointData> list = data.tpDataList;
        if (list == null) {
            data.tpDataList = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (TouchPointData touchPointData : data.tpDataList) {
            if (touchPointData != null && touchPointData.logExtra == null) {
                touchPointData.logExtra = new HashMap();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GetFirstRechargeInfoV2Resp.Data data) {
        LJ(data);
    }

    @Override // X.C0IMD
    public final GetFirstRechargeInfoV2Resp.Data LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetFirstRechargeInfoV2Resp.Data data, List list) {
    }
}
