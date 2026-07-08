package com.ss.android.ugc.aweme.fe.method;

import X.AbstractC1255880imo;
import X.C14EU;
import X.C1563370qml;
import X.C15O7;
import X.C20684815ws;
import X.C2188811AlT;
import X.C663720Q1q;
import X.C686150Qvl;
import X.EnumC682280QpW;
import X.InterfaceC1041760dDS;
import Y.ACallableS242S0200000_10;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.fe.method.feeds.pojo.FeedsResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS411S0200000_10;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class OpenFeedsFlowMethod extends BaseCommonJavaMethod {
    public String LLILLL;

    public OpenFeedsFlowMethod() {
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

    public OpenFeedsFlowMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
        this.LLILLL = "";
        EventBus.LIZLLL().LJIJJ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final BaseCommonJavaMethod attach(WeakReference<Context> weakReference) {
        Context context = weakReference.get();
        if (context instanceof LifecycleOwner) {
            C1563370qml.LIZ((LifecycleOwner) context, EnumC682280QpW.MAIN, new AwS411S0200000_10(context, this, 17));
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, InterfaceC1041760dDS interfaceC1041760dDS) throws JSONException {
        AbstractC1255880imo abstractC1255880imo;
        String aid;
        int i = 1;
        boolean z = false;
        if (jSONObject != null && jSONObject.has("react_id") && jSONObject.has("enter_from") && 1 != 0) {
            this.LLILLL = jSONObject.optString("react_id");
            Activity activity = (Activity) getActContext();
            if (activity != null && (abstractC1255880imo = (AbstractC1255880imo) activity.findViewById(R.id.content).getTag(com.zhiliaoapp.musically.R.id.cjt)) != null) {
                if (abstractC1255880imo.getItems().size() <= 0) {
                    if (TextUtils.equals(jSONObject.optString("enter_from"), "feed_low_quality")) {
                        C20684815ws.onEventV3("ads_specialist_show_fail");
                        return;
                    }
                    return;
                }
                if (jSONObject.has("aweme_id")) {
                    aid = jSONObject.optString("aweme_id");
                } else {
                    aid = ((Aweme) ListProtector.get(abstractC1255880imo.getItems(), 0)).getAid();
                }
                String strOptString = jSONObject.optString("enter_from");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("aweme://aweme/detail/");
                sbLIZ.append(aid);
                C686150Qvl c686150Qvl = new C686150Qvl(C2188811AlT.LIZIZ(sbLIZ));
                c686150Qvl.LIZIZ("react_session_id", this.LLILLL);
                c686150Qvl.LIZIZ("page_type", strOptString);
                c686150Qvl.LIZIZ("refer", strOptString);
                c686150Qvl.LIZIZ("video_from", "from_feeds_operate");
                c686150Qvl.LIZIZ("from_group_id", jSONObject.optString("from_group_id"));
                c686150Qvl.LIZIZ("carrier_type", jSONObject.optString("carrier_type"));
                c686150Qvl.LIZIZ("refer_commodity_id", jSONObject.optString("refer_commodity_id"));
                c686150Qvl.LIZIZ("data_type", jSONObject.optString("data_type"));
                c686150Qvl.LIZIZ("previous_page", jSONObject.optString("previous_page"));
                c686150Qvl.LIZIZ("enter_method", jSONObject.optString("enter_method"));
                c686150Qvl.LIZ(((FeedsResponse) abstractC1255880imo.getData()).isNewUser ? 1 : 0, "is_new_low_quality_user");
                if (jSONObject.has("current_time")) {
                    c686150Qvl.LIZ((int) (jSONObject.optDouble("current_time") * ((double) 1000.0f)), "video_current_position");
                }
                C15O7.LIZIZ(new ACallableS242S0200000_10(this, c686150Qvl, 1), C15O7.LJIIIIZZ, null);
                z = true;
            } else {
                return;
            }
        }
        if (interfaceC1041760dDS != null) {
            JSONObject jSONObject2 = new JSONObject();
            if (!z) {
                i = -1;
            }
            jSONObject2.put("code", i);
            interfaceC1041760dDS.LIZIZ(jSONObject2);
        }
    }
}
