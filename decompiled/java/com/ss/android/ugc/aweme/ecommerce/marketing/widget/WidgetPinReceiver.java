package com.ss.android.ugc.aweme.ecommerce.marketing.widget;

import X.C1323820kYO;
import X.C1548820qPI;
import X.C2188191AkT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C2410609cW;
import X.C397901gf;
import X.C788530UwV;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class WidgetPinReceiver extends BroadcastReceiver {
    public static final C2410609cW Companion = new Object() { // from class: X.09cW
    };

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws JSONException {
        com_ss_android_ugc_aweme_ecommerce_marketing_widget_WidgetPinReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
    }

    public void com_ss_android_ugc_aweme_ecommerce_marketing_widget_WidgetPinReceiver__onReceive$___twin___(Context context, Intent intent) throws JSONException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("widget_id", "bonus_widget_small");
        C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, new C1323820kYO(jSONObject), "ecWidgetInstallSuccess"));
    }

    public static void com_ss_android_ugc_aweme_ecommerce_marketing_widget_WidgetPinReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(WidgetPinReceiver widgetPinReceiver, Context context, Intent intent) throws JSONException {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            widgetPinReceiver.com_ss_android_ugc_aweme_ecommerce_marketing_widget_WidgetPinReceiver__onReceive$___twin___(context, intent);
        } else {
            C2408409cA.LIZ();
            widgetPinReceiver.com_ss_android_ugc_aweme_ecommerce_marketing_widget_WidgetPinReceiver__onReceive$___twin___(context, intent);
        }
    }

    public static void com_ss_android_ugc_aweme_ecommerce_marketing_widget_WidgetPinReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(WidgetPinReceiver widgetPinReceiver, Context context, Intent intent) throws JSONException {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        com_ss_android_ugc_aweme_ecommerce_marketing_widget_WidgetPinReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(widgetPinReceiver, context, intent);
    }
}
