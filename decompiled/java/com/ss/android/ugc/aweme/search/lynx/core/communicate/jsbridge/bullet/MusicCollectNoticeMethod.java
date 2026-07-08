package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.C0OGJ;
import X.C1051660dTQ;
import X.C1440005kM;
import X.C663340Q0e;
import X.C667290QFj;
import X.InterfaceC1019840ce6;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class MusicCollectNoticeMethod extends BaseBridgeMethod {
    public final C663340Q0e helper;
    public final String name;
    public static final C667290QFj Companion = new Object() { // from class: X.0QFj
    };
    public static final int $stable = 8;
    public static final JSONObject EMPTY_JSON_OBJECT = new JSONObject();

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public MusicCollectNoticeMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "musicCollectNotice";
        this.helper = new C663340Q0e(this.contextProviderFactory, getName());
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        if (this.helper.LIZ(interfaceC1019840ce6)) {
            return;
        }
        try {
            String strOptString = jSONObject.optString(FollowStatusChangeMethod.PARAM_UID, "");
            if (strOptString.length() > 0 && 1 != 0) {
                Integer numValueOf = Integer.valueOf(jSONObject.optInt(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, -1));
                int iIntValue = numValueOf.intValue();
                if (iIntValue != 1 && iIntValue != 0) {
                    interfaceC1019840ce6.LIZ(0, "collect status is not valid");
                    return;
                } else {
                    C1440005kM.LIZ(new C0OGJ(strOptString, numValueOf.intValue(), true));
                    interfaceC1019840ce6.onSuccess(EMPTY_JSON_OBJECT);
                    return;
                }
            }
            interfaceC1019840ce6.LIZ(0, "music id is not valid");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message == null) {
                message = "unknown exception";
            }
            interfaceC1019840ce6.LIZ(0, message);
        }
    }
}
