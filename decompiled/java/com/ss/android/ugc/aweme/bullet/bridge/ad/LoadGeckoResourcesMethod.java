package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.C1024380clQ;
import X.C1024480cla;
import X.C1051660dTQ;
import X.C1687430u0r;
import X.InterfaceC1019840ce6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class LoadGeckoResourcesMethod extends BaseBridgeMethod {
    public final String name;
    public static final C1024480cla Companion = new Object() { // from class: X.0cla
    };
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public LoadGeckoResourcesMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "loadGeckoResources";
    }

    private final void preloadLynxResources(List<String> list) {
        IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
        if (iAdLandPagePreloadService != null && iAdLandPagePreloadService.G0() != null) {
            C1024380clQ.LJIILJJIL(null, C1687430u0r.LIZ(list));
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        if (jSONObject.has("channels")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("channels");
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArrayOptJSONArray.optString(i));
            }
            preloadLynxResources(arrayList);
        }
    }
}
