package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C01GW;
import X.C1051660dTQ;
import X.C1063260dm8;
import X.C1065720dq6;
import X.C1388190mED;
import X.C13BV;
import X.C13LQ;
import X.C452501pT;
import X.InterfaceC1019840ce6;
import X.InterfaceC1065730dq7;
import android.R;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.fe.method.feeds.pojo.FeedsResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS187S0000000_2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class LoadFeedsFlowMethod extends BaseBridgeMethod implements InterfaceC1065730dq7 {
    public static final C1063260dm8 Companion = new Object() { // from class: X.0dm8
    };
    public final Map<String, C1065720dq6> bridgeModelMap;
    public final String name;
    public final C01GW parser$delegate;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final Gson getParser() {
        return (Gson) this.parser$delegate.getValue();
    }

    private final void clearEnvironment() {
        Activity activityLIZ;
        Context context = getContext();
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        activityLIZ.findViewById(R.id.content).setTag(com.zhiliaoapp.musically.R.id.cjt, null);
    }

    private final void prepareEnvironment() {
        Activity activityLIZ;
        Context context = getContext();
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        activityLIZ.findViewById(R.id.content).setTag(com.zhiliaoapp.musically.R.id.cjt, this.bridgeModelMap);
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

    @Override // X.AbstractC1051750dTZ, X.InterfaceC1051690dTT
    public void release() {
        super.release();
        clearEnvironment();
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public LoadFeedsFlowMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "loadFeedsFlow";
        this.bridgeModelMap = new LinkedHashMap();
        attach();
        this.parser$delegate = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(193));
    }

    private final C1065720dq6 getBridgeModelList(String str) {
        C1065720dq6 c1065720dq6 = this.bridgeModelMap.get(str);
        if (c1065720dq6 == null) {
            C1065720dq6 c1065720dq62 = new C1065720dq6(new FeedsResponse(), str, this);
            this.bridgeModelMap.put(str, c1065720dq62);
            return c1065720dq62;
        }
        return c1065720dq6;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) throws JSONException {
        List listLJJLL;
        int i = 1;
        boolean z = false;
        if (jSONObject.has("react_id") && jSONObject.has("has_more") && jSONObject.has("aweme_list") && jSONObject.has("page")) {
            C1065720dq6 bridgeModelList = getBridgeModelList(jSONObject.optString("react_id"));
            Object[] objArr = (Object[]) GsonProtectorUtils.fromJson(getParser(), jSONObject.optString("aweme_list"), Aweme[].class);
            if (objArr == null || (listLJJLL = C13LQ.LJJLL(objArr)) == null) {
                listLJJLL = C13BV.INSTANCE;
            }
            bridgeModelList.LJIIJJI(jSONObject.optInt("page", 0), jSONObject.optBoolean("has_more", false), jSONObject.optBoolean("insert_before", false), listLJJLL);
            z = true;
        }
        prepareEnvironment();
        JSONObject jSONObject2 = new JSONObject();
        if (!z) {
            i = -1;
        }
        jSONObject2.put("code", i);
        interfaceC1019840ce6.LIZIZ(jSONObject2);
    }

    @Override // X.InterfaceC1065730dq7
    public void sendStatus(String str, JSONObject jSONObject, int i) {
        sendEvent(str, jSONObject);
    }
}
