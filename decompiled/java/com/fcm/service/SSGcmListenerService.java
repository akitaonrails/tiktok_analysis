package com.fcm.service;

import X.C089N;
import X.C13WZ;
import X.C1C7U;
import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C786410Ut5;
import X.C788530UwV;
import X.C808680Vnu;
import X.C808870VoD;
import X.C809030VoT;
import X.C809150Vof;
import X.C809220Vom;
import X.C809340Voy;
import X.C809360Vp0;
import X.C809750Vpd;
import X.C810890VrT;
import X.C817700W5w;
import X.C818260W8a;
import X.EnumC809870Vpp;
import X.EnumC818290W8d;
import Y.ARunnableS113S0100000_13;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.fcm.FcmPushAdapter;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.util.HashMap;
import java.util.Map;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes14.dex */
public class SSGcmListenerService extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService, com.google.firebase.messaging.EnhancedIntentService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        com_fcm_service_SSGcmListenerService_com_ss_android_ugc_aweme_nxreword_proxy_NxStringLancet_attachBaseContextWrapper(this, context);
    }

    public void com_fcm_service_SSGcmListenerService__attachBaseContext$___twin___(Context context) {
        super.attachBaseContext(context);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        boolean zLJI = MethodIDManager.LJI(71713);
        com_fcm_service_SSGcmListenerService_com_ss_android_ugc_aweme_lancet_PushColdBootLancet_onMessageReceived(this, remoteMessage);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void doOnMsgReceived(Map<String, String> map) {
        String str;
        C808870VoD c808870VoDLJIIZILJ = C809030VoT.LJIIZILJ();
        C809220Vom c809220Vom = c808870VoDLJIIZILJ.LIZIZ;
        if (c809220Vom != null && !TextUtils.isEmpty(c809220Vom.LJIJ)) {
            str = c808870VoDLJIIZILJ.LIZIZ.LJIJ;
        } else {
            str = "payload";
        }
        String str2 = map.get(str);
        C809030VoT.LJIILIIL(FcmPushAdapter.getFcmPush(), str2);
        ((C808680Vnu) C809030VoT.LJIILJJIL()).LJ(FcmPushAdapter.getFcmPush(), str2, null);
    }

    public static void lambda$onMessageReceived$0(Map map) {
        C1C7U.LIZ("SSGcmListenerService@d69a.com_fcm_service_SSGcmListenerService__onMessageReceived$___twin___$1L");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SSGcmListenerServiceconfigs initiated, start handling message...@");
        sbLIZ.append(C786410Ut5.u3().getName());
        C2188811AlT.LIZIZ(sbLIZ);
        doOnMsgReceived(map);
        C1C7U.LIZIZ("SSGcmListenerService@d69a.com_fcm_service_SSGcmListenerService__onMessageReceived$___twin___$1L");
    }

    private void sendToken(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Intent intent = new Intent(this, (Class<?>) FcmRegistrationJobIntentService.class);
            intent.putExtra("key_token", str);
            FcmRegistrationJobIntentService.enqueueWork(this, intent);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C809150Vof c809150Vof = C809030VoT.LJIIJ.LIZ;
            th.getMessage();
            c809150Vof.getClass();
        }
    }

    public void com_fcm_service_SSGcmListenerService__onMessageReceived$___twin___(RemoteMessage remoteMessage) {
        try {
            Map<String, String> mapLJLZ = remoteMessage.LJLZ();
            C809340Voy c809340VoyLIZ = PushMultiProcessSharedProvider.LJ(C809360Vp0.LIZ).LIZ();
            c809340VoyLIZ.LIZIZ.put("last_fcm_push_receive_time", Long.valueOf(System.currentTimeMillis()));
            c809340VoyLIZ.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SSGcmListenerService.onMessageReceived(): ");
            sbLIZ.append(mapLJLZ);
            sbLIZ.append(e3.g);
            sbLIZ.append(C786410Ut5.u3().getName());
            C2188811AlT.LIZIZ(sbLIZ);
            if (PushMultiProcessSharedProvider.LJ(C809360Vp0.LIZ).LIZIZ("ensure_init_configurations", false)) {
                C809030VoT c809030VoT = C809030VoT.LJIIJ;
                if (c809030VoT.LIZIZ == null) {
                    c809030VoT.LJFF(new ARunnableS113S0100000_13((Map) mapLJLZ, 177));
                    return;
                }
            }
            doOnMsgReceived(mapLJLZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("SSGcmListenerService.onMessageReceived() - error: ");
            sbLIZ2.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
            C809150Vof c809150Vof = C809030VoT.LJIIJ.LIZ;
            e.getMessage();
            c809150Vof.getClass();
            try {
                C809030VoT.LJIIL(FcmPushAdapter.getFcmPush(), e.getClass().getSimpleName());
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        super.onNewToken(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SSGcmListenerService.onNewToken(");
        sbLIZ.append(str);
        sbLIZ.append(")");
        C2188811AlT.LIZIZ(sbLIZ);
        sendToken(str);
    }

    public static void com_fcm_service_SSGcmListenerService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(SSGcmListenerService sSGcmListenerService, Context context) {
        if (!C2214201BlK.LJIIJJI && C788530UwV.LIZ("serviceAttachBaseContext")) {
            C2188191AkT.LIZJ();
        }
        sSGcmListenerService.com_fcm_service_SSGcmListenerService__attachBaseContext$___twin___(context);
    }

    public static void com_fcm_service_SSGcmListenerService_com_ss_android_ugc_aweme_lancet_PushColdBootLancet_onMessageReceived(SSGcmListenerService sSGcmListenerService, RemoteMessage remoteMessage) {
        C13WZ c13wz = C089N.LIZ;
        if (c13wz.LJFF && c13wz.LIZLLL("SSGcmListenerService#onMessageReceived")) {
            HashMap map = new HashMap();
            map.put("SSGcmListenerService", "onMessageReceived");
            c13wz.LJIIL(map);
        }
        if (C809750Vpd.LIZ()) {
            C810890VrT c810890VrT = C810890VrT.LIZIZ;
            c810890VrT.LJIJ("from_enhanced_to_SSGCM", "", false);
            C818260W8a c818260W8a = C818260W8a.LIZ;
            C818260W8a.LJI("SSGcmListenerService.onMessageReceived() lancet hook", EnumC809870Vpp.FIREBASE, EnumC818290W8d.INFO);
            c810890VrT.LJ("SSGcmListenerService_onMessageReceived", true);
            sSGcmListenerService.com_fcm_service_SSGcmListenerService__onMessageReceived$___twin___(remoteMessage);
            c810890VrT.LJIJ("SSGcmListenerService_onMessageReceived", "", false);
            return;
        }
        sSGcmListenerService.com_fcm_service_SSGcmListenerService__onMessageReceived$___twin___(remoteMessage);
    }

    public static void com_fcm_service_SSGcmListenerService_com_ss_android_ugc_aweme_nxreword_proxy_NxStringLancet_attachBaseContextWrapper(SSGcmListenerService sSGcmListenerService, Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        com_fcm_service_SSGcmListenerService_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_serviceAttachBaseContext(sSGcmListenerService, context);
    }
}
