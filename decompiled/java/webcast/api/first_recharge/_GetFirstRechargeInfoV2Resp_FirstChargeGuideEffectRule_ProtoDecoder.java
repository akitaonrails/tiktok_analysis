package webcast.api.first_recharge;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import webcast.api.first_recharge.GetFirstRechargeInfoV2Resp;

/* JADX INFO: loaded from: classes.dex */
public final class _GetFirstRechargeInfoV2Resp_FirstChargeGuideEffectRule_ProtoDecoder implements C0IMD<GetFirstRechargeInfoV2Resp.FirstChargeGuideEffectRule> {
    public static GetFirstRechargeInfoV2Resp.FirstChargeGuideEffectRule LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GetFirstRechargeInfoV2Resp.FirstChargeGuideEffectRule firstChargeGuideEffectRule = new GetFirstRechargeInfoV2Resp.FirstChargeGuideEffectRule();
        firstChargeGuideEffectRule.enterRoomShowTime = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            firstChargeGuideEffectRule.watchPkShowTime = c1516680pZS.LJIIJ();
                        }
                    } else {
                        firstChargeGuideEffectRule.enterRoomShowTime.add(Integer.valueOf(c1516680pZS.LJIIJ()));
                    }
                } else {
                    firstChargeGuideEffectRule.enableFirstRechargeGuideEffect = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return firstChargeGuideEffectRule;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GetFirstRechargeInfoV2Resp.FirstChargeGuideEffectRule firstChargeGuideEffectRule) {
        GetFirstRechargeInfoV2Resp.FirstChargeGuideEffectRule firstChargeGuideEffectRule2 = firstChargeGuideEffectRule;
        if (firstChargeGuideEffectRule2.enterRoomShowTime == null) {
            firstChargeGuideEffectRule2.enterRoomShowTime = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final GetFirstRechargeInfoV2Resp.FirstChargeGuideEffectRule LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetFirstRechargeInfoV2Resp.FirstChargeGuideEffectRule firstChargeGuideEffectRule, List list) {
    }
}
