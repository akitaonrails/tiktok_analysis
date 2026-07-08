package com.ss.android.ugc.awemepushlib;

import X.C19266210Yy;
import X.C20684815ws;
import X.C2188191AkT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C788530UwV;
import X.C814860Vxs;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.awemepushlib.interaction.PushService;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes14.dex */
public final class PushDislikeActionReceiver extends BroadcastReceiver {
    public static String LIZ(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void LIZIZ(Context context, Intent intent) {
        String strLIZ;
        String strLIZ2;
        String strLIZ3;
        String strLIZ4;
        String str;
        String strLIZ5;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        C19266210Yy.LIZIZ.LIZIZ();
        if (intent == null || (strLIZ = LIZ(intent, "action_id")) == null) {
            strLIZ = "push_body";
        }
        String str2 = "";
        if (intent == null || (strLIZ2 = LIZ(intent, "url_string")) == null) {
            strLIZ2 = "";
        }
        if (intent == null || (strLIZ3 = LIZ(intent, "author_id")) == null) {
            strLIZ3 = "";
        }
        if (intent == null || (strLIZ4 = LIZ(intent, "user_id")) == null) {
            strLIZ4 = "";
        }
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(strLIZ2)) {
            C814860Vxs.LJ(strLIZ2, map);
        }
        Uri uri = UriProtector.parse(strLIZ2);
        if (uri != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "rec_type")) != null) {
            str2 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        }
        map.put("rec_type", str2);
        map.put("author_id", strLIZ3);
        map.put("push_channel", "GCM");
        map.put("user_id", strLIZ4);
        if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_login", str);
        map.put("position", strLIZ);
        C20684815ws.LJIILLIIL("push_click_dislike", map);
        int intExtra = -1;
        if (intent != null && intent.getIntExtra("need_clear_notification_push_id", -1) == -1) {
            return;
        }
        PushService pushService = new PushService();
        if (intent != null) {
            strLIZ5 = LIZ(intent, "cancel_TAG");
            intExtra = intent.getIntExtra("need_clear_notification_push_id", -1);
        } else {
            strLIZ5 = null;
        }
        pushService.clearNotificationId(strLIZ5, context, intExtra);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZIZ(context, intent);
        } else {
            C2408409cA.LIZ();
            LIZIZ(context, intent);
        }
    }
}
