package com.ss.android.ugc.aweme.fe.method;

import X.C0XI4;
import X.C13LP;
import X.C13LZ;
import X.C14EU;
import X.C15438062q;
import X.C1563370qml;
import X.C19724912Fj;
import X.C212367188v;
import X.C21244318Bt;
import X.C2188811AlT;
import X.C531650Kt9;
import X.C663720Q1q;
import X.EnumC682280QpW;
import X.InterfaceC1041760dDS;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.ranges.IntRange;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class OpenShortVideoMethod extends BaseCommonJavaMethod {
    public String LLILLL;

    public OpenShortVideoMethod() {
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

    public OpenShortVideoMethod(IESJsBridge iESJsBridge) {
        super(iESJsBridge);
        this.LLILLL = "";
        EventBus.LIZLLL().LJIJJ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final BaseCommonJavaMethod attach(WeakReference<Context> weakReference) {
        Context context = weakReference.get();
        if (context instanceof LifecycleOwner) {
            C1563370qml.LIZ((LifecycleOwner) context, EnumC682280QpW.MAIN, new AwS411S0200000_10(context, this, 18));
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
        if (jSONObject != null && jSONObject.has("current_item_id") && jSONObject.has("item_ids") && jSONObject.has("react_id")) {
            WebView webView = null;
            if (1 != 0) {
                this.LLILLL = jSONObject.optString("react_id");
                String strOptString = jSONObject.optString("current_item_id");
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("item_ids");
                String strOptString2 = jSONObject.optString("enter_from");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("aweme://aweme/detaillist/");
                sbLIZ.append(strOptString);
                C0XI4 c0xi4 = new C0XI4(C2188811AlT.LIZIZ(sbLIZ));
                c0xi4.LJ("react_session_id", this.LLILLL);
                int length = jSONArrayOptJSONArray.length();
                if (length > 0) {
                    IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, length);
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(intRangeLJIILJJIL, 10));
                    C531650Kt9 it2 = intRangeLJIILJJIL.iterator();
                    while (it2.LLILLL) {
                        arrayList.add(jSONArrayOptJSONArray.get(it2.nextInt()));
                    }
                    c0xi4.LJ("ids", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
                }
                if (jSONObject.has("current_time")) {
                    c0xi4.LIZIZ((int) (jSONObject.optDouble("current_time") * ((double) 1000.0f)), "video_current_position");
                }
                if (strOptString2 != null) {
                    c0xi4.LJ("enter_from", strOptString2);
                }
                if (jSONObject.has("tracker_data")) {
                    c0xi4.LJ("tracker_data", jSONObject.optString("tracker_data"));
                }
                c0xi4.LJ("video_from", "commerce_general");
                c0xi4.LJ("from_group_id", jSONObject.optString("from_group_id"));
                c0xi4.LJ("carrier_type", jSONObject.optString("carrier_type"));
                c0xi4.LJ("refer_commodity_id", jSONObject.optString("refer_commodity_id"));
                c0xi4.LJ("data_type", jSONObject.optString("data_type"));
                c0xi4.LJ("previous_page", jSONObject.optString("previous_page"));
                c0xi4.LJ("enter_method", jSONObject.optString("enter_method"));
                c0xi4.LJ("auto_route_schema", jSONObject.optString("auto_route_schema"));
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("extra");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                String strOptString3 = jSONObjectOptJSONObject.optString("btm");
                if (strOptString3 != null && strOptString3.length() != 0) {
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("bcm");
                    BtmSDK btmSDK = BtmSDK.INSTANCE;
                    C21244318Bt c21244318Bt = new C21244318Bt();
                    c21244318Bt.LIZ = strOptString3;
                    IESJsBridge iESJsBridge = this.LLILLJJLI;
                    if (iESJsBridge != null) {
                        webView = iESJsBridge.LIZ;
                    }
                    c21244318Bt.LIZIZ = PageFinder.via((View) webView);
                    BcmParams.Companion.getClass();
                    c21244318Bt.LIZJ = C212367188v.LIZIZ(jSONObjectOptJSONObject2);
                    String strCreateJumpSourceBtmTokenForJSB = btmSDK.createJumpSourceBtmTokenForJSB(c21244318Bt);
                    if (strCreateJumpSourceBtmTokenForJSB != null && strCreateJumpSourceBtmTokenForJSB.length() != 0) {
                        c0xi4.LJ("source_btm_token", strCreateJumpSourceBtmTokenForJSB);
                    }
                }
                C19724912Fj.LIZLLL().LJII(c0xi4.LJFF());
            }
        }
        if (interfaceC1041760dDS != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            interfaceC1041760dDS.LIZIZ(jSONObject2);
        }
    }
}
