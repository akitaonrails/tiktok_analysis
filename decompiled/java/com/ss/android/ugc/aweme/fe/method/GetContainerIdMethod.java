package com.ss.android.ugc.aweme.fe.method;

import X.AbstractC1550140qRQ;
import X.C1550010qRD;
import X.C2198811B3v;
import X.InterfaceC1041760dDS;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class GetContainerIdMethod extends BaseCommonJavaMethod {
    public GetContainerIdMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public GetContainerIdMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) throws JSONException {
        String str;
        C2198811B3v c2198811B3v;
        AbstractC1550140qRQ abstractC1550140qRQ;
        if (interfaceC1041760dDS != null) {
            JSONObject jSONObject2 = new JSONObject();
            WeakReference<C2198811B3v> weakReference = this.LL;
            if (weakReference == null || (c2198811B3v = weakReference.get()) == null || (abstractC1550140qRQ = (AbstractC1550140qRQ) c2198811B3v.LIZ(C1550010qRD.class)) == null || (str = abstractC1550140qRQ.LIZ) == null) {
                str = "";
            }
            jSONObject2.put("container_id", str);
            interfaceC1041760dDS.onSuccess(jSONObject2);
        }
    }
}
