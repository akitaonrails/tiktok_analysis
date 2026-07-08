package com.ss.android.ugc.aweme.web.jsbridge;

import X.C743880TFy;
import X.C844470XAv;
import X.InterfaceC1041760dDS;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class IsAppInstalledMethod extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public IsAppInstalledMethod() {
    }

    public IsAppInstalledMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        String string = JSONObjectProtectorUtils.getString(jSONObject, "packageName");
        C844470XAv.LIZ.getClass();
        if (C743880TFy.LIZ(C844470XAv.LIZ(), string)) {
            interfaceC1041760dDS.onSuccess(new JSONObject());
        } else {
            interfaceC1041760dDS.LIZ(-1, string);
        }
    }
}
