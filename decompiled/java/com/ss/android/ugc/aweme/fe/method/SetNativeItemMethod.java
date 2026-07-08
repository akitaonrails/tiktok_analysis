package com.ss.android.ugc.aweme.fe.method;

import X.C596440NaM;
import X.InterfaceC1041760dDS;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class SetNativeItemMethod extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public SetNativeItemMethod() {
    }

    public SetNativeItemMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        try {
            String string = JSONObjectProtectorUtils.getString(jSONObject, "key");
            if (C596440NaM.LIZ.LIZJ(JSONObjectProtectorUtils.getString(jSONObject, "value"), string)) {
                interfaceC1041760dDS.onSuccess(null);
            } else {
                interfaceC1041760dDS.LIZ(-1, "");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC1041760dDS.LIZ(-1, "");
        }
    }
}
