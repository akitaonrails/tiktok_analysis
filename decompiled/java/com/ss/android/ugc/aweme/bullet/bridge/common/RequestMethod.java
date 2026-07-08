package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C1051660dTQ;
import X.C1550010qRD;
import X.C1BRP;
import X.C1BRW;
import X.EnumC1051570dTH;
import X.InterfaceC1019840ce6;
import X.InterfaceC2204861BRc;
import X.InterfaceC2204871BRd;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public final class RequestMethod extends BaseBridgeMethod {
    public static final C1BRW Companion = new Object() { // from class: X.1BRW
    };
    public EnumC1051570dTH access;
    public final InterfaceC2204861BRc mJsRequestCallback;
    public C1550010qRD mMonitorSession;
    public final String name;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC1051750dTZ, X.InterfaceC1051460dT6
    public EnumC1051570dTH getAccess() {
        return this.access;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public RequestMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "request";
        this.access = EnumC1051570dTH.PROTECT;
        this.mJsRequestCallback = new InterfaceC2204861BRc() { // from class: X.1BRY
            /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
            @Override // X.InterfaceC2204861BRc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.C2204851BRb r6, X.C2204841BRa r7) {
                /*
                    r5 = this;
                    X.0WKS r4 = new X.0WKS
                    java.lang.String r3 = r6.LIZIZ
                    java.lang.String r2 = ""
                    if (r3 != 0) goto L9
                    r3 = r2
                L9:
                    java.lang.String r1 = r6.LIZ
                    if (r1 != 0) goto Le
                    r1 = r2
                Le:
                    org.json.JSONObject r0 = r6.LIZJ
                    if (r0 == 0) goto L16
                    java.lang.String r2 = X.C786410Ut5.J3(r0)
                L16:
                    r4.<init>(r3, r1, r2)
                    java.lang.Exception r0 = r7.LIZIZ
                    if (r0 == 0) goto L2f
                    X.0OAI r2 = new X.0OAI
                    java.lang.String r1 = "network_error"
                    java.lang.Exception r0 = r7.LIZIZ
                    r2.<init>(r1, r0)
                L26:
                    com.ss.android.ugc.aweme.bullet.bridge.common.RequestMethod r0 = r5.LIZ
                    X.0qRD r0 = r0.mMonitorSession
                    if (r0 == 0) goto L2e
                    boolean r0 = r0.LIZIZ
                L2e:
                    return
                L2f:
                    org.json.JSONObject r0 = r7.LIZ
                    if (r0 == 0) goto L26
                    java.lang.String r1 = "message"
                    boolean r0 = r0.has(r1)
                    if (r0 == 0) goto L5c
                    org.json.JSONObject r0 = r7.LIZ
                    java.lang.String r1 = r0.optString(r1)
                    java.lang.String r0 = "success"
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
                    if (r0 != 0) goto L5c
                L49:
                    X.0OAI r2 = new X.0OAI
                    java.lang.Exception r1 = new java.lang.Exception
                    org.json.JSONObject r0 = r7.LIZ
                    java.lang.String r0 = X.C786410Ut5.J3(r0)
                    r1.<init>(r0)
                    java.lang.String r0 = "api_error"
                    r2.<init>(r0, r1)
                    goto L26
                L5c:
                    org.json.JSONObject r0 = r7.LIZ
                    java.lang.String r1 = "code"
                    boolean r0 = r0.has(r1)
                    if (r0 == 0) goto L6f
                    org.json.JSONObject r0 = r7.LIZ
                    int r0 = r0.optInt(r1)
                L6c:
                    if (r0 == 0) goto L26
                    goto L49
                L6f:
                    org.json.JSONObject r0 = r7.LIZ
                    java.lang.String r1 = "status_code"
                    boolean r0 = r0.has(r1)
                    if (r0 == 0) goto L80
                    org.json.JSONObject r0 = r7.LIZ
                    int r0 = r0.optInt(r1)
                    goto L6c
                L80:
                    org.json.JSONObject r0 = r7.LIZ
                    java.lang.String r1 = "statusCode"
                    boolean r0 = r0.has(r1)
                    if (r0 == 0) goto L26
                    org.json.JSONObject r0 = r7.LIZ
                    int r0 = r0.optInt(r1)
                    goto L6c
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1BRY.LIZ(X.1BRb, X.1BRa):void");
            }
        };
    }

    @Override // X.AbstractC1051750dTZ
    public void setAccess(EnumC1051570dTH enumC1051570dTH) {
        this.access = enumC1051570dTH;
    }

    public final void setHybridMonitorSession(C1550010qRD c1550010qRD) {
        this.mMonitorSession = c1550010qRD;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, final InterfaceC1019840ce6 interfaceC1019840ce6) {
        try {
            C1BRP.LIZ(getWebJsMsg(jSONObject), jSONObject.optJSONObject("res"), null, new InterfaceC2204871BRd() { // from class: X.1BRT
                @Override // X.InterfaceC2204871BRd
                public final void LIZ(JSONObject jSONObject2) throws JSONException {
                    JSONObject jSONObject3 = new JSONObject(jSONObject2.optString("_raw"));
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("response", jSONObject3);
                    interfaceC1019840ce6.onSuccess(jSONObject4);
                }
            }, this.mJsRequestCallback).execute();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
