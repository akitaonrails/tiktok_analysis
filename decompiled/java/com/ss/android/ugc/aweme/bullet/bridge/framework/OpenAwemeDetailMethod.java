package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C1051660dTQ;
import X.C1065720dq6;
import X.C1388190mED;
import X.C14EU;
import X.C1593730rZj;
import X.C15O7;
import X.C19719512Dh;
import X.C2188811AlT;
import X.C663720Q1q;
import X.C686150Qvl;
import X.C686190Qvp;
import X.C786410Ut5;
import X.InterfaceC1019840ce6;
import Y.ACallableS15S2200000_10;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class OpenAwemeDetailMethod extends BaseBridgeMethod {
    public static final C686190Qvp Companion = new Object() { // from class: X.0Qvp
    };
    public String lastReactId;
    public final String name;

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

    public OpenAwemeDetailMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "openAwemeDetail";
        this.lastReactId = "";
        attach();
        register();
    }

    @C14EU
    public final void onEvent(C663720Q1q c663720Q1q) throws JSONException {
        if (TextUtils.equals(c663720Q1q.LIZ, this.lastReactId)) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("play_state", c663720Q1q.LIZIZ);
            long j = c663720Q1q.LIZJ;
            if (j < 0) {
                j = 0;
            }
            jSONObject2.put("current_time", Float.valueOf(j / 1000.0f));
            jSONObject2.put("current_item_id", c663720Q1q.LIZLLL);
            jSONObject2.put("react_id", this.lastReactId);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "video_state_change");
            sendEvent("notification", jSONObject);
        }
    }

    public final C1065720dq6 possibleModel(String str) {
        Activity activityLIZ;
        Context context = getContext();
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            Object tag = activityLIZ.findViewById(R.id.content).getTag(com.zhiliaoapp.musically.R.id.cjt);
            if (C19719512Dh.LJII(tag)) {
                Object obj = ((Map) tag).get(str);
                if (!(obj instanceof C1065720dq6)) {
                    return null;
                }
                return (C1065720dq6) obj;
            }
            if (tag instanceof C1065720dq6) {
                return (C1065720dq6) tag;
            }
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) throws JSONException {
        int i = 1;
        boolean z = false;
        if (jSONObject.has("react_id") && jSONObject.has("aweme_id") && jSONObject.has("enter_from") && 1 != 0) {
            String strOptString = jSONObject.optString("react_id");
            this.lastReactId = strOptString;
            String strOptString2 = jSONObject.optString("aweme_id");
            String strOptString3 = jSONObject.optString("enter_from");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://aweme/detail/");
            sbLIZ.append(strOptString2);
            C686150Qvl c686150Qvl = new C686150Qvl(C2188811AlT.LIZIZ(sbLIZ));
            c686150Qvl.LIZIZ("react_session_id", strOptString);
            c686150Qvl.LIZIZ("page_type", strOptString3);
            c686150Qvl.LIZIZ("refer", strOptString3);
            c686150Qvl.LIZIZ("video_from", "from_feeds_operate_optimized");
            c686150Qvl.LIZIZ("entrance_info", jSONObject.optString("entrance_info"));
            if (jSONObject.has("log_extra")) {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString("log_extra"));
                c686150Qvl.LIZIZ("carrier_type", jSONObject2.optString("carrier_type"));
                c686150Qvl.LIZIZ("from_group_id", jSONObject2.optString("from_group_id"));
                c686150Qvl.LIZIZ("refer_commodity_id", jSONObject2.optString("refer_commodity_id"));
                c686150Qvl.LIZIZ("data_type", jSONObject2.optString("data_type"));
                c686150Qvl.LIZIZ("previous_page", jSONObject2.optString("previous_page"));
                c686150Qvl.LIZIZ("enter_from", jSONObject2.optString("enter_from"));
                c686150Qvl.LIZIZ("tab_name", jSONObject2.optString("tab_name"));
                if (Intrinsics.LJFF("creation_inspiration", strOptString3)) {
                    c686150Qvl.LIZIZ("tracker_data", C786410Ut5.J3(jSONObject2));
                }
                C1593730rZj.LIZIZ.LIZ(c686150Qvl, strOptString3, jSONObject2);
            }
            if (jSONObject.has("current_time")) {
                c686150Qvl.LIZ((int) (jSONObject.optDouble("current_time") * ((double) 1000.0f)), "video_current_position");
            }
            if (jSONObject.has("message_id")) {
                c686150Qvl.LIZIZ("ai_sutdio_message_id", jSONObject.optString("message_id"));
                c686150Qvl.LIZIZ("ai_sutdio_session_id", jSONObject.optString("session_id"));
                c686150Qvl.LIZIZ("enter_method", jSONObject.optString("enter_method"));
            }
            C15O7.LIZIZ(new ACallableS15S2200000_10(this, strOptString, strOptString3, c686150Qvl, 0), C15O7.LJIIIIZZ, null);
            z = true;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (!z) {
            i = -1;
        }
        jSONObject3.put("code", i);
        interfaceC1019840ce6.LIZIZ(jSONObject3);
    }
}
