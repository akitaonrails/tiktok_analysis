package com.ss.android.ugc.aweme.compliance.protection.jsb;

import X.C1051660dTQ;
import X.C2215101Bmm;
import X.InterfaceC1019840ce6;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class GetFormattedTimeMethod extends BaseBridgeMethod {
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

    public GetFormattedTimeMethod(C1051660dTQ c1051660dTQ, String str) {
        super(c1051660dTQ);
        this.name = str;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            getFormatter(jSONObject2, jSONObject.optLong("time_stamp"), jSONObject.optString("formate_str"));
            interfaceC1019840ce6.onSuccess(jSONObject2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC1019840ce6.LIZ(-1, e.getMessage());
        }
    }

    public final void getFormatter(JSONObject jSONObject, long j, String str) throws JSONException {
        jSONObject.put("time_string", C2215101Bmm.LIZ(j, str));
        jSONObject.put("is_hour_24_format", TextUtils.equals(C2215101Bmm.LIZ(j, "LT"), C2215101Bmm.LIZ(j, "lt")));
    }
}
