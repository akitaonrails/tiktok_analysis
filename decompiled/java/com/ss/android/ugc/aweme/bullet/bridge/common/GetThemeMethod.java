package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C1020720cfW;
import X.C1051660dTQ;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;

/* JADX INFO: loaded from: classes17.dex */
public final class GetThemeMethod extends BaseBridgeMethod {
    public static final C1020720cfW Companion = new Object() { // from class: X.0cfW
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

    public GetThemeMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "getTheme";
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handle(org.json.JSONObject r6, X.InterfaceC1019840ce6 r7) {
        /*
            r5 = this;
            android.content.Context r0 = r5.getContext()
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L1a
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Exception -> L2d
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch: java.lang.Exception -> L2d
            int r0 = r0.uiMode     // Catch: java.lang.Exception -> L2d
            r1 = r0 & 48
            r0 = 32
            if (r1 != r0) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2d
            r1.<init>()     // Catch: java.lang.Exception -> L2d
            java.lang.String r0 = "isDarkMode"
            if (r2 == 0) goto L25
            r3 = 1
        L25:
            r1.put(r0, r3)     // Catch: java.lang.Exception -> L2d
            r0 = 0
            r7.LIZJ(r4, r1, r0)     // Catch: java.lang.Exception -> L2d
            return
        L2d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r1 = -1
            java.lang.String r0 = "Had trouble in getting current uiMode"
            r7.LIZ(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.bridge.common.GetThemeMethod.handle(org.json.JSONObject, X.0ce6):void");
    }
}
