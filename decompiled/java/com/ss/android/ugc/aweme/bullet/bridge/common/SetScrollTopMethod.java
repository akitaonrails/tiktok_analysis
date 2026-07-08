package com.ss.android.ugc.aweme.bullet.bridge.common;

import X.C1030100cue;
import X.C1051660dTQ;
import X.InterfaceC1019840ce6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class SetScrollTopMethod extends BaseBridgeMethod {
    public final String name;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public SetScrollTopMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "setScrollTop";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        int iOptInt = jSONObject.optInt("top", 2);
        if (iOptInt != 0) {
            if (iOptInt == 1) {
                C1030100cue.LIZ = true;
            }
        } else {
            C1030100cue.LIZ = false;
        }
        interfaceC1019840ce6.onSuccess(1);
    }
}
