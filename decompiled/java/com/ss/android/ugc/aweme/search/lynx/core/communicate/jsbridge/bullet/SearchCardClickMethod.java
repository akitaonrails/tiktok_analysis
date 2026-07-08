package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.C0Q0X;
import X.C1051660dTQ;
import X.C1529870puj;
import X.C1537480q70;
import X.C653440Pk6;
import X.C660870Pw5;
import X.C663340Q0e;
import X.EnumC1051570dTH;
import X.InterfaceC1019840ce6;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchCardClickMethod extends BaseBridgeMethod {
    public EnumC1051570dTH access;
    public final C663340Q0e helper;
    public final String name;
    public String reactId;
    public static final C0Q0X Companion = new Object() { // from class: X.0Q0X
    };
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC1051750dTZ, X.InterfaceC1051460dT6
    public EnumC1051570dTH getAccess() {
        return this.access;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public SearchCardClickMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "click_search_card";
        this.access = EnumC1051570dTH.PRIVATE;
        this.reactId = "";
        this.helper = new C663340Q0e(c1051660dTQ, getName());
    }

    @Override // X.AbstractC1051750dTZ
    public void setAccess(EnumC1051570dTH enumC1051570dTH) {
        this.access = enumC1051570dTH;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) throws JSONException {
        String str;
        Iterator<String> itKeys;
        if (this.helper.LIZ(interfaceC1019840ce6)) {
            return;
        }
        Object objLJFF = null;
        if (jSONObject.has("card_params")) {
            this.reactId = jSONObject.optString("react_id");
            try {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("card_params");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (jSONObjectOptJSONObject != null && (itKeys = jSONObjectOptJSONObject.keys()) != null) {
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        String string = JSONObjectProtectorUtils.getString(jSONObjectOptJSONObject, next);
                        if (string == null) {
                            string = "";
                        }
                        linkedHashMap.put(next, string);
                    }
                }
                C1537480q70 c1537480q70 = this.contextProviderFactory.LIZIZ;
                if (c1537480q70 != null && (str = c1537480q70.containerId) != null) {
                    C1529870puj.LIZ.getClass();
                    objLJFF = C1529870puj.LJFF(str);
                }
                View view = (View) objLJFF;
                C653440Pk6.LIZ(C660870Pw5.LIZ(view).LJIILL, view, (String) linkedHashMap.get("search_result_id"), linkedHashMap);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                interfaceC1019840ce6.LIZ(0, e.getMessage());
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        interfaceC1019840ce6.LIZIZ(jSONObject2);
    }
}
