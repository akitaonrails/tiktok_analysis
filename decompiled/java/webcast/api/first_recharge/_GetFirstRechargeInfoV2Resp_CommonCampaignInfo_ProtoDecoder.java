package webcast.api.first_recharge;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import webcast.api.first_recharge.GetFirstRechargeInfoV2Resp;

/* JADX INFO: loaded from: classes.dex */
public final class _GetFirstRechargeInfoV2Resp_CommonCampaignInfo_ProtoDecoder implements C0IMD<GetFirstRechargeInfoV2Resp.CommonCampaignInfo> {
    public static GetFirstRechargeInfoV2Resp.CommonCampaignInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GetFirstRechargeInfoV2Resp.CommonCampaignInfo commonCampaignInfo = new GetFirstRechargeInfoV2Resp.CommonCampaignInfo();
        commonCampaignInfo.campaignProcess = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 3) {
                        if (iLJI != 4) {
                            if (iLJI != 5) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                commonCampaignInfo.campaignProcess.add(_GetFirstRechargeInfoV2Resp_CampaignProcess_ProtoDecoder.LIZLLL(c1516680pZS));
                            }
                        } else {
                            commonCampaignInfo.campaignStatus = c1516680pZS.LJIIJ();
                        }
                    } else {
                        commonCampaignInfo.expireTime = c1516680pZS.LJIIJJI();
                    }
                } else {
                    commonCampaignInfo.campaignName = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return commonCampaignInfo;
            }
        }
    }

    public static void LJ(GetFirstRechargeInfoV2Resp.CommonCampaignInfo commonCampaignInfo) {
        List<GetFirstRechargeInfoV2Resp.CampaignProcess> list = commonCampaignInfo.campaignProcess;
        if (list == null) {
            commonCampaignInfo.campaignProcess = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (GetFirstRechargeInfoV2Resp.CampaignProcess campaignProcess : commonCampaignInfo.campaignProcess) {
            if (campaignProcess != null) {
                _GetFirstRechargeInfoV2Resp_CampaignProcess_ProtoDecoder.LJ(campaignProcess);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GetFirstRechargeInfoV2Resp.CommonCampaignInfo commonCampaignInfo) {
        LJ(commonCampaignInfo);
    }

    @Override // X.C0IMD
    public final GetFirstRechargeInfoV2Resp.CommonCampaignInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetFirstRechargeInfoV2Resp.CommonCampaignInfo commonCampaignInfo, List list) {
    }
}
