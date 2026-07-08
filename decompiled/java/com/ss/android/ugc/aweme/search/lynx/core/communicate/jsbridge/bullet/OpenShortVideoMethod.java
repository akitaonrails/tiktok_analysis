package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.C01GW;
import X.C1051660dTQ;
import X.C14EU;
import X.C452501pT;
import X.C663340Q0e;
import X.C663710Q1p;
import X.C663720Q1q;
import X.C786410Ut5;
import X.EnumC1051570dTH;
import X.InterfaceC663700Q1o;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS554S0100000_10;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class OpenShortVideoMethod extends BaseBridgeMethod {
    public EnumC1051570dTH access;
    public final C663340Q0e helper;
    public final Map<String, String> logParamMap;
    public final C01GW mDetailJumpInterceptor$delegate;
    public final String name;
    public String reactId;
    public static final C663710Q1p Companion = new Object() { // from class: X.0Q1p
    };
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final InterfaceC663700Q1o getMDetailJumpInterceptor() {
        return (InterfaceC663700Q1o) this.mDetailJumpInterceptor$delegate.getValue();
    }

    @Override // X.AbstractC1051750dTZ, X.InterfaceC1051690dTT
    public void release() {
        EventBus.LIZLLL().LJJI(this);
    }

    @Override // X.AbstractC1051750dTZ, X.InterfaceC1051460dT6
    public EnumC1051570dTH getAccess() {
        return this.access;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public OpenShortVideoMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.logParamMap = new LinkedHashMap();
        this.name = "open_short_video";
        this.access = EnumC1051570dTH.PRIVATE;
        this.reactId = "";
        this.mDetailJumpInterceptor$delegate = C452501pT.LIZIZ(new AwS554S0100000_10(c1051660dTQ, 320));
        EventBus.LIZLLL().LJIJJ(this);
        this.helper = new C663340Q0e(c1051660dTQ, getName());
    }

    private final Map<String, String> jsonObjToMap(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            linkedHashMap.put(next, JSONObjectProtectorUtils.getString(jSONObject, next));
        }
        return linkedHashMap;
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

    @Override // X.AbstractC1051750dTZ
    public void setAccess(EnumC1051570dTH enumC1051570dTH) {
        this.access = enumC1051570dTH;
    }

    private final void handleTokenType(JSONObject jSONObject, Bundle bundle) {
        if (!jSONObject.has("token_type")) {
            return;
        }
        HashMap map = new HashMap();
        map.put("token_type", jSONObject.optString("token_type"));
        C786410Ut5.LJJIZ(bundle, "feed_param_extra", map);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0073 A[Catch: Exception -> 0x0098, TryCatch #4 {Exception -> 0x0098, blocks: (B:20:0x0058, B:22:0x0060, B:24:0x0066, B:27:0x006e, B:29:0x0073, B:31:0x0079, B:34:0x0081, B:36:0x0086, B:38:0x008c, B:41:0x0094), top: B:239:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086 A[Catch: Exception -> 0x0098, TryCatch #4 {Exception -> 0x0098, blocks: (B:20:0x0058, B:22:0x0060, B:24:0x0066, B:27:0x006e, B:29:0x0073, B:31:0x0079, B:34:0x0081, B:36:0x0086, B:38:0x008c, B:41:0x0094), top: B:239:0x0058 }] */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handle(org.json.JSONObject r38, final X.InterfaceC1019840ce6 r39) {
        /*
            Method dump skipped, instruction units count: 1651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet.OpenShortVideoMethod.handle(org.json.JSONObject, X.0ce6):void");
    }
}
