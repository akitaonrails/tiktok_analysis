package com.ss.android.ugc.aweme.fe.method;

import X.C1024380clQ;
import X.C1687430u0r;
import X.InterfaceC1041760dDS;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class LoadGeckoResourcesMethod extends BaseCommonJavaMethod {
    public LoadGeckoResourcesMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public LoadGeckoResourcesMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        if (jSONObject.has("channels")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("channels");
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i));
            }
            IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
            if (iAdLandPagePreloadService != null && iAdLandPagePreloadService.G0() != null) {
                C1024380clQ.LJIILJJIL(null, C1687430u0r.LIZ(arrayList));
            }
        }
    }
}
