package com.heytap.mcssdk.a;

import X.C2188811AlT;
import X.C786410Ut5;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.heytap.mcssdk.c;
import com.heytap.mcssdk.utils.e;
import com.heytap.msp.push.callback.IServiceChannelCallback;

/* JADX INFO: loaded from: classes14.dex */
public class b {
    public static c.a a(final IServiceChannelCallback iServiceChannelCallback, final String str) {
        if (iServiceChannelCallback == null) {
            return null;
        }
        return new c.a() { // from class: com.heytap.mcssdk.a.b.1
            @Override // com.heytap.mcssdk.c.a
            public void a(int i, Bundle bundle, String str2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ServiceChannel ");
                sbLIZ.append(str);
                sbLIZ.append(" result - responseCode: ");
                sbLIZ.append(i);
                sbLIZ.append(", message: ");
                sbLIZ.append(str2);
                sbLIZ.append(", resultParams: ");
                sbLIZ.append(bundle);
                e.b("ServiceChannelManager", C2188811AlT.LIZIZ(sbLIZ));
                IServiceChannelCallback iServiceChannelCallback2 = iServiceChannelCallback;
                if (str2 == null) {
                    str2 = "";
                }
                iServiceChannelCallback2.onResult(i, str2);
            }
        };
    }

    public static void a(Context context, Intent intent, String str, IServiceChannelCallback iServiceChannelCallback) {
        a(intent, str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ServiceChannel subscribeServiceChannel - eventType: 12329, channelId: ");
        sbLIZ.append(str);
        e.b("ServiceChannelManager", C2188811AlT.LIZIZ(sbLIZ));
        c.a(context, intent, a(iServiceChannelCallback, "subscribeServiceChannel"));
    }

    public static void a(Intent intent, String str) {
        Bundle bundleINVOKEVIRTUAL_com_heytap_mcssdk_a_b_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_heytap_mcssdk_a_b_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
        if (bundleINVOKEVIRTUAL_com_heytap_mcssdk_a_b_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null) {
            bundleINVOKEVIRTUAL_com_heytap_mcssdk_a_b_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = new Bundle();
        }
        C786410Ut5.LJJJI("channelId", str, bundleINVOKEVIRTUAL_com_heytap_mcssdk_a_b_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras);
        intent.putExtras(bundleINVOKEVIRTUAL_com_heytap_mcssdk_a_b_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras);
    }

    public static void b(Context context, Intent intent, String str, IServiceChannelCallback iServiceChannelCallback) {
        a(intent, str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ServiceChannel unsubscribeServiceChannel - eventType: 12330, channelId: ");
        sbLIZ.append(str);
        e.b("ServiceChannelManager", C2188811AlT.LIZIZ(sbLIZ));
        c.a(context, intent, a(iServiceChannelCallback, "unsubscribeServiceChannel"));
    }

    public static Bundle INVOKEVIRTUAL_com_heytap_mcssdk_a_b_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
