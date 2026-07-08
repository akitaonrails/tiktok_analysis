package com.ss.android.ugc.aweme.fe.method;

import X.C1019830ce5;
import X.C1027410cqJ;
import X.C1028210crb;
import X.C1041070dCL;
import X.C2214201BlK;
import X.C844470XAv;
import X.C988570bpf;
import X.C988850bq7;
import X.InterfaceC1041760dDS;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class OpenAdLandPageLinksMethod extends BaseCommonJavaMethod {
    public OpenAdLandPageLinksMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public OpenAdLandPageLinksMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        String strOptString;
        boolean z;
        boolean z2;
        boolean z3;
        Context baseContext;
        C1019830ce5 c1019830ce5LIZ = C988850bq7.LIZ();
        if (jSONObject != null) {
            strOptString = jSONObject.optString("url");
        } else {
            strOptString = null;
        }
        if (strOptString != null && strOptString.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (interfaceC1041760dDS != null) {
                interfaceC1041760dDS.LIZ(-1, "empty url");
                return;
            }
            return;
        }
        if (jSONObject.optInt("isDeeplink") == 1) {
            Activity activityLJFF = C2214201BlK.LJFF();
            if (activityLJFF != null && (baseContext = activityLJFF.getBaseContext()) != null) {
                C988570bpf.LIZ.getClass();
                if (C1041070dCL.LIZ() != null && C1028210crb.LJIJI(baseContext, strOptString)) {
                    if (interfaceC1041760dDS != null) {
                        interfaceC1041760dDS.onSuccess(null);
                        return;
                    }
                    return;
                }
            }
            if (interfaceC1041760dDS == null) {
                return;
            }
            interfaceC1041760dDS.LIZJ(0, null, "can not open third app");
            return;
        }
        String strOptString2 = jSONObject.optString("title");
        int iOptInt = jSONObject.optInt("landingStyle", 0);
        int iOptInt2 = jSONObject.optInt("landingAccessStyle", 0);
        int iOptInt3 = jSONObject.optInt("landingExitStyle", 0);
        String strOptString3 = jSONObject.optString("refer", "");
        if (jSONObject.optBoolean("shouldUseActivity", false)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (jSONObject.optBoolean("useTuxSheet", false)) {
            z3 = true;
        } else {
            z3 = false;
        }
        String strOptString4 = jSONObject.optString("reportAdExtraData");
        try {
            C844470XAv.LIZ.getClass();
            if (C1027410cqJ.LIZ(C844470XAv.LIZ(), LIZ(strOptString, strOptString2, iOptInt, iOptInt2, iOptInt3, c1019830ce5LIZ, strOptString3, z2, z3, strOptString4)).LIZ()) {
                if (interfaceC1041760dDS != null) {
                    interfaceC1041760dDS.onSuccess(null);
                    return;
                }
                return;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (interfaceC1041760dDS != null) {
            interfaceC1041760dDS.LIZ(-1, "can not handle url");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x02c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1027480cqQ LIZ(java.lang.String r12, java.lang.String r13, int r14, int r15, int r16, X.C1019830ce5 r17, java.lang.String r18, boolean r19, boolean r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.OpenAdLandPageLinksMethod.LIZ(java.lang.String, java.lang.String, int, int, int, X.0ce5, java.lang.String, boolean, boolean, java.lang.String):X.0cqQ");
    }
}
