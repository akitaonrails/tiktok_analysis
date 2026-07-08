package com.ss.android.ugc.aweme.fe.method;

import X.C0XDN;
import X.InterfaceC1041760dDS;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ApiParamMethod extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        HashMap map = new HashMap();
        C0XDN.LIZJ(map, true);
        interfaceC1041760dDS.onSuccess(new JSONObject(map));
    }
}
