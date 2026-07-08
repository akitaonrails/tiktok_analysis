package com.ss.android.ugc.aweme.fe.method;

import X.C1388190mED;
import X.C149A;
import X.InterfaceC1041760dDS;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.secapi.ISecApi;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class BdturingMethod extends BaseCommonJavaMethod {
    public BdturingMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public BdturingMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, final InterfaceC1041760dDS interfaceC1041760dDS) {
        String strOptString;
        Context context;
        Activity activityLIZ;
        if (jSONObject == null || (strOptString = jSONObject.optString("decision")) == null) {
            strOptString = "";
        }
        if (TextUtils.isEmpty(strOptString)) {
            if (interfaceC1041760dDS != null) {
                interfaceC1041760dDS.onSuccess(1);
            }
        } else {
            WeakReference<Context> weakReference = this.mContextRef;
            if (weakReference != null && (context = weakReference.get()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                ((ISecApi) ServiceManager.get().getService(ISecApi.class)).popCaptchaV2(activityLIZ, strOptString, new C149A() { // from class: X.0XTa
                    @Override // X.C149A
                    public final void LIZIZ(int i, boolean z) {
                        InterfaceC1041760dDS interfaceC1041760dDS2 = interfaceC1041760dDS;
                        if (interfaceC1041760dDS2 != null) {
                            interfaceC1041760dDS2.onSuccess(Integer.valueOf(i));
                        }
                    }
                }, null);
            }
        }
    }
}
