package com.ss.android.ugc.aweme.fe.method;

import X.C14EU;
import X.C1563370qml;
import X.C15O7;
import X.C2188811AlT;
import X.C663720Q1q;
import X.C686150Qvl;
import X.EnumC682280QpW;
import X.InterfaceC1041760dDS;
import Y.ACallableS15S2200000_10;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS411S0200000_10;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class OpenAwemeDetailMethod extends BaseCommonJavaMethod {
    public String LLILLL;

    public OpenAwemeDetailMethod() {
        this(null);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        EventBus.LIZLLL().LJJI(this);
    }

    public OpenAwemeDetailMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
        this.LLILLL = "";
        EventBus.LIZLLL().LJIJJ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final BaseCommonJavaMethod attach(WeakReference<Context> weakReference) {
        Context context = weakReference.get();
        if (context instanceof LifecycleOwner) {
            C1563370qml.LIZ((LifecycleOwner) context, EnumC682280QpW.MAIN, new AwS411S0200000_10(context, this, 16));
        }
        super.attach(weakReference);
        return this;
    }

    @C14EU
    public final void onEvent(C663720Q1q c663720Q1q) throws JSONException {
        if (TextUtils.equals(c663720Q1q.LIZ, this.LLILLL)) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("play_state", c663720Q1q.LIZIZ);
            long j = c663720Q1q.LIZJ;
            if (j < 0) {
                j = 0;
            }
            jSONObject2.put("current_time", Float.valueOf(j / 1000.0f));
            jSONObject2.put("current_item_id", c663720Q1q.LIZLLL);
            jSONObject2.put("react_id", this.LLILLL);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "video_state_change");
            sendEvent("notification", jSONObject, 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) throws JSONException {
        String strOptString;
        String strOptString2;
        int i = 1;
        boolean z = false;
        if (jSONObject != null && jSONObject.has("react_id") && ((jSONObject.has("aweme_id") || jSONObject.has("init_index")) && jSONObject.has("enter_from") && 1 != 0)) {
            String strOptString3 = jSONObject.optString("react_id");
            this.LLILLL = strOptString3;
            if (jSONObject.has("init_index")) {
                strOptString = jSONObject.optString("aweme_id");
            } else {
                strOptString = jSONObject.optString("");
            }
            String strOptString4 = jSONObject.optString("enter_from");
            if (jSONObject.has("init_index")) {
                strOptString2 = jSONObject.optString("init_index");
            } else {
                strOptString2 = jSONObject.optString(CardStruct.IStatusCode.DEFAULT);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://aweme/detail/");
            sbLIZ.append(strOptString);
            C686150Qvl c686150Qvl = new C686150Qvl(C2188811AlT.LIZIZ(sbLIZ));
            c686150Qvl.LIZIZ("react_session_id", strOptString3);
            c686150Qvl.LIZIZ("index", strOptString2);
            c686150Qvl.LIZIZ("page_type", strOptString4);
            c686150Qvl.LIZIZ("refer", strOptString4);
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
                c686150Qvl.LIZIZ("enter_method", jSONObject2.optString("enter_method"));
            }
            if (jSONObject.has("current_time")) {
                c686150Qvl.LIZ((int) (jSONObject.optDouble("current_time") * ((double) 1000.0f)), "video_current_position");
            }
            if (jSONObject.has("report_reason")) {
                c686150Qvl.LIZIZ("ad_report_reason", jSONObject.optString("report_reason"));
            }
            if (jSONObject.has("report_reason_type")) {
                c686150Qvl.LIZIZ("ad_report_reason_type", jSONObject.optString("report_reason_type"));
            }
            if (jSONObject.has("ace_enter_from")) {
                c686150Qvl.LIZIZ("ace_enter_from", jSONObject.optString("report_reason_type"));
            }
            if (jSONObject.has("creative_hub_type")) {
                c686150Qvl.LIZ(jSONObject.optInt("creative_hub_type"), "creative_hub_type");
            }
            if (jSONObject.has("creative_hub_text")) {
                c686150Qvl.LIZIZ("creative_hub_text", jSONObject.optString("creative_hub_text"));
            }
            if (jSONObject.has("cvh_open_record_id")) {
                c686150Qvl.LIZIZ("cvh_open_record_id", jSONObject.optString("cvh_open_record_id"));
            }
            if (jSONObject.has("should_show_creator_ai_guide")) {
                c686150Qvl.LIZIZ("creator_ai_guide", jSONObject.optString("should_show_creator_ai_guide"));
            }
            C15O7.LIZIZ(new ACallableS15S2200000_10(this, strOptString3, strOptString4, c686150Qvl, 1), C15O7.LJIIIIZZ, null);
            z = true;
        }
        if (interfaceC1041760dDS != null) {
            JSONObject jSONObject3 = new JSONObject();
            if (!z) {
                i = -1;
            }
            jSONObject3.put("code", i);
            interfaceC1041760dDS.LIZIZ(jSONObject3);
        }
    }
}
