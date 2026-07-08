package com.ss.android.ugc.aweme.fe.method;

import X.C1043700dGa;
import X.C2198811B3v;
import X.C786410Ut5;
import X.InterfaceC1041760dDS;
import android.content.Intent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class RoutePopMethod extends BaseCommonJavaMethod {
    public RoutePopMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public RoutePopMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) throws JSONException {
        C2198811B3v c2198811B3v;
        AbsActivityContainer absActivityContainer;
        WeakReference<C2198811B3v> weakReference = this.LL;
        if (weakReference != null && (c2198811B3v = weakReference.get()) != null && (absActivityContainer = (AbsActivityContainer) c2198811B3v.LIZ(AbsActivityContainer.class)) != null) {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null) {
                C1043700dGa.LIZ(jSONObject2, jSONObject);
            }
            Intent intent = new Intent();
            intent.putExtra("serialized_data", C786410Ut5.J3(jSONObject2));
            absActivityContainer.LJIJJLI(50000, intent);
            absActivityContainer.LJIJ();
            if (interfaceC1041760dDS != null) {
                interfaceC1041760dDS.LIZJ(1, new JSONObject(), "pop succeed");
                return;
            }
            return;
        }
        if (interfaceC1041760dDS != null) {
            interfaceC1041760dDS.LIZ(-1, "params not valid");
        }
    }
}
