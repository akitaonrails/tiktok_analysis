package com.ss.android.ugc.aweme.ug.shortcut;

import X.C0WZX;
import X.C10XY;
import X.C1701330uNH;
import X.C2204961BRm;
import android.content.Context;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.router.route.IRouteAction;

/* JADX INFO: loaded from: classes29.dex */
public final class USLiteAppGpMiniCardRouter implements IRouteAction {
    public static final C10XY Companion = new Object() { // from class: X.10XY
    };

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_ug_shortcut_USLiteAppGpMiniCardRouter_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(Context context, Intent intent) {
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+vLYzG0yA0HpWX1EKLJhR6d3Yn02btEWyBbyhzBuVXcgMWXMA=", null));
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_ug_shortcut_USLiteAppGpMiniCardRouter_com_bytedance_router_monitor_page_PageLancet_startActivity(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_ug_shortcut_USLiteAppGpMiniCardRouter_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(context, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    @Override // com.bytedance.router.route.IRouteAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object open(android.content.Context r4, java.lang.String r5, android.os.Bundle r6) {
        /*
            r3 = this;
            java.lang.String r2 = "com.tiktok.lite.go"
            if (r4 == 0) goto L26
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            if (r0 == 0) goto L18
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r2)
            if (r0 == 0) goto L16
            INVOKEVIRTUAL_com_ss_android_ugc_aweme_ug_shortcut_USLiteAppGpMiniCardRouter_com_bytedance_router_monitor_page_PageLancet_startActivity(r4, r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L16:
            if (r4 == 0) goto L26
        L18:
            X.09fu r1 = X.C2431609fu.LIZ
            com.ss.android.ugc.aweme.ug.shortcut.UninstallRemoveData r0 = X.C10XW.LIZ()
            boolean r0 = r0.useMiniCard
            r1.getClass()
            X.C2431609fu.LIZ(r4, r2, r0)
        L26:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ug.shortcut.USLiteAppGpMiniCardRouter.open(android.content.Context, java.lang.String, android.os.Bundle):java.lang.Object");
    }
}
