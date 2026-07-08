package webcast.api.first_recharge;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import webcast.api.first_recharge.GetFirstRechargeInfoV2Resp;

/* JADX INFO: loaded from: classes.dex */
public final class _GetFirstRechargeInfoV2Resp_CampaignProcess_ProtoDecoder implements C0IMD<GetFirstRechargeInfoV2Resp.CampaignProcess> {
    public static GetFirstRechargeInfoV2Resp.CampaignProcess LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GetFirstRechargeInfoV2Resp.CampaignProcess campaignProcess = new GetFirstRechargeInfoV2Resp.CampaignProcess();
        campaignProcess.rewards = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        campaignProcess.taskId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        campaignProcess.taskOrder = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        campaignProcess.taskScene = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        campaignProcess.taskStatus = c1516680pZS.LJIIJ();
                        break;
                    case 5:
                        campaignProcess.taskTargetAmount = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        campaignProcess.taskFinishedAmount = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        campaignProcess.taskExpireTime = c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        campaignProcess.rewards.add(_GetFirstRechargeInfoV2Resp_RewardProcess_ProtoDecoder.LIZLLL(c1516680pZS));
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return campaignProcess;
            }
        }
    }

    public static void LJ(GetFirstRechargeInfoV2Resp.CampaignProcess campaignProcess) {
        ImageModel imageModel;
        List<GetFirstRechargeInfoV2Resp.RewardProcess> list = campaignProcess.rewards;
        if (list == null) {
            campaignProcess.rewards = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (GetFirstRechargeInfoV2Resp.RewardProcess rewardProcess : campaignProcess.rewards) {
            if (rewardProcess != null && (imageModel = rewardProcess.rewardIcon) != null) {
                _ImageModel_ProtoDecoder.LJ(imageModel);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GetFirstRechargeInfoV2Resp.CampaignProcess campaignProcess) {
        LJ(campaignProcess);
    }

    @Override // X.C0IMD
    public final GetFirstRechargeInfoV2Resp.CampaignProcess LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetFirstRechargeInfoV2Resp.CampaignProcess campaignProcess, List list) {
    }
}
