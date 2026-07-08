package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C0XI4;
import X.C1051660dTQ;
import X.C1059990dgr;
import X.C1893760zNe;
import X.C2093608Ic;
import X.C2188811AlT;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.util.Iterator;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public abstract class OpenMethod extends BaseBridgeMethod {
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public abstract /* synthetic */ String getName();

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public OpenMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
    }

    private final Activity contextToActivity(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return contextToActivity(((ContextWrapper) context).getBaseContext());
    }

    public final void open(JSONObject jSONObject) {
        Activity activityContextToActivity;
        try {
            Context context = getContext();
            if (((!(context instanceof Activity) || (activityContextToActivity = (Activity) context) == null) && (activityContextToActivity = contextToActivity(context)) == null) || !C1893760zNe.LIZ(activityContextToActivity, true)) {
                return;
            }
            String strOptString = jSONObject.optString("type");
            if (C2093608Ic.LJ(strOptString) || a0.LJJIZ(strOptString, ':', 0, false, 6) >= 0) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C1059990dgr.LIZ().getSSLocalScheme());
            sbLIZ.append("://");
            sbLIZ.append(strOptString);
            C0XI4 c0xi4 = new C0XI4(C2188811AlT.LIZIZ(sbLIZ));
            generateUrl(jSONObject.optJSONObject("args"), c0xi4);
            C1059990dgr.LIZ().startAdsAppActivity(activityContextToActivity, c0xi4.LJFF());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    private final void generateUrl(JSONObject jSONObject, C0XI4 c0xi4) throws JSONException {
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof Integer) {
                    c0xi4.LIZIZ(((Number) obj).intValue(), next);
                } else if (obj instanceof Long) {
                    c0xi4.LIZJ(((Number) obj).longValue(), next);
                } else if (obj instanceof Double) {
                    c0xi4.LIZ(((Number) obj).doubleValue(), next);
                } else if (obj instanceof String) {
                    c0xi4.LJ(next, (String) obj);
                } else if (obj instanceof Boolean) {
                    c0xi4.LJ(next, String.valueOf(((Boolean) obj).booleanValue()));
                } else if (obj instanceof JSONObject) {
                    generateUrl((JSONObject) obj, c0xi4);
                }
            }
        }
    }
}
