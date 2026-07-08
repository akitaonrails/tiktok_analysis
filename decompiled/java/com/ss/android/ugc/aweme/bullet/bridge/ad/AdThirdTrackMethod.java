package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.C1020060ceS;
import X.C1028210crb;
import X.C1041070dCL;
import X.C1051660dTQ;
import X.C2095008Iq;
import X.C988570bpf;
import X.InterfaceC1019840ce6;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AdThirdTrackMethod extends BaseBridgeMethod {
    public final String name;
    public static final C1020060ceS Companion = new Object() { // from class: X.0ceS
    };
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public AdThirdTrackMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "sendThirdTrack";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
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
                C988570bpf.LIZ.getClass();
                if (C1041070dCL.LIZ() != null) {
                    C1028210crb.LJJIIZI(strOptString, C2095008Iq.LJIILIIL(strOptString2), strOptString3, strOptString5, arrayList, strOptString4);
                }
                interfaceC1019840ce6.onSuccess(null);
                return;
            }
            interfaceC1019840ce6.LIZ(-1, "empty trackLabel or creativeId");
            return;
        }
        interfaceC1019840ce6.LIZ(-1, "empty track_url_list");
    }
}
