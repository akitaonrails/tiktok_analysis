package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C1051660dTQ;
import X.C1065740dq8;
import X.C1388190mED;
import X.C14EU;
import X.C15O7;
import X.C20684815ws;
import X.C2188811AlT;
import X.C663720Q1q;
import X.C686150Qvl;
import X.C686170Qvn;
import X.InterfaceC1019840ce6;
import Y.ACallableS242S0200000_10;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class OpenFeedsFlowMethod extends BaseBridgeMethod {
    public static final C686170Qvn Companion = new Object() { // from class: X.0Qvn
    };
    public final String name;
    public String reactId;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void attach() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        Object context = getContext();
        if (!(context instanceof LifecycleOwner) || (lifecycleOwner = (LifecycleOwner) context) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) {
            return;
        }
        lifecycle.addObserver(this);
    }

    public final C1065740dq8 possibleModel() {
        Activity activityLIZ;
        Context context = getContext();
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return null;
        }
        return (C1065740dq8) activityLIZ.findViewById(R.id.content).getTag(com.zhiliaoapp.musically.R.id.cjt);
    }

    public final void register() {
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // X.AbstractC1051750dTZ, X.InterfaceC1051690dTT
    public void release() {
        super.release();
        unregister();
    }

    public final void unregister() {
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public OpenFeedsFlowMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "openFeedsFlow";
        this.reactId = "";
        attach();
        register();
    }

    @C14EU
    public final void onEvent(C663720Q1q c663720Q1q) throws JSONException {
        if (TextUtils.equals(c663720Q1q.LIZ, this.reactId)) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("play_state", c663720Q1q.LIZIZ);
            long j = c663720Q1q.LIZJ;
            if (j < 0) {
                j = 0;
            }
            jSONObject2.put("current_time", Float.valueOf(j / 1000.0f));
            jSONObject2.put("current_item_id", c663720Q1q.LIZLLL);
            jSONObject2.put("react_id", this.reactId);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "video_state_change");
            sendEvent("notification", jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) throws JSONException {
        String aid;
        int i = 1;
        boolean z = false;
        if (jSONObject.has("react_id") && jSONObject.has("enter_from") && 1 != 0) {
            this.reactId = jSONObject.optString("react_id");
            C1065740dq8 c1065740dq8PossibleModel = possibleModel();
            if (c1065740dq8PossibleModel == null) {
                return;
            }
            if (c1065740dq8PossibleModel.getItems().size() <= 0) {
                if (TextUtils.equals(jSONObject.optString("enter_from"), "feed_low_quality")) {
                    C20684815ws.onEventV3("ads_specialist_show_fail");
                    return;
                }
                return;
            }
            if (jSONObject.has("aweme_id")) {
                aid = jSONObject.optString("aweme_id");
            } else {
                aid = ((Aweme) ListProtector.get(c1065740dq8PossibleModel.getItems(), 0)).getAid();
            }
            String strOptString = jSONObject.optString("enter_from");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://aweme/detail/");
            sbLIZ.append(aid);
            C686150Qvl c686150Qvl = new C686150Qvl(C2188811AlT.LIZIZ(sbLIZ));
            c686150Qvl.LIZIZ("react_session_id", this.reactId);
            c686150Qvl.LIZIZ("page_type", strOptString);
            c686150Qvl.LIZIZ("refer", strOptString);
            c686150Qvl.LIZIZ("video_from", "from_feeds_operate");
            c686150Qvl.LIZIZ("from_group_id", jSONObject.optString("from_group_id"));
            c686150Qvl.LIZIZ("carrier_type", jSONObject.optString("carrier_type"));
            c686150Qvl.LIZIZ("refer_commodity_id", jSONObject.optString("refer_commodity_id"));
            c686150Qvl.LIZIZ("data_type", jSONObject.optString("data_type"));
            c686150Qvl.LIZIZ("previous_page", jSONObject.optString("previous_page"));
            c686150Qvl.LIZ(c1065740dq8PossibleModel.getData().isNewUser ? 1 : 0, "is_new_low_quality_user");
            if (jSONObject.has("current_time")) {
                c686150Qvl.LIZ((int) (jSONObject.optDouble("current_time") * ((double) 1000.0f)), "video_current_position");
            }
            C15O7.LIZIZ(new ACallableS242S0200000_10(this, c686150Qvl, 0), C15O7.LJIIIIZZ, null);
            z = true;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (!z) {
            i = -1;
        }
        jSONObject2.put("code", i);
        interfaceC1019840ce6.LIZIZ(jSONObject2);
    }
}
