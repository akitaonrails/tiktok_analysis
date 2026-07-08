package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.C1000380c8i;
import X.C1051660dTQ;
import X.InterfaceC1019840ce6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ad.feed.IFeedAdService;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class DynamicAdViewSizeMethod extends BaseBridgeMethod {
    public static final int $stable = 8;
    public final String name;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public DynamicAdViewSizeMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "getDCViewSize";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        ((IFeedAdService) ServiceManager.get().getService(IFeedAdService.class)).LJIJJLI();
        Pair<Integer, Integer> pairLJI = C1000380c8i.LJI();
        if (pairLJI.getSecond().intValue() == 0) {
            interfaceC1019840ce6.LIZ(-1, "");
        } else {
            interfaceC1019840ce6.onSuccess(new JSONObject().put("viewPortWidth", pairLJI.getFirst().intValue()).put("viewPortHeight", pairLJI.getSecond().intValue()));
        }
    }
}
