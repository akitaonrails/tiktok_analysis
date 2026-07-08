package com.ss.android.ugc.aweme.web.jsbridge;

import X.C600230NgT;
import X.InterfaceC1041760dDS;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import kotlin.jvm.internal.AwS240S0300000_31;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class EditPageMethod extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public EditPageMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        if (jSONObject == null) {
            return;
        }
        C600230NgT.LIZ(jSONObject, new AwS240S0300000_31(this, jSONObject, interfaceC1041760dDS, 31));
    }
}
