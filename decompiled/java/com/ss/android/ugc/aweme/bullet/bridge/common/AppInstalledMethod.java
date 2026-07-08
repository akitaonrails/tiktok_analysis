package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C1051660dTQ;
import X.C1055550dZh;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;

/* JADX INFO: loaded from: classes17.dex */
public final class AppInstalledMethod extends BaseBridgeMethod {
    public static final C1055550dZh Companion = new Object() { // from class: X.0dZh
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

    public AppInstalledMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "isAppInstalled";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026 A[PHI: r2
      0x0026: PHI (r2v2 ??) = (r2v5 ?? I:??[int, short, byte, float]), (r2v6 ??) binds: [B:5:0x001d, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0ce6] */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handle(org.json.JSONObject r7, X.InterfaceC1019840ce6 r8) throws org.json.JSONException {
        /*
            r6 = this;
            java.lang.String r0 = "pkg_name"
            java.lang.String r5 = r7.optString(r0)
            java.lang.String r0 = "open_url"
            java.lang.String r4 = r7.optString(r0)
            X.0dTQ r1 = r6.contextProviderFactory
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Object r3 = r1.LIZIZ(r0)
            android.content.Context r3 = (android.content.Context) r3
            r2 = -1
            if (r3 == 0) goto L3e
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L26
            boolean r2 = X.C2162308dZ.LJFF(r3, r5)
            r0 = 1
            if (r2 == r0) goto L3e
        L26:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L3e
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.VIEW"
            r1.<init>(r0)
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r4)
            r1.setData(r0)
            boolean r2 = X.C2162308dZ.LJ(r3, r1)
        L3e:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r0 = "installed"
            r1.put(r0, r2)
            java.lang.String r0 = "code"
            r1.put(r0, r2)
            r8.LIZIZ(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.bullet.bridge.common.AppInstalledMethod.handle(org.json.JSONObject, X.0ce6):void");
    }
}
