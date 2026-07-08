package com.heytap.msp.push.service;

import X.C2188811AlT;
import android.content.Context;
import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.heytap.mcssdk.d.e;
import com.heytap.msp.push.mode.BaseMode;
import com.heytap.msp.push.mode.EnhanceDataMessage;

/* JADX INFO: loaded from: classes14.dex */
public class a implements e {
    @Override // com.heytap.mcssdk.d.e
    public BaseMode a(Context context, int i, Intent intent) {
        if (intent == null) {
            com.heytap.mcssdk.utils.e.d("EnhanceDataMessageParser", "Intent is null, cannot parse message");
            return null;
        }
        if (i != 4117) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Message type mismatch, expected: 4117, got: ");
            sbLIZ.append(i);
            com.heytap.mcssdk.utils.e.d("EnhanceDataMessageParser", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        try {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Parsing enhanced data message, type: ");
            sbLIZ2.append(i);
            com.heytap.mcssdk.utils.e.b("EnhanceDataMessageParser", C2188811AlT.LIZIZ(sbLIZ2));
            EnhanceDataMessage enhanceDataMessage = new EnhanceDataMessage(com.heytap.mcssdk.utils.b.d(INVOKEVIRTUAL_com_heytap_msp_push_service_a_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "appPackage")), com.heytap.mcssdk.utils.b.d(INVOKEVIRTUAL_com_heytap_msp_push_service_a_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "messageID")), com.heytap.mcssdk.utils.b.d(INVOKEVIRTUAL_com_heytap_msp_push_service_a_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "content")), i);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Successfully parsed enhanced data message: ");
            sbLIZ3.append(enhanceDataMessage.getMessageID());
            com.heytap.mcssdk.utils.e.b("EnhanceDataMessageParser", C2188811AlT.LIZIZ(sbLIZ3));
            return enhanceDataMessage;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Error parsing enhanced data message: ");
            sbLIZ4.append(e.getMessage());
            com.heytap.mcssdk.utils.e.e("EnhanceDataMessageParser", C2188811AlT.LIZIZ(sbLIZ4));
            return null;
        }
    }

    public static String INVOKEVIRTUAL_com_heytap_msp_push_service_a_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
