package com.ss.android.ugc.aweme.fe.method;

import X.C0N2Z;
import X.C1440005kM;
import X.InterfaceC1041760dDS;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class GetWebViewInfo extends BaseCommonJavaMethod {
    public GetWebViewInfo() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        int iHashCode;
        WebView webView;
        IESJsBridge iESJsBridge = this.LLILLJJLI;
        if (iESJsBridge != null && (webView = iESJsBridge.LIZ) != null) {
            iHashCode = webView.hashCode();
        } else {
            iHashCode = 0;
        }
        C1440005kM.LIZ(new C0N2Z(iHashCode, interfaceC1041760dDS));
    }
}
