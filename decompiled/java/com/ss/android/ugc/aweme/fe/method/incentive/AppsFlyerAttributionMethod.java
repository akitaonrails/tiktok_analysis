package com.ss.android.ugc.aweme.fe.method.incentive;

import X.C20144713rx;
import X.C836440Wra;
import X.InterfaceC1041760dDS;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public final class AppsFlyerAttributionMethod extends BaseCommonJavaMethod {
    public AppsFlyerAttributionMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        JSONObject jSONObjectOptJSONObject;
        Iterator<String> itKeys;
        String strOptString = null;
        if (jSONObject != null) {
            strOptString = jSONObject.optString("event_name", "");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jSONObject != null && jSONObject.has("params") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("params")) != null && (itKeys = jSONObjectOptJSONObject.keys()) != null) {
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, jSONObjectOptJSONObject.opt(next));
            }
        }
        ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LIZLLL();
        C836440Wra.LIZLLL(strOptString, linkedHashMap, new C20144713rx(939524108));
        if (interfaceC1041760dDS != null) {
            interfaceC1041760dDS.onSuccess("");
        }
    }
}
