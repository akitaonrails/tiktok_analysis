package com.ss.android.ugc.trill.abtest.impl;

import X.C0WZX;
import X.C1701330uNH;
import X.C20684815ws;
import X.C2188191AkT;
import X.C2204961BRm;
import X.C2214201BlK;
import X.C2408409cA;
import X.C786410Ut5;
import X.C788530UwV;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.common.MobClick;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class NotificationBroadcastReceiver extends BroadcastReceiver {
    public static void LIZ(Context context, Intent intent) {
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return;
        }
        int intExtra = intent.getIntExtra("type", -1);
        if (intExtra != -1) {
            ((NotificationManager) C786410Ut5.H2(context, "notification")).cancel(intExtra);
        }
        if (action.equals("notification_clicked")) {
            Intent intent2 = new Intent();
            intent2.setClassName(context, "com.ss.android.ugc.aweme.splash.SplashActivity");
            intent2.setFlags(335544320);
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent2, "Context_startActivity_1");
            C1701330uNH.LIZ(intent2, context);
            C2204961BRm.LJJJJJL(context, intent2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2wrdWs/KOuqd5rdyHzdBoF6eNBZL2QSaK2aXoM32FGmud3uCIPPN7rBFdjK3W7/", null));
            MobClick mobClickObtain = MobClick.obtain();
            mobClickObtain.setLabelName("click");
            mobClickObtain.setEventName("recall_push");
            C20684815ws.onEvent(mobClickObtain);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(context, intent);
        } else {
            C2408409cA.LIZ();
            LIZ(context, intent);
        }
    }
}
