package com.ss.android.ugc.aweme.fe.method;

import X.C1061440djC;
import X.InterfaceC1041760dDS;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class HasFeedbackMethod extends BaseCommonJavaMethod {
    public HasFeedbackMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public HasFeedbackMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        if (C1061440djC.LIZ == null) {
            C1061440djC.LIZ = Keva.getRepo("HasFeedbackKeva");
        }
        Keva keva = C1061440djC.LIZ;
        if (keva != null) {
            keva.storeBoolean("has", true);
        }
    }
}
