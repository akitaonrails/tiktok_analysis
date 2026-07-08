package com.ss.android.ugc.aweme.fe.method.commerce;

import X.InterfaceC1041760dDS;
import X.InterfaceC1061400dj8;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class RefreshNavTitleMethod extends BaseCommonJavaMethod {
    public final InterfaceC1061400dj8 LLILLL;

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public RefreshNavTitleMethod(InterfaceC1061400dj8 interfaceC1061400dj8) {
        this.LLILLL = interfaceC1061400dj8;
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        String strOptString;
        if (jSONObject != null && (strOptString = jSONObject.optString("title")) != null) {
            this.LLILLL.LIZ(strOptString);
        }
    }
}
