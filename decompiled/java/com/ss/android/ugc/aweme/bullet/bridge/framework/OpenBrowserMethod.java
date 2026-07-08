package com.ss.android.ugc.aweme.bullet.bridge.framework;

import X.C01GW;
import X.C0WZX;
import X.C1020020ceO;
import X.C1020030ceP;
import X.C1029220ctE;
import X.C1051020dSO;
import X.C1051660dTQ;
import X.C1059900dgi;
import X.C1440005kM;
import X.C1701330uNH;
import X.C2184171Adz;
import X.C2204961BRm;
import X.C2429209fW;
import X.C294500BgW;
import X.C452501pT;
import X.C997880c4g;
import X.EnumC1051570dTH;
import X.InterfaceC1019840ce6;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.commercialize.ICommercializeFromMainOutService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Locale;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class OpenBrowserMethod extends BaseBridgeMethod {
    public static final C1051020dSO Companion = new Object() { // from class: X.0dSO
    };
    public EnumC1051570dTH access;
    public final String name;
    public final C01GW service$delegate;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final ICommercializeFromMainOutService getService() {
        return (ICommercializeFromMainOutService) this.service$delegate.getValue();
    }

    @Override // X.AbstractC1051750dTZ, X.InterfaceC1051460dT6
    public EnumC1051570dTH getAccess() {
        return this.access;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public OpenBrowserMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.service$delegate = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(115));
        this.name = "openBrowser";
        this.access = EnumC1051570dTH.PROTECT;
    }

    private final boolean openHttp(JSONObject jSONObject) throws JSONException {
        String string = JSONObjectProtectorUtils.getString(jSONObject, "url");
        Context context = getContext();
        if (context != null && jSONObject.optBoolean("use_external_browser", false)) {
            Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(string));
            intent.addFlags(268435456);
            intent.addCategory("android.intent.category.BROWSABLE");
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
            if (resolveInfoResolveActivity != null) {
                ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
                intent.setClassName(activityInfo.packageName, activityInfo.name);
                C2429209fW.LIZ().appendDataFlowId(intent, 1207969294);
                INVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_framework_OpenBrowserMethod_com_bytedance_router_monitor_page_PageLancet_startActivity(context, intent);
                return true;
            }
        }
        jSONObject.put("type", "webview");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("url", string);
        jSONObject.put("args", jSONObject2);
        C1059900dgi.LIZIZ(context, jSONObject);
        return true;
    }

    @Override // X.AbstractC1051750dTZ
    public void setAccess(EnumC1051570dTH enumC1051570dTH) {
        this.access = enumC1051570dTH;
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_framework_OpenBrowserMethod_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(Context context, Intent intent) {
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOi9b5PLyHwDdlrQqGjrn2czMXzD4AxbD5kOwPtnoZ35u932Uiot8jmV", null));
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_framework_OpenBrowserMethod_com_bytedance_router_monitor_page_PageLancet_startActivity(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_framework_OpenBrowserMethod_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(context, intent);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        try {
            Context context = getContext();
            String string = JSONObjectProtectorUtils.getString(jSONObject, "url");
            if (!TextUtils.isEmpty(string)) {
                String lowerCase = string.toLowerCase(Locale.ROOT);
                if (!u.LJJIIJZLJL(lowerCase, "http://", false) && !u.LJJIIJZLJL(lowerCase, "https://", false)) {
                    if (context != null && getService().LIZ(context, string)) {
                        if (C294500BgW.LIZ()) {
                            getService().LJ(new C1029220ctE(null, CardStruct.IStatusCode.DEFAULT, "", CardStruct.IStatusCode.DEFAULT), string, context);
                        }
                        C1020020ceO c1020020ceOLIZ = C1020030ceP.LIZ();
                        c1020020ceOLIZ.LIZ = "draw_ad";
                        c1020020ceOLIZ.LIZIZ = "open_url_app";
                        c1020020ceOLIZ.LJIIJ(context);
                        C2184171Adz.LJ("draw_ad", "open_url_app", CardStruct.IStatusCode.DEFAULT, "", CardStruct.IStatusCode.DEFAULT).LJIIIIZZ();
                        getService().pendingDeepLinkLog(new AwS588S0100000_9(context, 67));
                        C1440005kM.LIZ(new C997880c4g());
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("code", 1);
                        interfaceC1019840ce6.LIZIZ(jSONObject2);
                        return;
                    }
                } else if (openHttp(jSONObject)) {
                    C1440005kM.LIZ(new C997880c4g());
                    JSONObject jSONObject22 = new JSONObject();
                    jSONObject22.put("code", 1);
                    interfaceC1019840ce6.LIZIZ(jSONObject22);
                    return;
                }
            }
            interfaceC1019840ce6.LIZ(0, "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC1019840ce6.LIZ(0, "");
        }
    }
}
