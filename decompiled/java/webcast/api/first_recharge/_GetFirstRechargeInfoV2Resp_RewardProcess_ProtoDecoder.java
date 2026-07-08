package webcast.api.first_recharge;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;
import webcast.api.first_recharge.GetFirstRechargeInfoV2Resp;

/* JADX INFO: loaded from: classes.dex */
public final class _GetFirstRechargeInfoV2Resp_RewardProcess_ProtoDecoder implements C0IMD<GetFirstRechargeInfoV2Resp.RewardProcess> {
    public static GetFirstRechargeInfoV2Resp.RewardProcess LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GetFirstRechargeInfoV2Resp.RewardProcess rewardProcess = new GetFirstRechargeInfoV2Resp.RewardProcess();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        rewardProcess.rewardId = c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        rewardProcess.rewardOrder = c1516680pZS.LJIIJ();
                        break;
                    case 3:
                        rewardProcess.rewardScene = c1516680pZS.LJIIJ();
                        break;
                    case 4:
                        rewardProcess.rewardAmount = c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        rewardProcess.rewardExpire = c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        rewardProcess.rewardIcon = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return rewardProcess;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GetFirstRechargeInfoV2Resp.RewardProcess rewardProcess) {
        ImageModel imageModel = rewardProcess.rewardIcon;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final GetFirstRechargeInfoV2Resp.RewardProcess LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetFirstRechargeInfoV2Resp.RewardProcess rewardProcess, List list) {
    }
}
