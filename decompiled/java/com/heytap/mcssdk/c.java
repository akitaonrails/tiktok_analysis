package com.heytap.mcssdk;

import X.C786410Ut5;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.heytap.mcssdk.utils.e;
import com.mcs.aidl.IMcsSdkEventCallback;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    public interface a {
        void a(int i, Bundle bundle, String str);
    }

    public static void a(Context context, Intent intent, final a aVar) {
        IMcsSdkEventCallback.Stub stub;
        if (context == null || intent == null) {
            e.e("McsSdkCommandManager", "sendCommand: context or intent is null");
            if (aVar != null) {
                aVar.a(-2, new Bundle(), "context or intent is null");
                return;
            }
            return;
        }
        Context contextN3 = C786410Ut5.N3(context);
        if (aVar != null) {
            try {
                stub = new IMcsSdkEventCallback.Stub() { // from class: com.heytap.mcssdk.c.1
                    @Override // com.mcs.aidl.IMcsSdkEventCallback
                    public void onResult(int i, Bundle bundle, String str) {
                        a aVar2 = aVar;
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        if (str == null) {
                            str = "";
                        }
                        aVar2.a(i, bundle, str);
                    }
                };
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                e.b("McsSdkCommandManager", "sendCommand exception: " + th.getMessage());
                if (aVar != null) {
                    aVar.a(-2, new Bundle(), "start service exception: " + th.getMessage());
                    return;
                }
                return;
            }
        } else {
            stub = null;
        }
        Bundle bundleINVOKEVIRTUAL_com_heytap_mcssdk_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_heytap_mcssdk_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent);
        if (bundleINVOKEVIRTUAL_com_heytap_mcssdk_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null) {
            bundleINVOKEVIRTUAL_com_heytap_mcssdk_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = new Bundle();
        }
        if (stub != null) {
            stub.asBinder();
            C786410Ut5.LJJIIZ(bundleINVOKEVIRTUAL_com_heytap_mcssdk_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, stub, "command_callback");
        }
        intent.putExtras(bundleINVOKEVIRTUAL_com_heytap_mcssdk_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras);
        C786410Ut5.s3(contextN3, intent);
        e.b("McsSdkCommandManager", "sendCommand: startService called, action=" + intent.getAction());
    }

    public static Bundle INVOKEVIRTUAL_com_heytap_mcssdk_c_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
