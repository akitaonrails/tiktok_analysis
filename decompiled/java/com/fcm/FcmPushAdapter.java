package com.fcm;

import X.C2188811AlT;
import X.C808750Vo1;
import X.C809030VoT;
import X.C809150Vof;
import X.C809340Voy;
import X.C809360Vp0;
import X.C809470VpB;
import X.C809560VpK;
import X.C809580VpM;
import X.C809600VpO;
import X.C809610VpP;
import X.C809650VpT;
import X.C818880WAk;
import X.InterfaceC808910VoH;
import X.InterfaceC809680VpW;
import X.InterfaceC834580Woa;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.firebase.messaging.FirebaseMessaging;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import com.ss.android.ugc.aweme.app.R$string;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Arrays;
import java.util.Collections;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class FcmPushAdapter implements InterfaceC808910VoH {
    public static int FCM_PUSH = -1;

    @Override // X.InterfaceC808910VoH
    public boolean requestNotificationPermission(int i) {
        return false;
    }

    @Override // X.InterfaceC808910VoH
    public void setAlias(Context context, String str, int i) {
    }

    @Override // X.InterfaceC808910VoH
    public void trackPush(Context context, int i, Object obj) {
    }

    public static int getFcmPush() {
        if (FCM_PUSH == -1) {
            FCM_PUSH = C809470VpB.LJIIIIZZ(C809360Vp0.LIZ).LIZIZ(FcmPushAdapter.class.getName());
        }
        return FCM_PUSH;
    }

    @Override // X.InterfaceC808910VoH
    public boolean checkThirdPushConfig(String str, Context context) {
        boolean z;
        String string = context.getResources().getString(R$string.google_api_key);
        String string2 = context.getResources().getString(R$string.google_app_id);
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
            z = true;
        } else {
            z = false;
            C809030VoT.LJIIJ.LIZ.getClass();
        }
        C809650VpT c809650VpT = new C809650VpT("com.fcm.service.SSGcmListenerService");
        c809650VpT.LIZ.LIZJ = context.getPackageName();
        c809650VpT.LIZ(new C809610VpP(Collections.singletonList("com.google.firebase.MESSAGING_EVENT"), null));
        C809650VpT c809650VpT2 = new C809650VpT("com.fcm.service.FcmRegistrationJobIntentService");
        String packageName = context.getPackageName();
        C809600VpO c809600VpO = c809650VpT2.LIZ;
        c809600VpO.LIZJ = packageName;
        c809600VpO.LIZLLL = "android.permission.BIND_JOB_SERVICE";
        return z & C809560VpK.LIZIZ(context, "Fcm Push error", Arrays.asList(c809650VpT.LIZ, c809600VpO));
    }

    @Override // X.InterfaceC808910VoH
    public boolean isPushAvailable(Context context, int i) {
        return true;
    }

    @Override // X.InterfaceC808910VoH
    public void registerPush(final Context context, int i) {
        String str;
        FirebaseMessaging firebaseMessaging;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcmPushAdapter.registerPush(");
        sbLIZ.append(i);
        sbLIZ.append(")");
        C2188811AlT.LIZIZ(sbLIZ);
        if (context != null) {
            if (i != getFcmPush()) {
                if (i != getFcmPush()) {
                    str = "register sender error";
                } else {
                    str = null;
                }
            } else {
                C809030VoT c809030VoT = C809030VoT.LJIIJ;
                c809030VoT.LIZJ("registerPush_fcm_androidx");
                c809030VoT.LIZ("registerPush_fcm_androidx");
                C809150Vof c809150Vof = c809030VoT.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("registerPush:");
                sbLIZ2.append(i);
                C2188811AlT.LIZIZ(sbLIZ2);
                c809150Vof.getClass();
                try {
                    boolean z = false;
                    boolean zLIZIZ = PushMultiProcessSharedProvider.LJ(C809360Vp0.LIZ).LIZIZ("need_force_refresh_fcm", false);
                    long jLIZLLL = PushMultiProcessSharedProvider.LJ(C809360Vp0.LIZ).LIZLLL("last_fcm_token_refresh_time", -1L);
                    int iLIZJ = PushMultiProcessSharedProvider.LJ(C809360Vp0.LIZ).LIZJ("force_refresh_fcm_frequency", 0);
                    boolean z2 = true;
                    if (jLIZLLL > 0 && iLIZJ > 0) {
                        if (System.currentTimeMillis() - jLIZLLL > ((long) iLIZJ) * 24 * 60 * 60 * 1000) {
                            z = true;
                        }
                        z2 = z;
                    }
                    if (zLIZIZ && z2) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "client_reset");
                            ((C808750Vo1) C809030VoT.LJIILLIIL()).LIZ("reset_token_result", jSONObject);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        synchronized (FirebaseMessaging.class) {
                            firebaseMessaging = FirebaseMessaging.getInstance(C818880WAk.LIZIZ());
                        }
                        firebaseMessaging.LIZIZ().LIZIZ(new InterfaceC834580Woa<Void>() { // from class: X.0VpN
                            @Override // X.InterfaceC834580Woa
                            public final void LIZ(AbstractC835450Wpz<Void> abstractC835450Wpz) {
                                if (abstractC835450Wpz != null && abstractC835450Wpz.LJIILJJIL()) {
                                    C809580VpM.LIZ(context);
                                    try {
                                        JSONObject jSONObject2 = new JSONObject();
                                        jSONObject2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "token_changed");
                                        ((C808750Vo1) C809030VoT.LJIILLIIL()).LIZ("reset_token_result", jSONObject2);
                                    } catch (Throwable th2) {
                                        TryCatchGuardChecker.doCheck(th2);
                                    }
                                }
                            }
                        });
                        C809340Voy c809340VoyLIZ = PushMultiProcessSharedProvider.LJ(C809360Vp0.LIZ).LIZ();
                        c809340VoyLIZ.LIZIZ.put("last_fcm_token_refresh_time", Long.valueOf(System.currentTimeMillis()));
                        c809340VoyLIZ.LIZ();
                        return;
                    }
                    C809580VpM.LIZ(context);
                    return;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    return;
                }
            }
        } else {
            str = "context is null";
        }
        C809030VoT.LJIIJJI().LJIIIIZZ(i, 101, CardStruct.IStatusCode.DEFAULT, str);
    }

    @Override // X.InterfaceC808910VoH
    public void unregisterPush(Context context, int i) {
        if (context != null && i == getFcmPush()) {
            C809030VoT.LJIIJ.LIZ.getClass();
        }
    }

    @Override // X.InterfaceC808910VoH
    public boolean requestSystemNotificationPermission(String str, int i, InterfaceC809680VpW interfaceC809680VpW) {
        if (interfaceC809680VpW != null) {
            try {
                interfaceC809680VpW.LIZJ("fcm-androidx is not supported", false);
                return false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return false;
    }
}
