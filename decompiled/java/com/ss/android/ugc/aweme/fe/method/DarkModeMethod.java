package com.ss.android.ugc.aweme.fe.method;

import X.C1323040kX8;
import X.C1388190mED;
import X.InterfaceC1041760dDS;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class DarkModeMethod extends BaseCommonJavaMethod {
    public DarkModeMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public DarkModeMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        String strOptString;
        Activity activityLIZ = null;
        if (jSONObject != null) {
            strOptString = jSONObject.optString("enable");
        } else {
            strOptString = null;
        }
        try {
            WeakReference<Context> weakReference = this.mContextRef;
            if (weakReference != null) {
                Context context = weakReference.get();
                if (context != null) {
                    activityLIZ = C1388190mED.LIZ(context);
                }
                C1323040kX8.LIZIZ(activityLIZ, activityLIZ.getWindow(), TextUtils.equals(strOptString, "true"));
                if (interfaceC1041760dDS != null) {
                    interfaceC1041760dDS.onSuccess(new JSONObject());
                    if (Unit.LIZ != null) {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (interfaceC1041760dDS != null) {
                interfaceC1041760dDS.LIZ(-1, "context is null");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (interfaceC1041760dDS != null) {
                interfaceC1041760dDS.LIZ(0, e.getMessage());
            }
        }
    }
}
