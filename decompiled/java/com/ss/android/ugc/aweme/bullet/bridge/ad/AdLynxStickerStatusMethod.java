package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.C1051660dTQ;
import X.C1440005kM;
import X.C824380WVo;
import X.InterfaceC1019840ce6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AdLynxStickerStatusMethod extends BaseBridgeMethod {
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

    public AdLynxStickerStatusMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "adLynxStickerStatus";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        if (!jSONObject.has(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)) {
            interfaceC1019840ce6.LIZ(-1, "status is empty");
        } else {
            C1440005kM.LIZ(new C824380WVo(jSONObject.optInt(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)));
            interfaceC1019840ce6.LIZJ(1, null, "post status success");
        }
    }
}
