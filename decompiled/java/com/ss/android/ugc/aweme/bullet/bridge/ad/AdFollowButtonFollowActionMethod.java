package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.C1051660dTQ;
import X.C1440005kM;
import X.InterfaceC1019840ce6;
import X.InterfaceC1051470dT7;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.governance.eventbus.IEvent;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AdFollowButtonFollowActionMethod extends BaseBridgeMethod {
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

    public AdFollowButtonFollowActionMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "followAction";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        Object objLIZ;
        InterfaceC1051470dT7 interfaceC1051470dT7LIZ = this.contextProviderFactory.LIZ(View.class);
        if (interfaceC1051470dT7LIZ != null && (objLIZ = interfaceC1051470dT7LIZ.LIZ()) != null) {
            objLIZ.hashCode();
        }
        C1440005kM.LIZ(new IEvent() { // from class: X.0c7X
            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent post() {
                C1440005kM.LIZ(this);
                return this;
            }

            @Override // com.ss.android.ugc.governance.eventbus.IEvent
            public final /* synthetic */ IEvent postSticky() {
                C1440005kM.LIZIZ(this);
                return this;
            }
        });
        interfaceC1019840ce6.onSuccess(null);
    }
}
