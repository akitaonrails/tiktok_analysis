package com.ss.android.ugc.aweme.web.jsbridge;

import X.C2188811AlT;
import X.C794420VEi;
import X.InterfaceC1041760dDS;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class MonitorLogMethod extends BaseCommonJavaMethod {
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) throws JSONException {
        if (jSONObject != null && jSONObject.length() != 0) {
            String strOptString = jSONObject.optString("log_type");
            if (TextUtils.isEmpty(strOptString)) {
                if (interfaceC1041760dDS != null) {
                    interfaceC1041760dDS.LIZ(0, "log_type is empty");
                    return;
                }
                return;
            }
            String strOptString2 = jSONObject.optString("service");
            if (TextUtils.equals(strOptString, "service_monitor") && TextUtils.isEmpty(strOptString2)) {
                if (interfaceC1041760dDS != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("service is required while log_type=");
                    sbLIZ.append(strOptString);
                    interfaceC1041760dDS.LIZ(0, C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            Object objOpt = jSONObject.opt(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
            if (objOpt != null) {
                jSONObject2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, objOpt);
            }
            Object objOpt2 = jSONObject.opt("value");
            if (objOpt2 != null) {
                jSONObject2.put("value", objOpt2);
            }
            C794420VEi.LIZIZ(strOptString, strOptString2, jSONObject2);
            if (interfaceC1041760dDS != null) {
                interfaceC1041760dDS.onSuccess(null);
                return;
            }
            return;
        }
        if (interfaceC1041760dDS != null) {
            interfaceC1041760dDS.LIZ(0, "params is empty");
        }
    }
}
