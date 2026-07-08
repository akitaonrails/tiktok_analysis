package com.fcm.service;

import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C788530UwV;
import X.C809030VoT;
import X.C809150Vof;
import X.C809580VpM;
import X.C817700W5w;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.core.app.FcmJobIntentService;
import androidx.core.app.JobIntentService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.fcm.FcmPushAdapter;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class FcmRegistrationJobIntentService extends FcmJobIntentService {
    @Override // androidx.core.app.FcmJobIntentService, androidx.core.app.JobIntentService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_fcm_service_FcmRegistrationJobIntentService_com_ss_android_ugc_aweme_nxreword_proxy_NxStringLancet_attachBaseContextWrapper(this, context);
    }

    public void com_fcm_service_FcmRegistrationJobIntentService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(Intent intent) {
        String strINVOKEVIRTUAL_com_fcm_service_FcmRegistrationJobIntentService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_fcm_service_FcmRegistrationJobIntentService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "key_token");
        C809150Vof c809150Vof = C809030VoT.LJIIJ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getToken = ");
        sbLIZ.append(strINVOKEVIRTUAL_com_fcm_service_FcmRegistrationJobIntentService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
        C2188811AlT.LIZIZ(sbLIZ);
        c809150Vof.getClass();
        try {
            C809580VpM.LIZIZ(this, strINVOKEVIRTUAL_com_fcm_service_FcmRegistrationJobIntentService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("label", "get_token");
            jSONObject.put("type", FcmPushAdapter.getFcmPush());
            jSONObject.put("token", strINVOKEVIRTUAL_com_fcm_service_FcmRegistrationJobIntentService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
            C809030VoT.LJIIZILJ().getClass();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C809150Vof c809150Vof2 = C809030VoT.LJIIJ.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Error = ");
            sbLIZ2.append(th.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
            c809150Vof2.getClass();
        }
    }

    public static String INVOKEVIRTUAL_com_fcm_service_FcmRegistrationJobIntentService_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void com_fcm_service_FcmRegistrationJobIntentService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(FcmRegistrationJobIntentService fcmRegistrationJobIntentService, Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        fcmRegistrationJobIntentService.com_fcm_service_FcmRegistrationJobIntentService__attachBaseContext$___twin___(context);
    }

    public static void com_fcm_service_FcmRegistrationJobIntentService_com_ss_android_ugc_aweme_nxreword_proxy_NxStringLancet_attachBaseContextWrapper(FcmRegistrationJobIntentService fcmRegistrationJobIntentService, Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        com_fcm_service_FcmRegistrationJobIntentService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(fcmRegistrationJobIntentService, context);
    }

    public static void enqueueWork(Context context, Intent intent) {
        JobIntentService.enqueueWork(context, (Class<?>) FcmRegistrationJobIntentService.class, 101, intent);
    }
}
