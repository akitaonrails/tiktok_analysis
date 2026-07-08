package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C08B7;
import X.C08RQ;
import X.C0DQL;
import X.C0N52;
import X.C1047150dM9;
import X.C1047290dMN;
import X.C1051660dTQ;
import X.C1051980dTw;
import X.C1440005kM;
import X.C1529880puk;
import X.C1537480q70;
import X.C20113813my;
import X.C602130NjX;
import X.EnumC1051570dTH;
import X.EnumC1054630dYD;
import X.InterfaceC1019840ce6;
import X.InterfaceC1028200cra;
import X.InterfaceC1047180dMC;
import X.InterfaceC1059280dfi;
import android.app.Activity;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.DetailFeedService;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.commercialize.ecommerce.service.IShoppingAdsService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class CloseMethod extends BaseBridgeMethod {
    public static final C1047150dM9 Companion = new Object() { // from class: X.0dM9
    };
    public EnumC1051570dTH access;
    public final String name;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final boolean closePopUpIfNeeds() {
        C1047290dMN sessionInfo;
        InterfaceC1028200cra kitContainerApi = getKitContainerApi();
        String str = (kitContainerApi == null || (sessionInfo = kitContainerApi.getSessionInfo()) == null) ? null : sessionInfo.LIZ;
        if (str == null || str.length() == 0) {
            return false;
        }
        InterfaceC1047180dMC interfaceC1047180dMC = (InterfaceC1047180dMC) C20113813my.LIZIZ().LIZIZ(InterfaceC1047180dMC.class);
        if (interfaceC1047180dMC != null && interfaceC1047180dMC.dismiss()) {
            return true;
        }
        SparkContext.Companion.getClass();
        InterfaceC1059280dfi interfaceC1059280dfiLIZ = C1529880puk.LIZ(str);
        if (interfaceC1059280dfiLIZ == null || !(interfaceC1059280dfiLIZ instanceof SparkPopup)) {
            return false;
        }
        ((SparkPopup) interfaceC1059280dfiLIZ).gS(true);
        closeAllWebContainerInSession(str);
        return true;
    }

    private final boolean closeSparkFragmentIfNeed() {
        BaseBundle baseBundle;
        InterfaceC1059280dfi interfaceC1059280dfiLIZ;
        C1047290dMN sessionInfo;
        InterfaceC1028200cra kitContainerApi = getKitContainerApi();
        String str = null;
        if (kitContainerApi != null && (sessionInfo = kitContainerApi.getSessionInfo()) != null) {
            str = sessionInfo.LIZ;
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        SparkContext.Companion.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(str);
        if (c1537480q70LIZIZ == null || (baseBundle = (BaseBundle) c1537480q70LIZIZ.LJFF(Bundle.class)) == null || !baseBundle.getBoolean("close_fragment") || (interfaceC1059280dfiLIZ = C1529880puk.LIZ(str)) == null || !(interfaceC1059280dfiLIZ instanceof SparkFragment)) {
            return false;
        }
        ((SparkFragment) interfaceC1059280dfiLIZ).close();
        closeAllWebContainerInSession(str);
        return true;
    }

    @Override // X.AbstractC1051750dTZ, X.InterfaceC1051460dT6
    public EnumC1051570dTH getAccess() {
        return this.access;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public CloseMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "close";
        this.access = EnumC1051570dTH.PUBLIC;
    }

    private final boolean closeAdPopup(JSONObject jSONObject) {
        if (jSONObject.optInt("is_ad_popup", 0) != 1) {
            return false;
        }
        C1440005kM.LIZ(new C602130NjX("closeTuxSheet"));
        return true;
    }

    private final void closeAllWebContainerInSession(String str) {
        String str2 = C08RQ.LIZJ(str).get("__spark_session_id");
        if (str2 != null) {
            C1051980dTw.LIZIZ(str2);
        }
    }

    @Override // X.AbstractC1051750dTZ
    public void setAccess(EnumC1051570dTH enumC1051570dTH) {
        this.access = enumC1051570dTH;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) throws JSONException {
        boolean z;
        WebView webView;
        DetailFeedService detailFeedService;
        if (closeAdPopup(jSONObject)) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            interfaceC1019840ce6.LIZIZ(jSONObject2);
            return;
        }
        if (closePopUpIfNeeds()) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("code", 1);
            interfaceC1019840ce6.LIZIZ(jSONObject3);
            return;
        }
        IShoppingAdsService iShoppingAdsService = (IShoppingAdsService) ServiceManager.get().getService(IShoppingAdsService.class);
        int iHashCode = 0;
        if (iShoppingAdsService != null && iShoppingAdsService.LJFF(getContext())) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("code", 1);
            interfaceC1019840ce6.LIZIZ(jSONObject4);
            return;
        }
        if (closeSparkFragmentIfNeed()) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("code", 1);
            interfaceC1019840ce6.LIZIZ(jSONObject5);
            return;
        }
        if (getHybridType() != EnumC1054630dYD.WEB && getHybridType() != EnumC1054630dYD.LYNX) {
            Activity activityById = getActivityById(jSONObject.optString("reactId"));
            if (activityById != null) {
                activityById.finish();
                interfaceC1019840ce6.onSuccess(null);
                return;
            } else {
                interfaceC1019840ce6.LIZ(-1, "the target activity doesn't exist");
                return;
            }
        }
        String strOptString = jSONObject.optString("reactId");
        if (strOptString != null && strOptString.length() != 0 && strOptString != null) {
            Activity activityById2 = getActivityById(strOptString);
            if (activityById2 != null) {
                activityById2.finish();
            }
            z = true;
        } else {
            z = false;
        }
        Context context = getContext();
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!activity.isFinishing()) {
                if ((context instanceof C08B7) || ((detailFeedService = (DetailFeedService) PluggableExtentionKt.pluggableSpi$default(DetailFeedService.class, false, false, false, 14, null)) != null && detailFeedService.LIZ(context))) {
                    if (getHybridType() == EnumC1054630dYD.LYNX) {
                        InterfaceC1028200cra kitContainerApi = getKitContainerApi();
                        if (kitContainerApi != null) {
                            iHashCode = kitContainerApi.hashCode();
                        }
                    } else {
                        IESJsBridge jsBridge = getJsBridge();
                        if (jsBridge != null && (webView = jsBridge.LIZ) != null) {
                            iHashCode = webView.hashCode();
                        }
                    }
                    C1440005kM.LIZ(new C0N52(iHashCode));
                    C1440005kM.LIZ(new C0DQL(iHashCode));
                } else if (!z) {
                    activity.finish();
                }
            }
        }
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("code", 1);
        interfaceC1019840ce6.LIZIZ(jSONObject6);
    }
}
