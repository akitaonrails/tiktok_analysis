package com.ss.android.ugc.aweme.account.checkpoint;

import X.C09CT;
import X.C0XGR;
import X.C0XP1;
import X.C0XP6;
import X.C0XPY;
import X.C20684815ws;
import X.C7740030o;
import X.InterfaceC486470J5x;
import android.app.Application;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.account.idv.model.IDVDecisionConf;
import com.google.gson.Gson;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes14.dex */
public final class HackedCheckpointReceiverV2 implements InterfaceC486470J5x {
    @Override // X.InterfaceC486470J5x
    public final void LIZIZ(WsChannelMsg wsChannelMsg) {
        byte[] bArrLIZ = wsChannelMsg.LIZ();
        Gson gson = C7740030o.LIZ().getGson();
        IDVDecisionConf iDVDecisionConf = (IDVDecisionConf) GsonProtectorUtils.fromJson(gson, ((HackedCheckpointEventPayload) GsonProtectorUtils.fromJson(gson, new String(bArrLIZ, Charsets.UTF_8), HackedCheckpointEventPayload.class)).params.decisionConf, IDVDecisionConf.class);
        C0XP6 c0xp6 = new C0XP6() { // from class: X.0XP3
            @Override // X.C0XP6
            public final void LIZ() {
            }

            @Override // X.C0XP6
            public final void LIZIZ(EnumC110300bN enumC110300bN) {
                int i;
                C0XGR c0xgr = new C0XGR();
                c0xgr.LIZLLL("enter_from", "hacked_checkpoint");
                if (enumC110300bN == EnumC110300bN.SUCCESS) {
                    i = 1;
                } else {
                    i = 0;
                }
                c0xgr.LIZ(i, "is_success");
                C20684815ws.LJIILLIIL("idv_sdk_result", c0xgr.LIZ);
            }
        };
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", "hacked_checkpoint");
        C20684815ws.LJIILLIIL("idv_sdk_starts", c0xgr.LIZ);
        C0XP1 c0xp1 = C0XP1.LIZ;
        C0XPY.LIZ.getClass();
        Application applicationLIZ = C0XPY.LIZ();
        c0xp1.getClass();
        C0XP1.LIZ(applicationLIZ, c0xp6, iDVDecisionConf);
    }

    public static final class HCParam {

        @C09CT("account_details")
        public final String accountDetails;

        @C09CT("decision_conf")
        public final String decisionConf;

        @C09CT("user_id")
        public final String userId;

        public HCParam(String str, String str2, String str3) {
            this.userId = str;
            this.accountDetails = str2;
            this.decisionConf = str3;
        }
    }

    public static final class HackedCheckpointEventPayload {

        @C09CT("degrade")
        public final boolean degrade;

        @C09CT("log_id")
        public final String logId;

        @C09CT("params")
        public final HCParam params;

        public HackedCheckpointEventPayload(HCParam hCParam, String str, boolean z) {
            this.params = hCParam;
            this.logId = str;
            this.degrade = z;
        }
    }
}
