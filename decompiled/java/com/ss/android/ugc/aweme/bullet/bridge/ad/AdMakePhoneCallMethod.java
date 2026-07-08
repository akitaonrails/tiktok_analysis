package com.ss.android.ugc.aweme.bullet.bridge.ad;

import X.C0WZX;
import X.C1019830ce5;
import X.C1021990chZ;
import X.C1022820ciu;
import X.C1051660dTQ;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1701330uNH;
import X.C2184171Adz;
import X.C2204961BRm;
import X.C2429209fW;
import X.C2540909xX;
import X.C988840bq6;
import X.C988850bq7;
import X.InterfaceC1019840ce6;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AdMakePhoneCallMethod extends BaseBridgeMethod {
    public final String name;
    public static final C1021990chZ Companion = new Object() { // from class: X.0chZ
    };
    public static final int $stable = 8;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    public AdMakePhoneCallMethod(C1051660dTQ c1051660dTQ) {
        super(c1051660dTQ);
        this.name = "adMakePhoneCall";
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_ad_AdMakePhoneCallMethod_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(Context context, Intent intent) {
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOi9b5PLyHwDdlrQqGjrmHF8HX357hVVT5oQSHeiIqZ0aYdgYnF/", null));
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_ad_AdMakePhoneCallMethod_com_bytedance_router_monitor_page_PageLancet_startActivity(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_ad_AdMakePhoneCallMethod_com_bytedance_analytics_lancet_StartActivityLancet_startActivity(context, intent);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        Aweme aweme;
        int iIntValue;
        Activity activityLIZ;
        if (!jSONObject.has("phoneNumber")) {
            interfaceC1019840ce6.LIZ(0, "phone number is empty");
            return;
        }
        String strOptString = jSONObject.optString("phoneNumber");
        String strOptString2 = jSONObject.optString("enterFrom");
        if (strOptString2 == null) {
            strOptString2 = "landing_page";
        }
        Context context = (Context) this.contextProviderFactory.LIZIZ(Context.class);
        HashMap<String, Integer> map = C988840bq6.LIZ;
        Integer num = map.get(strOptString);
        C1019830ce5 c1019830ce5LIZ = C988850bq7.LIZ();
        AwemeRawAd awemeRawAd = null;
        if (c1019830ce5LIZ != null) {
            aweme = c1019830ce5LIZ.LJIIL;
        } else {
            aweme = null;
        }
        if (num != null && num.intValue() >= C2540909xX.LIZ()) {
            if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIIZ(2131828230);
                c1389890mGx.LJIIJJI();
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                }
                C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(strOptString2, "othershow", awemeRawAd);
                c1022820ciuLIZLLL.LIZJ("tooltip", "refer");
                c1022820ciuLIZLLL.LJII();
                interfaceC1019840ce6.LIZ(0, "frequency control");
                return;
            }
            return;
        }
        if (num == null) {
            iIntValue = 1;
        } else {
            iIntValue = num.intValue() + 1;
        }
        map.put(strOptString, Integer.valueOf(iIntValue));
        Intent intent = new Intent("android.intent.action.DIAL", Uri.fromParts("tel", strOptString, null));
        C2429209fW.LIZ().appendDataFlowId(intent, 1207964164);
        if (context == null) {
            interfaceC1019840ce6.LIZ(0, "Context not provided in host");
            return;
        }
        C988840bq6.LIZIZ = System.currentTimeMillis();
        C988840bq6.LIZJ = strOptString2;
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_bullet_bridge_ad_AdMakePhoneCallMethod_com_bytedance_router_monitor_page_PageLancet_startActivity(context, intent);
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        }
        C2184171Adz.LIZLLL(strOptString2, "leave_tt", awemeRawAd).LJII();
        interfaceC1019840ce6.onSuccess(1);
    }
}
