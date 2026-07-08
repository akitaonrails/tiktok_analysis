package com.ss.android.ugc.aweme.fe.method;

import X.C596440NaM;
import X.InterfaceC1041760dDS;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class GetNativeItemMethod extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public GetNativeItemMethod() {
    }

    public GetNativeItemMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        try {
            String strLIZIZ = C596440NaM.LIZ.LIZIZ(JSONObjectProtectorUtils.getString(jSONObject, "key"), "");
            if (!TextUtils.isEmpty(strLIZIZ)) {
                interfaceC1041760dDS.onSuccess(strLIZIZ);
            } else {
                interfaceC1041760dDS.LIZ(0, "value is null");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC1041760dDS.LIZ(0, e.getMessage());
        }
    }
}
