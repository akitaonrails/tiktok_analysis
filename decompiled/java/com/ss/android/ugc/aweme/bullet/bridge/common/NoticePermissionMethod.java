package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C06MM;
import X.C0WZX;
import X.C1051660dTQ;
import X.C1062070dkD;
import X.C1701330uNH;
import X.C1893760zNe;
import X.C2204961BRm;
import X.C824390WVp;
import X.InterfaceC1019840ce6;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.experiment.PermissionJsbSupportSaExp;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class NoticePermissionMethod extends BaseBridgeMethod {
    public static final C1062070dkD Companion = new Object() { // from class: X.0dkD
    };
    public final String name;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public NoticePermissionMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "noticePermission";
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_common_NoticePermissionMethod_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(Activity activity, Intent intent) {
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOi9b5PLyHwDdlrQqGjrmno/MXbaoTBfcV2jSdYdfBAd1dQSmArNf7Cn12Y=", null));
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_common_NoticePermissionMethod_com_bytedance_router_monitor_page_PageLancet_startActivity(Activity activity, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_common_NoticePermissionMethod_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(activity, intent);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        Activity activityLIZ;
        boolean value = PermissionJsbSupportSaExp.INSTANCE.getValue();
        Context context = getContext();
        if (context == null) {
            if (value) {
                interfaceC1019840ce6.LIZ(0, "context is null");
                return;
            }
            return;
        }
        if (!value) {
            if (context instanceof Activity) {
                activityLIZ = (Activity) context;
            } else if (context instanceof MutableContextWrapper) {
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("notice_permission_ger_activity_from_mutable_context", true)) {
                    activityLIZ = C06MM.LIZ(context);
                } else {
                    return;
                }
            } else {
                return;
            }
            if (activityLIZ == null || !C1893760zNe.LIZ(activityLIZ, true)) {
                return;
            }
            handleInternal(context, activityLIZ, jSONObject, interfaceC1019840ce6);
            return;
        }
        try {
            handleInternalSa(context, jSONObject, interfaceC1019840ce6);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String message = th.getMessage();
            if (message == null) {
                message = "unknown error";
            }
            interfaceC1019840ce6.LIZ(0, message);
        }
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_common_NoticePermissionMethod_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(Context context, Intent intent) {
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOi9b5PLyHwDdlrQqGjrmno/MXbaoTBfcV2jSdYdfBAd1dQSmArNf7Cn12Y=", null));
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_common_NoticePermissionMethod_com_bytedance_router_monitor_page_PageLancet_startActivity(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_common_NoticePermissionMethod_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(context, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void handleInternalSa(android.content.Context r6, org.json.JSONObject r7, X.InterfaceC1019840ce6 r8) {
        /*
            r5 = this;
            java.lang.String r0 = "toOpen"
            boolean r0 = r7.optBoolean(r0)
            r4 = 0
            boolean r3 = X.C824390WVp.LIZJ(r6)     // Catch: java.lang.Throwable -> L4c
            if (r3 != 0) goto L40
            if (r0 == 0) goto L40
            android.app.Activity r1 = X.C06MM.LIZ(r6)
            if (r1 == 0) goto L20
            r2 = 1
            boolean r0 = X.C1893760zNe.LIZ(r1, r2)
            if (r0 == 0) goto L20
            r6 = r1
        L1d:
            if (r6 == 0) goto L40
            goto L22
        L20:
            r2 = 0
            goto L1d
        L22:
            X.C824390WVp.LIZLLL(r6)     // Catch: java.lang.Exception -> L26
            goto L40
        L26:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> L3c
            java.lang.String r0 = "android.settings.SETTINGS"
            r1.<init>(r0)     // Catch: java.lang.Exception -> L3c
            if (r2 != 0) goto L38
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r1.addFlags(r0)     // Catch: java.lang.Exception -> L3c
        L38:
            INVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_common_NoticePermissionMethod_com_bytedance_router_monitor_page_PageLancet_startActivity(r6, r1)     // Catch: java.lang.Exception -> L3c
            goto L40
        L3c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L40:
            java.lang.String r0 = ""
            if (r3 == 0) goto L48
            r8.onSuccess(r0)
            return
        L48:
            r8.LIZ(r4, r0)
            return
        L4c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L58
            java.lang.String r0 = "isNotificationEnabled error"
        L58:
            r8.LIZ(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.bridge.common.NoticePermissionMethod.handleInternalSa(android.content.Context, org.json.JSONObject, X.0ce6):void");
    }

    private final void handleInternal(Context context, Activity activity, JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        boolean zOptBoolean = jSONObject.optBoolean("toOpen");
        boolean zLIZJ = C824390WVp.LIZJ(context);
        if (!zLIZJ && zOptBoolean) {
            try {
                C824390WVp.LIZLLL(activity);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                INVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_common_NoticePermissionMethod_com_bytedance_router_monitor_page_PageLancet_startActivity(activity, new Intent("android.settings.SETTINGS"));
            }
        }
        if (zLIZJ) {
            interfaceC1019840ce6.onSuccess("");
        } else {
            interfaceC1019840ce6.LIZ(0, "");
        }
    }
}
