package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C01GW;
import X.C1051660dTQ;
import X.C1054760dYQ;
import X.C1075630e65;
import X.C1075640e66;
import X.C1388190mED;
import X.C1537480q70;
import X.C452501pT;
import X.EnumC1051570dTH;
import X.InterfaceC1019840ce6;
import X.InterfaceC1541990qEH;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.share.improve.pkg.SearchSharePackage;
import com.ss.android.ugc.aweme.web.share.model.SearchShareUIConfig;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS204S0000000_16;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class ShareSearchMethod extends BaseBridgeMethod {
    public static final C1054760dYQ Companion = new Object() { // from class: X.0dYQ
    };
    public EnumC1051570dTH access;
    public final C01GW gsonProvider$delegate;
    public final InterfaceC1541990qEH kitView;
    public final String name;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final Gson getGsonProvider() {
        return (Gson) this.gsonProvider$delegate.getValue();
    }

    @Override // X.AbstractC1051750dTZ, X.InterfaceC1051460dT6
    public EnumC1051570dTH getAccess() {
        return this.access;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public ShareSearchMethod(C1051660dTQ c1051660dTQ) {
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        super(c1051660dTQ);
        this.gsonProvider$delegate = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(116));
        C1537480q70 c1537480q70 = c1051660dTQ.LIZIZ;
        if (c1537480q70 != null) {
            interfaceC1541990qEHLJIJJ = c1537480q70.LJIJJ();
        } else {
            interfaceC1541990qEHLJIJJ = null;
        }
        this.kitView = interfaceC1541990qEHLJIJJ;
        this.name = "shareSearch";
        this.access = EnumC1051570dTH.PRIVATE;
    }

    @Override // X.AbstractC1051750dTZ
    public void setAccess(EnumC1051570dTH enumC1051570dTH) {
        this.access = enumC1051570dTH;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) throws JSONException {
        View viewE1;
        WebView webView;
        JSONObject jSONObject2 = new JSONObject();
        int i = 1;
        jSONObject2.put("code", 1);
        WeakReference<Context> weakReference = new WeakReference<>(getContext());
        InterfaceC1541990qEH interfaceC1541990qEH = this.kitView;
        String url = null;
        if (interfaceC1541990qEH != null) {
            viewE1 = interfaceC1541990qEH.e1();
        } else {
            viewE1 = null;
        }
        if ((viewE1 instanceof WebView) && (webView = (WebView) viewE1) != null) {
            url = webView.getUrl();
        }
        boolean zDirectlyShare = directlyShare(weakReference, jSONObject, url, jSONObject2, interfaceC1019840ce6);
        if (!jSONObject2.has("tricky_flag")) {
            if (!zDirectlyShare) {
                i = -1;
            }
            jSONObject2.put("code", i);
            interfaceC1019840ce6.LIZIZ(jSONObject2);
        }
    }

    private final boolean directlyShare(WeakReference<Context> weakReference, JSONObject jSONObject, String str, JSONObject jSONObject2, InterfaceC1019840ce6 interfaceC1019840ce6) {
        SearchShareUIConfig searchShareUIConfig;
        Activity activityLIZ;
        if (jSONObject == null) {
            return false;
        }
        String strOptString = jSONObject.optString("title");
        String strOptString2 = jSONObject.optString("desc");
        String strOptString3 = jSONObject.optString("image");
        String strOptString4 = jSONObject.optString("url");
        String strOptString5 = jSONObject.optString("schema");
        String strOptString6 = jSONObject.optString("track_info");
        try {
            searchShareUIConfig = (SearchShareUIConfig) getGsonProvider().LJII(jSONObject.optString("UIConfig"), SearchShareUIConfig.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            searchShareUIConfig = new SearchShareUIConfig(0, 0);
        }
        C1075640e66 c1075640e66 = new C1075640e66(strOptString, strOptString2, strOptString3, strOptString4, strOptString5, strOptString6, searchShareUIConfig, jSONObject.optString("contentPb"), null, 256);
        Context context = weakReference.get();
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return false;
        }
        SearchSharePackage.Companion.getClass();
        C1075630e65.LIZ(activityLIZ, c1075640e66);
        return true;
    }
}
