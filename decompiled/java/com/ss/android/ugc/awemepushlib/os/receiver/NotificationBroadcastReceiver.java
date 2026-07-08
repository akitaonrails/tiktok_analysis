package com.ss.android.ugc.awemepushlib.os.receiver;

import X.C20684815ws;
import X.C20684915wt;
import X.C2111608Pa;
import X.C2188191AkT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C786410Ut5;
import X.C788530UwV;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class NotificationBroadcastReceiver extends BroadcastReceiver {
    public static final String TYPE = "type";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
    }

    public static String INVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private void addReadingOrderParams(Intent intent, Map<String, String> map) {
        String strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = INVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "reading_order_pre_title");
        if (!TextUtils.isEmpty(strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra)) {
            map.put("reading_order_pre_title", strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
        }
        String strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2 = INVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "reading_order_post_title");
        if (!TextUtils.isEmpty(strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2)) {
            map.put("reading_order_post_title", strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra2);
        }
        String strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra3 = INVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "reading_order_pre_text");
        if (!TextUtils.isEmpty(strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra3)) {
            map.put("reading_order_pre_text", strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra3);
        }
        String strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra4 = INVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(intent, "reading_order_post_text");
        if (!TextUtils.isEmpty(strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra4)) {
            map.put("reading_order_post_text", strINVOKEVIRTUAL_com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra4);
        }
    }

    public void com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver__onReceive$___twin___(Context context, Intent intent) {
        if (context != null && intent != null) {
            String action = intent.getAction();
            int intExtra = intent.getIntExtra("type", -1);
            if (intExtra != -1) {
                ((NotificationManager) C786410Ut5.H2(context, "notification")).cancel(intExtra);
            }
            Intent intent2 = (Intent) intent.getParcelableExtra("contentIntentURI");
            if ("notification_cancelled".equals(action)) {
                HashMap map = new HashMap();
                Map map2 = map;
                if (C2111608Pa.LIZ(-1, "message_from", intent) == 10001) {
                    map.put("push_label", "non_login_push");
                    map.put("real_timestamp", String.valueOf(System.currentTimeMillis() / 1000));
                    map.put("rule_id", String.valueOf(C2111608Pa.LIZIZ(intent, "push_rule_id")));
                    map.put("colorized", CardStruct.IStatusCode.DEFAULT);
                    map.put("has_image", CardStruct.IStatusCode.DEFAULT);
                    map.put("has_button", CardStruct.IStatusCode.DEFAULT);
                    C20684815ws.LJIIZILJ("non_login_push_clear", map, true);
                    return;
                }
                if (intent2 != null) {
                    Map<String, String> map3 = (Map) intent2.getSerializableExtra("log_data_extra_to_adsapp");
                    Map<String, String> map4 = map3;
                    if (map3 == null) {
                        map4 = new HashMap();
                    }
                    addReadingOrderParams(intent2, map4);
                    map2 = map4;
                }
                C20684915wt.LJFF("push_clear", map2);
            }
        }
    }

    public static void com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(NotificationBroadcastReceiver notificationBroadcastReceiver, Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            notificationBroadcastReceiver.com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver__onReceive$___twin___(context, intent);
        } else {
            C2408409cA.LIZ();
            notificationBroadcastReceiver.com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver__onReceive$___twin___(context, intent);
        }
    }

    public static void com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(NotificationBroadcastReceiver notificationBroadcastReceiver, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        com_ss_android_ugc_awemepushlib_os_receiver_NotificationBroadcastReceiver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(notificationBroadcastReceiver, context, intent);
    }
}
