package com.ss.android.ugc.aweme.web.jsbridge;

import X.C2095008Iq;
import X.C2201701BEy;
import X.InterfaceC1041760dDS;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS38S2000000_16;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AdThirdTrackMethod extends BaseCommonJavaMethod {
    public AdThirdTrackMethod() {
        super(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public AdThirdTrackMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) {
        if (jSONObject == null) {
            return;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("track_url_list");
        String strOptString = jSONObject.optString("track_label");
        String strOptString2 = jSONObject.optString("creative_id");
        String strOptString3 = jSONObject.optString("log_extra");
        String strOptString4 = jSONObject.optString("ad_id");
        String strOptString5 = jSONObject.optString("group_id");
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                ArrayList arrayList = new ArrayList();
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(jSONArrayOptJSONArray.optString(i));
                }
                C2201701BEy c2201701BEy = C2201701BEy.LIZ;
                Long lLJIILIIL = C2095008Iq.LJIILIIL(strOptString2);
                new AwS38S2000000_16(strOptString5, strOptString4, 1);
                c2201701BEy.getClass();
                C2201701BEy.LIZIZ(strOptString, arrayList, lLJIILIIL, strOptString3, null);
                if (interfaceC1041760dDS != null) {
                    interfaceC1041760dDS.onSuccess(null);
                    return;
                }
                return;
            }
            if (interfaceC1041760dDS != null) {
                interfaceC1041760dDS.LIZ(-1, "empty trackLabel or creativeId");
                return;
            }
            return;
        }
        if (interfaceC1041760dDS != null) {
            interfaceC1041760dDS.LIZ(-1, "empty track_url_list");
        }
    }
}
