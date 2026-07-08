package com.bytedance.android.livesdkapi.depend.model.live;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MsgNotifyComAvoidConfig_ProtoDecoder implements C0IMD<MsgNotifyComAvoidConfig> {
    public static MsgNotifyComAvoidConfig LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MsgNotifyComAvoidConfig msgNotifyComAvoidConfig = new MsgNotifyComAvoidConfig();
        msgNotifyComAvoidConfig.componentRuleListV2 = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    msgNotifyComAvoidConfig.componentRuleListV2.add(_MsgNotifyComponentAvoidRuleV2_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return msgNotifyComAvoidConfig;
            }
        }
    }

    public static void LJ(MsgNotifyComAvoidConfig msgNotifyComAvoidConfig) {
        List<MsgNotifyComponentAvoidRuleV2> list = msgNotifyComAvoidConfig.componentRuleListV2;
        if (list == null) {
            msgNotifyComAvoidConfig.componentRuleListV2 = new ArrayList();
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        for (MsgNotifyComponentAvoidRuleV2 msgNotifyComponentAvoidRuleV2 : msgNotifyComAvoidConfig.componentRuleListV2) {
            if (msgNotifyComponentAvoidRuleV2 != null && msgNotifyComponentAvoidRuleV2.avoidScene == null) {
                msgNotifyComponentAvoidRuleV2.avoidScene = new ArrayList();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MsgNotifyComAvoidConfig msgNotifyComAvoidConfig) {
        LJ(msgNotifyComAvoidConfig);
    }

    @Override // X.C0IMD
    public final MsgNotifyComAvoidConfig LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MsgNotifyComAvoidConfig msgNotifyComAvoidConfig, List list) {
    }
}
